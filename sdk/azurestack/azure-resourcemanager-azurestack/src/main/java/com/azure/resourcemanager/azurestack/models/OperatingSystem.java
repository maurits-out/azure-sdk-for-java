// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperatingSystem. */
public final class OperatingSystem extends ExpandableStringEnum<OperatingSystem> {
    /** Static value None for OperatingSystem. */
    public static final OperatingSystem NONE = fromString("None");

    /** Static value Windows for OperatingSystem. */
    public static final OperatingSystem WINDOWS = fromString("Windows");

    /** Static value Linux for OperatingSystem. */
    public static final OperatingSystem LINUX = fromString("Linux");

    /**
     * Creates or finds a OperatingSystem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperatingSystem.
     */
    @JsonCreator
    public static OperatingSystem fromString(String name) {
        return fromString(name, OperatingSystem.class);
    }

    /** @return known OperatingSystem values. */
    public static Collection<OperatingSystem> values() {
        return values(OperatingSystem.class);
    }
}