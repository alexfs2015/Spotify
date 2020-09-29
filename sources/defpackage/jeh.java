package defpackage;

/* renamed from: jeh reason: default package */
public final class jeh implements vua<jeg> {
    private final wlc<gho> a;

    private jeh(wlc<gho> wlc) {
        this.a = wlc;
    }

    public static jeh a(wlc<gho> wlc) {
        return new jeh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jeg((gho) this.a.get());
    }
}
