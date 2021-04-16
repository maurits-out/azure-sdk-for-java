// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.SecretInner;
import com.azure.resourcemanager.devtestlabs.models.Secret;
import com.azure.resourcemanager.devtestlabs.models.SecretFragment;
import java.util.Collections;
import java.util.Map;

public final class SecretImpl implements Secret, Secret.Definition, Secret.Update {
    private SecretInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String value() {
        return this.innerModel().value();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SecretInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String username;

    private String name;

    private SecretFragment updateSecret;

    public SecretImpl withExistingUser(String resourceGroupName, String labName, String username) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        this.username = username;
        return this;
    }

    public Secret create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .createOrUpdate(resourceGroupName, labName, username, name, this.innerModel(), Context.NONE);
        return this;
    }

    public Secret create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .createOrUpdate(resourceGroupName, labName, username, name, this.innerModel(), context);
        return this;
    }

    SecretImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new SecretInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public SecretImpl update() {
        this.updateSecret = new SecretFragment();
        return this;
    }

    public Secret apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .updateWithResponse(resourceGroupName, labName, username, name, updateSecret, Context.NONE)
                .getValue();
        return this;
    }

    public Secret apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .updateWithResponse(resourceGroupName, labName, username, name, updateSecret, context)
                .getValue();
        return this;
    }

    SecretImpl(SecretInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
        this.username = Utils.getValueFromIdByName(innerObject.id(), "users");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "secrets");
    }

    public Secret refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .getWithResponse(resourceGroupName, labName, username, name, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public Secret refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .getWithResponse(resourceGroupName, labName, username, name, localExpand, context)
                .getValue();
        return this;
    }

    public SecretImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SecretImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SecretImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateSecret.withTags(tags);
            return this;
        }
    }

    public SecretImpl withValue(String value) {
        this.innerModel().withValue(value);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}