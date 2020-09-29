package defpackage;

/* renamed from: qil reason: default package */
public final class qil implements vua<qik> {
    private final wlc<qin> a;
    private final wlc<qix> b;
    private final wlc<qii> c;

    private qil(wlc<qin> wlc, wlc<qix> wlc2, wlc<qii> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qil a(wlc<qin> wlc, wlc<qix> wlc2, wlc<qii> wlc3) {
        return new qil(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qik((qin) this.a.get(), (qix) this.b.get(), (qii) this.c.get());
    }
}
