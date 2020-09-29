package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: bui reason: default package */
final class bui extends exh {
    private final WeakReference<bub> a;

    bui(bub bub) {
        this.a = new WeakReference<>(bub);
    }

    public final void a(exo exo) {
        bub bub = (bub) this.a.get();
        if (bub != null) {
            bub.a.a((bux) new buj(bub, bub, exo));
        }
    }
}
