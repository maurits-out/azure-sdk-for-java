// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KubeletDiskType. */
public final class KubeletDiskType extends ExpandableStringEnum<KubeletDiskType> {
    /** Static value OS for KubeletDiskType. */
    public static final KubeletDiskType OS = fromString("OS");

    /** Static value Temporary for KubeletDiskType. */
    public static final KubeletDiskType TEMPORARY = fromString("Temporary");

    /**
     * Creates or finds a KubeletDiskType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KubeletDiskType.
     */
    @JsonCreator
    public static KubeletDiskType fromString(String name) {
        return fromString(name, KubeletDiskType.class);
    }

    /** @return known KubeletDiskType values. */
    public static Collection<KubeletDiskType> values() {
        return values(KubeletDiskType.class);
    }
}