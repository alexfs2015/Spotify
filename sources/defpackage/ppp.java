package defpackage;

/* renamed from: ppp reason: default package */
public final class ppp implements kmm<hcs, pnk> {
    public final gwr a;
    /* access modifiers changed from: private */
    public final gwp b;

    public ppp(gwr gwr, gwp gwp) {
        this.a = gwr;
        this.b = gwp;
    }

    public final kmn<hcs> connect(knw<pnk> knw) {
        return new kmn<hcs>() {
            public final /* synthetic */ void accept(Object obj) {
                ppp.this.b.a((hcs) obj, false);
            }

            public final void dispose() {
            }
        };
    }
}
