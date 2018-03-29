/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import org.hopto.apimatic.*;
import org.hopto.apimatic.models.*;
import org.hopto.apimatic.exceptions.*;
import org.hopto.apimatic.http.client.HttpClient;
import org.hopto.apimatic.http.client.HttpContext;
import org.hopto.apimatic.http.request.HttpRequest;
import org.hopto.apimatic.http.response.HttpResponse;
import org.hopto.apimatic.http.response.HttpStringResponse;
import org.hopto.apimatic.http.client.APICallBack;

public class HeaderController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static HeaderController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the HeaderController class 
     */
    public static HeaderController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new HeaderController();
            }
        }
        return instance;
    }

    /**
     * Sends a single header params
     * @param    customHeader    Required parameter: Example: 
     * @param    value    Required parameter: Represents the value of the custom header
     * @return    Returns the void response from the API call 
     */
    public void sendHeadersAsync(
                final String customHeader,
                final String value,
                final APICallBack<ServerResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //validating required parameters
                if (null == customHeader) {
                    callBack.onFailure(null, new NullPointerException("The parameter \"customHeader\" is a required parameter and cannot be null."));
                    return;
                }

                if (null == value) {
                    callBack.onFailure(null, new NullPointerException("The parameter \"value\" is a required parameter and cannot be null."));
                    return;
                }

                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/header");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 4669337863575172871L;
                    {
                        put( "custom-header", customHeader );
                        put( "user-agent", "Stamplay SDK" );
                        put( "accept", "application/json" );
                    }
                };

                //load all fields for the outgoing API request
                Map<String, Object> _parameters = new HashMap<String, Object>() {
                    private static final long serialVersionUID = 4849273158474886208L;
                    {
                        put( "value", value );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();

                            //return null on 404
                            if (_responseCode == 404)
                                callBack.onSuccess(_context, null);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            ServerResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ServerResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}