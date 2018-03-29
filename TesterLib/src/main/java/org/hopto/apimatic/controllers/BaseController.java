/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.controllers;

import org.hopto.apimatic.exceptions.*;
import org.hopto.apimatic.http.client.HttpClient;
import org.hopto.apimatic.http.client.HttpContext;
import org.hopto.apimatic.http.client.HttpCallBack;
import org.hopto.apimatic.http.client.VolleyClient;
import org.hopto.apimatic.http.response.HttpResponse;

public abstract class BaseController {
    /**
     * Private variable to keep shared reference of client instance
     */
    private static HttpClient clientInstance = null;
    private static Object syncObject = new Object();

    /**
     * Protected variable to keep reference of httpCallBack instance if user provides any
     */
    protected HttpCallBack httpCallBack = null;
    
    /**
     * Get httpCallBack associated with this controller
     * @return HttpCallBack
     */
    public HttpCallBack getHttpCallBack() {
        return httpCallBack;
    }
    
    /**
     * Set the httpCallBack for this controller
     * @param httpCallBack
     */
    public void setHttpCallBack(HttpCallBack httpCallBack) {
        this.httpCallBack = httpCallBack;
    }

    /**
     * Shared instance of the Http client
     * @return The shared instance of the http client 
     */
    public static HttpClient getClientInstance() {
        synchronized (syncObject) {
            if (null == clientInstance) {
                clientInstance = VolleyClient.getSharedInstance();
    }
        }
        return clientInstance;
    }

    /**
     * Shared instance of the Http client
     * @param    client    The shared instance of the http client 
     */
    public static void setClientInstance(HttpClient client) {
        synchronized (syncObject) {
            if (null != client) {
                clientInstance = client;
            }
        }
    }

    /**
     * Validates the response against HTTP errors defined at the API level
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response 
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws APIException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if (responseCode == 400)
            throw new APIException("400 Global", context);

        if (responseCode == 402)
            throw new APIException("402 Global", context);

        if (responseCode == 403)
            throw new APIException("403 Global", context);

        if (responseCode == 404)
            throw new APIException("404 Global", context);

        if (responseCode == 500)
            throw new GlobalTestException("500 Global", context);

        if ((responseCode < 200) || (responseCode > 208)) //[200,208] = HTTP OK
            throw new GlobalTestException("Invalid response.", context);

    }
}
