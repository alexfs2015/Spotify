package defpackage;

/* renamed from: qac reason: default package */
public final class qac implements vua<rzf> {
    private final wlc<rzc> a;
    private final wlc<String> b;
    private final wlc<Boolean> c;

    private qac(wlc<rzc> wlc, wlc<String> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qac a(wlc<rzc> wlc, wlc<String> wlc2, wlc<Boolean> wlc3) {
        return new qac(wlc, wlc2, wlc3);
    }

    public static rzf a(rzc rzc, String str, boolean z) {
        return (rzf) vuf.a(pzz.a(rzc, str, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((rzc) this.a.get(), (String) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
