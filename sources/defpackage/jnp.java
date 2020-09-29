package defpackage;

/* renamed from: jnp reason: default package */
public final class jnp implements vua<jno> {
    private final wlc<twr> a;
    private final wlc<jjf> b;

    private jnp(wlc<twr> wlc, wlc<jjf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jnp a(wlc<twr> wlc, wlc<jjf> wlc2) {
        return new jnp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new jno((twr) this.a.get(), (jjf) this.b.get());
    }
}
