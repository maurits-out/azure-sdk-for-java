/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes how identity is verified.
 */
public class Identity {
    /**
     * The tenantId property.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The principalId property.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * The type property.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the Identity object itself.
     */
    public Identity withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the principalId value.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId value.
     *
     * @param principalId the principalId value to set
     * @return the Identity object itself.
     */
    public Identity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the Identity object itself.
     */
    public Identity withType(String type) {
        this.type = type;
        return this;
    }

}