package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pse reason: default package */
public final class pse {
    private final jjf a;

    public pse(jjf jjf) {
        this.a = jjf;
    }

    public final void a(String str, String str2, int i, String str3, String str4) {
        jjf jjf = this.a;
        ac acVar = new ac(str, str2, (long) i, str3, str4);
        jjf.a(acVar);
    }

    public final void a(String str, String str2, String str3) {
        Uri parse = Uri.parse(str2);
        String str4 = (String) parse.getPathSegments().get(parse.getPathSegments().size() - 1);
        jjf jjf = this.a;
        ag agVar = new ag(str, null, null, str3, str4);
        jjf.a(agVar);
    }

    public static <T> String a(wsj<T> wsj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_type", "fetch_trigger_list");
            jSONObject.put("uri", wsj.a.a.a.toString());
            jSONObject.put("status", wsj.a.c);
            jSONObject.put("body", wsj.b.f());
        } catch (IOException | JSONException unused) {
            Logger.b("error formatting error message json", new Object[0]);
        }
        return jSONObject.toString();
    }

    public static <T> String b(wsj<T> wsj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_type", "trigger_list_parser");
            jSONObject.put("uri", wsj.a.a.a);
        } catch (Exception unused) {
            Logger.b("error formatting error message json", new Object[0]);
        }
        return jSONObject.toString();
    }
}
