package defpackage;

/* renamed from: phz reason: default package */
public final class phz implements vua<phy> {
    private final wlc<phk> a;

    private phz(wlc<phk> wlc) {
        this.a = wlc;
    }

    public static phz a(wlc<phk> wlc) {
        return new phz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new phy((phk) this.a.get());
    }
}
