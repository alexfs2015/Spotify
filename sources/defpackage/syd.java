package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: syd reason: default package */
public final class syd implements wig<sya> {
    private final wzi<sxx> a;
    private final wzi<sye> b;
    private final wzi<uix> c;
    private final wzi<hgz> d;
    private final wzi<hgy> e;
    private final wzi<Observable<Boolean>> f;
    private final wzi<Scheduler> g;

    private syd(wzi<sxx> wzi, wzi<sye> wzi2, wzi<uix> wzi3, wzi<hgz> wzi4, wzi<hgy> wzi5, wzi<Observable<Boolean>> wzi6, wzi<Scheduler> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static syd a(wzi<sxx> wzi, wzi<sye> wzi2, wzi<uix> wzi3, wzi<hgz> wzi4, wzi<hgy> wzi5, wzi<Observable<Boolean>> wzi6, wzi<Scheduler> wzi7) {
        syd syd = new syd(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return syd;
    }

    public final /* synthetic */ Object get() {
        sya sya = new sya((sxx) this.a.get(), (sye) this.b.get(), (uix) this.c.get(), (hgz) this.d.get(), (hgy) this.e.get(), (Observable) this.f.get(), (Scheduler) this.g.get());
        return sya;
    }
}
