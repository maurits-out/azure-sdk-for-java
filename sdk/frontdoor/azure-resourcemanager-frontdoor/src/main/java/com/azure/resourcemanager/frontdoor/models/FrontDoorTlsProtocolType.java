// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FrontDoorTlsProtocolType. */
public final class FrontDoorTlsProtocolType extends ExpandableStringEnum<FrontDoorTlsProtocolType> {
    /** Static value ServerNameIndication for FrontDoorTlsProtocolType. */
    public static final FrontDoorTlsProtocolType SERVER_NAME_INDICATION = fromString("ServerNameIndication");

    /**
     * Creates or finds a FrontDoorTlsProtocolType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FrontDoorTlsProtocolType.
     */
    @JsonCreator
    public static FrontDoorTlsProtocolType fromString(String name) {
        return fromString(name, FrontDoorTlsProtocolType.class);
    }

    /** @return known FrontDoorTlsProtocolType values. */
    public static Collection<FrontDoorTlsProtocolType> values() {
        return values(FrontDoorTlsProtocolType.class);
    }
}