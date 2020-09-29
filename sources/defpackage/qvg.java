package defpackage;

/* renamed from: qvg reason: default package */
public final class qvg implements vua<qvf> {
    private final wlc<ioo> a;
    private final wlc<qze> b;
    private final wlc<String> c;
    private final wlc<rnf> d;
    private final wlc<jug> e;

    private qvg(wlc<ioo> wlc, wlc<qze> wlc2, wlc<String> wlc3, wlc<rnf> wlc4, wlc<jug> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static qvg a(wlc<ioo> wlc, wlc<qze> wlc2, wlc<String> wlc3, wlc<rnf> wlc4, wlc<jug> wlc5) {
        qvg qvg = new qvg(wlc, wlc2, wlc3, wlc4, wlc5);
        return qvg;
    }

    public final /* synthetic */ Object get() {
        qvf qvf = new qvf((ioo) this.a.get(), (qze) this.b.get(), (String) this.c.get(), (rnf) this.d.get(), (jug) this.e.get());
        return qvf;
    }
}
