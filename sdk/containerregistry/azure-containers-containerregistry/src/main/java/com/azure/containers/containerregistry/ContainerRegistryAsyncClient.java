// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.implementation.ContainerRegistriesImpl;
import com.azure.containers.containerregistry.models.AcrErrorsException;
import com.azure.containers.containerregistry.models.DeleteRepositoryResult;
import com.azure.containers.containerregistry.models.ListRepositoriesOptions;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.withContext;

/**
 * Initializes a new instance of the asynchronous ContainerRegistry type.
 */
@ServiceClient(builder = ContainerRegistryClientBuilder.class, isAsync = true)
public final class ContainerRegistryAsyncClient {
    private final ContainerRegistriesImpl serviceClient;
    private final ClientLogger logger = new ClientLogger(ContainerRegistryAsyncClient.class);
    private static final String CONTINUATIONLINK_HEADER_NAME = "Link";
    private static final String LINK_MATCHER = "(<(.+)>;.*)";
    private static final Pattern CONTINUATIONLINK_PATTERN = Pattern.compile(LINK_MATCHER);

    /**
     * Initializes an instance of ContainerRegistries client.
     *
     * @param serviceClient the service client implementation.
     */
    ContainerRegistryAsyncClient(ContainerRegistriesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List repositories.
     *
     * @return list of repositories.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listRepositories() {
        ListRepositoriesOptions options = new ListRepositoriesOptions();
        return this.listRepositories(options);
    }

    /**
     * List repositories.
     *
     * @param options for the list repositories call.
     * @return list of repositories.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws NullPointerException thrown if the parameter is null.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listRepositories(ListRepositoriesOptions options) {
        if (options == null) {
            throw logger.logExceptionAsError(new NullPointerException("options can't be null"));
        }

        Integer pageSize = options.getMaxPageSize();
        return new PagedFlux<>(
            () -> withContext(context -> listRepositoriesSinglePageAsync(pageSize, context)),
            token -> withContext(context -> listRepositoriesNextSinglePageAsync(token, context)));
    }

    private PagedResponse<String> getPagedResponseWithContinuationToken(PagedResponse<String> listRepositoriesResponse) {
        String continuationLink = null;
        HttpHeaders headers = listRepositoriesResponse.getHeaders();

        if (headers != null) {
            String continuationLinkHeader = headers.getValue(CONTINUATIONLINK_HEADER_NAME);
            if (!CoreUtils.isNullOrEmpty(continuationLinkHeader)) {
                // TODO (<pallaviT>): ACR follows docker API spec which has continuation token in header.
                // It currently returns it in the header without the url which they intend to fix
                // in the upcoming releases.

                Matcher matcher = CONTINUATIONLINK_PATTERN.matcher(continuationLinkHeader);
                if (matcher.matches()) {
                    if (matcher.groupCount() == 2) {
                        String apiPath = matcher.group(2);
                        continuationLink = apiPath;
                    }
                }
            }
        }

        return new PagedResponseBase<String, String>(
            listRepositoriesResponse.getRequest(),
            listRepositoriesResponse.getStatusCode(),
            listRepositoriesResponse.getHeaders(),
            listRepositoriesResponse.getValue(),
            continuationLink,
            null
        );
    }

    Mono<PagedResponse<String>> listRepositoriesSinglePageAsync(Integer pageSize, Context context) {
        try {
            Mono<PagedResponse<String>> pagedResponseMono = this.serviceClient.listRepositoriesSinglePageAsync(null, pageSize, context)
                .map(res -> getPagedResponseWithContinuationToken(res));

            return pagedResponseMono;

        } catch (RuntimeException e) {
            return monoError(logger, e);
        }
    }

    Mono<PagedResponse<String>> listRepositoriesNextSinglePageAsync(String nextLink, Context context) {
        try {
            Mono<PagedResponse<String>> pagedResponseMono = this.serviceClient.listRepositoriesNextSinglePageAsync(nextLink, context);
            return pagedResponseMono.map(res -> getPagedResponseWithContinuationToken(res));
        } catch (RuntimeException e) {
            return monoError(logger, e);
        }
    }


    /**
     * Delete the repository identified by `name`.
     *
     * @param name Name of the image (including the namespace).
     * @return deleted repository.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DeleteRepositoryResult>> deleteRepositoryWithResponse(String name) {
        return withContext(context -> deleteRepositoryWithResponse(name, context));
    }

    Mono<Response<DeleteRepositoryResult>> deleteRepositoryWithResponse(String name, Context context) {
        if (CoreUtils.isNullOrEmpty(name)) {
            return Mono.error(logger.logExceptionAsError(new NullPointerException("repository name can't be null or empty.")));
        }

        return this.serviceClient.deleteRepositoryWithResponseAsync(name, context);
    }

    /**
     * Delete the repository identified by `name`.
     *
     * @param name Name of the image (including the namespace).
     * @return deleted repository.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeleteRepositoryResult> deleteRepository(String name) {
        return withContext(context -> this.deleteRepository(name, context));
    }

    Mono<DeleteRepositoryResult> deleteRepository(String name, Context context) {
        if (CoreUtils.isNullOrEmpty(name)) {
            return Mono.error(logger.logExceptionAsError(new NullPointerException("repository name can't be null or empty.")));
        }

        return this.serviceClient.deleteRepositoryAsync(name, context);
    }
}