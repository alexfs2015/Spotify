package defpackage;

/* renamed from: lzc reason: default package */
public final class lzc implements vua<lzb> {
    private final wlc<a> a;
    private final wlc<lye> b;

    private lzc(wlc<a> wlc, wlc<lye> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lzc a(wlc<a> wlc, wlc<lye> wlc2) {
        return new lzc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new lzb((a) this.a.get(), (lye) this.b.get());
    }
}
