/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Days {
    SUNDAY, //TODO: Write general description for this element
    MONDAY, //TODO: Write general description for this element
    TUESDAY, //TODO: Write general description for this element
    WEDNESDAY_, //TODO: Write general description for this element
    THURSDAY, //TODO: Write general description for this element
    FRI_DAY, //TODO: Write general description for this element
    SATURDAY; //TODO: Write general description for this element

    private static TreeMap<String, Days> valueMap = new TreeMap<String, Days>();
    private String value;

    static {
        SUNDAY.value = "Sunday";
        MONDAY.value = "Monday";
        TUESDAY.value = "Tuesday";
        WEDNESDAY_.value = "Wednesday";
        THURSDAY.value = "Thursday";
        FRI_DAY.value = "Friday";
        SATURDAY.value = "Saturday";

        valueMap.put("Sunday", SUNDAY);
        valueMap.put("Monday", MONDAY);
        valueMap.put("Tuesday", TUESDAY);
        valueMap.put("Wednesday", WEDNESDAY_);
        valueMap.put("Thursday", THURSDAY);
        valueMap.put("Friday", FRI_DAY);
        valueMap.put("Saturday", SATURDAY);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Days fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Days values to list of string values
     * @param toConvert The list of Days values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Days> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Days enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 