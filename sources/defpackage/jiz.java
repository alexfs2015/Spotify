package defpackage;

/* renamed from: jiz reason: default package */
public final class jiz implements vua<jix> {
    private final wlc<jpw> a;
    private final wlc<rgz> b;
    private final wlc<twu> c;
    private final wlc<shs> d;

    private jiz(wlc<jpw> wlc, wlc<rgz> wlc2, wlc<twu> wlc3, wlc<shs> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static jiz a(wlc<jpw> wlc, wlc<rgz> wlc2, wlc<twu> wlc3, wlc<shs> wlc4) {
        return new jiz(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new jix((jpw) this.a.get(), (rgz) this.b.get(), (twu) this.c.get(), (shs) this.d.get());
    }
}
