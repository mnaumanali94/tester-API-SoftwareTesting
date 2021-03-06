/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.testing;

import org.hopto.apimatic.controllers.syncwrapper.SynchronousBase;
import org.hopto.apimatic.http.client.HttpCallBack;
import org.hopto.apimatic.http.client.HttpContext;
import org.hopto.apimatic.http.request.HttpRequest;
import org.hopto.apimatic.http.response.HttpResponse;

/**
 * An HTTPCallBack that captures the request and response for use later
 */
public class HttpCallBackCatcher extends SynchronousBase implements HttpCallBack {

    private HttpRequest request;
    private HttpResponse response;
    
    /**
     * Call back executed before the HTTP request is sent
     */
    public void OnBeforeRequest(HttpRequest request) {
        // Nothing to do here
    }

    /**
     * Call back executed after the HTTP response is received
     * but before the APICallBack's handler is called
     */
    public void OnAfterResponse(HttpContext context) {
        setRequest(context.getRequest());
        setResponse(context.getResponse());
        this.markAsDone();
    }

    /**
     * Get the HTTP Request object associated with this API call 
     * @return
     */
    public HttpRequest getRequest() {
        return request;
    }

    /**
     * Set the HTTP Request object associated with this API call
     * @param request
     */
    private void setRequest(HttpRequest prequest) {
        this.request = prequest;
    }

    /**
     * Get the HTTP Response object associated with this API call
     * @return
     */
    public HttpResponse getResponse() {
        return response;
    }

    /**
     * Get the HTTP Response object associated with this API call
     * @param httpResponse
     */
    private void setResponse(HttpResponse httpResponse) {
        this.response = httpResponse;
    }
}
