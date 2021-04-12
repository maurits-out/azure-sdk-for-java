// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data flow debug resource. */
@Fluent
public final class DataFlowDebugResource extends SubResourceDebugResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataFlowDebugResource.class);

    /*
     * Data flow properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DataFlow properties;

    /**
     * Get the properties property: Data flow properties.
     *
     * @return the properties value.
     */
    public DataFlow properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Data flow properties.
     *
     * @param properties the properties value to set.
     * @return the DataFlowDebugResource object itself.
     */
    public DataFlowDebugResource withProperties(DataFlow properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowDebugResource withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model DataFlowDebugResource"));
        } else {
            properties().validate();
        }
    }
}