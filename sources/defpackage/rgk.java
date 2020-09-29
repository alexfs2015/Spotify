package defpackage;

/* renamed from: rgk reason: default package */
public final class rgk implements vua<rgj> {
    private final wlc<uvf> a;
    private final wlc<rgw> b;
    private final wlc<Boolean> c;
    private final wlc<sjj> d;
    private final wlc<Boolean> e;

    private rgk(wlc<uvf> wlc, wlc<rgw> wlc2, wlc<Boolean> wlc3, wlc<sjj> wlc4, wlc<Boolean> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static rgk a(wlc<uvf> wlc, wlc<rgw> wlc2, wlc<Boolean> wlc3, wlc<sjj> wlc4, wlc<Boolean> wlc5) {
        rgk rgk = new rgk(wlc, wlc2, wlc3, wlc4, wlc5);
        return rgk;
    }

    public final /* synthetic */ Object get() {
        rgj rgj = new rgj((uvf) this.a.get(), vtz.b(this.b), ((Boolean) this.c.get()).booleanValue(), vtz.b(this.d), ((Boolean) this.e.get()).booleanValue());
        return rgj;
    }
}
