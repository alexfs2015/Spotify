package defpackage;

import java.util.ArrayList;

/* renamed from: euo reason: default package */
final class euo implements Runnable {
    private final /* synthetic */ evc a;
    private final /* synthetic */ Runnable b;

    euo(evc evc, Runnable runnable) {
        this.a = evc;
        this.b = runnable;
    }

    public final void run() {
        this.a.k();
        evc evc = this.a;
        Runnable runnable = this.b;
        evc.g();
        if (evc.c == null) {
            evc.c = new ArrayList();
        }
        evc.c.add(runnable);
        this.a.i();
    }
}
