// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

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
import com.azure.resourcemanager.billing.fluent.BillingPeriodsClient;
import com.azure.resourcemanager.billing.fluent.models.BillingPeriodInner;
import com.azure.resourcemanager.billing.models.BillingPeriodsListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BillingPeriodsClient. */
public final class BillingPeriodsClientImpl implements BillingPeriodsClient {
    private final ClientLogger logger = new ClientLogger(BillingPeriodsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final BillingPeriodsService service;

    /** The service client containing this operation class. */
    private final BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingPeriodsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BillingPeriodsClientImpl(BillingManagementClientImpl client) {
        this.service =
            RestProxy.create(BillingPeriodsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingManagementClientBillingPeriods to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BillingManagementCli")
    private interface BillingPeriodsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BillingPeriodsListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @QueryParam("$skiptoken") String skiptoken,
            @QueryParam("$top") Integer top,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BillingPeriodInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingPeriodName") String billingPeriodName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BillingPeriodsListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the available billing periods for a subscription in reverse chronological order. This is only supported for
     * Azure Web-Direct subscriptions. Other subscription types which were not purchased directly through the Azure web
     * portal are not supported through this preview API.
     *
     * @param filter May be used to filter billing periods by billingPeriodEndDate. The filter supports 'eq', 'lt',
     *     'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N billing periods.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing billing periods.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BillingPeriodInner>> listSinglePageAsync(String filter, String skiptoken, Integer top) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            apiVersion,
                            filter,
                            skiptoken,
                            top,
                            accept,
                            context))
            .<PagedResponse<BillingPeriodInner>>map(
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
     * Lists the available billing periods for a subscription in reverse chronological order. This is only supported for
     * Azure Web-Direct subscriptions. Other subscription types which were not purchased directly through the Azure web
     * portal are not supported through this preview API.
     *
     * @param filter May be used to filter billing periods by billingPeriodEndDate. The filter supports 'eq', 'lt',
     *     'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N billing periods.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing billing periods.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BillingPeriodInner>> listSinglePageAsync(
        String filter, String skiptoken, Integer top, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                apiVersion,
                filter,
                skiptoken,
                top,
                accept,
                context)
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
     * Lists the available billing periods for a subscription in reverse chronological order. This is only supported for
     * Azure Web-Direct subscriptions. Other subscription types which were not purchased directly through the Azure web
     * portal are not supported through this preview API.
     *
     * @param filter May be used to filter billing periods by billingPeriodEndDate. The filter supports 'eq', 'lt',
     *     'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N billing periods.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing billing periods.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<BillingPeriodInner> listAsync(String filter, String skiptoken, Integer top) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, skiptoken, top), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the available billing periods for a subscription in reverse chronological order. This is only supported for
     * Azure Web-Direct subscriptions. Other subscription types which were not purchased directly through the Azure web
     * portal are not supported through this preview API.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing billing periods.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<BillingPeriodInner> listAsync() {
        final String filter = null;
        final String skiptoken = null;
        final Integer top = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, skiptoken, top), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the available billing periods for a subscription in reverse chronological order. This is only supported for
     * Azure Web-Direct subscriptions. Other subscription types which were not purchased directly through the Azure web
     * portal are not supported through this preview API.
     *
     * @param filter May be used to filter billing periods by billingPeriodEndDate. The filter supports 'eq', 'lt',
     *     'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N billing periods.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing billing periods.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<BillingPeriodInner> listAsync(String filter, String skiptoken, Integer top, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, skiptoken, top, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the available billing periods for a subscription in reverse chronological order. This is only supported for
     * Azure Web-Direct subscriptions. Other subscription types which were not purchased directly through the Azure web
     * portal are not supported through this preview API.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing billing periods.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BillingPeriodInner> list() {
        final String filter = null;
        final String skiptoken = null;
        final Integer top = null;
        return new PagedIterable<>(listAsync(filter, skiptoken, top));
    }

    /**
     * Lists the available billing periods for a subscription in reverse chronological order. This is only supported for
     * Azure Web-Direct subscriptions. Other subscription types which were not purchased directly through the Azure web
     * portal are not supported through this preview API.
     *
     * @param filter May be used to filter billing periods by billingPeriodEndDate. The filter supports 'eq', 'lt',
     *     'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N billing periods.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing billing periods.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BillingPeriodInner> list(String filter, String skiptoken, Integer top, Context context) {
        return new PagedIterable<>(listAsync(filter, skiptoken, top, context));
    }

    /**
     * Gets a named billing period. This is only supported for Azure Web-Direct subscriptions. Other subscription types
     * which were not purchased directly through the Azure web portal are not supported through this preview API.
     *
     * @param billingPeriodName The name of a BillingPeriod resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a named billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BillingPeriodInner>> getWithResponseAsync(String billingPeriodName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            apiVersion,
                            billingPeriodName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a named billing period. This is only supported for Azure Web-Direct subscriptions. Other subscription types
     * which were not purchased directly through the Azure web portal are not supported through this preview API.
     *
     * @param billingPeriodName The name of a BillingPeriod resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a named billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BillingPeriodInner>> getWithResponseAsync(String billingPeriodName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                apiVersion,
                billingPeriodName,
                accept,
                context);
    }

    /**
     * Gets a named billing period. This is only supported for Azure Web-Direct subscriptions. Other subscription types
     * which were not purchased directly through the Azure web portal are not supported through this preview API.
     *
     * @param billingPeriodName The name of a BillingPeriod resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a named billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BillingPeriodInner> getAsync(String billingPeriodName) {
        return getWithResponseAsync(billingPeriodName)
            .flatMap(
                (Response<BillingPeriodInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a named billing period. This is only supported for Azure Web-Direct subscriptions. Other subscription types
     * which were not purchased directly through the Azure web portal are not supported through this preview API.
     *
     * @param billingPeriodName The name of a BillingPeriod resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a named billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BillingPeriodInner get(String billingPeriodName) {
        return getAsync(billingPeriodName).block();
    }

    /**
     * Gets a named billing period. This is only supported for Azure Web-Direct subscriptions. Other subscription types
     * which were not purchased directly through the Azure web portal are not supported through this preview API.
     *
     * @param billingPeriodName The name of a BillingPeriod resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a named billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BillingPeriodInner> getWithResponse(String billingPeriodName, Context context) {
        return getWithResponseAsync(billingPeriodName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing billing periods.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BillingPeriodInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<BillingPeriodInner>>map(
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
     * @return result of listing billing periods.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BillingPeriodInner>> listNextSinglePageAsync(String nextLink, Context context) {
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