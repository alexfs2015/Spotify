package defpackage;

import java.util.Map;

/* renamed from: bgw reason: default package */
final class bgw implements bhc<Object> {
    bgw() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf((String) map.get("string"));
        String str = "Received log message: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cpn.a(4);
    }
}
