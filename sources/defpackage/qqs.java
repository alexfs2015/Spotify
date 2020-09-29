package defpackage;

/* renamed from: qqs reason: default package */
public final class qqs implements vua<qqr> {
    private final wlc<hfx> a;

    private qqs(wlc<hfx> wlc) {
        this.a = wlc;
    }

    public static qqs a(wlc<hfx> wlc) {
        return new qqs(wlc);
    }

    public static qqr a(hfx hfx) {
        return new qqr(hfx);
    }

    public final /* synthetic */ Object get() {
        return new qqr((hfx) this.a.get());
    }
}
