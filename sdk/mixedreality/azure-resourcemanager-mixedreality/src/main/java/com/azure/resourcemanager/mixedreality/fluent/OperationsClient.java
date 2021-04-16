// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mixedreality.fluent.models.OperationInner;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public interface OperationsClient {
    /**
     * Exposing Available Operations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Resource Provider operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationInner> list();

    /**
     * Exposing Available Operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Resource Provider operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationInner> list(Context context);
}