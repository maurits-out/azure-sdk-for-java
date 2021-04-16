// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.JobSchedulesClient;
import com.azure.resourcemanager.automation.fluent.models.JobScheduleInner;
import com.azure.resourcemanager.automation.models.JobSchedule;
import com.azure.resourcemanager.automation.models.JobSchedules;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.UUID;

public final class JobSchedulesImpl implements JobSchedules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobSchedulesImpl.class);

    private final JobSchedulesClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public JobSchedulesImpl(
        JobSchedulesClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String automationAccountName, UUID jobScheduleId) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, jobScheduleId);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, UUID jobScheduleId, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, automationAccountName, jobScheduleId, context);
    }

    public JobSchedule get(String resourceGroupName, String automationAccountName, UUID jobScheduleId) {
        JobScheduleInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, jobScheduleId);
        if (inner != null) {
            return new JobScheduleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobSchedule> getWithResponse(
        String resourceGroupName, String automationAccountName, UUID jobScheduleId, Context context) {
        Response<JobScheduleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, jobScheduleId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobScheduleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<JobSchedule> listByAutomationAccount(String resourceGroupName, String automationAccountName) {
        PagedIterable<JobScheduleInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new JobScheduleImpl(inner1, this.manager()));
    }

    public PagedIterable<JobSchedule> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, String filter, Context context) {
        PagedIterable<JobScheduleInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName, filter, context);
        return Utils.mapPage(inner, inner1 -> new JobScheduleImpl(inner1, this.manager()));
    }

    public JobSchedule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        UUID jobScheduleId = UUID.fromString(Utils.getValueFromIdByName(id, "jobSchedules"));
        return this.getWithResponse(resourceGroupName, automationAccountName, jobScheduleId, Context.NONE).getValue();
    }

    public Response<JobSchedule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        UUID jobScheduleId = UUID.fromString(Utils.getValueFromIdByName(id, "jobSchedules"));
        return this.getWithResponse(resourceGroupName, automationAccountName, jobScheduleId, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        UUID jobScheduleId = UUID.fromString(Utils.getValueFromIdByName(id, "jobSchedules"));
        this.deleteWithResponse(resourceGroupName, automationAccountName, jobScheduleId, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        UUID jobScheduleId = UUID.fromString(Utils.getValueFromIdByName(id, "jobSchedules"));
        return this.deleteWithResponse(resourceGroupName, automationAccountName, jobScheduleId, context);
    }

    private JobSchedulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public JobScheduleImpl define(UUID name) {
        return new JobScheduleImpl(name, this.manager());
    }
}