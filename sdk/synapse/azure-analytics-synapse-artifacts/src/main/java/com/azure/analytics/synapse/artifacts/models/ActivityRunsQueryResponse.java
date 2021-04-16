// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list activity runs. */
@Fluent
public final class ActivityRunsQueryResponse {
    /*
     * List of activity runs.
     */
    @JsonProperty(value = "value", required = true)
    private List<ActivityRun> value;

    /*
     * The continuation token for getting the next page of results, if any
     * remaining results exist, null otherwise.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * Get the value property: List of activity runs.
     *
     * @return the value value.
     */
    public List<ActivityRun> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of activity runs.
     *
     * @param value the value value to set.
     * @return the ActivityRunsQueryResponse object itself.
     */
    public ActivityRunsQueryResponse setValue(List<ActivityRun> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the continuationToken property: The continuation token for getting the next page of results, if any remaining
     * results exist, null otherwise.
     *
     * @return the continuationToken value.
     */
    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: The continuation token for getting the next page of results, if any remaining
     * results exist, null otherwise.
     *
     * @param continuationToken the continuationToken value to set.
     * @return the ActivityRunsQueryResponse object itself.
     */
    public ActivityRunsQueryResponse setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
}