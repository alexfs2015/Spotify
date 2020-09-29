package defpackage;

/* renamed from: mdi reason: default package */
public final class mdi implements vua<mdh> {
    private final wlc<jjf> a;
    private final wlc<hec> b;

    private mdi(wlc<jjf> wlc, wlc<hec> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mdi a(wlc<jjf> wlc, wlc<hec> wlc2) {
        return new mdi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mdh((jjf) this.a.get(), (hec) this.b.get());
    }
}
