package defpackage;

/* renamed from: mjx reason: default package */
public final class mjx implements vua<mjw> {
    private final wlc<a> a;

    private mjx(wlc<a> wlc) {
        this.a = wlc;
    }

    public static mjx a(wlc<a> wlc) {
        return new mjx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mjw((a) this.a.get());
    }
}
