/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01.implementation;

import com.microsoft.azure.management.attestation.v2020_10_01.SystemData;
import java.util.List;
import com.microsoft.azure.management.attestation.v2020_10_01.OperationsDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of supported operations.
 */
public class OperationListInner {
    /**
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * List of supported operations.
     */
    @JsonProperty(value = "value")
    private List<OperationsDefinition> value;

    /**
     * Get the system metadata relating to this resource.
     *
     * @return the systemData value
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get list of supported operations.
     *
     * @return the value value
     */
    public List<OperationsDefinition> value() {
        return this.value;
    }

    /**
     * Set list of supported operations.
     *
     * @param value the value value to set
     * @return the OperationListInner object itself.
     */
    public OperationListInner withValue(List<OperationsDefinition> value) {
        this.value = value;
        return this;
    }

}