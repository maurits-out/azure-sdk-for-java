// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Properties related to Digital Twins Endpoint. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "endpointType",
    defaultImpl = DigitalTwinsEndpointResourceProperties.class)
@JsonTypeName("DigitalTwinsEndpointResourceProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ServiceBus", value = ServiceBus.class),
    @JsonSubTypes.Type(name = "EventHub", value = EventHub.class),
    @JsonSubTypes.Type(name = "EventGrid", value = EventGrid.class)
})
@Fluent
public class DigitalTwinsEndpointResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DigitalTwinsEndpointResourceProperties.class);

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EndpointProvisioningState provisioningState;

    /*
     * Time when the Endpoint was added to DigitalTwinsInstance.
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Specifies the authentication type being used for connecting to the
     * endpoint.
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /*
     * Dead letter storage secret for key-based authentication. Will be
     * obfuscated during read.
     */
    @JsonProperty(value = "deadLetterSecret")
    private String deadLetterSecret;

    /*
     * Dead letter storage URL for identity-based authentication.
     */
    @JsonProperty(value = "deadLetterUri")
    private String deadLetterUri;

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public EndpointProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createdTime property: Time when the Endpoint was added to DigitalTwinsInstance.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the authenticationType property: Specifies the authentication type being used for connecting to the endpoint.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Specifies the authentication type being used for connecting to the endpoint.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the DigitalTwinsEndpointResourceProperties object itself.
     */
    public DigitalTwinsEndpointResourceProperties withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the deadLetterSecret property: Dead letter storage secret for key-based authentication. Will be obfuscated
     * during read.
     *
     * @return the deadLetterSecret value.
     */
    public String deadLetterSecret() {
        return this.deadLetterSecret;
    }

    /**
     * Set the deadLetterSecret property: Dead letter storage secret for key-based authentication. Will be obfuscated
     * during read.
     *
     * @param deadLetterSecret the deadLetterSecret value to set.
     * @return the DigitalTwinsEndpointResourceProperties object itself.
     */
    public DigitalTwinsEndpointResourceProperties withDeadLetterSecret(String deadLetterSecret) {
        this.deadLetterSecret = deadLetterSecret;
        return this;
    }

    /**
     * Get the deadLetterUri property: Dead letter storage URL for identity-based authentication.
     *
     * @return the deadLetterUri value.
     */
    public String deadLetterUri() {
        return this.deadLetterUri;
    }

    /**
     * Set the deadLetterUri property: Dead letter storage URL for identity-based authentication.
     *
     * @param deadLetterUri the deadLetterUri value to set.
     * @return the DigitalTwinsEndpointResourceProperties object itself.
     */
    public DigitalTwinsEndpointResourceProperties withDeadLetterUri(String deadLetterUri) {
        this.deadLetterUri = deadLetterUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}