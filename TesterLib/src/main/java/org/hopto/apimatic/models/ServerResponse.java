/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ServerResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4979484986221558581L;
    private boolean passed;
    private String message;
    private LinkedHashMap<String, Object> input;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("passed")
    public boolean getPassed ( ) { 
        return this.passed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("passed")
    public void setPassed (boolean value) { 
        this.passed = value;
        notifyObservers(this.passed);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Message")
    public void setMessage (String value) { 
        this.message = value;
        notifyObservers(this.message);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("input")
    public LinkedHashMap<String, Object> getInput ( ) { 
        return this.input;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("input")
    public void setInput (LinkedHashMap<String, Object> value) { 
        this.input = value;
        notifyObservers(this.input);
    }
 
}
 