package defpackage;

/* renamed from: ktx reason: default package */
public final class ktx implements vua<ktw> {
    private final wlc<kte> a;
    private final wlc<ktp> b;
    private final wlc<jrp> c;
    private final wlc<ktg> d;
    private final wlc<kua> e;

    private ktx(wlc<kte> wlc, wlc<ktp> wlc2, wlc<jrp> wlc3, wlc<ktg> wlc4, wlc<kua> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ktx a(wlc<kte> wlc, wlc<ktp> wlc2, wlc<jrp> wlc3, wlc<ktg> wlc4, wlc<kua> wlc5) {
        ktx ktx = new ktx(wlc, wlc2, wlc3, wlc4, wlc5);
        return ktx;
    }

    public final /* synthetic */ Object get() {
        ktw ktw = new ktw((kte) this.a.get(), (ktp) this.b.get(), (jrp) this.c.get(), (ktg) this.d.get(), (kua) this.e.get());
        return ktw;
    }
}
