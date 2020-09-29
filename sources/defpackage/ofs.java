package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ofs reason: default package */
public final class ofs implements vua<ofr> {
    private final wlc<ois> a;
    private final wlc<ofn> b;
    private final wlc<hbj> c;
    private final wlc<String> d;
    private final wlc<Scheduler> e;

    private ofs(wlc<ois> wlc, wlc<ofn> wlc2, wlc<hbj> wlc3, wlc<String> wlc4, wlc<Scheduler> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ofs a(wlc<ois> wlc, wlc<ofn> wlc2, wlc<hbj> wlc3, wlc<String> wlc4, wlc<Scheduler> wlc5) {
        ofs ofs = new ofs(wlc, wlc2, wlc3, wlc4, wlc5);
        return ofs;
    }

    public final /* synthetic */ Object get() {
        ofr ofr = new ofr((ois) this.a.get(), (ofn) this.b.get(), (hbj) this.c.get(), (String) this.d.get(), (Scheduler) this.e.get());
        return ofr;
    }
}
