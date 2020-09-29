package defpackage;

/* renamed from: iwm reason: default package */
public final class iwm implements vua<gqw> {
    private final wlc<tad> a;
    private final wlc<rpg> b;
    private final wlc<gjf> c;
    private final wlc<sih> d;

    private iwm(wlc<tad> wlc, wlc<rpg> wlc2, wlc<gjf> wlc3, wlc<sih> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static iwm a(wlc<tad> wlc, wlc<rpg> wlc2, wlc<gjf> wlc3, wlc<sih> wlc4) {
        return new iwm(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (gqw) vuf.a(new iwl((tad) this.a.get(), (rpg) this.b.get(), (gjf) this.c.get(), (sih) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
