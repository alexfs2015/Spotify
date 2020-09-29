package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aky reason: default package */
public class aky {
    private static ConcurrentHashMap<String, String> a;
    private static SharedPreferences b;
    private static AtomicBoolean c = new AtomicBoolean(false);

    static {
        aky.class.getSimpleName();
    }

    static void a() {
        if (!c.get()) {
            c();
        }
    }

    public static String b() {
        if (!c.get()) {
            c();
        }
        return a((Map<String, String>) a);
    }

    private static synchronized void c() {
        synchronized (aky.class) {
            if (!c.get()) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(akc.g());
                b = defaultSharedPreferences;
                a = new ConcurrentHashMap<>(a(defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "")));
                c.set(true);
            }
        }
    }

    private static String a(Map<String, String> map) {
        String str = "";
        if (map.isEmpty()) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : map.keySet()) {
                jSONObject.put(str2, map.get(str2));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    private static Map<String, String> a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.getString(str2));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }
}
