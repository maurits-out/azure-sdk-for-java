// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.FieldsClient;
import com.azure.resourcemanager.automation.fluent.models.TypeFieldInner;
import com.azure.resourcemanager.automation.models.Fields;
import com.azure.resourcemanager.automation.models.TypeField;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class FieldsImpl implements Fields {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FieldsImpl.class);

    private final FieldsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public FieldsImpl(FieldsClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TypeField> listByType(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName) {
        PagedIterable<TypeFieldInner> inner =
            this.serviceClient().listByType(resourceGroupName, automationAccountName, moduleName, typeName);
        return Utils.mapPage(inner, inner1 -> new TypeFieldImpl(inner1, this.manager()));
    }

    public PagedIterable<TypeField> listByType(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName, Context context) {
        PagedIterable<TypeFieldInner> inner =
            this.serviceClient().listByType(resourceGroupName, automationAccountName, moduleName, typeName, context);
        return Utils.mapPage(inner, inner1 -> new TypeFieldImpl(inner1, this.manager()));
    }

    private FieldsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}