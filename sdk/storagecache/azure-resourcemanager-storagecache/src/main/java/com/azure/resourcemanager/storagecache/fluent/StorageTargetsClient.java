// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.storagecache.fluent.models.StorageTargetInner;

/** An instance of this class provides access to all the operations defined in StorageTargetsClient. */
public interface StorageTargetsClient {
    /**
     * Tells a storage target to refresh its DNS information.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDnsRefresh(
        String resourceGroupName, String cacheName, String storageTargetName);

    /**
     * Tells a storage target to refresh its DNS information.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDnsRefresh(
        String resourceGroupName, String cacheName, String storageTargetName, Context context);

    /**
     * Tells a storage target to refresh its DNS information.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void dnsRefresh(String resourceGroupName, String cacheName, String storageTargetName);

    /**
     * Tells a storage target to refresh its DNS information.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void dnsRefresh(String resourceGroupName, String cacheName, String storageTargetName, Context context);

    /**
     * Returns a list of Storage Targets for the specified Cache.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Storage Targets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageTargetInner> listByCache(String resourceGroupName, String cacheName);

    /**
     * Returns a list of Storage Targets for the specified Cache.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Storage Targets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageTargetInner> listByCache(String resourceGroupName, String cacheName, Context context);

    /**
     * Removes a Storage Target from a Cache. This operation is allowed at any time, but if the Cache is down or
     * unhealthy, the actual removal of the Storage Target may be delayed until the Cache is healthy again. Note that if
     * the Cache has data to flush to the Storage Target, the data will be flushed before the Storage Target will be
     * deleted.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String cacheName, String storageTargetName);

    /**
     * Removes a Storage Target from a Cache. This operation is allowed at any time, but if the Cache is down or
     * unhealthy, the actual removal of the Storage Target may be delayed until the Cache is healthy again. Note that if
     * the Cache has data to flush to the Storage Target, the data will be flushed before the Storage Target will be
     * deleted.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String cacheName, String storageTargetName, Context context);

    /**
     * Removes a Storage Target from a Cache. This operation is allowed at any time, but if the Cache is down or
     * unhealthy, the actual removal of the Storage Target may be delayed until the Cache is healthy again. Note that if
     * the Cache has data to flush to the Storage Target, the data will be flushed before the Storage Target will be
     * deleted.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cacheName, String storageTargetName);

    /**
     * Removes a Storage Target from a Cache. This operation is allowed at any time, but if the Cache is down or
     * unhealthy, the actual removal of the Storage Target may be delayed until the Cache is healthy again. Note that if
     * the Cache has data to flush to the Storage Target, the data will be flushed before the Storage Target will be
     * deleted.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cacheName, String storageTargetName, Context context);

    /**
     * Returns a Storage Target from a Cache.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return type of the Storage Target.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageTargetInner get(String resourceGroupName, String cacheName, String storageTargetName);

    /**
     * Returns a Storage Target from a Cache.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return type of the Storage Target.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StorageTargetInner> getWithResponse(
        String resourceGroupName, String cacheName, String storageTargetName, Context context);

    /**
     * Create or update a Storage Target. This operation is allowed at any time, but if the Cache is down or unhealthy,
     * the actual creation/modification of the Storage Target may be delayed until the Cache is healthy again.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @param storagetarget Object containing the definition of a Storage Target.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return type of the Storage Target.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<StorageTargetInner>, StorageTargetInner> beginCreateOrUpdate(
        String resourceGroupName, String cacheName, String storageTargetName, StorageTargetInner storagetarget);

    /**
     * Create or update a Storage Target. This operation is allowed at any time, but if the Cache is down or unhealthy,
     * the actual creation/modification of the Storage Target may be delayed until the Cache is healthy again.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @param storagetarget Object containing the definition of a Storage Target.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return type of the Storage Target.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<StorageTargetInner>, StorageTargetInner> beginCreateOrUpdate(
        String resourceGroupName,
        String cacheName,
        String storageTargetName,
        StorageTargetInner storagetarget,
        Context context);

    /**
     * Create or update a Storage Target. This operation is allowed at any time, but if the Cache is down or unhealthy,
     * the actual creation/modification of the Storage Target may be delayed until the Cache is healthy again.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @param storagetarget Object containing the definition of a Storage Target.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return type of the Storage Target.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageTargetInner createOrUpdate(
        String resourceGroupName, String cacheName, String storageTargetName, StorageTargetInner storagetarget);

    /**
     * Create or update a Storage Target. This operation is allowed at any time, but if the Cache is down or unhealthy,
     * the actual creation/modification of the Storage Target may be delayed until the Cache is healthy again.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return type of the Storage Target.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageTargetInner createOrUpdate(String resourceGroupName, String cacheName, String storageTargetName);

    /**
     * Create or update a Storage Target. This operation is allowed at any time, but if the Cache is down or unhealthy,
     * the actual creation/modification of the Storage Target may be delayed until the Cache is healthy again.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param storageTargetName Name of Storage Target.
     * @param storagetarget Object containing the definition of a Storage Target.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return type of the Storage Target.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageTargetInner createOrUpdate(
        String resourceGroupName,
        String cacheName,
        String storageTargetName,
        StorageTargetInner storagetarget,
        Context context);
}