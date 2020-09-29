package defpackage;

/* renamed from: tpk reason: default package */
public final class tpk implements vua<tpj> {
    private final wlc<tnc> a;

    private tpk(wlc<tnc> wlc) {
        this.a = wlc;
    }

    public static tpk a(wlc<tnc> wlc) {
        return new tpk(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tpj((tnc) this.a.get());
    }
}
