package defpackage;

/* renamed from: mhg reason: default package */
public final class mhg implements vua<mhf> {
    private final wlc<fpg> a;

    private mhg(wlc<fpg> wlc) {
        this.a = wlc;
    }

    public static mhg a(wlc<fpg> wlc) {
        return new mhg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mhf((fpg) this.a.get());
    }
}
