package defpackage;

/* renamed from: oza reason: default package */
public final class oza implements vua<oyz> {
    private final wlc<fsf> a;
    private final wlc<String> b;
    private final wlc<owu> c;

    private oza(wlc<fsf> wlc, wlc<String> wlc2, wlc<owu> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static oza a(wlc<fsf> wlc, wlc<String> wlc2, wlc<owu> wlc3) {
        return new oza(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new oyz((fsf) this.a.get(), (String) this.b.get(), (owu) this.c.get());
    }
}
