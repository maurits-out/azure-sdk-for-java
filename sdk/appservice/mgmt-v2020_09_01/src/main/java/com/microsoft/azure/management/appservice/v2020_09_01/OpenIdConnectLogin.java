/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The OpenIdConnectLogin model.
 */
@JsonFlatten
public class OpenIdConnectLogin extends ProxyOnlyResource {
    /**
     * The nameClaimType property.
     */
    @JsonProperty(value = "properties.nameClaimType")
    private String nameClaimType;

    /**
     * The scopes property.
     */
    @JsonProperty(value = "properties.scopes")
    private List<String> scopes;

    /**
     * Get the nameClaimType value.
     *
     * @return the nameClaimType value
     */
    public String nameClaimType() {
        return this.nameClaimType;
    }

    /**
     * Set the nameClaimType value.
     *
     * @param nameClaimType the nameClaimType value to set
     * @return the OpenIdConnectLogin object itself.
     */
    public OpenIdConnectLogin withNameClaimType(String nameClaimType) {
        this.nameClaimType = nameClaimType;
        return this;
    }

    /**
     * Get the scopes value.
     *
     * @return the scopes value
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes value.
     *
     * @param scopes the scopes value to set
     * @return the OpenIdConnectLogin object itself.
     */
    public OpenIdConnectLogin withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

}