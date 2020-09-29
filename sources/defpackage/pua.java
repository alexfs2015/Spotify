package defpackage;

/* renamed from: pua reason: default package */
public final class pua implements wig<ptz> {
    private final wzi<jtz> a;
    private final wzi<gfk<fli>> b;

    private pua(wzi<jtz> wzi, wzi<gfk<fli>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pua a(wzi<jtz> wzi, wzi<gfk<fli>> wzi2) {
        return new pua(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ptz((jtz) this.a.get(), (gfk) this.b.get());
    }
}
