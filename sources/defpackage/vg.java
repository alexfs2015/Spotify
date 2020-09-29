package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: vg reason: default package */
public final class vg {
    private static vr c = vh.a();
    String a;
    Map<String, String> b;

    public vg(String str) {
        vr vrVar = c;
        boolean z = false;
        if (str == null) {
            vrVar.f("Missing Event Token", new Object[0]);
        } else if (str.length() != 6) {
            vrVar.f("Malformed Event Token '%s'", str);
        } else {
            z = true;
        }
        if (z) {
            this.a = str;
        }
    }

    public final void a(String str, String str2) {
        String str3 = "Callback";
        if (wm.a(str, "key", str3) && wm.a(str2, "value", str3)) {
            if (this.b == null) {
                this.b = new LinkedHashMap();
            }
            if (((String) this.b.put(str, str2)) != null) {
                c.d("Key %s was overwritten", str);
            }
        }
    }
}
