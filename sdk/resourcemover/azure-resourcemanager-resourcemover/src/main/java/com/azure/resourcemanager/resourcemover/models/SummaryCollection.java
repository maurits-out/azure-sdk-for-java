// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Summary Collection. */
@Fluent
public final class SummaryCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SummaryCollection.class);

    /*
     * Gets or sets the field name on which summary is done.
     */
    @JsonProperty(value = "fieldName")
    private String fieldName;

    /*
     * Gets or sets the list of summary items.
     */
    @JsonProperty(value = "summary")
    private List<Summary> summary;

    /**
     * Get the fieldName property: Gets or sets the field name on which summary is done.
     *
     * @return the fieldName value.
     */
    public String fieldName() {
        return this.fieldName;
    }

    /**
     * Set the fieldName property: Gets or sets the field name on which summary is done.
     *
     * @param fieldName the fieldName value to set.
     * @return the SummaryCollection object itself.
     */
    public SummaryCollection withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * Get the summary property: Gets or sets the list of summary items.
     *
     * @return the summary value.
     */
    public List<Summary> summary() {
        return this.summary;
    }

    /**
     * Set the summary property: Gets or sets the list of summary items.
     *
     * @param summary the summary value to set.
     * @return the SummaryCollection object itself.
     */
    public SummaryCollection withSummary(List<Summary> summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (summary() != null) {
            summary().forEach(e -> e.validate());
        }
    }
}