package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: bfn reason: default package */
public final class bfn implements bgl<Object> {
    private final Object a = new Object();
    private final Map<String, bfo> b = new HashMap();

    public final void a(String str, bfo bfo) {
        synchronized (this.a) {
            this.b.put(str, bfo);
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
            bfo bfo = (bfo) this.b.remove(str2);
            if (bfo == null) {
                String str8 = "Received result for unexpected method invocation: ";
                String valueOf2 = String.valueOf(str2);
                if (valueOf2.length() != 0) {
                    str8.concat(valueOf2);
                } else {
                    new String(str8);
                }
                cow.a(5);
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                bfo.a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                bfo.a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (clu.a()) {
                        String str9 = "Result GMSG: ";
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        if (valueOf5.length() != 0) {
                            str9.concat(valueOf5);
                        } else {
                            new String(str9);
                        }
                        clu.a();
                    }
                    bfo.a(jSONObject);
                } catch (JSONException e) {
                    bfo.a(e.getMessage());
                }
            }
        }
    }
}
