/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_08_01.implementation.VirtualHubBgpConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualHubBgpConnections.
 */
public interface VirtualHubBgpConnections extends SupportsCreating<BgpConnection.DefinitionStages.Blank>, HasInner<VirtualHubBgpConnectionsInner> {
    /**
     * Retrieves a list of routes the virtual hub bgp connection has learned.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeerRouteList> listLearnedRoutesAsync(String resourceGroupName, String hubName, String connectionName);

    /**
     * Retrieves a list of routes the virtual hub bgp connection is advertising to the specified peer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeerRouteList> listAdvertisedRoutesAsync(String resourceGroupName, String hubName, String connectionName);

    /**
     * Retrieves the details of a Virtual Hub Bgp Connection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BgpConnection> getAsync(String resourceGroupName, String virtualHubName, String connectionName);

    /**
     * Retrieves the details of all VirtualHubBgpConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BgpConnection> listAsync(final String resourceGroupName, final String virtualHubName);

    /**
     * Deletes a VirtualHubBgpConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String virtualHubName, String connectionName);

}