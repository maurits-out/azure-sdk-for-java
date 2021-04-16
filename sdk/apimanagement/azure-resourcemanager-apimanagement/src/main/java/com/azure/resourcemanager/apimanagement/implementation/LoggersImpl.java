// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.LoggersClient;
import com.azure.resourcemanager.apimanagement.fluent.models.LoggerContractInner;
import com.azure.resourcemanager.apimanagement.models.LoggerContract;
import com.azure.resourcemanager.apimanagement.models.Loggers;
import com.azure.resourcemanager.apimanagement.models.LoggersGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.LoggersGetResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LoggersImpl implements Loggers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoggersImpl.class);

    private final LoggersClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public LoggersImpl(
        LoggersClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LoggerContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<LoggerContractInner> inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new LoggerContractImpl(inner1, this.manager()));
    }

    public PagedIterable<LoggerContract> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        PagedIterable<LoggerContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new LoggerContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String loggerId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, loggerId);
    }

    public LoggersGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String loggerId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, loggerId, context);
    }

    public LoggerContract get(String resourceGroupName, String serviceName, String loggerId) {
        LoggerContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, loggerId);
        if (inner != null) {
            return new LoggerContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LoggerContract> getWithResponse(
        String resourceGroupName, String serviceName, String loggerId, Context context) {
        LoggersGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, loggerId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LoggerContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String loggerId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, loggerId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String loggerId, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, loggerId, ifMatch, context);
    }

    public LoggerContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String loggerId = Utils.getValueFromIdByName(id, "loggers");
        if (loggerId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'loggers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, loggerId, Context.NONE).getValue();
    }

    public Response<LoggerContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String loggerId = Utils.getValueFromIdByName(id, "loggers");
        if (loggerId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'loggers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, loggerId, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String loggerId = Utils.getValueFromIdByName(id, "loggers");
        if (loggerId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'loggers'.", id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, loggerId, localIfMatch, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String loggerId = Utils.getValueFromIdByName(id, "loggers");
        if (loggerId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'loggers'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, loggerId, ifMatch, context);
    }

    private LoggersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public LoggerContractImpl define(String name) {
        return new LoggerContractImpl(name, this.manager());
    }
}