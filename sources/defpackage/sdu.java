package defpackage;

/* renamed from: sdu reason: default package */
public final class sdu implements vua<sdt> {
    private final wlc<String> a;
    private final wlc<String> b;

    private sdu(wlc<String> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sdu a(wlc<String> wlc, wlc<String> wlc2) {
        return new sdu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sdt((String) this.a.get(), (String) this.b.get());
    }
}
