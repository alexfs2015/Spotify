package defpackage;

/* renamed from: phv reason: default package */
public final class phv implements vua<phu> {
    private final wlc<phk> a;

    private phv(wlc<phk> wlc) {
        this.a = wlc;
    }

    public static phv a(wlc<phk> wlc) {
        return new phv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new phu((phk) this.a.get());
    }
}
