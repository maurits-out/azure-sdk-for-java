// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Map;

/** A listed Azure Storage share item. */
@JacksonXmlRootElement(localName = "Share")
@Fluent
public final class ShareItemInternal {
    /*
     * The Name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The Snapshot property.
     */
    @JsonProperty(value = "Snapshot")
    private String snapshot;

    /*
     * The Deleted property.
     */
    @JsonProperty(value = "Deleted")
    private Boolean deleted;

    /*
     * The Version property.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * Properties of a share.
     */
    @JsonProperty(value = "Properties", required = true)
    private SharePropertiesInternal properties;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /**
     * Get the name property: The Name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     *
     * @param name the name value to set.
     * @return the ShareItemInternal object itself.
     */
    public ShareItemInternal setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the snapshot property: The Snapshot property.
     *
     * @return the snapshot value.
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The Snapshot property.
     *
     * @param snapshot the snapshot value to set.
     * @return the ShareItemInternal object itself.
     */
    public ShareItemInternal setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the deleted property: The Deleted property.
     *
     * @return the deleted value.
     */
    public Boolean isDeleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: The Deleted property.
     *
     * @param deleted the deleted value to set.
     * @return the ShareItemInternal object itself.
     */
    public ShareItemInternal setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the version property: The Version property.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The Version property.
     *
     * @param version the version value to set.
     * @return the ShareItemInternal object itself.
     */
    public ShareItemInternal setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the properties property: Properties of a share.
     *
     * @return the properties value.
     */
    public SharePropertiesInternal getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a share.
     *
     * @param properties the properties value to set.
     * @return the ShareItemInternal object itself.
     */
    public ShareItemInternal setProperties(SharePropertiesInternal properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: Dictionary of &lt;string&gt;.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Dictionary of &lt;string&gt;.
     *
     * @param metadata the metadata value to set.
     * @return the ShareItemInternal object itself.
     */
    public ShareItemInternal setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}