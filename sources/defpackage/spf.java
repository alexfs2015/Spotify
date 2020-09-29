package defpackage;

import io.reactivex.Flowable;

/* renamed from: spf reason: default package */
public final class spf implements wig<spe> {
    private final wzi<spc> a;
    private final wzi<spg> b;
    private final wzi<vvy<hcs>> c;
    private final wzi<Flowable<hcs>> d;

    private spf(wzi<spc> wzi, wzi<spg> wzi2, wzi<vvy<hcs>> wzi3, wzi<Flowable<hcs>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static spf a(wzi<spc> wzi, wzi<spg> wzi2, wzi<vvy<hcs>> wzi3, wzi<Flowable<hcs>> wzi4) {
        return new spf(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new spe((spc) this.a.get(), (spg) this.b.get(), (vvy) this.c.get(), (Flowable) this.d.get());
    }
}
