/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DiskAccesses;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DiskAccess;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2020_10_01_preview.PrivateLinkResourceListResult;
import com.microsoft.azure.management.compute.v2020_10_01_preview.PrivateEndpointConnection;

class DiskAccessesImpl extends GroupableResourcesCoreImpl<DiskAccess, DiskAccessImpl, DiskAccessInner, DiskAccessesInner, ComputeManager>  implements DiskAccesses {
    protected DiskAccessesImpl(ComputeManager manager) {
        super(manager.inner().diskAccesses(), manager);
    }

    @Override
    protected Observable<DiskAccessInner> getInnerAsync(String resourceGroupName, String name) {
        DiskAccessesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        DiskAccessesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<DiskAccess> listByResourceGroup(String resourceGroupName) {
        DiskAccessesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<DiskAccess> listByResourceGroupAsync(String resourceGroupName) {
        DiskAccessesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DiskAccessInner>, Iterable<DiskAccessInner>>() {
            @Override
            public Iterable<DiskAccessInner> call(Page<DiskAccessInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DiskAccessInner, DiskAccess>() {
            @Override
            public DiskAccess call(DiskAccessInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<DiskAccess> list() {
        DiskAccessesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<DiskAccess> listAsync() {
        DiskAccessesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DiskAccessInner>, Iterable<DiskAccessInner>>() {
            @Override
            public Iterable<DiskAccessInner> call(Page<DiskAccessInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DiskAccessInner, DiskAccess>() {
            @Override
            public DiskAccess call(DiskAccessInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public DiskAccessImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected DiskAccessImpl wrapModel(DiskAccessInner inner) {
        return  new DiskAccessImpl(inner.name(), inner, manager());
    }

    @Override
    protected DiskAccessImpl wrapModel(String name) {
        return new DiskAccessImpl(name, new DiskAccessInner(), this.manager());
    }

    private PrivateEndpointConnectionImpl wrapPrivateEndpointConnectionModel(PrivateEndpointConnectionInner inner) {
        return  new PrivateEndpointConnectionImpl(inner, manager());
    }

    private Observable<PrivateEndpointConnectionInner> getPrivateEndpointConnectionInnerUsingDiskAccessesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String diskAccessName = IdParsingUtils.getValueFromIdByName(id, "diskAccesses");
        String privateEndpointConnectionName = IdParsingUtils.getValueFromIdByName(id, "privateEndpointConnections");
        DiskAccessesInner client = this.inner();
        return client.getAPrivateEndpointConnectionAsync(resourceGroupName, diskAccessName, privateEndpointConnectionName);
    }

    @Override
    public Observable<PrivateLinkResourceListResult> getPrivateLinkResourcesAsync(String resourceGroupName, String diskAccessName) {
        DiskAccessesInner client = this.inner();
        return client.getPrivateLinkResourcesAsync(resourceGroupName, diskAccessName)
        .map(new Func1<PrivateLinkResourceListResultInner, PrivateLinkResourceListResult>() {
            @Override
            public PrivateLinkResourceListResult call(PrivateLinkResourceListResultInner inner) {
                return new PrivateLinkResourceListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PrivateEndpointConnection> getAPrivateEndpointConnectionAsync(String resourceGroupName, String diskAccessName, String privateEndpointConnectionName) {
        DiskAccessesInner client = this.inner();
        return client.getAPrivateEndpointConnectionAsync(resourceGroupName, diskAccessName, privateEndpointConnectionName)
        .flatMap(new Func1<PrivateEndpointConnectionInner, Observable<PrivateEndpointConnection>>() {
            @Override
            public Observable<PrivateEndpointConnection> call(PrivateEndpointConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PrivateEndpointConnection)wrapPrivateEndpointConnectionModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<PrivateEndpointConnection> listPrivateEndpointConnectionsAsync(final String resourceGroupName, final String diskAccessName) {
        DiskAccessesInner client = this.inner();
        return client.listPrivateEndpointConnectionsAsync(resourceGroupName, diskAccessName)
        .flatMapIterable(new Func1<Page<PrivateEndpointConnectionInner>, Iterable<PrivateEndpointConnectionInner>>() {
            @Override
            public Iterable<PrivateEndpointConnectionInner> call(Page<PrivateEndpointConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateEndpointConnectionInner, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(PrivateEndpointConnectionInner inner) {
                return wrapPrivateEndpointConnectionModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAPrivateEndpointConnectionAsync(String resourceGroupName, String diskAccessName, String privateEndpointConnectionName) {
        DiskAccessesInner client = this.inner();
        return client.deleteAPrivateEndpointConnectionAsync(resourceGroupName, diskAccessName, privateEndpointConnectionName).toCompletable();
    }

}