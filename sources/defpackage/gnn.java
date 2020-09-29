package defpackage;

/* renamed from: gnn reason: default package */
public final class gnn implements vua<gnm> {
    private final wlc<gcq> a;
    private final wlc<gne> b;
    private final wlc<gao> c;

    private gnn(wlc<gcq> wlc, wlc<gne> wlc2, wlc<gao> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gnn a(wlc<gcq> wlc, wlc<gne> wlc2, wlc<gao> wlc3) {
        return new gnn(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new gnm((gcq) this.a.get(), (gne) this.b.get(), (gao) this.c.get());
    }
}
