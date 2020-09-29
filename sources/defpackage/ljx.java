package defpackage;

/* renamed from: ljx reason: default package */
public final class ljx implements vua<ljw> {
    private final wlc<ka> a;
    private final wlc<Boolean> b;

    private ljx(wlc<ka> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ljx a(wlc<ka> wlc, wlc<Boolean> wlc2) {
        return new ljx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ljw((ka) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
