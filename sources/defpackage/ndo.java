package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ndo reason: default package */
public final class ndo implements vua<ndn> {
    private final wlc<ndk> a;
    private final wlc<ndl> b;
    private final wlc<ndb> c;
    private final wlc<ndt> d;
    private final wlc<Boolean> e;
    private final wlc<Scheduler> f;

    private ndo(wlc<ndk> wlc, wlc<ndl> wlc2, wlc<ndb> wlc3, wlc<ndt> wlc4, wlc<Boolean> wlc5, wlc<Scheduler> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static ndo a(wlc<ndk> wlc, wlc<ndl> wlc2, wlc<ndb> wlc3, wlc<ndt> wlc4, wlc<Boolean> wlc5, wlc<Scheduler> wlc6) {
        ndo ndo = new ndo(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return ndo;
    }

    public final /* synthetic */ Object get() {
        ndn ndn = new ndn((ndk) this.a.get(), (ndl) this.b.get(), (ndb) this.c.get(), (ndt) this.d.get(), ((Boolean) this.e.get()).booleanValue(), (Scheduler) this.f.get());
        return ndn;
    }
}
