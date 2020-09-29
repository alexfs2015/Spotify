package defpackage;

/* renamed from: jnx reason: default package */
public final class jnx implements vua<jnw> {
    private final wlc<jmq> a;
    private final wlc<jmg> b;
    private final wlc<jne> c;

    private jnx(wlc<jmq> wlc, wlc<jmg> wlc2, wlc<jne> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static jnx a(wlc<jmq> wlc, wlc<jmg> wlc2, wlc<jne> wlc3) {
        return new jnx(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new jnw((jmq) this.a.get(), (jmg) this.b.get(), (jne) this.c.get());
    }
}
