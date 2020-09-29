package defpackage;

/* renamed from: nim reason: default package */
public final class nim implements kjd<nhz, nhx> {
    public final nfd a;
    /* access modifiers changed from: private */
    public final gup b;

    public nim(nfd nfd, gup gup) {
        this.a = nfd;
        this.b = gup;
    }

    public final kje<nhz> connect(kkn<nhx> kkn) {
        return new kje<nhz>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                nhz nhz = (nhz) obj;
                nim.this.b.a(nhz.a().a(), false);
                nim.this.a.a(nhz.a().a().custom());
            }
        };
    }
}
