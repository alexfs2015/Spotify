package defpackage;

/* renamed from: nfo reason: default package */
public final class nfo implements vua<Boolean> {
    private final wlc<rgz> a;
    private final wlc<twu> b;
    private final wlc<fpt> c;

    private nfo(wlc<rgz> wlc, wlc<twu> wlc2, wlc<fpt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nfo a(wlc<rgz> wlc, wlc<twu> wlc2, wlc<fpt> wlc3) {
        return new nfo(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(CC.a((rgz) this.a.get(), (twu) this.b.get(), (fpt) this.c.get()));
    }
}
