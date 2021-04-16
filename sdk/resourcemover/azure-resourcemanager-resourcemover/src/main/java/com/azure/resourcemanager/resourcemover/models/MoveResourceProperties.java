// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the move resource properties. */
@Fluent
public final class MoveResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MoveResourceProperties.class);

    /*
     * Defines the provisioning states.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Gets or sets the Source ARM Id of the resource.
     */
    @JsonProperty(value = "sourceId", required = true)
    private String sourceId;

    /*
     * Gets or sets the Target ARM Id of the resource.
     */
    @JsonProperty(value = "targetId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetId;

    /*
     * Gets or sets the existing target ARM Id of the resource.
     */
    @JsonProperty(value = "existingTargetId")
    private String existingTargetId;

    /*
     * Gets or sets the resource settings.
     */
    @JsonProperty(value = "resourceSettings")
    private ResourceSettings resourceSettings;

    /*
     * Gets or sets the source resource settings.
     */
    @JsonProperty(value = "sourceResourceSettings", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceSettings sourceResourceSettings;

    /*
     * Defines the move resource status.
     */
    @JsonProperty(value = "moveStatus", access = JsonProperty.Access.WRITE_ONLY)
    private MoveResourcePropertiesMoveStatus moveStatus;

    /*
     * Gets or sets the move resource dependencies.
     */
    @JsonProperty(value = "dependsOn", access = JsonProperty.Access.WRITE_ONLY)
    private List<MoveResourceDependency> dependsOn;

    /*
     * Gets or sets the move resource dependencies overrides.
     */
    @JsonProperty(value = "dependsOnOverrides")
    private List<MoveResourceDependencyOverride> dependsOnOverrides;

    /*
     * Gets a value indicating whether the resolve action is required over the
     * move collection.
     */
    @JsonProperty(value = "isResolveRequired", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isResolveRequired;

    /*
     * Defines the move resource errors.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private MoveResourcePropertiesErrors errors;

    /**
     * Get the provisioningState property: Defines the provisioning states.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sourceId property: Gets or sets the Source ARM Id of the resource.
     *
     * @return the sourceId value.
     */
    public String sourceId() {
        return this.sourceId;
    }

    /**
     * Set the sourceId property: Gets or sets the Source ARM Id of the resource.
     *
     * @param sourceId the sourceId value to set.
     * @return the MoveResourceProperties object itself.
     */
    public MoveResourceProperties withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get the targetId property: Gets or sets the Target ARM Id of the resource.
     *
     * @return the targetId value.
     */
    public String targetId() {
        return this.targetId;
    }

    /**
     * Get the existingTargetId property: Gets or sets the existing target ARM Id of the resource.
     *
     * @return the existingTargetId value.
     */
    public String existingTargetId() {
        return this.existingTargetId;
    }

    /**
     * Set the existingTargetId property: Gets or sets the existing target ARM Id of the resource.
     *
     * @param existingTargetId the existingTargetId value to set.
     * @return the MoveResourceProperties object itself.
     */
    public MoveResourceProperties withExistingTargetId(String existingTargetId) {
        this.existingTargetId = existingTargetId;
        return this;
    }

    /**
     * Get the resourceSettings property: Gets or sets the resource settings.
     *
     * @return the resourceSettings value.
     */
    public ResourceSettings resourceSettings() {
        return this.resourceSettings;
    }

    /**
     * Set the resourceSettings property: Gets or sets the resource settings.
     *
     * @param resourceSettings the resourceSettings value to set.
     * @return the MoveResourceProperties object itself.
     */
    public MoveResourceProperties withResourceSettings(ResourceSettings resourceSettings) {
        this.resourceSettings = resourceSettings;
        return this;
    }

    /**
     * Get the sourceResourceSettings property: Gets or sets the source resource settings.
     *
     * @return the sourceResourceSettings value.
     */
    public ResourceSettings sourceResourceSettings() {
        return this.sourceResourceSettings;
    }

    /**
     * Get the moveStatus property: Defines the move resource status.
     *
     * @return the moveStatus value.
     */
    public MoveResourcePropertiesMoveStatus moveStatus() {
        return this.moveStatus;
    }

    /**
     * Get the dependsOn property: Gets or sets the move resource dependencies.
     *
     * @return the dependsOn value.
     */
    public List<MoveResourceDependency> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Get the dependsOnOverrides property: Gets or sets the move resource dependencies overrides.
     *
     * @return the dependsOnOverrides value.
     */
    public List<MoveResourceDependencyOverride> dependsOnOverrides() {
        return this.dependsOnOverrides;
    }

    /**
     * Set the dependsOnOverrides property: Gets or sets the move resource dependencies overrides.
     *
     * @param dependsOnOverrides the dependsOnOverrides value to set.
     * @return the MoveResourceProperties object itself.
     */
    public MoveResourceProperties withDependsOnOverrides(List<MoveResourceDependencyOverride> dependsOnOverrides) {
        this.dependsOnOverrides = dependsOnOverrides;
        return this;
    }

    /**
     * Get the isResolveRequired property: Gets a value indicating whether the resolve action is required over the move
     * collection.
     *
     * @return the isResolveRequired value.
     */
    public Boolean isResolveRequired() {
        return this.isResolveRequired;
    }

    /**
     * Get the errors property: Defines the move resource errors.
     *
     * @return the errors value.
     */
    public MoveResourcePropertiesErrors errors() {
        return this.errors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sourceId in model MoveResourceProperties"));
        }
        if (resourceSettings() != null) {
            resourceSettings().validate();
        }
        if (sourceResourceSettings() != null) {
            sourceResourceSettings().validate();
        }
        if (moveStatus() != null) {
            moveStatus().validate();
        }
        if (dependsOn() != null) {
            dependsOn().forEach(e -> e.validate());
        }
        if (dependsOnOverrides() != null) {
            dependsOnOverrides().forEach(e -> e.validate());
        }
        if (errors() != null) {
            errors().validate();
        }
    }
}