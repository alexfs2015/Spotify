package defpackage;

import android.app.Application;

/* renamed from: hvb reason: default package */
public final class hvb implements vua<hva> {
    private final wlc<Application> a;
    private final wlc<txn> b;
    private final wlc<txp> c;

    private hvb(wlc<Application> wlc, wlc<txn> wlc2, wlc<txp> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hvb a(wlc<Application> wlc, wlc<txn> wlc2, wlc<txp> wlc3) {
        return new hvb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hva((Application) this.a.get(), (txn) this.b.get(), (txp) this.c.get());
    }
}
