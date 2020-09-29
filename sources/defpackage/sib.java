package defpackage;

/* renamed from: sib reason: default package */
public final class sib implements vua<sia> {
    private final wlc<hed> a;
    private final wlc<rgz> b;
    private final wlc<hec> c;

    private sib(wlc<hed> wlc, wlc<rgz> wlc2, wlc<hec> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sib a(wlc<hed> wlc, wlc<rgz> wlc2, wlc<hec> wlc3) {
        return new sib(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new sia((hed) this.a.get(), (rgz) this.b.get(), (hec) this.c.get());
    }
}
