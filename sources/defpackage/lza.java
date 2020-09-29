package defpackage;

/* renamed from: lza reason: default package */
public final class lza implements vua<lyz> {
    private final wlc<lzk> a;
    private final wlc<lzf> b;
    private final wlc<Boolean> c;

    private lza(wlc<lzk> wlc, wlc<lzf> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lza a(wlc<lzk> wlc, wlc<lzf> wlc2, wlc<Boolean> wlc3) {
        return new lza(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new lyz((lzk) this.a.get(), (lzf) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
