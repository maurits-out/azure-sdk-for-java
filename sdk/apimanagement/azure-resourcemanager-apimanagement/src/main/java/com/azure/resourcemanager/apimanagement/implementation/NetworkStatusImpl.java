// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.NetworkStatusClient;
import com.azure.resourcemanager.apimanagement.fluent.models.NetworkStatusContractByLocationInner;
import com.azure.resourcemanager.apimanagement.fluent.models.NetworkStatusContractInner;
import com.azure.resourcemanager.apimanagement.models.NetworkStatus;
import com.azure.resourcemanager.apimanagement.models.NetworkStatusContract;
import com.azure.resourcemanager.apimanagement.models.NetworkStatusContractByLocation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class NetworkStatusImpl implements NetworkStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkStatusImpl.class);

    private final NetworkStatusClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public NetworkStatusImpl(
        NetworkStatusClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public List<NetworkStatusContractByLocation> listByService(String resourceGroupName, String serviceName) {
        List<NetworkStatusContractByLocationInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new NetworkStatusContractByLocationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<NetworkStatusContractByLocation>> listByServiceWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        Response<List<NetworkStatusContractByLocationInner>> inner =
            this.serviceClient().listByServiceWithResponse(resourceGroupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new NetworkStatusContractByLocationImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public NetworkStatusContract listByLocation(String resourceGroupName, String serviceName, String locationName) {
        NetworkStatusContractInner inner =
            this.serviceClient().listByLocation(resourceGroupName, serviceName, locationName);
        if (inner != null) {
            return new NetworkStatusContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkStatusContract> listByLocationWithResponse(
        String resourceGroupName, String serviceName, String locationName, Context context) {
        Response<NetworkStatusContractInner> inner =
            this.serviceClient().listByLocationWithResponse(resourceGroupName, serviceName, locationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkStatusContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private NetworkStatusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}