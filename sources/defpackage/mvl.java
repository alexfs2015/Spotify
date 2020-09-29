package defpackage;

/* renamed from: mvl reason: default package */
public final class mvl implements kmm<hcs, mvx> {
    public final mup a;
    /* access modifiers changed from: private */
    public final gwp b;

    public mvl(gwp gwp, mup mup) {
        this.b = gwp;
        this.a = mup;
    }

    public final kmn<hcs> connect(knw<mvx> knw) {
        return new kmn<hcs>() {
            public final /* synthetic */ void accept(Object obj) {
                mvl.this.b.a((hcs) obj, false);
            }

            public final void dispose() {
            }
        };
    }
}
