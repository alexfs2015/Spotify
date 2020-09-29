package defpackage;

/* renamed from: phx reason: default package */
public final class phx implements vua<phw> {
    private final wlc<phk> a;

    private phx(wlc<phk> wlc) {
        this.a = wlc;
    }

    public static phx a(wlc<phk> wlc) {
        return new phx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new phw((phk) this.a.get());
    }
}
