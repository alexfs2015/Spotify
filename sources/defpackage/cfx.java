package defpackage;

import java.lang.ref.WeakReference;

@cey
/* renamed from: cfx reason: default package */
public final class cfx extends cgg {
    private final WeakReference<cfm> a;

    public cfx(cfm cfm) {
        this.a = new WeakReference<>(cfm);
    }

    public final void a(cfy cfy) {
        cfm cfm = (cfm) this.a.get();
        if (cfm != null) {
            cfm.a(cfy);
        }
    }
}
