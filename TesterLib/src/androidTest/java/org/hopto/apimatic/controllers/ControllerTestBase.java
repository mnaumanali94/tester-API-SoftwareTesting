/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;

import org.hopto.apimatic.TesterClient;
import org.hopto.apimatic.Configuration;
import org.hopto.apimatic.testing.HttpCallBackCatcher;
import org.hopto.apimatic.models.*;
import org.hopto.apimatic.Environments;

/**
 * Base class for all test cases
 */
public class ControllerTestBase {
    /**
     * Test configuration
     */
    public final static int REQUEST_TIMEOUT = 60;

    public final static double ASSERT_PRECISION = 0.1;
    
    /**
     * Global rules for tests
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures
     */
    
    // Used to serve as HttpCallBack and to capture request & response
    protected HttpCallBackCatcher httpResponse = new HttpCallBackCatcher();
    
    /**
     * Setup test
     */
    @Before
    public void setUp() throws Exception {
        httpResponse = new HttpCallBackCatcher(); 
    }

    /**
     * Tear down test
     */
    @After
    public void tearDown() throws Exception {
        httpResponse = null;
    }
    
    // Singleton instance of client for all test classes
    private static TesterClient client;
    private static Object clientSync = new Object();
    
    /**
     * Get client instance
     * @return
     */
    protected static TesterClient getClient() {
        if(client == null)
            synchronized (clientSync) {
                client = new TesterClient();
            }
        return client;
    }

    /**
     * Apply test configuration
     */
    protected static void applyConfiguration() {
        // Set Configuration parameters for test execution
        Configuration.environment = Environments.TESTING;
        Configuration.port = "3000";
        Configuration.suites = SuiteCode.DIAMONDS;
    }
}
