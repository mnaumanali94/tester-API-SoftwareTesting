/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.exceptions;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.hopto.apimatic.http.client.HttpContext;

public class LocalTestException 
        extends GlobalTestException {
    private static final long serialVersionUID = 4633342168095823624L;
    private String secretMessageForEndpoint;
    /** GETTER
     * Represents the specific endpoint info
     */
    @JsonGetter("SecretMessageForEndpoint")
    public String getSecretMessageForEndpoint ( ) { 
        return this.secretMessageForEndpoint;
    }
    
    /** SETTER
     * Represents the specific endpoint info
     */
    @JsonSetter("SecretMessageForEndpoint")
    private void setSecretMessageForEndpoint (String value) { 
        this.secretMessageForEndpoint = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public LocalTestException(String reason, HttpContext context) {
        super(reason, context);
    }
}
 