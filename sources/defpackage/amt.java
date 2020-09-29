package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: amt reason: default package */
public class amt {
    private static final Map<String, JSONObject> a = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public static Long b = null;

    static {
        amt.class.getCanonicalName();
    }

    public static JSONObject a(String str, boolean z) {
        JSONObject b2 = b(str);
        if (b2 == null) {
            return null;
        }
        Context g = akq.g();
        g.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), b2.toString()).apply();
        return b(str, b2);
    }

    private static synchronized void a() {
        synchronized (amt.class) {
            Long l = b;
            if (!(l != null && System.currentTimeMillis() - l.longValue() < 3600000)) {
                final Context g = akq.g();
                final String k = akq.k();
                final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{k});
                akq.e().execute(new Runnable() {
                    public final void run() {
                        SharedPreferences sharedPreferences = g.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
                        JSONObject jSONObject = null;
                        String string = sharedPreferences.getString(format, null);
                        if (!ank.a(string)) {
                            try {
                                jSONObject = new JSONObject(string);
                            } catch (JSONException e) {
                                ank.a("FacebookSDK", (Exception) e);
                            }
                            if (jSONObject != null) {
                                amt.b(k, jSONObject);
                            }
                        }
                        JSONObject a2 = amt.b(k);
                        if (a2 != null) {
                            amt.b = Long.valueOf(System.currentTimeMillis());
                            amt.b(k, a2);
                            sharedPreferences.edit().putString(format, a2.toString()).apply();
                        }
                    }
                });
            }
        }
    }

    public static boolean a(String str, String str2, boolean z) {
        a();
        if (str2 == null || !a.containsKey(str2)) {
            return false;
        }
        return ((JSONObject) a.get(str2)).optBoolean(str, false);
    }

    /* access modifiers changed from: private */
    public static JSONObject b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", akq.i());
        bundle.putString("fields", "gatekeepers");
        akr a2 = akr.a((aki) null, String.format("%s/%s", new Object[]{str, "mobile_sdk_gk"}), (b) null);
        a2.h = true;
        a2.d = bundle;
        return akr.a(a2).a;
    }

    /* access modifiers changed from: private */
    public static synchronized JSONObject b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (amt.class) {
            jSONObject2 = a.containsKey(str) ? (JSONObject) a.get(str) : new JSONObject();
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException e) {
                        ank.a("FacebookSDK", (Exception) e);
                    }
                }
            }
            a.put(str, jSONObject2);
        }
        return jSONObject2;
    }
}
