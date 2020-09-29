package defpackage;

/* renamed from: owo reason: default package */
public final class owo implements vua<own> {
    private final wlc<tmt> a;
    private final wlc<wug> b;
    private final wlc<String> c;

    private owo(wlc<tmt> wlc, wlc<wug> wlc2, wlc<String> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static owo a(wlc<tmt> wlc, wlc<wug> wlc2, wlc<String> wlc3) {
        return new owo(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new own((tmt) this.a.get(), (wug) this.b.get(), (String) this.c.get());
    }
}
