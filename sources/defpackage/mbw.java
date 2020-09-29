package defpackage;

/* renamed from: mbw reason: default package */
public final class mbw {
    final mbv a;
    private final a b;

    /* renamed from: mbw$a */
    public interface a {
        void ae();

        boolean af();
    }

    public mbw(a aVar, mbv mbv) {
        this.b = aVar;
        this.a = mbv;
    }

    public final boolean a() {
        boolean af = this.b.af();
        if (af) {
            this.a.b();
        } else {
            b();
        }
        return af;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.a.a();
        this.b.ae();
    }
}
