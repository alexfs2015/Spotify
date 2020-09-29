package defpackage;

import java.util.Map;

/* renamed from: chp reason: default package */
public final class chp implements bhc<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String valueOf = String.valueOf((String) map.get("errors"));
        String str2 = "Invalid request: ";
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        cpn.a(5);
        chh.f.a(str);
    }
}
