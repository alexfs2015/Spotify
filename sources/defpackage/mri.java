package defpackage;

/* renamed from: mri reason: default package */
public final class mri implements wig<mrh> {
    private final wzi<uix> a;
    private final wzi<rqb> b;
    private final wzi<hfx> c;

    private mri(wzi<uix> wzi, wzi<rqb> wzi2, wzi<hfx> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mri a(wzi<uix> wzi, wzi<rqb> wzi2, wzi<hfx> wzi3) {
        return new mri(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mrh((uix) this.a.get(), (rqb) this.b.get(), (hfx) this.c.get());
    }
}
