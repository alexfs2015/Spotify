package defpackage;

/* renamed from: ebi reason: default package */
final class ebi implements cqw {
    private final /* synthetic */ ebp a;
    private final /* synthetic */ eay b;

    ebi(eay eay, ebp ebp) {
        this.b = eay;
        this.a = ebp;
    }

    public final void a() {
        synchronized (this.b.a) {
            this.b.g = 1;
            cml.a();
            this.a.d();
        }
    }
}
