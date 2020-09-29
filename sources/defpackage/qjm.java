package defpackage;

import java.util.Set;

/* renamed from: qjm reason: default package */
public final class qjm implements a, b {
    private final Set<a> a;
    private final Set<b> b;

    public qjm(Set<a> set, Set<b> set2) {
        this.a = set;
        this.b = set2;
    }

    public final void a(hcs hcs, hcs hcs2) {
        for (a a2 : this.a) {
            a2.a(hcs, hcs2);
        }
    }

    public final void a(hcs hcs, String str, String str2) {
        for (b a2 : this.b) {
            a2.a(hcs, str, str2);
        }
    }
}
