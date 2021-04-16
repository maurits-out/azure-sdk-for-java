// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.containers.containerregistry.models.ContentProperties;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Repository attributes. */
@Immutable
public final class RepositoryProperties {
    /*
     * Image name
     */
    @JsonProperty(value = "imageName", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Image created time
     */
    @JsonProperty(value = "createdTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Image last update time
     */
    @JsonProperty(value = "lastUpdateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedOn;

    /*
     * Number of the manifests
     */
    @JsonProperty(value = "manifestCount", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int registryArtifactCount;

    /*
     * Number of the tags
     */
    @JsonProperty(value = "tagCount", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int tagCount;

    /*
     * Writeable properties of the resource
     */
    @JsonProperty(value = "changeableAttributes", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private ContentProperties writeableProperties;

    /**
     * Get the name property: Image name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the createdOn property: Image created time.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Get the lastUpdatedOn property: Image last update time.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the registryArtifactCount property: Number of the manifests.
     *
     * @return the registryArtifactCount value.
     */
    public int getRegistryArtifactCount() {
        return this.registryArtifactCount;
    }

    /**
     * Get the tagCount property: Number of the tags.
     *
     * @return the tagCount value.
     */
    public int getTagCount() {
        return this.tagCount;
    }

    /**
     * Get the writeableProperties property: Writeable properties of the resource.
     *
     * @return the writeableProperties value.
     */
    public ContentProperties getWriteableProperties() {
        return this.writeableProperties;
    }
}