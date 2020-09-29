package defpackage;

/* renamed from: lwv reason: default package */
public final class lwv implements vua<String> {
    private final wlc<lum> a;

    private lwv(wlc<lum> wlc) {
        this.a = wlc;
    }

    public static lwv a(wlc<lum> wlc) {
        return new lwv(wlc);
    }

    public static String a(lum lum) {
        return (String) vuf.a(lum.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((lum) this.a.get());
    }
}
