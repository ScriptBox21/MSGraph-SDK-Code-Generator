// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;
import com.microsoft.graph2.callrecords.models.extensions.CallRecord;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Record Request.
 */
public interface ICallRecordRequest extends IHttpRequest {

    /**
     * Gets the CallRecord from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<CallRecord> callback);

    /**
     * Gets the CallRecord from the service
     *
     * @return the CallRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CallRecord get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<CallRecord> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CallRecord with a source
     *
     * @param sourceCallRecord the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CallRecord sourceCallRecord, final ICallback<CallRecord> callback);

    /**
     * Patches this CallRecord with a source
     *
     * @param sourceCallRecord the source object with updates
     * @return the updated CallRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CallRecord patch(final CallRecord sourceCallRecord) throws ClientException;

    /**
     * Posts a CallRecord with a new object
     *
     * @param newCallRecord the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CallRecord newCallRecord, final ICallback<CallRecord> callback);

    /**
     * Posts a CallRecord with a new object
     *
     * @param newCallRecord the new object to create
     * @return the created CallRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CallRecord post(final CallRecord newCallRecord) throws ClientException;

    /**
     * Posts a CallRecord with a new object
     *
     * @param newCallRecord the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final CallRecord newCallRecord, final ICallback<CallRecord> callback);

    /**
     * Posts a CallRecord with a new object
     *
     * @param newCallRecord the object to create/update
     * @return the created CallRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CallRecord put(final CallRecord newCallRecord) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICallRecordRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICallRecordRequest expand(final String value);

}

