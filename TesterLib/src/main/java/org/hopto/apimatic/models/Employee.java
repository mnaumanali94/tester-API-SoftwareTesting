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
import org.joda.time.DateTime;

@JsonTypeInfo(
          use = JsonTypeInfo.Id.NAME,
          include = JsonTypeInfo.As.EXISTING_PROPERTY,
          property = "personType",
          defaultImpl = Employee.class,
          visible = true)
@JsonSubTypes({
    @Type(value = Boss.class, name = "Boss")
})
@JsonInclude(Include.ALWAYS)
public class Employee 
        extends Person {
    private static final long serialVersionUID = 5170406340317767164L;
    private String department;
    private List<Person> dependents;
    private DateTime hiredAt;
    private Days joiningDay = Days.MONDAY;
    private int salary;
    private List<Days> workingDays;
    private Person boss;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("department")
    public String getDepartment ( ) { 
        return this.department;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("department")
    public void setDepartment (String value) { 
        this.department = value;
        notifyObservers(this.department);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("dependents")
    public List<Person> getDependents ( ) { 
        return this.dependents;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("dependents")
    public void setDependents (List<Person> value) { 
        this.dependents = value;
        notifyObservers(this.dependents);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("hiredAt")
    @JsonSerialize(using=DateTimeHelper.Rfc1123DateTimeSerializer.class)
    public DateTime getHiredAt ( ) { 
        return this.hiredAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("hiredAt")
    @JsonDeserialize(using=DateTimeHelper.Rfc1123DateTimeDeserializer.class)
    public void setHiredAt (DateTime value) { 
        this.hiredAt = value;
        notifyObservers(this.hiredAt);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("joiningDay")
    public Days getJoiningDay ( ) { 
        return this.joiningDay;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("joiningDay")
    public void setJoiningDay (Days value) { 
        this.joiningDay = value;
        notifyObservers(this.joiningDay);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("salary")
    public int getSalary ( ) { 
        return this.salary;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("salary")
    public void setSalary (int value) { 
        this.salary = value;
        notifyObservers(this.salary);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("workingDays")
    public List<Days> getWorkingDays ( ) { 
        return this.workingDays;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("workingDays")
    public void setWorkingDays (List<Days> value) { 
        this.workingDays = value;
        notifyObservers(this.workingDays);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("boss")
    public Person getBoss ( ) { 
        return this.boss;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("boss")
    public void setBoss (Person value) { 
        this.boss = value;
        notifyObservers(this.boss);
    }
 
}
 