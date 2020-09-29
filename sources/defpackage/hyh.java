package defpackage;

import com.spotify.base.java.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hyh reason: default package */
public final class hyh {
    private static String a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;

    public static d a(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        String str8 = str3;
        String str9 = str4;
        String str10 = str7;
        d dVar = new d(null, null, null, str8, str9, str2, null, str10, str5, null, str6, null, str, j, true);
        return dVar;
    }

    private static String a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", str);
            return jSONObject.toString();
        } catch (JSONException unused) {
            Logger.e("Unable to format json message", new Object[0]);
            return "";
        }
    }

    public final d a(String str, String str2, String str3, String str4, String str5) {
        return a(str, str2, str3, str4, "event_errored", a(str5), null, 0);
    }
}
