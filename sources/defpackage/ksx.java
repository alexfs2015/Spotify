package defpackage;

/* renamed from: ksx reason: default package */
public final class ksx implements vua<ksw> {
    private final wlc<jej> a;
    private final wlc<jen> b;

    private ksx(wlc<jej> wlc, wlc<jen> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ksx a(wlc<jej> wlc, wlc<jen> wlc2) {
        return new ksx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ksw((jej) this.a.get(), (jen) this.b.get());
    }
}
