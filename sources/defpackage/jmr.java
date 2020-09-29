package defpackage;

/* renamed from: jmr reason: default package */
public final class jmr implements vua<jmq> {
    private final wlc<jmz> a;

    private jmr(wlc<jmz> wlc) {
        this.a = wlc;
    }

    public static jmr a(wlc<jmz> wlc) {
        return new jmr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jmq((jmz) this.a.get());
    }
}
