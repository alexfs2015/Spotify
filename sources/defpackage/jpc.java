package defpackage;

import java.util.Map;

/* renamed from: jpc reason: default package */
public final class jpc {
    private final jpl a;

    public jpc(jpl jpl) {
        this.a = jpl;
    }

    public final e a(String str, String str2) {
        return joz.a(this.a).a(str, str2);
    }

    public final h a(String str, String str2, String str3) {
        return jqd.a(this.a).a(str, str2, str3, false, null);
    }

    public final h a(String str, String str2, String str3, boolean z, Map<String, String> map) {
        return jqd.a(this.a).a(str, str2, str3, z, map);
    }

    public final j b(String str, String str2) {
        return jpf.a(this.a).a(str, str2, null, false, null);
    }

    public final j b(String str, String str2, String str3, boolean z, Map<String, String> map) {
        return jpf.a(this.a).a(str, str2, str3, z, map);
    }

    public final d c(String str, String str2) {
        return new a(this.a).a(str, str2);
    }
}
