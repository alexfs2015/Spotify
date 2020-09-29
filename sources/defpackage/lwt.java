package defpackage;

/* renamed from: lwt reason: default package */
public final class lwt implements vua<Boolean> {
    private final wlc<lum> a;

    private lwt(wlc<lum> wlc) {
        this.a = wlc;
    }

    public static lwt a(wlc<lum> wlc) {
        return new lwt(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!((lum) this.a.get()).g());
    }
}
