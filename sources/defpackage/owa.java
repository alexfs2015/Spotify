package defpackage;

/* renamed from: owa reason: default package */
public final class owa implements vua<ovz> {
    private final wlc<a> a;

    private owa(wlc<a> wlc) {
        this.a = wlc;
    }

    public static owa a(wlc<a> wlc) {
        return new owa(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ovz((a) this.a.get());
    }
}
