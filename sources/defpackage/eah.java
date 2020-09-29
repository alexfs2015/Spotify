package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: eah reason: default package */
public final /* synthetic */ class eah {
    public static void a(eag eag, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        eag.b(sb.toString());
    }

    public static void a(eag eag, String str, Map map) {
        try {
            eag.a(str, bkc.e().a(map));
        } catch (JSONException unused) {
            cpn.a(5);
        }
    }

    public static void a(eag eag, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        eag.a(str, jSONObject.toString());
    }

    public static void b(eag eag, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        cpn.a(3);
        eag.b(sb.toString());
    }
}
