package defpackage;

import io.reactivex.Observable;

/* renamed from: sos reason: default package */
public final class sos implements wig<sod> {
    private final wzi<Observable<lbg>> a;
    private final wzi<Observable<sph>> b;
    private final wzi<spe> c;
    private final wzi<sre> d;
    private final wzi<loy> e;
    private final wzi<vvr<hcs>> f;
    private final wzi<spl> g;

    private sos(wzi<Observable<lbg>> wzi, wzi<Observable<sph>> wzi2, wzi<spe> wzi3, wzi<sre> wzi4, wzi<loy> wzi5, wzi<vvr<hcs>> wzi6, wzi<spl> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static sos a(wzi<Observable<lbg>> wzi, wzi<Observable<sph>> wzi2, wzi<spe> wzi3, wzi<sre> wzi4, wzi<loy> wzi5, wzi<vvr<hcs>> wzi6, wzi<spl> wzi7) {
        sos sos = new sos(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return sos;
    }

    public final /* synthetic */ Object get() {
        sod sod = new sod((Observable) this.a.get(), (Observable) this.b.get(), (spe) this.c.get(), (sre) this.d.get(), (loy) this.e.get(), (vvr) this.f.get(), (spl) this.g.get());
        return sod;
    }
}
