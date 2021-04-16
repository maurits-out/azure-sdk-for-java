// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Create keyVault contract details. */
@Fluent
public class KeyVaultContractCreateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultContractCreateProperties.class);

    /*
     * Key vault secret identifier for fetching secret. Providing a versioned
     * secret will prevent auto-refresh. This requires Api Management service
     * to be configured with aka.ms/apimmsi
     */
    @JsonProperty(value = "secretIdentifier")
    private String secretIdentifier;

    /*
     * SystemAssignedIdentity or UserAssignedIdentity Client Id which will be
     * used to access key vault secret.
     */
    @JsonProperty(value = "identityClientId")
    private String identityClientId;

    /**
     * Get the secretIdentifier property: Key vault secret identifier for fetching secret. Providing a versioned secret
     * will prevent auto-refresh. This requires Api Management service to be configured with aka.ms/apimmsi.
     *
     * @return the secretIdentifier value.
     */
    public String secretIdentifier() {
        return this.secretIdentifier;
    }

    /**
     * Set the secretIdentifier property: Key vault secret identifier for fetching secret. Providing a versioned secret
     * will prevent auto-refresh. This requires Api Management service to be configured with aka.ms/apimmsi.
     *
     * @param secretIdentifier the secretIdentifier value to set.
     * @return the KeyVaultContractCreateProperties object itself.
     */
    public KeyVaultContractCreateProperties withSecretIdentifier(String secretIdentifier) {
        this.secretIdentifier = secretIdentifier;
        return this;
    }

    /**
     * Get the identityClientId property: SystemAssignedIdentity or UserAssignedIdentity Client Id which will be used to
     * access key vault secret.
     *
     * @return the identityClientId value.
     */
    public String identityClientId() {
        return this.identityClientId;
    }

    /**
     * Set the identityClientId property: SystemAssignedIdentity or UserAssignedIdentity Client Id which will be used to
     * access key vault secret.
     *
     * @param identityClientId the identityClientId value to set.
     * @return the KeyVaultContractCreateProperties object itself.
     */
    public KeyVaultContractCreateProperties withIdentityClientId(String identityClientId) {
        this.identityClientId = identityClientId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}