package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mec reason: default package */
public final class mec implements wig<meb> {
    private final wzi<hgy> a;
    private final wzi<med> b;
    private final wzi<kym> c;
    private final wzi<kyt> d;
    private final wzi<kyk> e;
    private final wzi<Scheduler> f;

    private mec(wzi<hgy> wzi, wzi<med> wzi2, wzi<kym> wzi3, wzi<kyt> wzi4, wzi<kyk> wzi5, wzi<Scheduler> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static mec a(wzi<hgy> wzi, wzi<med> wzi2, wzi<kym> wzi3, wzi<kyt> wzi4, wzi<kyk> wzi5, wzi<Scheduler> wzi6) {
        mec mec = new mec(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return mec;
    }

    public final /* synthetic */ Object get() {
        meb meb = new meb((hgy) this.a.get(), (med) this.b.get(), (kym) this.c.get(), (kyt) this.d.get(), (kyk) this.e.get(), (Scheduler) this.f.get());
        return meb;
    }
}
