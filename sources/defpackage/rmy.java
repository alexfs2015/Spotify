package defpackage;

import java.util.Iterator;

/* renamed from: rmy reason: default package */
public final class rmy extends rle {
    private final jum a;

    rmy(jum jum) {
        this.a = jum;
    }

    public final void a(final aia aia, boolean z) {
        if (!z) {
            jum jum = this.a;
            AnonymousClass1 r0 = new gbr<String>() {
                public final /* synthetic */ void accept(Object obj) {
                    aia.a((String) obj);
                }
            };
            synchronized (jum.b) {
                Iterator it = jum.a.iterator();
                while (it.hasNext()) {
                    r0.accept(((jup) it.next()).toString());
                }
            }
        }
    }
}
