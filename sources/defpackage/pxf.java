package defpackage;

/* renamed from: pxf reason: default package */
public final class pxf implements vua<rzf> {
    private final wlc<rzc> a;
    private final wlc<String> b;
    private final wlc<Boolean> c;

    private pxf(wlc<rzc> wlc, wlc<String> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pxf a(wlc<rzc> wlc, wlc<String> wlc2, wlc<Boolean> wlc3) {
        return new pxf(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (rzf) vuf.a(((rzc) this.a.get()).a((String) this.b.get(), ((Boolean) this.c.get()).booleanValue() ? "assisted_curation" : "default"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
