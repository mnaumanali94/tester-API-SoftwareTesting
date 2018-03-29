/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.models;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;

import org.hopto.apimatic.APIHelper;
import org.hopto.apimatic.http.response.HttpResponse;
import org.hopto.apimatic.http.response.HttpStringResponse;

/**
 * Represents dynamic response returned by an API call.
 * 
 * Allows user to lazily parse the response as a primtive
 * or a more complex type using parse(). 
 */
public class DynamicResponse {
    private HttpResponse response;
    private String responseString;

    /**
     * Instantiate class
     * @param responseBody
     */
    public DynamicResponse(HttpResponse responseBody) {
        this.response = responseBody;
    }
    
    /**
     * Parse response as instance of class cls
     * @param cls
     * @return
     * @throws ParseException
     */
    public <T> T parse(Class<T> cls) throws ParseException {
        try {
            return APIHelper.deserialize(getResponseString(), cls);
        } catch (Exception e) {
            throw new java.text.ParseException("Could not deserialize dynamic content as given type", 0);
        }
    }

    /**
     * Parse response as boolean.
     * @return Parsed value
     * @throws ParseException
     */
    public boolean parseAsBoolean() throws ParseException {
        return this.parse(Boolean.class);
    }

    /**
     * Parse response as boolean.
     * @return Parsed value
     * @throws ParseException
     */
    public byte parseAsByte() throws ParseException {
        return this.parse(Byte.class);
    }

    /**
     * Parse response as character.
     * @return Parsed value
     * @throws ParseException
     */
    public char parseAsCharacter() throws ParseException {
        return this.parse(Character.class);
    }

    /**
     * Parse response as float.
     * @return Parsed value
     * @throws ParseException
     */
    public float parseAsFloat() throws ParseException {
        return this.parse(Float.class);
    }

    /**
     * Parse response as integer.
     * @return Parsed value
     * @throws ParseException
     */
    public int parseAsInteger() throws ParseException {
        return this.parse(Integer.class);
    }

    /**
     * Parse response as long.
     * @return Parsed value
     * @throws ParseException
     */
    public long parseAsLong() throws ParseException {
        return this.parse(Long.class);
    }

    /**
     * Parse response as short.
     * @return Parsed value
     * @throws ParseException
     */
    public short parseAsShort() throws ParseException {
        return this.parse(Short.class);
    }

    /**
     * Parse response as double.
     * @return Parsed value
     * @throws ParseException
     */
    public double parseAsDouble() throws ParseException {
        return this.parse(Double.class);
    }
    
    /**
     * Parse response as string.
     * @return Parsed value
     * @throws ParseException
     */
    public String parseAsString() throws ParseException {
        try {
            return getResponseString();			
        } catch (Throwable e) {
            throw new java.text.ParseException("Could not deserialize dynamic content as given type", 0);
        }
    }

    /**
     * Parse response as a map of keys and values.
     * @return Parsed map
     * @throws ParseException
     */
    public Map<String, Object> parseAsDictionary() throws ParseException {
        try {
            return APIHelper.deserialize(getResponseString());
        } catch (IOException e) {
            throw new java.text.ParseException("Could not deserialize dynamic content as given type", 0);
        }
    }
    
    /**
     * Get the raw stream for the response body.
     * @return Raw body
     */
    public InputStream getRawBody() {
        return response.getRawBody();
    }
    
    /**
     * Get response headers for the HTTP response.
     * @return Headers
     */
    public Map<String, String> getHeaders() {
        return response.getHeaders();
    }

    /**
     * Get response as string
     * @return String
     */
    private String getResponseString() {
        if(responseString == null) {
            responseString = ((HttpStringResponse)response).getBody();
        }
        return responseString;
    }
}
