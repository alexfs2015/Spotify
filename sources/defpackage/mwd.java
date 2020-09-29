package defpackage;

/* renamed from: mwd reason: default package */
public final class mwd implements wig<mwc> {
    private final wzi<mwi> a;
    private final wzi<mxf> b;

    private mwd(wzi<mwi> wzi, wzi<mxf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mwd a(wzi<mwi> wzi, wzi<mxf> wzi2) {
        return new mwd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mwc((mwi) this.a.get(), (mxf) this.b.get());
    }
}
