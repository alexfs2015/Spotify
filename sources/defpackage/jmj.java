package defpackage;

/* renamed from: jmj reason: default package */
public final class jmj implements vua<jmi> {
    private final wlc<imo> a;

    private jmj(wlc<imo> wlc) {
        this.a = wlc;
    }

    public static jmj a(wlc<imo> wlc) {
        return new jmj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jmi((imo) this.a.get());
    }
}
