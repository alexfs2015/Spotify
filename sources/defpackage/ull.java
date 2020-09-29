package defpackage;

/* renamed from: ull reason: default package */
public final class ull implements vua<ulk> {
    private final wlc<jjf> a;
    private final wlc<String> b;

    private ull(wlc<jjf> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ull a(wlc<jjf> wlc, wlc<String> wlc2) {
        return new ull(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ulk((jjf) this.a.get(), (String) this.b.get());
    }
}
