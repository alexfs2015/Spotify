package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qba reason: default package */
public final class qba {
    private final jlr a;

    public qba(jlr jlr) {
        this.a = jlr;
    }

    public static <T> String a(xgo<T> xgo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_type", "fetch_trigger_list");
            jSONObject.put("uri", xgo.a.a.a.toString());
            jSONObject.put("status", xgo.a.c);
            jSONObject.put("body", xgo.b.f());
        } catch (IOException | JSONException unused) {
            Logger.b("error formatting error message json", new Object[0]);
        }
        return jSONObject.toString();
    }

    public static <T> String b(xgo<T> xgo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_type", "trigger_list_parser");
            jSONObject.put("uri", xgo.a.a.a);
        } catch (Exception unused) {
            Logger.b("error formatting error message json", new Object[0]);
        }
        return jSONObject.toString();
    }

    public final void a(String str, String str2, int i, String str3, String str4) {
        jlr jlr = this.a;
        ab abVar = new ab(str, str2, (long) i, str3, str4);
        jlr.a(abVar);
    }

    public final void a(String str, String str2, String str3) {
        Uri parse = Uri.parse(str2);
        String str4 = (String) parse.getPathSegments().get(parse.getPathSegments().size() - 1);
        jlr jlr = this.a;
        af afVar = new af(str, null, null, str3, str4);
        jlr.a(afVar);
    }
}
