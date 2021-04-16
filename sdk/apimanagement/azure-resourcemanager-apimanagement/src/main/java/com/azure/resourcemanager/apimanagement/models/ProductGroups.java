// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ProductGroups. */
public interface ProductGroups {
    /**
     * Lists the collection of developer groups associated with the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Group list representation.
     */
    PagedIterable<GroupContract> listByProduct(String resourceGroupName, String serviceName, String productId);

    /**
     * Lists the collection of developer groups associated with the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | |&lt;/br&gt;| displayName | filter | eq, ne | |&lt;/br&gt;| description | filter | eq, ne |
     *     |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Group list representation.
     */
    PagedIterable<GroupContract> listByProduct(
        String resourceGroupName,
        String serviceName,
        String productId,
        String filter,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Checks that Group entity specified by identifier is associated with the Product entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void checkEntityExists(String resourceGroupName, String serviceName, String productId, String groupId);

    /**
     * Checks that Group entity specified by identifier is associated with the Product entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> checkEntityExistsWithResponse(
        String resourceGroupName, String serviceName, String productId, String groupId, Context context);

    /**
     * Adds the association between the specified developer group with the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contract details.
     */
    GroupContract createOrUpdate(String resourceGroupName, String serviceName, String productId, String groupId);

    /**
     * Adds the association between the specified developer group with the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contract details.
     */
    Response<GroupContract> createOrUpdateWithResponse(
        String resourceGroupName, String serviceName, String productId, String groupId, Context context);

    /**
     * Deletes the association between the specified group and product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String productId, String groupId);

    /**
     * Deletes the association between the specified group and product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String productId, String groupId, Context context);
}