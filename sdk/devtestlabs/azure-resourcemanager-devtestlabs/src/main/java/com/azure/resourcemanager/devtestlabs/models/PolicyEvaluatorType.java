// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PolicyEvaluatorType. */
public final class PolicyEvaluatorType extends ExpandableStringEnum<PolicyEvaluatorType> {
    /** Static value AllowedValuesPolicy for PolicyEvaluatorType. */
    public static final PolicyEvaluatorType ALLOWED_VALUES_POLICY = fromString("AllowedValuesPolicy");

    /** Static value MaxValuePolicy for PolicyEvaluatorType. */
    public static final PolicyEvaluatorType MAX_VALUE_POLICY = fromString("MaxValuePolicy");

    /**
     * Creates or finds a PolicyEvaluatorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PolicyEvaluatorType.
     */
    @JsonCreator
    public static PolicyEvaluatorType fromString(String name) {
        return fromString(name, PolicyEvaluatorType.class);
    }

    /** @return known PolicyEvaluatorType values. */
    public static Collection<PolicyEvaluatorType> values() {
        return values(PolicyEvaluatorType.class);
    }
}