package defpackage;

import java.util.Map;

@cfp
/* renamed from: bhf reason: default package */
public final class bhf implements bhc<Object> {
    private final bhg a;

    public bhf(bhg bhg) {
        this.a = bhg;
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
            cml.a("Fail to parse float", e);
        }
        this.a.a(equals);
        this.a.a(equals2, f);
    }
}
