// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** lobbyBypassSettings. */
@Fluent
public final class MicrosoftGraphLobbyBypassSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphLobbyBypassSettings.class);

    /*
     * Specifies whether or not to always let dial-in callers bypass the lobby.
     * Optional.
     */
    @JsonProperty(value = "isDialInBypassEnabled")
    private Boolean isDialInBypassEnabled;

    /*
     * The scope property.
     */
    @JsonProperty(value = "scope")
    private MicrosoftGraphLobbyBypassScope scope;

    /*
     * lobbyBypassSettings
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the isDialInBypassEnabled property: Specifies whether or not to always let dial-in callers bypass the lobby.
     * Optional.
     *
     * @return the isDialInBypassEnabled value.
     */
    public Boolean isDialInBypassEnabled() {
        return this.isDialInBypassEnabled;
    }

    /**
     * Set the isDialInBypassEnabled property: Specifies whether or not to always let dial-in callers bypass the lobby.
     * Optional.
     *
     * @param isDialInBypassEnabled the isDialInBypassEnabled value to set.
     * @return the MicrosoftGraphLobbyBypassSettings object itself.
     */
    public MicrosoftGraphLobbyBypassSettings withIsDialInBypassEnabled(Boolean isDialInBypassEnabled) {
        this.isDialInBypassEnabled = isDialInBypassEnabled;
        return this;
    }

    /**
     * Get the scope property: The scope property.
     *
     * @return the scope value.
     */
    public MicrosoftGraphLobbyBypassScope scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope property.
     *
     * @param scope the scope value to set.
     * @return the MicrosoftGraphLobbyBypassSettings object itself.
     */
    public MicrosoftGraphLobbyBypassSettings withScope(MicrosoftGraphLobbyBypassScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the additionalProperties property: lobbyBypassSettings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: lobbyBypassSettings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphLobbyBypassSettings object itself.
     */
    public MicrosoftGraphLobbyBypassSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}