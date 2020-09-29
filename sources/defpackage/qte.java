package defpackage;

/* renamed from: qte reason: default package */
public final class qte implements vua<qtd> {
    private final wlc<qyd> a;

    private qte(wlc<qyd> wlc) {
        this.a = wlc;
    }

    public static qte a(wlc<qyd> wlc) {
        return new qte(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qtd((qyd) this.a.get());
    }
}
