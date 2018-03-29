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
import org.hopto.apimatic.controllers.FormParamsController;
import org.hopto.apimatic.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FormParamsControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static FormParamsController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getFormParams();
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
     * Todo Add description for test testSendStringInFormWithNewLine1
     * @throws Throwable
     */
    @Test
    public void testSendStringInFormWithNewLine1() throws Throwable {
        // Parameters for the API call
        TestNstringEncoding body = APIHelper.deserialize("{\"name\":\"farhan\", \"field\":\"QA\"}", new TypeReference<TestNstringEncoding>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringInFormWithNewLineAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringInFormWithNewLine2
     * @throws Throwable
     */
    @Test
    public void testSendStringInFormWithNewLine2() throws Throwable {
        // Parameters for the API call
        TestNstringEncoding body = APIHelper.deserialize("{\"name\":\"farhan\", \"field\":\"QA&Dev\"}", new TypeReference<TestNstringEncoding>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringInFormWithNewLineAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringInFormWithNewLine3
     * @throws Throwable
     */
    @Test
    public void testSendStringInFormWithNewLine3() throws Throwable {
        // Parameters for the API call
        TestNstringEncoding body = APIHelper.deserialize("{\"name\":\"farhan&nouman\", \"field\":\"QA\"}", new TypeReference<TestNstringEncoding>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringInFormWithNewLineAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringInFormWithR1
     * @throws Throwable
     */
    @Test
    public void testSendStringInFormWithR1() throws Throwable {
        // Parameters for the API call
        TestRstringEncoding body = APIHelper.deserialize("{\"name\":\"farhan\",\"field\":\"QA\"}", new TypeReference<TestRstringEncoding>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringInFormWithRAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringInFormWithR2
     * @throws Throwable
     */
    @Test
    public void testSendStringInFormWithR2() throws Throwable {
        // Parameters for the API call
        TestRstringEncoding body = APIHelper.deserialize("{\"name\":\"farhan\",\"field\":\"QA&Dev\"}", new TypeReference<TestRstringEncoding>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringInFormWithRAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringInFormWithR3
     * @throws Throwable
     */
    @Test
    public void testSendStringInFormWithR3() throws Throwable {
        // Parameters for the API call
        TestRstringEncoding body = APIHelper.deserialize("{\"name\":\"farhan&nouman\",\"field\":\"QA\"}", new TypeReference<TestRstringEncoding>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringInFormWithRAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringInFormWithRN1
     * @throws Throwable
     */
    @Test
    public void testSendStringInFormWithRN1() throws Throwable {
        // Parameters for the API call
        TestRNstringEncoding body = APIHelper.deserialize("{\"name\":\"farhan\",\"field\":\"QA\"}", new TypeReference<TestRNstringEncoding>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringInFormWithRNAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringInFormWithRN2
     * @throws Throwable
     */
    @Test
    public void testSendStringInFormWithRN2() throws Throwable {
        // Parameters for the API call
        TestRNstringEncoding body = APIHelper.deserialize("{\"name\":\"farhan\",\"field\":\"QA&Dev\"}", new TypeReference<TestRNstringEncoding>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringInFormWithRNAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringInFormWithRN3
     * @throws Throwable
     */
    @Test
    public void testSendStringInFormWithRN3() throws Throwable {
        // Parameters for the API call
        TestRNstringEncoding body = APIHelper.deserialize("{\"name\":\"farhan&nouman\",\"field\":\"QA\"}", new TypeReference<TestRNstringEncoding>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringInFormWithRNAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testUpdateModelWithForm
     * @throws Throwable
     */
    @Test
    public void testUpdateModelWithForm() throws Throwable {
        // Parameters for the API call
        Employee model = APIHelper.deserialize("{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}", new TypeReference<Employee>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.updateModelWithFormAsync(model, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testDeleteFormTestWithModel
     * @throws Throwable
     */
    @Test
    public void testDeleteFormTestWithModel() throws Throwable {
        // Parameters for the API call
        Employee model = APIHelper.deserialize("{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}", new TypeReference<Employee>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDeleteForm1Async(model, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendDeleteFormWithModelArray
     * @throws Throwable
     */
    @Test
    public void testSendDeleteFormWithModelArray() throws Throwable {
        // Parameters for the API call
        List<Employee> models = APIHelper.deserialize("[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}, {\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}]", new TypeReference<List<Employee>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDeleteFormWithModelArrayAsync(models, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testUpdateModelArrayWithForm
     * @throws Throwable
     */
    @Test
    public void testUpdateModelArrayWithForm() throws Throwable {
        // Parameters for the API call
        List<Employee> models = APIHelper.deserialize("[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}, {\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}]", new TypeReference<List<Employee>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.updateModelArrayWithFormAsync(models, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testUpdateStringWithForm
     * @throws Throwable
     */
    @Test
    public void testUpdateStringWithForm() throws Throwable {
        // Parameters for the API call
        String value = "TestString";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.updateStringWithFormAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testUpdateSpecialStringWithForm
     * @throws Throwable
     */
    @Test
    public void testUpdateSpecialStringWithForm() throws Throwable {
        // Parameters for the API call
        String value = "$%^!@#$%^&*";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.updateStringWithFormAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testUpdateMultilinerStringWithForm
     * @throws Throwable
     */
    @Test
    public void testUpdateMultilinerStringWithForm() throws Throwable {
        // Parameters for the API call
        String value = "TestString\nnouman";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.updateStringWithFormAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testUpdateStringWithFormCornerCase
     * @throws Throwable
     */
    @Test
    public void testUpdateStringWithFormCornerCase() throws Throwable {
        // Parameters for the API call
        String value = " ";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.updateStringWithFormAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testUpdateEmptyStringWithForm
     * @throws Throwable
     */
    @Test
    public void testUpdateEmptyStringWithForm() throws Throwable {
        // Parameters for the API call
        String value = "";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.updateStringWithFormAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testUpdateStringArrayWithForm
     * @throws Throwable
     */
    @Test
    public void testUpdateStringArrayWithForm() throws Throwable {
        // Parameters for the API call
        List<String> strings = APIHelper.deserialize("[\"abc\", \"def\"]", new TypeReference<List<String>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.updateStringArrayWithFormAsync(strings, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendIntegerEnumArray
     * @throws Throwable
     */
    @Test
    public void testSendIntegerEnumArray() throws Throwable {
        // Parameters for the API call
        List<SuiteCode> suites = APIHelper.deserialize("[1, 3, 4, 2, 3]", new TypeReference<List<SuiteCode>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendIntegerEnumArrayAsync(suites, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertTrue("Status is not between 200 and 208", 
                httpResponse.getResponse().getStatusCode() >= 200 && 
                httpResponse.getResponse().getStatusCode() <= 208);

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringEnumArray
     * @throws Throwable
     */
    @Test
    public void testSendStringEnumArray() throws Throwable {
        // Parameters for the API call
        List<Days> days = APIHelper.deserialize("[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]", new TypeReference<List<Days>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringEnumArrayAsync(days, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertTrue("Status is not between 200 and 208", 
                httpResponse.getResponse().getStatusCode() >= 200 && 
                httpResponse.getResponse().getStatusCode() <= 208);

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendMultipleFiles
     * @throws Throwable
     */
    @Test
    public void testSendMultipleFiles() throws Throwable {
        // Parameters for the API call
        File file = TestHelper.getFile("http://localhost:3000/response/image");
        File file1 = TestHelper.getFile("http://localhost:3000/response/image");

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendMultipleFilesAsync(file, file1, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Todo Add description for test testSendString
     * @throws Throwable
     */
    @Test
    public void testSendString() throws Throwable {
        // Parameters for the API call
        String value = "TestString";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendMultilinerString
     * @throws Throwable
     */
    @Test
    public void testSendMultilinerString() throws Throwable {
        // Parameters for the API call
        String value = "TestString\nnouman";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringWithSpecialCharacters
     * @throws Throwable
     */
    @Test
    public void testSendStringWithSpecialCharacters() throws Throwable {
        // Parameters for the API call
        String value = "$%^!@#$%^&*";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringWithOnlySpace
     * @throws Throwable
     */
    @Test
    public void testSendStringWithOnlySpace() throws Throwable {
        // Parameters for the API call
        String value = " ";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendEmptyString
     * @throws Throwable
     */
    @Test
    public void testSendEmptyString() throws Throwable {
        // Parameters for the API call
        String value = "";

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendRfc3339DateTimeArray
     * @throws Throwable
     */
    @Test
    public void testSendRfc3339DateTimeArray() throws Throwable {
        // Parameters for the API call
        List<DateTime> datetimes = APIHelper.deserialize("[\"1994-02-13T14:01:54.9571247Z\",\"1994-02-13T14:01:54.9571247Z\"]",
									new TypeReference<List<DateTime>>(){},
									DateTime.class,
									new DateTimeHelper.Rfc8601DateTimeDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendRfc3339DateTimeArrayAsync(datetimes, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendMixedArray
     * @throws Throwable
     */
    @Test
    public void testSendMixedArray() throws Throwable {
        // Parameters for the API call
        SendMixedArrayInput input = new SendMixedArrayInput();
        input.setFile(TestHelper.getFile("http://localhost:3000/response/image"));
        input.setIntegers(APIHelper.deserialize("[1,2,3,4,5]", new TypeReference<List<Integer>>(){}));
        input.setModels(APIHelper.deserialize("[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"},{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}]", new TypeReference<List<Employee>>(){}));
        input.setStrings(APIHelper.deserialize("[\"abc\", \"def\"]", new TypeReference<List<String>>(){}));

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendMixedArrayAsync(input, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendUnixDateTimeArray
     * @throws Throwable
     */
    @Test
    public void testSendUnixDateTimeArray() throws Throwable {
        // Parameters for the API call
        List<DateTime> datetimes = APIHelper.deserialize("[1484719381,1484719381]",
									new TypeReference<List<DateTime>>(){},
									DateTime.class,
									new DateTimeHelper.UnixTimestampDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendUnixDateTimeArrayAsync(datetimes, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendRfc1123DateTimeArray
     * @throws Throwable
     */
    @Test
    public void testSendRfc1123DateTimeArray() throws Throwable {
        // Parameters for the API call
        List<DateTime> datetimes = APIHelper.deserialize("[\"Sun, 06 Nov 1994 08:49:37 GMT\",\"Sun, 06 Nov 1994 08:49:37 GMT\"]",
									new TypeReference<List<DateTime>>(){},
									DateTime.class,
									new DateTimeHelper.Rfc1123DateTimeDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendRfc1123DateTimeArrayAsync(datetimes, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendLong
     * @throws Throwable
     */
    @Test
    public void testSendLong() throws Throwable {
        // Parameters for the API call
        long value = 5147483647L;

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendLongAsync(value, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendIntegerArray
     * @throws Throwable
     */
    @Test
    public void testSendIntegerArray() throws Throwable {
        // Parameters for the API call
        List<Integer> integers = APIHelper.deserialize("[1,2,3,4,5]", new TypeReference<List<Integer>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendIntegerArrayAsync(integers, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendStringArray
     * @throws Throwable
     */
    @Test
    public void testSendStringArray() throws Throwable {
        // Parameters for the API call
        List<String> strings = APIHelper.deserialize("[\"abc\", \"def\"]", new TypeReference<List<String>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendStringArrayAsync(strings, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testAllowDynamicFormFields
     * @throws Throwable
     */
    @Test
    public void testAllowDynamicFormFields() throws Throwable {
        // Parameters for the API call
        String name = "farhan";
        // key-value map for optional form parameters
        LinkedHashMap<String, Object> formParams = new LinkedHashMap<String, Object>();
        formParams.put("field", "QA");

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.allowDynamicFormFieldsAsync(name, formParams, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendModel
     * @throws Throwable
     */
    @Test
    public void testSendModel() throws Throwable {
        // Parameters for the API call
        Employee model = APIHelper.deserialize("{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}", new TypeReference<Employee>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendModelAsync(model, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendModelArray
     * @throws Throwable
     */
    @Test
    public void testSendModelArray() throws Throwable {
        // Parameters for the API call
        List<Employee> models = APIHelper.deserialize("[{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"},{\"name\":\"Shahid Khaliq\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"boss\":{\"personType\":\"Boss\",\"name\":\"Zeeshan Ejaz\",\"age\":5147483645,\"address\":\"H # 531, S # 20\",\"uid\":\"123321\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\",\"salary\":20000,\"department\":\"Software Development\",\"joiningDay\":\"Saturday\",\"workingDays\":[\"Monday\",\"Tuesday\",\"Friday\"],\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\",\"promotedAt\":1484719381},\"dependents\":[{\"name\":\"Future Wife\",\"age\":5147483649,\"address\":\"H # 531, S # 20\",\"uid\":\"123412\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"},{\"name\":\"Future Kid\",\"age\":5147483648,\"address\":\"H # 531, S # 20\",\"uid\":\"312341\",\"birthday\":\"1994-02-13\",\"birthtime\":\"1994-02-13T14:01:54.9571247Z\"}],\"hiredAt\":\"Sun, 06 Nov 1994 08:49:37 GMT\"}]", new TypeReference<List<Employee>>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendModelArrayAsync(models, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendFile
     * @throws Throwable
     */
    @Test
    public void testSendFile() throws Throwable {
        // Parameters for the API call
        File file = TestHelper.getFile("http://localhost:3000/response/image");

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendFileAsync(file, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendRfc1123DateTime
     * @throws Throwable
     */
    @Test
    public void testSendRfc1123DateTime() throws Throwable {
        // Parameters for the API call
        DateTime datetime = DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT");

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendRfc1123DateTimeAsync(datetime, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendRfc3339DateTime
     * @throws Throwable
     */
    @Test
    public void testSendRfc3339DateTime() throws Throwable {
        // Parameters for the API call
        DateTime datetime = DateTimeHelper.fromRfc8601DateTime("1994-02-13T14:01:54.9571247Z");

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendRfc3339DateTimeAsync(datetime, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testDeleteFormTestWithBlankField
     * @throws Throwable
     */
    @Test
    public void testDeleteFormTestWithBlankField() throws Throwable {
        // Parameters for the API call
        DeleteBody body = APIHelper.deserialize("{\"name\":\"farhan\",\"field\":\" \"}", new TypeReference<DeleteBody>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDeleteFormAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testDeleteFormTestWithBlankNameField
     * @throws Throwable
     */
    @Test
    public void testDeleteFormTestWithBlankNameField() throws Throwable {
        // Parameters for the API call
        DeleteBody body = APIHelper.deserialize("{\"name\":\" \",\"field\":\" \"}", new TypeReference<DeleteBody>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDeleteFormAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testDeleteFormTestWithBlankName
     * @throws Throwable
     */
    @Test
    public void testDeleteFormTestWithBlankName() throws Throwable {
        // Parameters for the API call
        DeleteBody body = APIHelper.deserialize("{\"name\":\" \",\"field\":\"QA\"}", new TypeReference<DeleteBody>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDeleteFormAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testDeleteFormTest
     * @throws Throwable
     */
    @Test
    public void testDeleteFormTest() throws Throwable {
        // Parameters for the API call
        DeleteBody body = APIHelper.deserialize("{\"name\":\"farhan\",\"field\":\"QA\"}", new TypeReference<DeleteBody>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDeleteFormAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testDeleteFormTestWithMultilinerName
     * @throws Throwable
     */
    @Test
    public void testDeleteFormTestWithMultilinerName() throws Throwable {
        // Parameters for the API call
        DeleteBody body = APIHelper.deserialize("{\"name\":\"farhan\\nnouman\",\"field\":\"QA\"}", new TypeReference<DeleteBody>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDeleteFormAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testDeleteFormTestWithSpecialCharactersField
     * @throws Throwable
     */
    @Test
    public void testDeleteFormTestWithSpecialCharactersField() throws Throwable {
        // Parameters for the API call
        DeleteBody body = APIHelper.deserialize("{\"name\":\"farhan\",\"field\":\"&&&\"}", new TypeReference<DeleteBody>(){});

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDeleteFormAsync(body, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendDateArray
     * @throws Throwable
     */
    @Test
    public void testSendDateArray() throws Throwable {
        // Parameters for the API call
        List<LocalDate> dates = APIHelper.deserialize("[\"1994-02-13\",\"1994-02-13\"]",
									new TypeReference<List<LocalDate>>(){},
									LocalDate.class,
									new DateTimeHelper.SimpleDateDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDateArrayAsync(dates, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendDate
     * @throws Throwable
     */
    @Test
    public void testSendDate() throws Throwable {
        // Parameters for the API call
        LocalDate date = DateTimeHelper.fromSimpleDate("1994-02-13");

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendDateAsync(date, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

    /**
     * Todo Add description for test testSendUnixDateTime
     * @throws Throwable
     */
    @Test
    public void testSendUnixDateTime() throws Throwable {
        // Parameters for the API call
        DateTime datetime = DateTimeHelper.fromUnixTimestamp(1484719381l);

        // Set callback and perform API call
        ServerResponse result = null;
        APICallBackCatcher<ServerResponse> response = new APICallBackCatcher<ServerResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.sendUnixDateTimeAsync(datetime, response);
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
                "{\"passed\":true}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
