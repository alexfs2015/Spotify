package defpackage;

import java.util.ArrayList;

/* renamed from: evf reason: default package */
final class evf implements Runnable {
    private final /* synthetic */ evt a;
    private final /* synthetic */ Runnable b;

    evf(evt evt, Runnable runnable) {
        this.a = evt;
        this.b = runnable;
    }

    public final void run() {
        this.a.k();
        evt evt = this.a;
        Runnable runnable = this.b;
        evt.g();
        if (evt.c == null) {
            evt.c = new ArrayList();
        }
        evt.c.add(runnable);
        this.a.i();
    }
}
