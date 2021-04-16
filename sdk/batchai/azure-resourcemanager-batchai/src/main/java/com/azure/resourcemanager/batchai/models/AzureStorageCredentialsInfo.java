// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure storage account credentials. */
@Fluent
public final class AzureStorageCredentialsInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureStorageCredentialsInfo.class);

    /*
     * Storage account key. One of accountKey or accountKeySecretReference must
     * be specified.
     */
    @JsonProperty(value = "accountKey")
    private String accountKey;

    /*
     * Information about KeyVault secret storing the storage account key. One
     * of accountKey or accountKeySecretReference must be specified.
     */
    @JsonProperty(value = "accountKeySecretReference")
    private KeyVaultSecretReference accountKeySecretReference;

    /**
     * Get the accountKey property: Storage account key. One of accountKey or accountKeySecretReference must be
     * specified.
     *
     * @return the accountKey value.
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: Storage account key. One of accountKey or accountKeySecretReference must be
     * specified.
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureStorageCredentialsInfo object itself.
     */
    public AzureStorageCredentialsInfo withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the accountKeySecretReference property: Information about KeyVault secret storing the storage account key.
     * One of accountKey or accountKeySecretReference must be specified.
     *
     * @return the accountKeySecretReference value.
     */
    public KeyVaultSecretReference accountKeySecretReference() {
        return this.accountKeySecretReference;
    }

    /**
     * Set the accountKeySecretReference property: Information about KeyVault secret storing the storage account key.
     * One of accountKey or accountKeySecretReference must be specified.
     *
     * @param accountKeySecretReference the accountKeySecretReference value to set.
     * @return the AzureStorageCredentialsInfo object itself.
     */
    public AzureStorageCredentialsInfo withAccountKeySecretReference(
        KeyVaultSecretReference accountKeySecretReference) {
        this.accountKeySecretReference = accountKeySecretReference;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountKeySecretReference() != null) {
            accountKeySecretReference().validate();
        }
    }
}