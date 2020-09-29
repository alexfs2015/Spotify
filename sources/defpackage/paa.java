package defpackage;

/* renamed from: paa reason: default package */
public final class paa implements vua<ozz> {
    private final wlc<tmy> a;
    private final wlc<Boolean> b;

    private paa(wlc<tmy> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static paa a(wlc<tmy> wlc, wlc<Boolean> wlc2) {
        return new paa(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ozz((tmy) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
