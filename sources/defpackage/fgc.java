package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: fgc reason: default package */
final class fgc {
    final ffs<?> a;
    final Set<fgc> b = new HashSet();
    final Set<fgc> c = new HashSet();

    fgc(ffs<?> ffs) {
        this.a = ffs;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.c.isEmpty();
    }
}
