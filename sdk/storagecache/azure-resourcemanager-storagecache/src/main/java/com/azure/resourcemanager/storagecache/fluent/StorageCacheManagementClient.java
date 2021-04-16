// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for StorageCacheManagementClient class. */
public interface StorageCacheManagementClient {
    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the SkusClient object to access its operations.
     *
     * @return the SkusClient object.
     */
    SkusClient getSkus();

    /**
     * Gets the UsageModelsClient object to access its operations.
     *
     * @return the UsageModelsClient object.
     */
    UsageModelsClient getUsageModels();

    /**
     * Gets the AscOperationsClient object to access its operations.
     *
     * @return the AscOperationsClient object.
     */
    AscOperationsClient getAscOperations();

    /**
     * Gets the CachesClient object to access its operations.
     *
     * @return the CachesClient object.
     */
    CachesClient getCaches();

    /**
     * Gets the StorageTargetsClient object to access its operations.
     *
     * @return the StorageTargetsClient object.
     */
    StorageTargetsClient getStorageTargets();
}