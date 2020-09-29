package defpackage;

/* renamed from: brq reason: default package */
final class brq extends f {
    private final /* synthetic */ String a;
    private final /* synthetic */ String e;
    private final /* synthetic */ bra f = null;

    brq(bsh bsh, String str, String str2) {
        this.a = str;
        this.e = str2;
        super(bsh);
    }

    public final void a(ehb ehb) {
        try {
            String str = this.a;
            String str2 = this.e;
            ehb.a((b<a>) this);
            bra bra = new bra();
            ehn ehn = (ehn) ehb.q();
            if (ehb.t()) {
                ehn.a(str, str2, bra);
            } else {
                ehb.b(2016);
            }
        } catch (IllegalStateException unused) {
            h();
        }
    }

    public final /* synthetic */ void a(b bVar) {
        a((ehb) bVar);
    }
}
