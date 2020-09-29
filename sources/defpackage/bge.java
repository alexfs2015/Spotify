package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: bge reason: default package */
public final class bge implements bhc<Object> {
    private final Object a = new Object();
    private final Map<String, bgf> b = new HashMap();

    public final void a(String str, bgf bgf) {
        synchronized (this.a) {
            this.b.put(str, bgf);
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String str7 = "\n";
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? str7.concat(valueOf) : new String(str7);
        }
        synchronized (this.a) {
            bgf bgf = (bgf) this.b.remove(str2);
            if (bgf == null) {
                String str8 = "Received result for unexpected method invocation: ";
                String valueOf2 = String.valueOf(str2);
                if (valueOf2.length() != 0) {
                    str8.concat(valueOf2);
                } else {
                    new String(str8);
                }
                cpn.a(5);
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                bgf.a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                bgf.a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (cml.a()) {
                        String str9 = "Result GMSG: ";
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        if (valueOf5.length() != 0) {
                            str9.concat(valueOf5);
                        } else {
                            new String(str9);
                        }
                        cml.a();
                    }
                    bgf.a(jSONObject);
                } catch (JSONException e) {
                    bgf.a(e.getMessage());
                }
            }
        }
    }
}
