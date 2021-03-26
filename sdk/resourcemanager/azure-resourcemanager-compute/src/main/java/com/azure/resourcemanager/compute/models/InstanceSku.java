// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InstanceSku model. */
@Immutable
public final class InstanceSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InstanceSku.class);

    /*
     * The sku name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The tier of the cloud service role instance.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /**
     * Get the name property: The sku name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the tier property: The tier of the cloud service role instance.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}