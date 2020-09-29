package defpackage;

/* renamed from: sda reason: default package */
public final class sda implements vua<scz> {
    private final wlc<kxz> a;
    private final wlc<hed> b;
    private final wlc<String> c;

    private sda(wlc<kxz> wlc, wlc<hed> wlc2, wlc<String> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sda a(wlc<kxz> wlc, wlc<hed> wlc2, wlc<String> wlc3) {
        return new sda(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new scz((kxz) this.a.get(), (hed) this.b.get(), (String) this.c.get());
    }
}
