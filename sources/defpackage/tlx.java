package defpackage;

/* renamed from: tlx reason: default package */
public final class tlx implements vua<tlw> {
    private final wlc<a> a;

    private tlx(wlc<a> wlc) {
        this.a = wlc;
    }

    public static tlx a(wlc<a> wlc) {
        return new tlx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tlw((a) this.a.get());
    }
}
