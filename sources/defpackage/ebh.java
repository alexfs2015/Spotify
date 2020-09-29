package defpackage;

/* renamed from: ebh reason: default package */
final class ebh implements cqy<eam> {
    private final /* synthetic */ ebp a;
    private final /* synthetic */ eay b;

    ebh(eay eay, ebp ebp) {
        this.b = eay;
        this.a = ebp;
    }

    public final /* synthetic */ void a(Object obj) {
        synchronized (this.b.a) {
            this.b.g = 0;
            if (!(this.b.f == null || this.a == this.b.f)) {
                cml.a();
                this.b.f.d();
            }
            this.b.f = this.a;
        }
    }
}
