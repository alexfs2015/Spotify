package defpackage;

/* renamed from: jek reason: default package */
public final class jek implements vua<jej> {
    private final wlc<jeg> a;

    private jek(wlc<jeg> wlc) {
        this.a = wlc;
    }

    public static jek a(wlc<jeg> wlc) {
        return new jek(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jej((jeg) this.a.get());
    }
}
