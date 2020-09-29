package defpackage;

/* renamed from: mpd reason: default package */
public final class mpd implements wig<mpi> {
    private final wzi<gwp> a;
    private final wzi<gwr> b;

    private mpd(wzi<gwp> wzi, wzi<gwr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mpd a(wzi<gwp> wzi, wzi<gwr> wzi2) {
        return new mpd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (mpi) wil.a(new mpj((gwp) this.a.get(), (gwr) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
