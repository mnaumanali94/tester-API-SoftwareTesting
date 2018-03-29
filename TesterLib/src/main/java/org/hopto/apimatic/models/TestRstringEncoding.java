/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TestRstringEncoding 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4621720966606700061L;
    private String field;
    private String name;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("field")
    public String getField ( ) { 
        return this.field;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("field")
    public void setField (String value) { 
        this.field = value;
        notifyObservers(this.field);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
}
 