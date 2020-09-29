package defpackage;

/* renamed from: hdm reason: default package */
public final class hdm implements gwl {
    private final gwl a;
    private final a b;

    /* renamed from: hdm$a */
    public interface a {
        void a(hcm hcm, int i);
    }

    public hdm(gwl gwl, a aVar) {
        this.a = (gwl) fbp.a(gwl);
        this.b = (a) fbp.a(aVar);
    }

    public final int resolve(hcm hcm) {
        int resolve = this.a.resolve(hcm);
        this.b.a(hcm, resolve);
        return resolve;
    }
}
