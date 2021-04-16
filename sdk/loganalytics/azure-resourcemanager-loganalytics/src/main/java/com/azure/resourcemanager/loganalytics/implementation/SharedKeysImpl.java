// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.resourcemanager.loganalytics.fluent.models.SharedKeysInner;
import com.azure.resourcemanager.loganalytics.models.SharedKeys;

public final class SharedKeysImpl implements SharedKeys {
    private SharedKeysInner innerObject;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    SharedKeysImpl(
        SharedKeysInner innerObject, com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primarySharedKey() {
        return this.innerModel().primarySharedKey();
    }

    public String secondarySharedKey() {
        return this.innerModel().secondarySharedKey();
    }

    public SharedKeysInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}