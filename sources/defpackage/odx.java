package defpackage;

/* renamed from: odx reason: default package */
public final class odx implements vua<odw> {
    private final wlc<hdb> a;
    private final wlc<kxg> b;

    private odx(wlc<hdb> wlc, wlc<kxg> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static odx a(wlc<hdb> wlc, wlc<kxg> wlc2) {
        return new odx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new odw((hdb) this.a.get(), (kxg) this.b.get());
    }
}
