/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic;

import org.hopto.apimatic.controllers.*;
import org.hopto.apimatic.http.client.HttpClient;

public class TesterClient {
    /**
     * Singleton access to QueryParam controller
     * @return	Returns the QueryParamController instance 
     */
    public QueryParamController getQueryParam() {
        return QueryParamController.getInstance();
    }

    /**
     * Singleton access to TemplateParams controller
     * @return	Returns the TemplateParamsController instance 
     */
    public TemplateParamsController getTemplateParams() {
        return TemplateParamsController.getInstance();
    }

    /**
     * Singleton access to BodyParams controller
     * @return	Returns the BodyParamsController instance 
     */
    public BodyParamsController getBodyParams() {
        return BodyParamsController.getInstance();
    }

    /**
     * Singleton access to FormParams controller
     * @return	Returns the FormParamsController instance 
     */
    public FormParamsController getFormParams() {
        return FormParamsController.getInstance();
    }

    /**
     * Singleton access to Header controller
     * @return	Returns the HeaderController instance 
     */
    public HeaderController getHeader() {
        return HeaderController.getInstance();
    }

    /**
     * Singleton access to Echo controller
     * @return	Returns the EchoController instance 
     */
    public EchoController getEcho() {
        return EchoController.getInstance();
    }

    /**
     * Singleton access to ResponseTypes controller
     * @return	Returns the ResponseTypesController instance 
     */
    public ResponseTypesController getResponseTypes() {
        return ResponseTypesController.getInstance();
    }

    /**
     * Singleton access to ErrorCodes controller
     * @return	Returns the ErrorCodesController instance 
     */
    public ErrorCodesController getErrorCodes() {
        return ErrorCodesController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public TesterClient() {
    }

}