// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerHistoryInner;

/** An instance of this class provides access to all the operations defined in WorkflowTriggerHistoriesClient. */
public interface WorkflowTriggerHistoriesClient {
    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow trigger histories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowTriggerHistoryInner> list(String resourceGroupName, String workflowName, String triggerName);

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and
     *     ClientTrackingId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow trigger histories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowTriggerHistoryInner> list(
        String resourceGroupName, String workflowName, String triggerName, Integer top, String filter, Context context);

    /**
     * Gets a workflow trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     *     run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow trigger history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowTriggerHistoryInner get(
        String resourceGroupName, String workflowName, String triggerName, String historyName);

    /**
     * Gets a workflow trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     *     run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow trigger history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowTriggerHistoryInner> getWithResponse(
        String resourceGroupName, String workflowName, String triggerName, String historyName, Context context);

    /**
     * Resubmits a workflow run based on the trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     *     run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resubmit(String resourceGroupName, String workflowName, String triggerName, String historyName);

    /**
     * Resubmits a workflow run based on the trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     *     run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> resubmitWithResponse(
        String resourceGroupName, String workflowName, String triggerName, String historyName, Context context);
}