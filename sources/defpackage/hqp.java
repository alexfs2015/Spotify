package defpackage;

/* renamed from: hqp reason: default package */
public final class hqp implements vua<hqo> {
    private final wlc<hsh> a;
    private final wlc<hpg> b;
    private final wlc<jro> c;
    private final wlc<jrf> d;
    private final wlc<hox> e;

    private hqp(wlc<hsh> wlc, wlc<hpg> wlc2, wlc<jro> wlc3, wlc<jrf> wlc4, wlc<hox> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hqp a(wlc<hsh> wlc, wlc<hpg> wlc2, wlc<jro> wlc3, wlc<jrf> wlc4, wlc<hox> wlc5) {
        hqp hqp = new hqp(wlc, wlc2, wlc3, wlc4, wlc5);
        return hqp;
    }

    public final /* synthetic */ Object get() {
        hqo hqo = new hqo((hsh) this.a.get(), (hpg) this.b.get(), (jro) this.c.get(), (jrf) this.d.get(), (hox) this.e.get());
        return hqo;
    }
}
