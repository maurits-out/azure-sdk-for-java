// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.fluent.models.JobInner;

/** An instance of this class provides access to all the operations defined in JobsClient. */
public interface JobsClient {
    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a specified job on a Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobInner get(String deviceName, String name, String resourceGroupName);

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a specified job on a Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobInner> getWithResponse(String deviceName, String name, String resourceGroupName, Context context);
}