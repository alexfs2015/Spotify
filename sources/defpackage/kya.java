package defpackage;

/* renamed from: kya reason: default package */
public final class kya implements vua<kxz> {
    private final wlc<ufm> a;
    private final wlc<kyb> b;

    private kya(wlc<ufm> wlc, wlc<kyb> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kya a(wlc<ufm> wlc, wlc<kyb> wlc2) {
        return new kya(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kxz((ufm) this.a.get(), (kyb) this.b.get());
    }
}
