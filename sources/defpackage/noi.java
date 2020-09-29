package defpackage;

/* renamed from: noi reason: default package */
public final class noi implements kmm<nnv, nnt> {
    public final nks a;
    /* access modifiers changed from: private */
    public final gwp b;

    public noi(nks nks, gwp gwp) {
        this.a = nks;
        this.b = gwp;
    }

    public final kmn<nnv> connect(knw<nnt> knw) {
        return new kmn<nnv>() {
            public final /* synthetic */ void accept(Object obj) {
                nnv nnv = (nnv) obj;
                noi.this.b.a(nnv.a().a(), false);
                noi.this.a.a(nnv.a().a().custom());
            }

            public final void dispose() {
            }
        };
    }
}
