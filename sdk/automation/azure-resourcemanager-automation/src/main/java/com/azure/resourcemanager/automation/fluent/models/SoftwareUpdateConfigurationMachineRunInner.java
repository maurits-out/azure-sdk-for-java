// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.JobNavigation;
import com.azure.resourcemanager.automation.models.UpdateConfigurationNavigation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Software update configuration machine run model. */
@JsonFlatten
@Fluent
public class SoftwareUpdateConfigurationMachineRunInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SoftwareUpdateConfigurationMachineRunInner.class);

    /*
     * Name of the software update configuration machine run
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource Id of the software update configuration machine run
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * name of the updated computer
     */
    @JsonProperty(value = "properties.targetComputer", access = JsonProperty.Access.WRITE_ONLY)
    private String targetComputer;

    /*
     * type of the updated computer.
     */
    @JsonProperty(value = "properties.targetComputerType", access = JsonProperty.Access.WRITE_ONLY)
    private String targetComputerType;

    /*
     * software update configuration triggered this run
     */
    @JsonProperty(value = "properties.softwareUpdateConfiguration")
    private UpdateConfigurationNavigation softwareUpdateConfiguration;

    /*
     * Status of the software update configuration machine run.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * Operating system target of the software update configuration triggered
     * this run
     */
    @JsonProperty(value = "properties.osType", access = JsonProperty.Access.WRITE_ONLY)
    private String osType;

    /*
     * correlation id of the software update configuration machine run
     */
    @JsonProperty(value = "properties.correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID correlationId;

    /*
     * source computer id of the software update configuration machine run
     */
    @JsonProperty(value = "properties.sourceComputerId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID sourceComputerId;

    /*
     * Start time of the software update configuration machine run.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * End time of the software update configuration machine run.
     */
    @JsonProperty(value = "properties.endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * configured duration for the software update configuration run.
     */
    @JsonProperty(value = "properties.configuredDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String configuredDuration;

    /*
     * Job associated with the software update configuration machine run
     */
    @JsonProperty(value = "properties.job")
    private JobNavigation job;

    /*
     * Creation time of the resource, which only appears in the response.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * createdBy property, which only appears in the response.
     */
    @JsonProperty(value = "properties.createdBy", access = JsonProperty.Access.WRITE_ONLY)
    private String createdBy;

    /*
     * Last time resource was modified, which only appears in the response.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * lastModifiedBy property, which only appears in the response.
     */
    @JsonProperty(value = "properties.lastModifiedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedBy;

    /*
     * Details of provisioning error
     */
    @JsonProperty(value = "properties.error")
    private ManagementError error;

    /**
     * Get the name property: Name of the software update configuration machine run.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Resource Id of the software update configuration machine run.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the targetComputer property: name of the updated computer.
     *
     * @return the targetComputer value.
     */
    public String targetComputer() {
        return this.targetComputer;
    }

    /**
     * Get the targetComputerType property: type of the updated computer.
     *
     * @return the targetComputerType value.
     */
    public String targetComputerType() {
        return this.targetComputerType;
    }

    /**
     * Get the softwareUpdateConfiguration property: software update configuration triggered this run.
     *
     * @return the softwareUpdateConfiguration value.
     */
    public UpdateConfigurationNavigation softwareUpdateConfiguration() {
        return this.softwareUpdateConfiguration;
    }

    /**
     * Set the softwareUpdateConfiguration property: software update configuration triggered this run.
     *
     * @param softwareUpdateConfiguration the softwareUpdateConfiguration value to set.
     * @return the SoftwareUpdateConfigurationMachineRunInner object itself.
     */
    public SoftwareUpdateConfigurationMachineRunInner withSoftwareUpdateConfiguration(
        UpdateConfigurationNavigation softwareUpdateConfiguration) {
        this.softwareUpdateConfiguration = softwareUpdateConfiguration;
        return this;
    }

    /**
     * Get the status property: Status of the software update configuration machine run.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the osType property: Operating system target of the software update configuration triggered this run.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Get the correlationId property: correlation id of the software update configuration machine run.
     *
     * @return the correlationId value.
     */
    public UUID correlationId() {
        return this.correlationId;
    }

    /**
     * Get the sourceComputerId property: source computer id of the software update configuration machine run.
     *
     * @return the sourceComputerId value.
     */
    public UUID sourceComputerId() {
        return this.sourceComputerId;
    }

    /**
     * Get the startTime property: Start time of the software update configuration machine run.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: End time of the software update configuration machine run.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the configuredDuration property: configured duration for the software update configuration run.
     *
     * @return the configuredDuration value.
     */
    public String configuredDuration() {
        return this.configuredDuration;
    }

    /**
     * Get the job property: Job associated with the software update configuration machine run.
     *
     * @return the job value.
     */
    public JobNavigation job() {
        return this.job;
    }

    /**
     * Set the job property: Job associated with the software update configuration machine run.
     *
     * @param job the job value to set.
     * @return the SoftwareUpdateConfigurationMachineRunInner object itself.
     */
    public SoftwareUpdateConfigurationMachineRunInner withJob(JobNavigation job) {
        this.job = job;
        return this;
    }

    /**
     * Get the creationTime property: Creation time of the resource, which only appears in the response.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the createdBy property: createdBy property, which only appears in the response.
     *
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Get the lastModifiedTime property: Last time resource was modified, which only appears in the response.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the lastModifiedBy property: lastModifiedBy property, which only appears in the response.
     *
     * @return the lastModifiedBy value.
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Get the error property: Details of provisioning error.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: Details of provisioning error.
     *
     * @param error the error value to set.
     * @return the SoftwareUpdateConfigurationMachineRunInner object itself.
     */
    public SoftwareUpdateConfigurationMachineRunInner withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (softwareUpdateConfiguration() != null) {
            softwareUpdateConfiguration().validate();
        }
        if (job() != null) {
            job().validate();
        }
    }
}