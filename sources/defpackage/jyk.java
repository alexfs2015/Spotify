package defpackage;

/* renamed from: jyk reason: default package */
public final class jyk implements vua<jyj> {
    private final wlc<twr> a;

    private jyk(wlc<twr> wlc) {
        this.a = wlc;
    }

    public static jyk a(wlc<twr> wlc) {
        return new jyk(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jyj((twr) this.a.get());
    }
}
