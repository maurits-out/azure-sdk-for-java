// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SparkStatementLanguageType. */
public final class SparkStatementLanguageType extends ExpandableStringEnum<SparkStatementLanguageType> {
    /** Static value spark for SparkStatementLanguageType. */
    public static final SparkStatementLanguageType SPARK = fromString("spark");

    /** Static value pyspark for SparkStatementLanguageType. */
    public static final SparkStatementLanguageType PY_SPARK = fromString("pyspark");

    /** Static value dotnetspark for SparkStatementLanguageType. */
    public static final SparkStatementLanguageType DOT_NET_SPARK = fromString("dotnetspark");

    /** Static value sql for SparkStatementLanguageType. */
    public static final SparkStatementLanguageType SQL = fromString("sql");

    /**
     * Creates or finds a SparkStatementLanguageType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SparkStatementLanguageType.
     */
    @JsonCreator
    public static SparkStatementLanguageType fromString(String name) {
        return fromString(name, SparkStatementLanguageType.class);
    }

    /** @return known SparkStatementLanguageType values. */
    public static Collection<SparkStatementLanguageType> values() {
        return values(SparkStatementLanguageType.class);
    }
}