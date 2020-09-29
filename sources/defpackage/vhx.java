package defpackage;

/* renamed from: vhx reason: default package */
public final class vhx implements vua<vhw> {
    private final wlc<hhc> a;

    private vhx(wlc<hhc> wlc) {
        this.a = wlc;
    }

    public static vhx a(wlc<hhc> wlc) {
        return new vhx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new vhw((hhc) this.a.get());
    }
}
