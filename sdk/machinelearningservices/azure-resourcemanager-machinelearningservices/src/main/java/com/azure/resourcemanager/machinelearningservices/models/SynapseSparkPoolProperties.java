// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties specific to Synapse Spark pools. */
@Fluent
public class SynapseSparkPoolProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SynapseSparkPoolProperties.class);

    /*
     * AKS properties
     */
    @JsonProperty(value = "properties")
    private SynapseSparkPoolPropertiesAutoGenerated properties;

    /**
     * Get the properties property: AKS properties.
     *
     * @return the properties value.
     */
    public SynapseSparkPoolPropertiesAutoGenerated properties() {
        return this.properties;
    }

    /**
     * Set the properties property: AKS properties.
     *
     * @param properties the properties value to set.
     * @return the SynapseSparkPoolProperties object itself.
     */
    public SynapseSparkPoolProperties withProperties(SynapseSparkPoolPropertiesAutoGenerated properties) {
        this.properties = properties;
        return this;
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