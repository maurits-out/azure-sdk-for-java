// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.EventsOperationsClient;
import com.azure.resourcemanager.consumption.fluent.models.EventSummaryInner;
import com.azure.resourcemanager.consumption.models.Events;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in EventsOperationsClient. */
public final class EventsOperationsClientImpl implements EventsOperationsClient {
    private final ClientLogger logger = new ClientLogger(EventsOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final EventsOperationsService service;

    /** The service client containing this operation class. */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of EventsOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    EventsOperationsClientImpl(ConsumptionManagementClientImpl client) {
        this.service =
            RestProxy.create(EventsOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientEventsOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    private interface EventsOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Consumption/events")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Events>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("startDate") String startDate,
            @QueryParam("endDate") String endDate,
            @PathParam(value = "scope", encoded = true) String scope,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Events>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the events by billingAccountId and billingProfileId for given start and end date.
     *
     * @param startDate Start date.
     * @param endDate End date.
     * @param scope The scope associated with events operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventSummaryInner>> listSinglePageAsync(String startDate, String endDate, String scope) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (startDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter startDate is required and cannot be null."));
        }
        if (endDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter endDate is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            startDate,
                            endDate,
                            scope,
                            accept,
                            context))
            .<PagedResponse<EventSummaryInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists the events by billingAccountId and billingProfileId for given start and end date.
     *
     * @param startDate Start date.
     * @param endDate End date.
     * @param scope The scope associated with events operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventSummaryInner>> listSinglePageAsync(
        String startDate, String endDate, String scope, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (startDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter startDate is required and cannot be null."));
        }
        if (endDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter endDate is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), startDate, endDate, scope, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists the events by billingAccountId and billingProfileId for given start and end date.
     *
     * @param startDate Start date.
     * @param endDate End date.
     * @param scope The scope associated with events operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventSummaryInner> listAsync(String startDate, String endDate, String scope) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(startDate, endDate, scope), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the events by billingAccountId and billingProfileId for given start and end date.
     *
     * @param startDate Start date.
     * @param endDate End date.
     * @param scope The scope associated with events operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventSummaryInner> listAsync(String startDate, String endDate, String scope, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(startDate, endDate, scope, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the events by billingAccountId and billingProfileId for given start and end date.
     *
     * @param startDate Start date.
     * @param endDate End date.
     * @param scope The scope associated with events operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventSummaryInner> list(String startDate, String endDate, String scope) {
        return new PagedIterable<>(listAsync(startDate, endDate, scope));
    }

    /**
     * Lists the events by billingAccountId and billingProfileId for given start and end date.
     *
     * @param startDate Start date.
     * @param endDate End date.
     * @param scope The scope associated with events operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventSummaryInner> list(String startDate, String endDate, String scope, Context context) {
        return new PagedIterable<>(listAsync(startDate, endDate, scope, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventSummaryInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<EventSummaryInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventSummaryInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}