package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fhk reason: default package */
public final class fhk {
    private static final long b = TimeUnit.DAYS.toMillis(7);
    final String a;
    private final String c;
    private final long d;

    private fhk(String str, String str2, long j) {
        this.a = str;
        this.c = str2;
        this.d = j;
    }

    static fhk a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new fhk(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new fhk(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            return null;
        }
    }

    static String a(fhk fhk) {
        if (fhk == null) {
            return null;
        }
        return fhk.a;
    }

    static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            return null;
        }
    }

    public final boolean b(String str) {
        return System.currentTimeMillis() > this.d + b || !str.equals(this.c);
    }
}
