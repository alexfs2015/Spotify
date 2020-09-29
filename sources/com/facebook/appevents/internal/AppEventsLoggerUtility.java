package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class AppEventsLoggerUtility {
    private static final Map<GraphAPIActivityType, String> a = new HashMap<GraphAPIActivityType, String>() {
        {
            put(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    };

    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    public static JSONObject a(GraphAPIActivityType graphAPIActivityType, ami ami, String str, boolean z, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", a.get(graphAPIActivityType));
        String c = AppEventsLogger.c();
        if (c != null) {
            jSONObject.put("app_user_id", c);
        }
        String d = AppEventsLogger.d();
        if (!d.isEmpty()) {
            jSONObject.put("ud", d);
        }
        ank.a(jSONObject, ami, str, z);
        try {
            ank.a(jSONObject, context);
        } catch (Exception e) {
            and.a(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
