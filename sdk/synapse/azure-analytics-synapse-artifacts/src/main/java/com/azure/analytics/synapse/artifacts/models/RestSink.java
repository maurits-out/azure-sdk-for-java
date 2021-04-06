// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Rest service Sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RestSink")
@Fluent
public final class RestSink extends CopySink {
    /*
     * The HTTP method used to call the RESTful API. The default is POST. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "requestMethod")
    private Object requestMethod;

    /*
     * The additional HTTP headers in the request to the RESTful API. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "additionalHeaders")
    private Object additionalHeaders;

    /*
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get
     * a response, not the timeout to read response data. Default value:
     * 00:01:40. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "httpRequestTimeout")
    private Object httpRequestTimeout;

    /*
     * The time to await before sending next request, in milliseconds
     */
    @JsonProperty(value = "requestInterval")
    private Object requestInterval;

    /*
     * Http Compression Type to Send data in compressed format with Optimal
     * Compression Level, Default is None. And The Only Supported option is
     * Gzip.
     */
    @JsonProperty(value = "httpCompressionType")
    private Object httpCompressionType;

    /**
     * Get the requestMethod property: The HTTP method used to call the RESTful API. The default is POST. Type: string
     * (or Expression with resultType string).
     *
     * @return the requestMethod value.
     */
    public Object getRequestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the requestMethod property: The HTTP method used to call the RESTful API. The default is POST. Type: string
     * (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set.
     * @return the RestSink object itself.
     */
    public RestSink setRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @return the additionalHeaders value.
     */
    public Object getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @param additionalHeaders the additionalHeaders value to set.
     * @return the RestSink object itself.
     */
    public RestSink setAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the httpRequestTimeout property: The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a
     * response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the httpRequestTimeout value.
     */
    public Object getHttpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    /**
     * Set the httpRequestTimeout property: The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a
     * response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param httpRequestTimeout the httpRequestTimeout value to set.
     * @return the RestSink object itself.
     */
    public RestSink setHttpRequestTimeout(Object httpRequestTimeout) {
        this.httpRequestTimeout = httpRequestTimeout;
        return this;
    }

    /**
     * Get the requestInterval property: The time to await before sending next request, in milliseconds.
     *
     * @return the requestInterval value.
     */
    public Object getRequestInterval() {
        return this.requestInterval;
    }

    /**
     * Set the requestInterval property: The time to await before sending next request, in milliseconds.
     *
     * @param requestInterval the requestInterval value to set.
     * @return the RestSink object itself.
     */
    public RestSink setRequestInterval(Object requestInterval) {
        this.requestInterval = requestInterval;
        return this;
    }

    /**
     * Get the httpCompressionType property: Http Compression Type to Send data in compressed format with Optimal
     * Compression Level, Default is None. And The Only Supported option is Gzip.
     *
     * @return the httpCompressionType value.
     */
    public Object getHttpCompressionType() {
        return this.httpCompressionType;
    }

    /**
     * Set the httpCompressionType property: Http Compression Type to Send data in compressed format with Optimal
     * Compression Level, Default is None. And The Only Supported option is Gzip.
     *
     * @param httpCompressionType the httpCompressionType value to set.
     * @return the RestSink object itself.
     */
    public RestSink setHttpCompressionType(Object httpCompressionType) {
        this.httpCompressionType = httpCompressionType;
        return this;
    }
}