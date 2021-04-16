// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.resourcemanager.devtestlabs.fluent.models.OperationMetadataInner;

/** An immutable client-side representation of OperationMetadata. */
public interface OperationMetadata {
    /**
     * Gets the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: The object that describes the operations.
     *
     * @return the display value.
     */
    OperationMetadataDisplay display();

    /**
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.OperationMetadataInner object.
     *
     * @return the inner object.
     */
    OperationMetadataInner innerModel();
}