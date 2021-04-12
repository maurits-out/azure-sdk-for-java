// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Link with additional information about a product. */
@Fluent
public final class ProductLink {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProductLink.class);

    /*
     * The description of the link.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The URI corresponding to the link.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Get the displayName property: The description of the link.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The description of the link.
     *
     * @param displayName the displayName value to set.
     * @return the ProductLink object itself.
     */
    public ProductLink withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the uri property: The URI corresponding to the link.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI corresponding to the link.
     *
     * @param uri the uri value to set.
     * @return the ProductLink object itself.
     */
    public ProductLink withUri(String uri) {
        this.uri = uri;
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