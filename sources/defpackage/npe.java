package defpackage;

/* renamed from: npe reason: default package */
public final class npe implements wig<npd> {
    private final wzi<lbi> a;
    private final wzi<npf> b;
    private final wzi<now> c;
    private final wzi<hhm<hcs>> d;
    private final wzi<noz> e;

    private npe(wzi<lbi> wzi, wzi<npf> wzi2, wzi<now> wzi3, wzi<hhm<hcs>> wzi4, wzi<noz> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static npe a(wzi<lbi> wzi, wzi<npf> wzi2, wzi<now> wzi3, wzi<hhm<hcs>> wzi4, wzi<noz> wzi5) {
        npe npe = new npe(wzi, wzi2, wzi3, wzi4, wzi5);
        return npe;
    }

    public final /* synthetic */ Object get() {
        npd npd = new npd((lbi) this.a.get(), (npf) this.b.get(), (now) this.c.get(), (hhm) this.d.get(), (noz) this.e.get());
        return npd;
    }
}
