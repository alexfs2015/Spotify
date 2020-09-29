package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: buu reason: default package */
final class buu extends bvj {
    private WeakReference<bun> a;

    buu(bun bun) {
        this.a = new WeakReference<>(bun);
    }

    public final void a() {
        bun bun = (bun) this.a.get();
        if (bun != null) {
            bun.a(bun);
        }
    }
}
