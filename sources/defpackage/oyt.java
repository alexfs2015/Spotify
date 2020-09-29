package defpackage;

/* renamed from: oyt reason: default package */
public final class oyt implements vua<oys> {
    private final wlc<a> a;
    private final wlc<owk> b;

    private oyt(wlc<a> wlc, wlc<owk> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oyt a(wlc<a> wlc, wlc<owk> wlc2) {
        return new oyt(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oys(vtz.b(this.a), (owk) this.b.get());
    }
}
