package defpackage;

/* renamed from: oxi reason: default package */
public final class oxi implements vua<Boolean> {
    private final wlc<fpt> a;

    private oxi(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static oxi a(wlc<fpt> wlc) {
        return new oxi(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(iqh.a((fpt) this.a.get()));
    }
}
