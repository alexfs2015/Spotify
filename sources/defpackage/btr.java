package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: btr reason: default package */
final class btr extends ewq {
    private final WeakReference<btk> a;

    btr(btk btk) {
        this.a = new WeakReference<>(btk);
    }

    public final void a(ewx ewx) {
        btk btk = (btk) this.a.get();
        if (btk != null) {
            btk.a.a((bug) new bts(btk, btk, ewx));
        }
    }
}
