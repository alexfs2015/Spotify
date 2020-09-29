package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: anh reason: default package */
final class anh {
    private static final ConcurrentHashMap<String, JSONObject> a = new ConcurrentHashMap<>();

    public static JSONObject a(String str) {
        return (JSONObject) a.get(str);
    }

    public static void a(String str, JSONObject jSONObject) {
        a.put(str, jSONObject);
    }
}
