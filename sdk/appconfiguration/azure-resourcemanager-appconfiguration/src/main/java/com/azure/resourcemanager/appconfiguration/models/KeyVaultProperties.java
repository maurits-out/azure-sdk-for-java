// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings concerning key vault encryption for a configuration store. */
@Fluent
public final class KeyVaultProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultProperties.class);

    /*
     * The URI of the key vault key used to encrypt data.
     */
    @JsonProperty(value = "keyIdentifier")
    private String keyIdentifier;

    /*
     * The client id of the identity which will be used to access key vault.
     */
    @JsonProperty(value = "identityClientId")
    private String identityClientId;

    /**
     * Get the keyIdentifier property: The URI of the key vault key used to encrypt data.
     *
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: The URI of the key vault key used to encrypt data.
     *
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get the identityClientId property: The client id of the identity which will be used to access key vault.
     *
     * @return the identityClientId value.
     */
    public String identityClientId() {
        return this.identityClientId;
    }

    /**
     * Set the identityClientId property: The client id of the identity which will be used to access key vault.
     *
     * @param identityClientId the identityClientId value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withIdentityClientId(String identityClientId) {
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