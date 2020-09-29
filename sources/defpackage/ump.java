package defpackage;

/* renamed from: ump reason: default package */
public final class ump implements vua<uma> {
    private final wlc<jjf> a;
    private final wlc<ukj> b;
    private final wlc<fpt> c;

    private ump(wlc<jjf> wlc, wlc<ukj> wlc2, wlc<fpt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ump a(wlc<jjf> wlc, wlc<ukj> wlc2, wlc<fpt> wlc3) {
        return new ump(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (uma) vuf.a(new uma((jjf) this.a.get(), (ukj) this.b.get(), (fpt) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
