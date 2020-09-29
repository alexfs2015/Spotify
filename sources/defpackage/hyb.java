package defpackage;

/* renamed from: hyb reason: default package */
public final class hyb implements vua<hya> {
    private final wlc<hyf> a;

    private hyb(wlc<hyf> wlc) {
        this.a = wlc;
    }

    public static hyb a(wlc<hyf> wlc) {
        return new hyb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hya((hyf) this.a.get());
    }
}
