package defpackage;

import java.util.HashMap;
import java.util.Map;

@cfp
/* renamed from: dts reason: default package */
public final class dts {
    public final Map<String, dtr> a = new HashMap();
    public final dtt b;

    public dts(dtt dtt) {
        this.b = dtt;
    }

    public final void a(String str, dtr dtr) {
        this.a.put(str, dtr);
    }
}
