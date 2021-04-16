/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.AFDEndpoint;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDEndpointUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.cdn.v2020_09_01.SystemData;
import com.microsoft.azure.management.cdn.v2020_09_01.EnabledState;
import com.microsoft.azure.management.cdn.v2020_09_01.AfdProvisioningState;
import com.microsoft.azure.management.cdn.v2020_09_01.DeploymentStatus;
import rx.functions.Func1;

class AFDEndpointImpl extends CreatableUpdatableImpl<AFDEndpoint, AFDEndpointInner, AFDEndpointImpl> implements AFDEndpoint, AFDEndpoint.Definition, AFDEndpoint.Update {
    private final CdnManager manager;
    private String resourceGroupName;
    private String profileName;
    private String endpointName;
    private AFDEndpointUpdateParameters updateParameter;

    AFDEndpointImpl(String name, CdnManager manager) {
        super(name, new AFDEndpointInner());
        this.manager = manager;
        // Set resource name
        this.endpointName = name;
        //
        this.updateParameter = new AFDEndpointUpdateParameters();
    }

    AFDEndpointImpl(AFDEndpointInner inner, CdnManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.endpointName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.profileName = IdParsingUtils.getValueFromIdByName(inner.id(), "profiles");
        this.endpointName = IdParsingUtils.getValueFromIdByName(inner.id(), "afdEndpoints");
        //
        this.updateParameter = new AFDEndpointUpdateParameters();
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AFDEndpoint> createResourceAsync() {
        AFDEndpointsInner client = this.manager().inner().aFDEndpoints();
        return client.createAsync(this.resourceGroupName, this.profileName, this.endpointName, this.inner())
            .map(new Func1<AFDEndpointInner, AFDEndpointInner>() {
               @Override
               public AFDEndpointInner call(AFDEndpointInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AFDEndpoint> updateResourceAsync() {
        AFDEndpointsInner client = this.manager().inner().aFDEndpoints();
        return client.updateAsync(this.resourceGroupName, this.profileName, this.endpointName, this.updateParameter)
            .map(new Func1<AFDEndpointInner, AFDEndpointInner>() {
               @Override
               public AFDEndpointInner call(AFDEndpointInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AFDEndpointInner> getInnerAsync() {
        AFDEndpointsInner client = this.manager().inner().aFDEndpoints();
        return client.getAsync(this.resourceGroupName, this.profileName, this.endpointName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new AFDEndpointUpdateParameters();
    }

    @Override
    public DeploymentStatus deploymentStatus() {
        return this.inner().deploymentStatus();
    }

    @Override
    public EnabledState enabledState() {
        return this.inner().enabledState();
    }

    @Override
    public String hostName() {
        return this.inner().hostName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer originResponseTimeoutSeconds() {
        return this.inner().originResponseTimeoutSeconds();
    }

    @Override
    public AfdProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public AFDEndpointImpl withExistingProfile(String resourceGroupName, String profileName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        return this;
    }

    @Override
    public AFDEndpointImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public AFDEndpointImpl withEnabledState(EnabledState enabledState) {
        if (isInCreateMode()) {
            this.inner().withEnabledState(enabledState);
        } else {
            this.updateParameter.withEnabledState(enabledState);
        }
        return this;
    }

    @Override
    public AFDEndpointImpl withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds) {
        if (isInCreateMode()) {
            this.inner().withOriginResponseTimeoutSeconds(originResponseTimeoutSeconds);
        } else {
            this.updateParameter.withOriginResponseTimeoutSeconds(originResponseTimeoutSeconds);
        }
        return this;
    }

    @Override
    public AFDEndpointImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}