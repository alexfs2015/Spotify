package defpackage;

/* renamed from: mfz reason: default package */
public final class mfz {
    final mfy a;
    private final a b;

    /* renamed from: mfz$a */
    public interface a {
        void ae();

        boolean af();
    }

    public mfz(a aVar, mfy mfy) {
        this.b = aVar;
        this.a = mfy;
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
