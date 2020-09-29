package defpackage;

import java.util.Map;

/* renamed from: jmq reason: default package */
public final class jmq {
    private final jmz a;

    public jmq(jmz jmz) {
        this.a = jmz;
    }

    public final h a(String str, String str2, String str3) {
        return jnr.a(this.a).a(str, str2, str3, false, null);
    }

    public final h a(String str, String str2, String str3, boolean z, Map<String, String> map) {
        return jnr.a(this.a).a(str, str2, str3, z, map);
    }

    public final e a(String str, String str2) {
        return jmn.a(this.a).a(str, str2);
    }

    public final j b(String str, String str2) {
        return jmt.a(this.a).a(str, str2, null, false, null);
    }

    public final j b(String str, String str2, String str3, boolean z, Map<String, String> map) {
        return jmt.a(this.a).a(str, str2, str3, z, map);
    }

    public final d c(String str, String str2) {
        return new a(this.a).a(str, str2);
    }
}
