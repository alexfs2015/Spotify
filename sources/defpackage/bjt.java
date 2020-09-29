package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: bjt reason: default package */
final class bjt implements Runnable {
    private final /* synthetic */ WeakReference a;
    private final /* synthetic */ bjs b;

    bjt(bjs bjs, WeakReference weakReference) {
        this.b = bjs;
        this.a = weakReference;
    }

    public final void run() {
        this.b.b = false;
        bif bif = (bif) this.a.get();
        if (bif != null) {
            dpp dpp = this.b.a;
            if (bif.c(dpp)) {
                bif.b(dpp);
            } else {
                cpn.a(4);
                bif.d.a(dpp);
            }
        }
    }
}
