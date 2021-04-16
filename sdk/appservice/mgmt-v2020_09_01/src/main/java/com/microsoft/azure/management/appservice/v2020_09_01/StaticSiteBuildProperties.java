/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Build properties for the static site.
 */
public class StaticSiteBuildProperties {
    /**
     * The path to the app code within the repository.
     */
    @JsonProperty(value = "appLocation")
    private String appLocation;

    /**
     * The path to the api code within the repository.
     */
    @JsonProperty(value = "apiLocation")
    private String apiLocation;

    /**
     * The path of the app artifacts after building.
     */
    @JsonProperty(value = "appArtifactLocation")
    private String appArtifactLocation;

    /**
     * Get the path to the app code within the repository.
     *
     * @return the appLocation value
     */
    public String appLocation() {
        return this.appLocation;
    }

    /**
     * Set the path to the app code within the repository.
     *
     * @param appLocation the appLocation value to set
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withAppLocation(String appLocation) {
        this.appLocation = appLocation;
        return this;
    }

    /**
     * Get the path to the api code within the repository.
     *
     * @return the apiLocation value
     */
    public String apiLocation() {
        return this.apiLocation;
    }

    /**
     * Set the path to the api code within the repository.
     *
     * @param apiLocation the apiLocation value to set
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withApiLocation(String apiLocation) {
        this.apiLocation = apiLocation;
        return this;
    }

    /**
     * Get the path of the app artifacts after building.
     *
     * @return the appArtifactLocation value
     */
    public String appArtifactLocation() {
        return this.appArtifactLocation;
    }

    /**
     * Set the path of the app artifacts after building.
     *
     * @param appArtifactLocation the appArtifactLocation value to set
     * @return the StaticSiteBuildProperties object itself.
     */
    public StaticSiteBuildProperties withAppArtifactLocation(String appArtifactLocation) {
        this.appArtifactLocation = appArtifactLocation;
        return this;
    }

}