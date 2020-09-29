package defpackage;

import io.reactivex.Flowable;

/* renamed from: sey reason: default package */
public final class sey implements vua<sex> {
    private final wlc<sev> a;
    private final wlc<sez> b;
    private final wlc<vit<gzz>> c;
    private final wlc<Flowable<gzz>> d;

    private sey(wlc<sev> wlc, wlc<sez> wlc2, wlc<vit<gzz>> wlc3, wlc<Flowable<gzz>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static sey a(wlc<sev> wlc, wlc<sez> wlc2, wlc<vit<gzz>> wlc3, wlc<Flowable<gzz>> wlc4) {
        return new sey(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new sex((sev) this.a.get(), (sez) this.b.get(), (vit) this.c.get(), (Flowable) this.d.get());
    }
}
