/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.hopto.apimatic;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import org.hopto.apimatic.models.*;

public class Configuration {

    //retains status whether we have already initialized
    private static boolean initialized = false;
    private static RequestQueue requestQueue = null;

    //Initialization of configuration
    public static void initialize(Context context){
        requestQueue = Volley.newRequestQueue(context);
    
        initialized = true;
    }

    // volley request queue needs to be initialized before use
    public static RequestQueue getRequestQueue() {
        if(!initialized)
            throw new IllegalStateException("Must initialize before accessing request queue");
        return requestQueue;
    }

    /**
     * Current API environment
     */
    public static Environments environment = Environments.PRODUCTION;

    /**
     *  port value
     */
    public static String port = "80";

    /**
     *  suites value
     */
    public static SuiteCode suites = SuiteCode.HEARTS;

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentsMap.get(Configuration.environment).get(server));
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5640520436866163872L;
            {
                put("port", Configuration.port);
                put("suites", Configuration.suites);
            }
        };
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.DEFAULT);
    }
    
    /**
     * Map of all base URLs by environments and server aliases 
     */
    private static EnumMap<Environments, EnumMap<Servers, String>> environmentsMap = new EnumMap<Environments, EnumMap<Servers,String>>(Environments.class) {
        private static final long serialVersionUID = 5434996145243394620L;
        {
            put(Environments.PRODUCTION , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5523426618294294504L;
                {
                    put(Servers.DEFAULT, "http://apimatic.hopto.org:{suites}");
                    put(Servers.AUTH_SERVER, "http://apimaticauth.hopto.org:3000");
                }
            });
            put(Environments.TESTING , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 4684547564927805027L;
                {
                    put(Servers.DEFAULT, "http://localhost:3000");
                    put(Servers.AUTH_SERVER, "http://apimaticauth.xhopto.org:3000");
                }
            });
        }
    };
}
