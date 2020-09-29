package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: bud reason: default package */
final class bud extends bus {
    private WeakReference<btw> a;

    bud(btw btw) {
        this.a = new WeakReference<>(btw);
    }

    public final void a() {
        btw btw = (btw) this.a.get();
        if (btw != null) {
            btw.a(btw);
        }
    }
}
