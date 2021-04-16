// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Base class for all control activities like IfCondition, ForEach , Until. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ControlActivity.class)
@JsonTypeName("Container")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ExecutePipeline", value = ExecutePipelineActivity.class),
    @JsonSubTypes.Type(name = "IfCondition", value = IfConditionActivity.class),
    @JsonSubTypes.Type(name = "Switch", value = SwitchActivity.class),
    @JsonSubTypes.Type(name = "ForEach", value = ForEachActivity.class),
    @JsonSubTypes.Type(name = "Wait", value = WaitActivity.class),
    @JsonSubTypes.Type(name = "Until", value = UntilActivity.class),
    @JsonSubTypes.Type(name = "Validation", value = ValidationActivity.class),
    @JsonSubTypes.Type(name = "Filter", value = FilterActivity.class),
    @JsonSubTypes.Type(name = "SetVariable", value = SetVariableActivity.class),
    @JsonSubTypes.Type(name = "AppendVariable", value = AppendVariableActivity.class),
    @JsonSubTypes.Type(name = "WebHook", value = WebhookActivity.class)
})
@Immutable
public class ControlActivity extends Activity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ControlActivity.class);

    /** {@inheritDoc} */
    @Override
    public ControlActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ControlActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ControlActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ControlActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
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
    }
}