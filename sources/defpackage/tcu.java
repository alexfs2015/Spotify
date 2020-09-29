package defpackage;

/* renamed from: tcu reason: default package */
public final class tcu implements vua<tct> {
    private final wlc<gtm> a;

    private tcu(wlc<gtm> wlc) {
        this.a = wlc;
    }

    public static tcu a(wlc<gtm> wlc) {
        return new tcu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tct((gtm) this.a.get());
    }
}
