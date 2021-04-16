// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PremiumMessagingRegionProperties model. */
@Immutable
public final class PremiumMessagingRegionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PremiumMessagingRegionProperties.class);

    /*
     * Region code
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Full name of the region
     */
    @JsonProperty(value = "fullName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullName;

    /**
     * Get the code property: Region code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the fullName property: Full name of the region.
     *
     * @return the fullName value.
     */
    public String fullName() {
        return this.fullName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}