package defpackage;

/* renamed from: lvv reason: default package */
public final class lvv implements vua<lvu> {
    private final wlc<lvw> a;

    private lvv(wlc<lvw> wlc) {
        this.a = wlc;
    }

    public static lvv a(wlc<lvw> wlc) {
        return new lvv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lvu((lvw) this.a.get());
    }
}
