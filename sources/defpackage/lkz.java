package defpackage;

/* renamed from: lkz reason: default package */
public final class lkz implements vua<lky> {
    private final wlc<lkk> a;
    private final wlc<lkw> b;

    private lkz(wlc<lkk> wlc, wlc<lkw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lkz a(wlc<lkk> wlc, wlc<lkw> wlc2) {
        return new lkz(wlc, wlc2);
    }

    public static lky a(lkk lkk, Object obj) {
        return new lky(lkk, (lkw) obj);
    }

    public final /* synthetic */ Object get() {
        return new lky((lkk) this.a.get(), (lkw) this.b.get());
    }
}
