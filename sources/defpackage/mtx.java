package defpackage;

/* renamed from: mtx reason: default package */
public final class mtx implements vua<mtw> {
    private final wlc<a> a;

    private mtx(wlc<a> wlc) {
        this.a = wlc;
    }

    public static mtx a(wlc<a> wlc) {
        return new mtx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mtw((a) this.a.get());
    }
}
