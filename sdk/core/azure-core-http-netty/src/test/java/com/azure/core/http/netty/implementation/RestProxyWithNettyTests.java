// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.netty.implementation;

import com.azure.core.http.HttpClient;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.test.RestProxyTestsWireMockServer;
import com.azure.core.test.implementation.RestProxyTests;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class RestProxyWithNettyTests extends RestProxyTests {
    private static WireMockServer server;

    @BeforeAll
    public static void getWireMockServer() {
        server = RestProxyTestsWireMockServer.getRestProxyTestsServer();
        server.start();
    }

    @AfterAll
    public static void shutdownWireMockServer() {
        if (server != null) {
            server.shutdown();
        }
    }

    @Override
    protected int getWireMockPort() {
        return server.port();
    }

    @Override
    protected HttpClient createHttpClient() {
        return new NettyAsyncHttpClientBuilder().build();
    }
}