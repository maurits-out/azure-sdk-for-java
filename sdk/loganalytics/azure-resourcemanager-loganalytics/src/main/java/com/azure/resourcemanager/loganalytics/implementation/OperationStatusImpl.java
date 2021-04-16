// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.loganalytics.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.loganalytics.models.OperationStatus;

public final class OperationStatusImpl implements OperationStatus {
    private OperationStatusInner innerObject;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    OperationStatusImpl(
        OperationStatusInner innerObject, com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String startTime() {
        return this.innerModel().startTime();
    }

    public String endTime() {
        return this.innerModel().endTime();
    }

    public String status() {
        return this.innerModel().status();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public OperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}