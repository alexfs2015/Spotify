package defpackage;

/* renamed from: tta reason: default package */
public final class tta implements vua<tsz> {
    private final wlc<spi> a;
    private final wlc<ttf> b;
    private final wlc<tvw> c;

    private tta(wlc<spi> wlc, wlc<ttf> wlc2, wlc<tvw> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tta a(wlc<spi> wlc, wlc<ttf> wlc2, wlc<tvw> wlc3) {
        return new tta(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tsz((spi) this.a.get(), (ttf) this.b.get(), (tvw) this.c.get());
    }
}
