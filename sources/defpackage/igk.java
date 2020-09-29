package defpackage;

/* renamed from: igk reason: default package */
public final class igk implements vua<igj> {
    private final wlc<hxi> a;
    private final wlc<rnd> b;

    private igk(wlc<hxi> wlc, wlc<rnd> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static igk a(wlc<hxi> wlc, wlc<rnd> wlc2) {
        return new igk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new igj((hxi) this.a.get(), (rnd) this.b.get());
    }
}
