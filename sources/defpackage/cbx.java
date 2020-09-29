package defpackage;

import java.util.Map;

@cey
/* renamed from: cbx reason: default package */
public final class cbx {
    public final csr a;
    public final boolean b;
    public final String c;

    public cbx(csr csr, Map<String, String> map) {
        this.a = csr;
        this.c = (String) map.get("forceOrientation");
        String str = "allowOrientationChange";
        this.b = map.containsKey(str) ? Boolean.parseBoolean((String) map.get(str)) : true;
    }
}
