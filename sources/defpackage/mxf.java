package defpackage;

/* renamed from: mxf reason: default package */
public final class mxf implements vua<String> {
    private final wlc<udr> a;

    private mxf(wlc<udr> wlc) {
        this.a = wlc;
    }

    public static mxf a(wlc<udr> wlc) {
        return new mxf(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((udr) this.a.get()).toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
