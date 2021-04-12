// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeMonitoringDataInner;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeMonitoringData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeNodeMonitoringData;
import java.util.Collections;
import java.util.List;

public final class IntegrationRuntimeMonitoringDataImpl implements IntegrationRuntimeMonitoringData {
    private IntegrationRuntimeMonitoringDataInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    IntegrationRuntimeMonitoringDataImpl(
        IntegrationRuntimeMonitoringDataInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public List<IntegrationRuntimeNodeMonitoringData> nodes() {
        List<IntegrationRuntimeNodeMonitoringData> inner = this.innerModel().nodes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public IntegrationRuntimeMonitoringDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}