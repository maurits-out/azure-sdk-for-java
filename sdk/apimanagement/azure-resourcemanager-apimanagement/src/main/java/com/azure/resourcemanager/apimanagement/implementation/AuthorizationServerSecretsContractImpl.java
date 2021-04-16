// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.AuthorizationServerSecretsContractInner;
import com.azure.resourcemanager.apimanagement.models.AuthorizationServerSecretsContract;

public final class AuthorizationServerSecretsContractImpl implements AuthorizationServerSecretsContract {
    private AuthorizationServerSecretsContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    AuthorizationServerSecretsContractImpl(
        AuthorizationServerSecretsContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String clientSecret() {
        return this.innerModel().clientSecret();
    }

    public String resourceOwnerUsername() {
        return this.innerModel().resourceOwnerUsername();
    }

    public String resourceOwnerPassword() {
        return this.innerModel().resourceOwnerPassword();
    }

    public AuthorizationServerSecretsContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}