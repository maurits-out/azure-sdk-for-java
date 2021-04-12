// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.VariableInner;
import com.azure.resourcemanager.automation.models.VariableCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.VariableUpdateParameters;

/** An instance of this class provides access to all the operations defined in VariablesClient. */
public interface VariablesClient {
    /**
     * Create a variable.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param variableName The variable name.
     * @param parameters The parameters supplied to the create or update variable operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the variable.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VariableInner createOrUpdate(
        String resourceGroupName,
        String automationAccountName,
        String variableName,
        VariableCreateOrUpdateParameters parameters);

    /**
     * Create a variable.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param variableName The variable name.
     * @param parameters The parameters supplied to the create or update variable operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the variable.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VariableInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String variableName,
        VariableCreateOrUpdateParameters parameters,
        Context context);

    /**
     * Update a variable.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param variableName The variable name.
     * @param parameters The parameters supplied to the update variable operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the variable.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VariableInner update(
        String resourceGroupName,
        String automationAccountName,
        String variableName,
        VariableUpdateParameters parameters);

    /**
     * Update a variable.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param variableName The variable name.
     * @param parameters The parameters supplied to the update variable operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the variable.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VariableInner> updateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String variableName,
        VariableUpdateParameters parameters,
        Context context);

    /**
     * Delete the variable.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param variableName The name of variable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String automationAccountName, String variableName);

    /**
     * Delete the variable.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param variableName The name of variable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String variableName, Context context);

    /**
     * Retrieve the variable identified by variable name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param variableName The name of variable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the variable.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VariableInner get(String resourceGroupName, String automationAccountName, String variableName);

    /**
     * Retrieve the variable identified by variable name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param variableName The name of variable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the variable.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VariableInner> getWithResponse(
        String resourceGroupName, String automationAccountName, String variableName, Context context);

    /**
     * Retrieve a list of variables.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list variables operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VariableInner> listByAutomationAccount(String resourceGroupName, String automationAccountName);

    /**
     * Retrieve a list of variables.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list variables operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VariableInner> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, Context context);
}