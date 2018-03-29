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
import org.hopto.apimatic.models.*;

public class NestedModelException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 5403492402399864212L;
    private String serverMessage;
    private String serverCode;
    private Validate model;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ServerMessage")
    public String getServerMessage ( ) { 
        return this.serverMessage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ServerMessage")
    private void setServerMessage (String value) { 
        this.serverMessage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ServerCode")
    public String getServerCode ( ) { 
        return this.serverCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ServerCode")
    private void setServerCode (String value) { 
        this.serverCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("model")
    public Validate getModel ( ) { 
        return this.model;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("model")
    private void setModel (Validate value) { 
        this.model = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public NestedModelException(String reason, HttpContext context) {
        super(reason, context);
    }
}
 