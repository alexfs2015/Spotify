package defpackage;

/* renamed from: ogf reason: default package */
public final class ogf implements vua<oge> {
    private final wlc<ogg> a;
    private final wlc<b> b;
    private final wlc<a> c;
    private final wlc<ogi> d;

    private ogf(wlc<ogg> wlc, wlc<b> wlc2, wlc<a> wlc3, wlc<ogi> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ogf a(wlc<ogg> wlc, wlc<b> wlc2, wlc<a> wlc3, wlc<ogi> wlc4) {
        return new ogf(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new oge((ogg) this.a.get(), (b) this.b.get(), (a) this.c.get(), (ogi) this.d.get());
    }
}
