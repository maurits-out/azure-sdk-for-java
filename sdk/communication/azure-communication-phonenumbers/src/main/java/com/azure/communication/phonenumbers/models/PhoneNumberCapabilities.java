// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PhoneNumberCapabilities model. */
@Fluent
public final class PhoneNumberCapabilities {
    /*
     * Capability value for calling.
     */
    @JsonProperty(value = "calling", required = true)
    private PhoneNumberCapabilityType calling;

    /*
     * Capability value for SMS.
     */
    @JsonProperty(value = "sms", required = true)
    private PhoneNumberCapabilityType sms;

    /**
     * Get the calling property: Capability value for calling.
     *
     * @return the calling value.
     */
    public PhoneNumberCapabilityType getCalling() {
        return this.calling;
    }

    /**
     * Set the calling property: Capability value for calling.
     *
     * @param calling the calling value to set.
     * @return the PhoneNumberCapabilities object itself.
     */
    public PhoneNumberCapabilities setCalling(PhoneNumberCapabilityType calling) {
        this.calling = calling;
        return this;
    }

    /**
     * Get the sms property: Capability value for SMS.
     *
     * @return the sms value.
     */
    public PhoneNumberCapabilityType getSms() {
        return this.sms;
    }

    /**
     * Set the sms property: Capability value for SMS.
     *
     * @param sms the sms value to set.
     * @return the PhoneNumberCapabilities object itself.
     */
    public PhoneNumberCapabilities setSms(PhoneNumberCapabilityType sms) {
        this.sms = sms;
        return this;
    }
}