// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.delegatednetwork.fluent.models.DelegatedControllerInner;

/** An instance of this class provides access to all the operations defined in DelegatedNetworksClient. */
public interface DelegatedNetworksClient {
    /**
     * Get all the delegatedController resources in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the delegatedController resources in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DelegatedControllerInner> list();

    /**
     * Get all the delegatedController resources in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the delegatedController resources in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DelegatedControllerInner> list(Context context);

    /**
     * Get all the delegatedController resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the delegatedController resources in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DelegatedControllerInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the delegatedController resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the delegatedController resources in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DelegatedControllerInner> listByResourceGroup(String resourceGroupName, Context context);
}