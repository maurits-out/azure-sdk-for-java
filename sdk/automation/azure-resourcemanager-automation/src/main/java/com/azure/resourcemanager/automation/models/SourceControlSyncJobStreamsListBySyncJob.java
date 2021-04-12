// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobStreamInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response model for the list source control sync job streams operation. */
@Fluent
public final class SourceControlSyncJobStreamsListBySyncJob {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceControlSyncJobStreamsListBySyncJob.class);

    /*
     * The list of source control sync job streams.
     */
    @JsonProperty(value = "value")
    private List<SourceControlSyncJobStreamInner> value;

    /*
     * The next link.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of source control sync job streams.
     *
     * @return the value value.
     */
    public List<SourceControlSyncJobStreamInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of source control sync job streams.
     *
     * @param value the value value to set.
     * @return the SourceControlSyncJobStreamsListBySyncJob object itself.
     */
    public SourceControlSyncJobStreamsListBySyncJob withValue(List<SourceControlSyncJobStreamInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}