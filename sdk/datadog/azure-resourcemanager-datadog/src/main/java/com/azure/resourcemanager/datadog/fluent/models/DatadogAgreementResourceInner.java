// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.models.DatadogAgreementProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DatadogAgreementResource model. */
@Fluent
public final class DatadogAgreementResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatadogAgreementResourceInner.class);

    /*
     * Represents the properties of the resource.
     */
    @JsonProperty(value = "properties")
    private DatadogAgreementProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Represents the properties of the resource.
     *
     * @return the properties value.
     */
    public DatadogAgreementProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Represents the properties of the resource.
     *
     * @param properties the properties value to set.
     * @return the DatadogAgreementResourceInner object itself.
     */
    public DatadogAgreementResourceInner withProperties(DatadogAgreementProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}