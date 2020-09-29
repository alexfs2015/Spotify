package defpackage;

/* renamed from: mte reason: default package */
public final class mte implements vua<Boolean> {
    private final wlc<fpt> a;

    private mte(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static mte a(wlc<fpt> wlc) {
        return new mte(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jsl.b((fpt) this.a.get()));
    }
}
