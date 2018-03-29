/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.models;

import java.io.File;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SendMixedArrayInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5060405972353246960L;
    private File file;
    private List<Integer> integers;
    private List<Employee> models;
    private List<String> strings;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("file")
    public File getFile ( ) { 
        return this.file;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("file")
    public void setFile (File value) { 
        this.file = value;
        notifyObservers(this.file);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("integers")
    public List<Integer> getIntegers ( ) { 
        return this.integers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("integers")
    public void setIntegers (List<Integer> value) { 
        this.integers = value;
        notifyObservers(this.integers);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("models")
    public List<Employee> getModels ( ) { 
        return this.models;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("models")
    public void setModels (List<Employee> value) { 
        this.models = value;
        notifyObservers(this.models);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("strings")
    public List<String> getStrings ( ) { 
        return this.strings;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("strings")
    public void setStrings (List<String> value) { 
        this.strings = value;
        notifyObservers(this.strings);
    }
 
}
 