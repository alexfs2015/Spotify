package defpackage;

/* renamed from: jmh reason: default package */
public final class jmh implements vua<jmg> {
    private final wlc<jmz> a;
    private final wlc<jmi> b;

    private jmh(wlc<jmz> wlc, wlc<jmi> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jmh a(wlc<jmz> wlc, wlc<jmi> wlc2) {
        return new jmh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new jmg((jmz) this.a.get(), (jmi) this.b.get());
    }
}
