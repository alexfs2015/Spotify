package defpackage;

/* renamed from: lvj reason: default package */
public final class lvj implements vua<lvi> {
    private final wlc<Boolean> a;
    private final wlc<Boolean> b;
    private final wlc<lvm> c;

    private lvj(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<lvm> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lvj a(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<lvm> wlc3) {
        return new lvj(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new lvi(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue(), (lvm) this.c.get());
    }
}
