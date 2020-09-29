package defpackage;

/* renamed from: pyn reason: default package */
public final class pyn implements vua<pzg> {
    private final wlc<Boolean> a;
    private final wlc<pyy> b;
    private final wlc<pza> c;

    private pyn(wlc<Boolean> wlc, wlc<pyy> wlc2, wlc<pza> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pyn a(wlc<Boolean> wlc, wlc<pyy> wlc2, wlc<pza> wlc3) {
        return new pyn(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        Object obj;
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        wlc<pyy> wlc = this.b;
        wlc<pza> wlc2 = this.c;
        if (booleanValue) {
            obj = wlc2.get();
        } else {
            obj = wlc.get();
        }
        return (pzg) vuf.a((pzg) obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
