// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EntityType3;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type3Request.
 */
public class EntityType3Request extends BaseRequest implements IEntityType3Request {
	
    /**
     * The request for the EntityType3
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityType3Request(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EntityType3.class);
    }

    /**
     * Gets the EntityType3 from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EntityType3> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EntityType3 from the service
     *
     * @return the EntityType3 from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntityType3 get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EntityType3> callback) {
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
     * Patches this EntityType3 with a source
     *
     * @param sourceEntityType3 the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EntityType3 sourceEntityType3, final ICallback<? super EntityType3> callback) {
        send(HttpMethod.PATCH, callback, sourceEntityType3);
    }

    /**
     * Patches this EntityType3 with a source
     *
     * @param sourceEntityType3 the source object with updates
     * @return the updated EntityType3
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntityType3 patch(final EntityType3 sourceEntityType3) throws ClientException {
        return send(HttpMethod.PATCH, sourceEntityType3);
    }

    /**
     * Creates a EntityType3 with a new object
     *
     * @param newEntityType3 the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EntityType3 newEntityType3, final ICallback<? super EntityType3> callback) {
        send(HttpMethod.POST, callback, newEntityType3);
    }

    /**
     * Creates a EntityType3 with a new object
     *
     * @param newEntityType3 the new object to create
     * @return the created EntityType3
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntityType3 post(final EntityType3 newEntityType3) throws ClientException {
        return send(HttpMethod.POST, newEntityType3);
    }

    /**
     * Creates a EntityType3 with a new object
     *
     * @param newEntityType3 the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EntityType3 newEntityType3, final ICallback<? super EntityType3> callback) {
        send(HttpMethod.PUT, callback, newEntityType3);
    }

    /**
     * Creates a EntityType3 with a new object
     *
     * @param newEntityType3 the object to create/update
     * @return the created EntityType3
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntityType3 put(final EntityType3 newEntityType3) throws ClientException {
        return send(HttpMethod.PUT, newEntityType3);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEntityType3Request select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EntityType3Request)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEntityType3Request expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EntityType3Request)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IEntityType3Request filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (EntityType3Request)this;
     }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
     public IEntityType3Request orderBy(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
         return (EntityType3Request)this;
     }

}

