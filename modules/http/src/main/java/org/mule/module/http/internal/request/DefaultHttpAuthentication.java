/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.http.internal.request;

import org.mule.api.MuleEvent;
import org.mule.module.http.api.HttpAuthentication;
import org.mule.module.http.internal.domain.request.HttpRequestBuilder;


public class DefaultHttpAuthentication implements HttpAuthentication
{
    private final HttpAuthenticationType type;

    private String username;
    private String password;

    public DefaultHttpAuthentication(HttpAuthenticationType type)
    {
        this.type = type;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public HttpAuthenticationType getType()
    {
        return type;
    }

    @Override
    public void authenticate(MuleEvent muleEvent, HttpRequestBuilder requestBuilder)
    {

    }

    @Override
    public boolean shouldRetry(MuleEvent firstAttemptResponseEvent)
    {
        return false;
    }


}
