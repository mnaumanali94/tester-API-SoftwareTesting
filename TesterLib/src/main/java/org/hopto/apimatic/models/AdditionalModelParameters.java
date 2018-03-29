/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AdditionalModelParameters 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5191836231066583047L;
    private Job job;
    private String address;
    private String field;
    private String name;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Job")
    public Job getJob ( ) { 
        return this.job;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Job")
    public void setJob (Job value) { 
        this.job = value;
        notifyObservers(this.job);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
        notifyObservers(this.address);
    }
 
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
 