// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TestEntity;
import com.microsoft.graph.requests.extensions.ITestTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.TestTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType2RequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType2RequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType3RequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType3RequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Entity Request.
 */
public class TestEntityRequest extends BaseRequest implements ITestEntityRequest {
	
    /**
     * The request for the TestEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TestEntityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TestEntity.class);
    }

    /**
     * Gets the TestEntity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TestEntity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TestEntity from the service
     *
     * @return the TestEntity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TestEntity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TestEntity> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TestEntity with a source
     *
     * @param sourceTestEntity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TestEntity sourceTestEntity, final ICallback<? super TestEntity> callback) {
        send(HttpMethod.PATCH, callback, sourceTestEntity);
    }

    /**
     * Patches this TestEntity with a source
     *
     * @param sourceTestEntity the source object with updates
     * @return the updated TestEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TestEntity patch(final TestEntity sourceTestEntity) throws ClientException {
        return send(HttpMethod.PATCH, sourceTestEntity);
    }

    /**
     * Creates a TestEntity with a new object
     *
     * @param newTestEntity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TestEntity newTestEntity, final ICallback<? super TestEntity> callback) {
        send(HttpMethod.POST, callback, newTestEntity);
    }

    /**
     * Creates a TestEntity with a new object
     *
     * @param newTestEntity the new object to create
     * @return the created TestEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TestEntity post(final TestEntity newTestEntity) throws ClientException {
        return send(HttpMethod.POST, newTestEntity);
    }

    /**
     * Creates a TestEntity with a new object
     *
     * @param newTestEntity the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TestEntity newTestEntity, final ICallback<? super TestEntity> callback) {
        send(HttpMethod.PUT, callback, newTestEntity);
    }

    /**
     * Creates a TestEntity with a new object
     *
     * @param newTestEntity the object to create/update
     * @return the created TestEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TestEntity put(final TestEntity newTestEntity) throws ClientException {
        return send(HttpMethod.PUT, newTestEntity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITestEntityRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TestEntityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITestEntityRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TestEntityRequest)this;
     }

}

