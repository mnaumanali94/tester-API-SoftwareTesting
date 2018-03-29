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

public class GlobalTestException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 5734921869337956897L;
    private String serverMessage;
    private int serverCode;
    /** GETTER
     * Represents the server's exception message
     */
    @JsonGetter("ServerMessage")
    public String getServerMessage ( ) { 
        return this.serverMessage;
    }
    
    /** SETTER
     * Represents the server's exception message
     */
    @JsonSetter("ServerMessage")
    private void setServerMessage (String value) { 
        this.serverMessage = value;
    }
 
    /** GETTER
     * Represents the server's error code
     */
    @JsonGetter("ServerCode")
    public int getServerCode ( ) { 
        return this.serverCode;
    }
    
    /** SETTER
     * Represents the server's error code
     */
    @JsonSetter("ServerCode")
    private void setServerCode (int value) { 
        this.serverCode = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public GlobalTestException(String reason, HttpContext context) {
        super(reason, context);
    }
}
 