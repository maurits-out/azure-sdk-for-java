// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TenantAccess. */
public interface TenantAccess {
    /**
     * Returns list of access infos - for Git and Management endpoints.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged AccessInformation list representation.
     */
    PagedIterable<AccessInformationContract> listByService(String resourceGroupName, String serviceName);

    /**
     * Returns list of access infos - for Git and Management endpoints.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter Not used.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged AccessInformation list representation.
     */
    PagedIterable<AccessInformationContract> listByService(
        String resourceGroupName, String serviceName, String filter, Context context);

    /**
     * Tenant access metadata.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEntityTag(String resourceGroupName, String serviceName, AccessIdName accessName);

    /**
     * Tenant access metadata.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    TenantAccessGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context);

    /**
     * Get tenant access information details without secrets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant access information details without secrets.
     */
    AccessInformationContract get(String resourceGroupName, String serviceName, AccessIdName accessName);

    /**
     * Get tenant access information details without secrets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant access information details without secrets.
     */
    Response<AccessInformationContract> getWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context);

    /**
     * Regenerate primary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regeneratePrimaryKey(String resourceGroupName, String serviceName, AccessIdName accessName);

    /**
     * Regenerate primary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> regeneratePrimaryKeyWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context);

    /**
     * Regenerate secondary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateSecondaryKey(String resourceGroupName, String serviceName, AccessIdName accessName);

    /**
     * Regenerate secondary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> regenerateSecondaryKeyWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context);

    /**
     * Get tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant access information details.
     */
    AccessInformationSecretsContract listSecrets(String resourceGroupName, String serviceName, AccessIdName accessName);

    /**
     * Get tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param accessName The identifier of the Access configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant access information details.
     */
    Response<AccessInformationSecretsContract> listSecretsWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context);

    /**
     * Get tenant access information details without secrets.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant access information details without secrets.
     */
    AccessInformationContract getById(String id);

    /**
     * Get tenant access information details without secrets.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant access information details without secrets.
     */
    Response<AccessInformationContract> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AccessInformationContract resource.
     *
     * @param name resource name.
     * @return the first stage of the new AccessInformationContract definition.
     */
    AccessInformationContract.DefinitionStages.Blank define(AccessIdName name);
}