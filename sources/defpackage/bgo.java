package defpackage;

import java.util.Map;

@cey
/* renamed from: bgo reason: default package */
public final class bgo implements bgl<Object> {
    private final bgp a;

    public bgo(bgp bgp) {
        this.a = bgp;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = "blurRadius";
        String str2 = "1";
        boolean equals = str2.equals(map.get("transparentBackground"));
        boolean equals2 = str2.equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get(str) != null) {
                f = Float.parseFloat((String) map.get(str));
            }
        } catch (NumberFormatException e) {
            clu.a("Fail to parse float", e);
        }
        this.a.a(equals);
        this.a.a(equals2, f);
    }
}
