package defpackage;

/* renamed from: igo reason: default package */
public final class igo implements vua<ign> {
    private final wlc<iga> a;
    private final wlc<idq> b;
    private final wlc<kct> c;
    private final wlc<igu> d;

    private igo(wlc<iga> wlc, wlc<idq> wlc2, wlc<kct> wlc3, wlc<igu> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static igo a(wlc<iga> wlc, wlc<idq> wlc2, wlc<kct> wlc3, wlc<igu> wlc4) {
        return new igo(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ign(this.a, this.b, (kct) this.c.get(), (igu) this.d.get());
    }
}
