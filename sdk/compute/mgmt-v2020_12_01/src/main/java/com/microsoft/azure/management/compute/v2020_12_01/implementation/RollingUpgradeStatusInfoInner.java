/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.management.compute.v2020_12_01.RollingUpgradePolicy;
import com.microsoft.azure.management.compute.v2020_12_01.RollingUpgradeRunningStatus;
import com.microsoft.azure.management.compute.v2020_12_01.RollingUpgradeProgressInfo;
import com.microsoft.azure.management.compute.v2020_12_01.ApiError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * The status of the latest virtual machine scale set rolling upgrade.
 */
@JsonFlatten
public class RollingUpgradeStatusInfoInner extends Resource {
    /**
     * The rolling upgrade policies applied for this upgrade.
     */
    @JsonProperty(value = "properties.policy", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradePolicy policy;

    /**
     * Information about the current running state of the overall upgrade.
     */
    @JsonProperty(value = "properties.runningStatus", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeRunningStatus runningStatus;

    /**
     * Information about the number of virtual machine instances in each
     * upgrade state.
     */
    @JsonProperty(value = "properties.progress", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeProgressInfo progress;

    /**
     * Error details for this upgrade, if there are any.
     */
    @JsonProperty(value = "properties.error", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError error;

    /**
     * Get the rolling upgrade policies applied for this upgrade.
     *
     * @return the policy value
     */
    public RollingUpgradePolicy policy() {
        return this.policy;
    }

    /**
     * Get information about the current running state of the overall upgrade.
     *
     * @return the runningStatus value
     */
    public RollingUpgradeRunningStatus runningStatus() {
        return this.runningStatus;
    }

    /**
     * Get information about the number of virtual machine instances in each upgrade state.
     *
     * @return the progress value
     */
    public RollingUpgradeProgressInfo progress() {
        return this.progress;
    }

    /**
     * Get error details for this upgrade, if there are any.
     *
     * @return the error value
     */
    public ApiError error() {
        return this.error;
    }

}