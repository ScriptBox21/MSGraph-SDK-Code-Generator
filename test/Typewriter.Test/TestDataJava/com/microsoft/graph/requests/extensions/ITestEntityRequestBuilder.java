// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TestEntity;
import com.microsoft.graph.requests.extensions.ITestTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType2RequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType3RequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Test Entity Request Builder.
 */
public interface ITestEntityRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ITestEntityRequest instance
     */
    ITestEntityRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ITestEntityRequest instance
     */
    ITestEntityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for TestType
     *
     * @return the ITestTypeWithReferenceRequestBuilder instance
     */
    ITestTypeWithReferenceRequestBuilder testNav();

    /**
     * Gets the request builder for EntityType2
     *
     * @return the IEntityType2WithReferenceRequestBuilder instance
     */
    IEntityType2WithReferenceRequestBuilder testInvalidNav();

    /**
     * Gets the request builder for EntityType3
     *
     * @return the IEntityType3WithReferenceRequestBuilder instance
     */
    IEntityType3WithReferenceRequestBuilder testExplicitNav();

}