package defpackage;

import io.reactivex.Scheduler;

/* renamed from: nun reason: default package */
public final class nun implements vua<num> {
    private final wlc<Scheduler> a;
    private final wlc<a> b;
    private final wlc<spi> c;

    private nun(wlc<Scheduler> wlc, wlc<a> wlc2, wlc<spi> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nun a(wlc<Scheduler> wlc, wlc<a> wlc2, wlc<spi> wlc3) {
        return new nun(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new num(this.a, this.b, this.c);
    }
}
