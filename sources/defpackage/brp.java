package defpackage;

/* renamed from: brp reason: default package */
final class brp extends f {
    private final /* synthetic */ String a;
    private final /* synthetic */ bnj e;

    brp(bsh bsh, String str, bnj bnj) {
        this.a = str;
        this.e = bnj;
        super(bsh);
    }

    public final void a(ehb ehb) {
        try {
            String str = this.a;
            bnj bnj = this.e;
            ehb.a((b<a>) this);
            ehn ehn = (ehn) ehb.q();
            if (ehb.t()) {
                ehn.a(str, bnj);
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
