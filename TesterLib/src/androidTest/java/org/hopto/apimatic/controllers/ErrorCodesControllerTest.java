/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.controllers;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.hopto.apimatic.models.*;
import org.hopto.apimatic.exceptions.*;
import org.hopto.apimatic.APIHelper;
import org.hopto.apimatic.DateTimeHelper;
import org.hopto.apimatic.Configuration;
import org.hopto.apimatic.testing.TestHelper;
import org.hopto.apimatic.controllers.ErrorCodesController;
import org.hopto.apimatic.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ErrorCodesControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static ErrorCodesController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getErrorCodes();
        applyConfiguration();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Todo Add description for test testGet501
     * @throws Throwable
     */
    @Test
    public void testGet501() throws Throwable {

        // Set callback and perform API call
        DynamicResponse result = null;
        APICallBackCatcher<DynamicResponse> response = new APICallBackCatcher<DynamicResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.get501Async(response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 501", 
                501, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Todo Add description for test testGet400
     * @throws Throwable
     */
    @Test
    public void testGet400() throws Throwable {

        // Set callback and perform API call
        DynamicResponse result = null;
        APICallBackCatcher<DynamicResponse> response = new APICallBackCatcher<DynamicResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.get400Async(response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 400", 
                400, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Todo Add description for test testGet500
     * @throws Throwable
     */
    @Test
    public void testGet500() throws Throwable {

        // Set callback and perform API call
        DynamicResponse result = null;
        APICallBackCatcher<DynamicResponse> response = new APICallBackCatcher<DynamicResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.get500Async(response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 500", 
                500, httpResponse.getResponse().getStatusCode());

    }

}
