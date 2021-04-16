// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.fluent.models.BillingResponseListResultInner;
import com.azure.resourcemanager.hdinsight.models.BillingResources;
import com.azure.resourcemanager.hdinsight.models.BillingResponseListResult;
import com.azure.resourcemanager.hdinsight.models.VmSizeCompatibilityFilterV2;
import com.azure.resourcemanager.hdinsight.models.VmSizeProperty;
import java.util.Collections;
import java.util.List;

public final class BillingResponseListResultImpl implements BillingResponseListResult {
    private BillingResponseListResultInner innerObject;

    private final com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager;

    BillingResponseListResultImpl(
        BillingResponseListResultInner innerObject,
        com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> vmSizes() {
        List<String> inner = this.innerModel().vmSizes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> vmSizesWithEncryptionAtHost() {
        List<String> inner = this.innerModel().vmSizesWithEncryptionAtHost();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VmSizeCompatibilityFilterV2> vmSizeFilters() {
        List<VmSizeCompatibilityFilterV2> inner = this.innerModel().vmSizeFilters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VmSizeProperty> vmSizeProperties() {
        List<VmSizeProperty> inner = this.innerModel().vmSizeProperties();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<BillingResources> billingResources() {
        List<BillingResources> inner = this.innerModel().billingResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public BillingResponseListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.HDInsightManager manager() {
        return this.serviceManager;
    }
}