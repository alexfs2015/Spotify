package defpackage;

/* renamed from: lww reason: default package */
public final class lww implements vua<Boolean> {
    private final wlc<lum> a;

    private lww(wlc<lum> wlc) {
        this.a = wlc;
    }

    public static lww a(wlc<lum> wlc) {
        return new lww(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((lum) this.a.get()).d());
    }
}
