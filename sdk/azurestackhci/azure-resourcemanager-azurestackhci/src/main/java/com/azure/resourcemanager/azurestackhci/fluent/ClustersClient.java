// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.ClusterInner;
import com.azure.resourcemanager.azurestackhci.models.ClusterUpdate;

/** An instance of this class provides access to all the operations defined in ClustersClient. */
public interface ClustersClient {
    /**
     * List all HCI clusters in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list();

    /**
     * List all HCI clusters in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list(Context context);

    /**
     * List all HCI clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all HCI clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get HCI cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hCI cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Get HCI cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hCI cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Create an HCI cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster Details of the HCI cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner create(String resourceGroupName, String clusterName, ClusterInner cluster);

    /**
     * Create an HCI cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster Details of the HCI cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> createWithResponse(
        String resourceGroupName, String clusterName, ClusterInner cluster, Context context);

    /**
     * Update an HCI cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster Details of the HCI cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(String resourceGroupName, String clusterName, ClusterUpdate cluster);

    /**
     * Update an HCI cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster Details of the HCI cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> updateWithResponse(
        String resourceGroupName, String clusterName, ClusterUpdate cluster, Context context);

    /**
     * Delete an HCI cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName);

    /**
     * Delete an HCI cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String clusterName, Context context);
}