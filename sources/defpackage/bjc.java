package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: bjc reason: default package */
final class bjc implements Runnable {
    private final /* synthetic */ WeakReference a;
    private final /* synthetic */ bjb b;

    bjc(bjb bjb, WeakReference weakReference) {
        this.b = bjb;
        this.a = weakReference;
    }

    public final void run() {
        this.b.b = false;
        bho bho = (bho) this.a.get();
        if (bho != null) {
            doy doy = this.b.a;
            if (bho.c(doy)) {
                bho.b(doy);
            } else {
                cow.a(4);
                bho.d.a(doy);
            }
        }
    }
}
