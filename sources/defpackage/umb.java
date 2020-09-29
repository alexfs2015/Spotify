package defpackage;

/* renamed from: umb reason: default package */
public final class umb implements vua<uma> {
    private final wlc<jjf> a;
    private final wlc<ukj> b;
    private final wlc<fpt> c;

    private umb(wlc<jjf> wlc, wlc<ukj> wlc2, wlc<fpt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static umb a(wlc<jjf> wlc, wlc<ukj> wlc2, wlc<fpt> wlc3) {
        return new umb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new uma((jjf) this.a.get(), (ukj) this.b.get(), (fpt) this.c.get());
    }
}
