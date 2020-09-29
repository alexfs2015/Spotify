package defpackage;

/* renamed from: omg reason: default package */
public final class omg implements vua<omf> {
    private final wlc<opb> a;

    private omg(wlc<opb> wlc) {
        this.a = wlc;
    }

    public static omg a(wlc<opb> wlc) {
        return new omg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new omf(this.a);
    }
}
