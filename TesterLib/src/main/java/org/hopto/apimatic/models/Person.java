/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.hopto.apimatic.DateTimeHelper;
import org.joda.time.LocalDate;
import org.joda.time.DateTime;

@JsonTypeInfo(
          use = JsonTypeInfo.Id.NAME,
          include = JsonTypeInfo.As.EXISTING_PROPERTY,
          property = "personType",
          defaultImpl = Person.class,
          visible = true)
@JsonSubTypes({
    @Type(value = Employee.class, name = "Empl"),
    @Type(value = Boss.class, name = "Boss")
})
@JsonInclude(Include.ALWAYS)
public class Person 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4810320633222399316L;
    private String address;
    private long age;
    private LocalDate birthday;
    private DateTime birthtime;
    private String name;
    private String uid;
    private String personType;
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
    @JsonGetter("age")
    public long getAge ( ) { 
        return this.age;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("age")
    public void setAge (long value) { 
        this.age = value;
        notifyObservers(this.age);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("birthday")
    @JsonSerialize(using=DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getBirthday ( ) { 
        return this.birthday;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("birthday")
    @JsonDeserialize(using=DateTimeHelper.SimpleDateDeserializer.class)
    public void setBirthday (LocalDate value) { 
        this.birthday = value;
        notifyObservers(this.birthday);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("birthtime")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getBirthtime ( ) { 
        return this.birthtime;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("birthtime")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setBirthtime (DateTime value) { 
        this.birthtime = value;
        notifyObservers(this.birthtime);
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("uid")
    public String getUid ( ) { 
        return this.uid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("uid")
    public void setUid (String value) { 
        this.uid = value;
        notifyObservers(this.uid);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("personType")
    public String getPersonType ( ) { 
        return this.personType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("personType")
    public void setPersonType (String value) { 
        this.personType = value;
        notifyObservers(this.personType);
    }
 
}
 