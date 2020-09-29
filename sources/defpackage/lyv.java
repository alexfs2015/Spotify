package defpackage;

/* renamed from: lyv reason: default package */
public final class lyv implements vua<lyu> {
    private final wlc<String> a;

    private lyv(wlc<String> wlc) {
        this.a = wlc;
    }

    public static lyv a(wlc<String> wlc) {
        return new lyv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lyu((String) this.a.get());
    }
}
