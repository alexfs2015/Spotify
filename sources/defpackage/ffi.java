package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: ffi reason: default package */
final class ffi {
    final fey<?> a;
    final Set<ffi> b = new HashSet();
    final Set<ffi> c = new HashSet();

    ffi(fey<?> fey) {
        this.a = fey;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.c.isEmpty();
    }
}
