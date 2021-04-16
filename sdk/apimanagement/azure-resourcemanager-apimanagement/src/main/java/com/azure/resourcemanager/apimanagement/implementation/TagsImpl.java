// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.TagsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.TagContractInner;
import com.azure.resourcemanager.apimanagement.models.TagContract;
import com.azure.resourcemanager.apimanagement.models.Tags;
import com.azure.resourcemanager.apimanagement.models.TagsAssignToApiResponse;
import com.azure.resourcemanager.apimanagement.models.TagsGetByApiResponse;
import com.azure.resourcemanager.apimanagement.models.TagsGetByOperationResponse;
import com.azure.resourcemanager.apimanagement.models.TagsGetByProductResponse;
import com.azure.resourcemanager.apimanagement.models.TagsGetEntityStateByApiResponse;
import com.azure.resourcemanager.apimanagement.models.TagsGetEntityStateByOperationResponse;
import com.azure.resourcemanager.apimanagement.models.TagsGetEntityStateByProductResponse;
import com.azure.resourcemanager.apimanagement.models.TagsGetEntityStateResponse;
import com.azure.resourcemanager.apimanagement.models.TagsGetResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TagsImpl implements Tags {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TagsImpl.class);

    private final TagsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public TagsImpl(
        TagsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TagContract> listByOperation(
        String resourceGroupName, String serviceName, String apiId, String operationId) {
        PagedIterable<TagContractInner> inner =
            this.serviceClient().listByOperation(resourceGroupName, serviceName, apiId, operationId);
        return Utils.mapPage(inner, inner1 -> new TagContractImpl(inner1, this.manager()));
    }

    public PagedIterable<TagContract> listByOperation(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<TagContractInner> inner =
            this
                .serviceClient()
                .listByOperation(resourceGroupName, serviceName, apiId, operationId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new TagContractImpl(inner1, this.manager()));
    }

    public void getEntityStateByOperation(
        String resourceGroupName, String serviceName, String apiId, String operationId, String tagId) {
        this.serviceClient().getEntityStateByOperation(resourceGroupName, serviceName, apiId, operationId, tagId);
    }

    public TagsGetEntityStateByOperationResponse getEntityStateByOperationWithResponse(
        String resourceGroupName, String serviceName, String apiId, String operationId, String tagId, Context context) {
        return this
            .serviceClient()
            .getEntityStateByOperationWithResponse(resourceGroupName, serviceName, apiId, operationId, tagId, context);
    }

    public TagContract getByOperation(
        String resourceGroupName, String serviceName, String apiId, String operationId, String tagId) {
        TagContractInner inner =
            this.serviceClient().getByOperation(resourceGroupName, serviceName, apiId, operationId, tagId);
        if (inner != null) {
            return new TagContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagContract> getByOperationWithResponse(
        String resourceGroupName, String serviceName, String apiId, String operationId, String tagId, Context context) {
        TagsGetByOperationResponse inner =
            this
                .serviceClient()
                .getByOperationWithResponse(resourceGroupName, serviceName, apiId, operationId, tagId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TagContract assignToOperation(
        String resourceGroupName, String serviceName, String apiId, String operationId, String tagId) {
        TagContractInner inner =
            this.serviceClient().assignToOperation(resourceGroupName, serviceName, apiId, operationId, tagId);
        if (inner != null) {
            return new TagContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagContract> assignToOperationWithResponse(
        String resourceGroupName, String serviceName, String apiId, String operationId, String tagId, Context context) {
        Response<TagContractInner> inner =
            this
                .serviceClient()
                .assignToOperationWithResponse(resourceGroupName, serviceName, apiId, operationId, tagId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void detachFromOperation(
        String resourceGroupName, String serviceName, String apiId, String operationId, String tagId) {
        this.serviceClient().detachFromOperation(resourceGroupName, serviceName, apiId, operationId, tagId);
    }

    public Response<Void> detachFromOperationWithResponse(
        String resourceGroupName, String serviceName, String apiId, String operationId, String tagId, Context context) {
        return this
            .serviceClient()
            .detachFromOperationWithResponse(resourceGroupName, serviceName, apiId, operationId, tagId, context);
    }

    public PagedIterable<TagContract> listByApi(String resourceGroupName, String serviceName, String apiId) {
        PagedIterable<TagContractInner> inner = this.serviceClient().listByApi(resourceGroupName, serviceName, apiId);
        return Utils.mapPage(inner, inner1 -> new TagContractImpl(inner1, this.manager()));
    }

    public PagedIterable<TagContract> listByApi(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<TagContractInner> inner =
            this.serviceClient().listByApi(resourceGroupName, serviceName, apiId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new TagContractImpl(inner1, this.manager()));
    }

    public void getEntityStateByApi(String resourceGroupName, String serviceName, String apiId, String tagId) {
        this.serviceClient().getEntityStateByApi(resourceGroupName, serviceName, apiId, tagId);
    }

    public TagsGetEntityStateByApiResponse getEntityStateByApiWithResponse(
        String resourceGroupName, String serviceName, String apiId, String tagId, Context context) {
        return this
            .serviceClient()
            .getEntityStateByApiWithResponse(resourceGroupName, serviceName, apiId, tagId, context);
    }

    public TagContract getByApi(String resourceGroupName, String serviceName, String apiId, String tagId) {
        TagContractInner inner = this.serviceClient().getByApi(resourceGroupName, serviceName, apiId, tagId);
        if (inner != null) {
            return new TagContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagContract> getByApiWithResponse(
        String resourceGroupName, String serviceName, String apiId, String tagId, Context context) {
        TagsGetByApiResponse inner =
            this.serviceClient().getByApiWithResponse(resourceGroupName, serviceName, apiId, tagId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TagContract assignToApi(String resourceGroupName, String serviceName, String apiId, String tagId) {
        TagContractInner inner = this.serviceClient().assignToApi(resourceGroupName, serviceName, apiId, tagId);
        if (inner != null) {
            return new TagContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagContract> assignToApiWithResponse(
        String resourceGroupName, String serviceName, String apiId, String tagId, Context context) {
        TagsAssignToApiResponse inner =
            this.serviceClient().assignToApiWithResponse(resourceGroupName, serviceName, apiId, tagId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void detachFromApi(String resourceGroupName, String serviceName, String apiId, String tagId) {
        this.serviceClient().detachFromApi(resourceGroupName, serviceName, apiId, tagId);
    }

    public Response<Void> detachFromApiWithResponse(
        String resourceGroupName, String serviceName, String apiId, String tagId, Context context) {
        return this.serviceClient().detachFromApiWithResponse(resourceGroupName, serviceName, apiId, tagId, context);
    }

    public PagedIterable<TagContract> listByProduct(String resourceGroupName, String serviceName, String productId) {
        PagedIterable<TagContractInner> inner =
            this.serviceClient().listByProduct(resourceGroupName, serviceName, productId);
        return Utils.mapPage(inner, inner1 -> new TagContractImpl(inner1, this.manager()));
    }

    public PagedIterable<TagContract> listByProduct(
        String resourceGroupName,
        String serviceName,
        String productId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<TagContractInner> inner =
            this.serviceClient().listByProduct(resourceGroupName, serviceName, productId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new TagContractImpl(inner1, this.manager()));
    }

    public void getEntityStateByProduct(String resourceGroupName, String serviceName, String productId, String tagId) {
        this.serviceClient().getEntityStateByProduct(resourceGroupName, serviceName, productId, tagId);
    }

    public TagsGetEntityStateByProductResponse getEntityStateByProductWithResponse(
        String resourceGroupName, String serviceName, String productId, String tagId, Context context) {
        return this
            .serviceClient()
            .getEntityStateByProductWithResponse(resourceGroupName, serviceName, productId, tagId, context);
    }

    public TagContract getByProduct(String resourceGroupName, String serviceName, String productId, String tagId) {
        TagContractInner inner = this.serviceClient().getByProduct(resourceGroupName, serviceName, productId, tagId);
        if (inner != null) {
            return new TagContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagContract> getByProductWithResponse(
        String resourceGroupName, String serviceName, String productId, String tagId, Context context) {
        TagsGetByProductResponse inner =
            this.serviceClient().getByProductWithResponse(resourceGroupName, serviceName, productId, tagId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TagContract assignToProduct(String resourceGroupName, String serviceName, String productId, String tagId) {
        TagContractInner inner = this.serviceClient().assignToProduct(resourceGroupName, serviceName, productId, tagId);
        if (inner != null) {
            return new TagContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagContract> assignToProductWithResponse(
        String resourceGroupName, String serviceName, String productId, String tagId, Context context) {
        Response<TagContractInner> inner =
            this.serviceClient().assignToProductWithResponse(resourceGroupName, serviceName, productId, tagId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void detachFromProduct(String resourceGroupName, String serviceName, String productId, String tagId) {
        this.serviceClient().detachFromProduct(resourceGroupName, serviceName, productId, tagId);
    }

    public Response<Void> detachFromProductWithResponse(
        String resourceGroupName, String serviceName, String productId, String tagId, Context context) {
        return this
            .serviceClient()
            .detachFromProductWithResponse(resourceGroupName, serviceName, productId, tagId, context);
    }

    public PagedIterable<TagContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<TagContractInner> inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new TagContractImpl(inner1, this.manager()));
    }

    public PagedIterable<TagContract> listByService(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        String scope,
        Context context) {
        PagedIterable<TagContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, filter, top, skip, scope, context);
        return Utils.mapPage(inner, inner1 -> new TagContractImpl(inner1, this.manager()));
    }

    public void getEntityState(String resourceGroupName, String serviceName, String tagId) {
        this.serviceClient().getEntityState(resourceGroupName, serviceName, tagId);
    }

    public TagsGetEntityStateResponse getEntityStateWithResponse(
        String resourceGroupName, String serviceName, String tagId, Context context) {
        return this.serviceClient().getEntityStateWithResponse(resourceGroupName, serviceName, tagId, context);
    }

    public TagContract get(String resourceGroupName, String serviceName, String tagId) {
        TagContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, tagId);
        if (inner != null) {
            return new TagContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TagContract> getWithResponse(
        String resourceGroupName, String serviceName, String tagId, Context context) {
        TagsGetResponse inner = this.serviceClient().getWithResponse(resourceGroupName, serviceName, tagId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String tagId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, tagId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String tagId, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, tagId, ifMatch, context);
    }

    public TagContract getById(String id) {
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
        String tagId = Utils.getValueFromIdByName(id, "tags");
        if (tagId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tags'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, tagId, Context.NONE).getValue();
    }

    public Response<TagContract> getByIdWithResponse(String id, Context context) {
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
        String tagId = Utils.getValueFromIdByName(id, "tags");
        if (tagId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tags'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, tagId, context);
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
        String tagId = Utils.getValueFromIdByName(id, "tags");
        if (tagId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tags'.", id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, tagId, localIfMatch, Context.NONE).getValue();
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
        String tagId = Utils.getValueFromIdByName(id, "tags");
        if (tagId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tags'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, tagId, ifMatch, context);
    }

    private TagsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public TagContractImpl define(String name) {
        return new TagContractImpl(name, this.manager());
    }
}