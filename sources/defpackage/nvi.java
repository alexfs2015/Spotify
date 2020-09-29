package defpackage;

/* renamed from: nvi reason: default package */
public final class nvi implements vua<nvf> {
    private final wlc<jej> a;
    private final wlc<jen> b;

    private nvi(wlc<jej> wlc, wlc<jen> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nvi a(wlc<jej> wlc, wlc<jen> wlc2) {
        return new nvi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new nvf((jej) this.a.get(), (jen) this.b.get());
    }
}
