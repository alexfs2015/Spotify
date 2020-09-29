package defpackage;

/* renamed from: jnf reason: default package */
public final class jnf implements vua<jne> {
    private final wlc<jmz> a;
    private final wlc<jng> b;

    private jnf(wlc<jmz> wlc, wlc<jng> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jnf a(wlc<jmz> wlc, wlc<jng> wlc2) {
        return new jnf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new jne((jmz) this.a.get(), (jng) this.b.get());
    }
}
