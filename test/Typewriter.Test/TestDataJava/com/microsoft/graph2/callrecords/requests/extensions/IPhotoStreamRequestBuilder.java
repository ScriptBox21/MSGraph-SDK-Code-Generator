// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.Photo;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph2.callrecords.requests.extensions.IPhotoStreamRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Photo Stream Request Builder.
 */
public interface IPhotoStreamRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @return the IPhotoStreamRequest instance
     */
    IPhotoStreamRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPhotoStreamRequest instance
     */
    IPhotoStreamRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);




}
