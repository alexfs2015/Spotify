package defpackage;

import java.util.Set;

/* renamed from: qao reason: default package */
public final class qao implements a, b {
    private final Set<a> a;
    private final Set<b> b;

    public qao(Set<a> set, Set<b> set2) {
        this.a = set;
        this.b = set2;
    }

    public final void a(gzz gzz, String str, String str2) {
        for (b a2 : this.b) {
            a2.a(gzz, str, str2);
        }
    }

    public final void a(gzz gzz, gzz gzz2) {
        for (a a2 : this.a) {
            a2.a(gzz, gzz2);
        }
    }
}
