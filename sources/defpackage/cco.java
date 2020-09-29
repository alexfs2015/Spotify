package defpackage;

import java.util.Map;

@cfp
/* renamed from: cco reason: default package */
public final class cco {
    public final cti a;
    public final boolean b;
    public final String c;

    public cco(cti cti, Map<String, String> map) {
        this.a = cti;
        this.c = (String) map.get("forceOrientation");
        String str = "allowOrientationChange";
        this.b = map.containsKey(str) ? Boolean.parseBoolean((String) map.get(str)) : true;
    }
}
