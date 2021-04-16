// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SqlPoolWorkloadClassifiers. */
public interface SqlPoolWorkloadClassifiers {
    /**
     * Get a workload classifier of Sql pool's workload group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param workloadGroupName The name of the workload group.
     * @param workloadClassifierName The name of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier of Sql pool's workload group.
     */
    WorkloadClassifier get(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String workloadGroupName,
        String workloadClassifierName);

    /**
     * Get a workload classifier of Sql pool's workload group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param workloadGroupName The name of the workload group.
     * @param workloadClassifierName The name of the workload classifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier of Sql pool's workload group.
     */
    Response<WorkloadClassifier> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String workloadGroupName,
        String workloadClassifierName,
        Context context);

    /**
     * Remove workload classifier of a Sql pool's workload group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param workloadGroupName The name of the workload group.
     * @param workloadClassifierName The name of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String workloadGroupName,
        String workloadClassifierName);

    /**
     * Remove workload classifier of a Sql pool's workload group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param workloadGroupName The name of the workload group.
     * @param workloadClassifierName The name of the workload classifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String workloadGroupName,
        String workloadClassifierName,
        Context context);

    /**
     * Get list of Sql pool's workload classifier for workload groups.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param workloadGroupName The name of the workload group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Sql pool's workload classifier for workload groups.
     */
    PagedIterable<WorkloadClassifier> list(
        String resourceGroupName, String workspaceName, String sqlPoolName, String workloadGroupName);

    /**
     * Get list of Sql pool's workload classifier for workload groups.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param workloadGroupName The name of the workload group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Sql pool's workload classifier for workload groups.
     */
    PagedIterable<WorkloadClassifier> list(
        String resourceGroupName, String workspaceName, String sqlPoolName, String workloadGroupName, Context context);

    /**
     * Get a workload classifier of Sql pool's workload group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier of Sql pool's workload group.
     */
    WorkloadClassifier getById(String id);

    /**
     * Get a workload classifier of Sql pool's workload group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier of Sql pool's workload group.
     */
    Response<WorkloadClassifier> getByIdWithResponse(String id, Context context);

    /**
     * Remove workload classifier of a Sql pool's workload group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Remove workload classifier of a Sql pool's workload group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new WorkloadClassifier resource.
     *
     * @param name resource name.
     * @return the first stage of the new WorkloadClassifier definition.
     */
    WorkloadClassifier.DefinitionStages.Blank define(String name);
}