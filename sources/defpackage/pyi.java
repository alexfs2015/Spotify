package defpackage;

/* renamed from: pyi reason: default package */
public final class pyi implements vua<rzf> {
    private final wlc<rzc> a;
    private final wlc<String> b;
    private final wlc<Boolean> c;

    private pyi(wlc<rzc> wlc, wlc<String> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pyi a(wlc<rzc> wlc, wlc<String> wlc2, wlc<Boolean> wlc3) {
        return new pyi(wlc, wlc2, wlc3);
    }

    public static rzf a(rzc rzc, String str, boolean z) {
        return (rzf) vuf.a(pye.a(rzc, str, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((rzc) this.a.get(), (String) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
