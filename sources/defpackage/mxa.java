package defpackage;

/* renamed from: mxa reason: default package */
public final class mxa implements vua<Boolean> {
    private final wlc<fpt> a;

    private mxa(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static mxa a(wlc<fpt> wlc) {
        return new mxa(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jsl.b((fpt) this.a.get()));
    }
}
