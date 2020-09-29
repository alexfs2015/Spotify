package defpackage;

/* renamed from: lwu reason: default package */
public final class lwu implements vua<String> {
    private final wlc<lum> a;

    private lwu(wlc<lum> wlc) {
        this.a = wlc;
    }

    public static lwu a(wlc<lum> wlc) {
        return new lwu(wlc);
    }

    public final /* synthetic */ Object get() {
        lum lum = (lum) this.a.get();
        return (String) vuf.a(lum.h(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
