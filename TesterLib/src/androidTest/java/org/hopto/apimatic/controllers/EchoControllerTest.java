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
import org.hopto.apimatic.controllers.EchoController;
import org.hopto.apimatic.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EchoControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static EchoController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getEcho();
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
     * Todo Add description for test testJsonEcho
     * @throws Throwable
     */
    @Test
    public void testJsonEcho() throws Throwable {
        // Parameters for the API call
        Object input = APIHelper.deserialize("{\"uid\": \"1123213\", \"name\": \"Shahid\"}");

        // Set callback and perform API call
        DynamicResponse result = null;
        APICallBackCatcher<DynamicResponse> response = new APICallBackCatcher<DynamicResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.jsonEchoAsync(input, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"body\": {\"uid\": \"1123213\", \"name\": \"Shahid\"}}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
