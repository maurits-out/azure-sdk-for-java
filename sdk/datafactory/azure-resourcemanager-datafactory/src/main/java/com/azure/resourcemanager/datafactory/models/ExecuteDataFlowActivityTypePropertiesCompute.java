// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Compute properties for data flow activity. */
@Fluent
public final class ExecuteDataFlowActivityTypePropertiesCompute {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExecuteDataFlowActivityTypePropertiesCompute.class);

    /*
     * Compute type of the cluster which will execute data flow job. Possible
     * values include: 'General', 'MemoryOptimized', 'ComputeOptimized'. Type:
     * string (or Expression with resultType string)
     */
    @JsonProperty(value = "computeType")
    private Object computeType;

    /*
     * Core count of the cluster which will execute data flow job. Supported
     * values are: 8, 16, 32, 48, 80, 144 and 272. Type: integer (or Expression
     * with resultType integer)
     */
    @JsonProperty(value = "coreCount")
    private Object coreCount;

    /**
     * Get the computeType property: Compute type of the cluster which will execute data flow job. Possible values
     * include: 'General', 'MemoryOptimized', 'ComputeOptimized'. Type: string (or Expression with resultType string).
     *
     * @return the computeType value.
     */
    public Object computeType() {
        return this.computeType;
    }

    /**
     * Set the computeType property: Compute type of the cluster which will execute data flow job. Possible values
     * include: 'General', 'MemoryOptimized', 'ComputeOptimized'. Type: string (or Expression with resultType string).
     *
     * @param computeType the computeType value to set.
     * @return the ExecuteDataFlowActivityTypePropertiesCompute object itself.
     */
    public ExecuteDataFlowActivityTypePropertiesCompute withComputeType(Object computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * Get the coreCount property: Core count of the cluster which will execute data flow job. Supported values are: 8,
     * 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer).
     *
     * @return the coreCount value.
     */
    public Object coreCount() {
        return this.coreCount;
    }

    /**
     * Set the coreCount property: Core count of the cluster which will execute data flow job. Supported values are: 8,
     * 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer).
     *
     * @param coreCount the coreCount value to set.
     * @return the ExecuteDataFlowActivityTypePropertiesCompute object itself.
     */
    public ExecuteDataFlowActivityTypePropertiesCompute withCoreCount(Object coreCount) {
        this.coreCount = coreCount;
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