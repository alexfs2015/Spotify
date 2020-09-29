package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: vu reason: default package */
public final class vu {
    private static wf c = vv.a();
    String a;
    Map<String, String> b;

    public vu(String str) {
        wf wfVar = c;
        boolean z = false;
        if (str == null) {
            wfVar.f("Missing Event Token", new Object[0]);
        } else if (str.length() != 6) {
            wfVar.f("Malformed Event Token '%s'", str);
        } else {
            z = true;
        }
        if (z) {
            this.a = str;
        }
    }

    public final void a(String str, String str2) {
        String str3 = "Callback";
        if (xa.a(str, "key", str3) && xa.a(str2, "value", str3)) {
            if (this.b == null) {
                this.b = new LinkedHashMap();
            }
            if (((String) this.b.put(str, str2)) != null) {
                c.d("Key %s was overwritten", str);
            }
        }
    }
}
