package defpackage;

/* renamed from: ovh reason: default package */
public final class ovh implements vua<ovg> {
    private final wlc<opb> a;

    private ovh(wlc<opb> wlc) {
        this.a = wlc;
    }

    public static ovh a(wlc<opb> wlc) {
        return new ovh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ovg(this.a);
    }
}
