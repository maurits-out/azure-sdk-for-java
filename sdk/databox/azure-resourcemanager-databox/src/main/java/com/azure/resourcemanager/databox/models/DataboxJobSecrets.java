// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The secrets related to a databox job. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobSecretsType")
@JsonTypeName("DataBox")
@Fluent
public final class DataboxJobSecrets extends JobSecrets {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataboxJobSecrets.class);

    /*
     * Contains the list of secret objects for a job.
     */
    @JsonProperty(value = "podSecrets")
    private List<DataBoxSecret> podSecrets;

    /**
     * Get the podSecrets property: Contains the list of secret objects for a job.
     *
     * @return the podSecrets value.
     */
    public List<DataBoxSecret> podSecrets() {
        return this.podSecrets;
    }

    /**
     * Set the podSecrets property: Contains the list of secret objects for a job.
     *
     * @param podSecrets the podSecrets value to set.
     * @return the DataboxJobSecrets object itself.
     */
    public DataboxJobSecrets withPodSecrets(List<DataBoxSecret> podSecrets) {
        this.podSecrets = podSecrets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (podSecrets() != null) {
            podSecrets().forEach(e -> e.validate());
        }
    }
}