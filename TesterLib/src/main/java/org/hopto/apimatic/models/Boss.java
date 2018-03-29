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
          defaultImpl = Boss.class,
          visible = true)
@JsonInclude(Include.ALWAYS)
public class Boss 
        extends Employee {
    private static final long serialVersionUID = 4772446832611879398L;
    private DateTime promotedAt;
    private Employee assistant;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("promotedAt")
    @JsonSerialize(using=DateTimeHelper.UnixTimestampSerializer.class)
    public DateTime getPromotedAt ( ) { 
        return this.promotedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("promotedAt")
    @JsonDeserialize(using=DateTimeHelper.UnixTimestampDeserializer.class)
    public void setPromotedAt (DateTime value) { 
        this.promotedAt = value;
        notifyObservers(this.promotedAt);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("assistant")
    public Employee getAssistant ( ) { 
        return this.assistant;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("assistant")
    public void setAssistant (Employee value) { 
        this.assistant = value;
        notifyObservers(this.assistant);
    }
 
}
 