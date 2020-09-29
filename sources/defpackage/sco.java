package defpackage;

/* renamed from: sco reason: default package */
public final class sco implements vua<scn> {
    private final wlc<sal> a;

    private sco(wlc<sal> wlc) {
        this.a = wlc;
    }

    public static sco a(wlc<sal> wlc) {
        return new sco(wlc);
    }

    public final /* synthetic */ Object get() {
        return new scn((sal) this.a.get());
    }
}
