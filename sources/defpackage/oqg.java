package defpackage;

/* renamed from: oqg reason: default package */
public final class oqg implements vua<oqf> {
    private final wlc<opb> a;

    private oqg(wlc<opb> wlc) {
        this.a = wlc;
    }

    public static oqg a(wlc<opb> wlc) {
        return new oqg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oqf(this.a);
    }
}
