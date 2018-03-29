/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Job 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5359193246277762352L;
    private String company;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("company")
    public String getCompany ( ) { 
        return this.company;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("company")
    public void setCompany (String value) { 
        this.company = value;
        notifyObservers(this.company);
    }
 
}
 