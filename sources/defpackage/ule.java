package defpackage;

/* renamed from: ule reason: default package */
public final class ule implements vua<wut<vri, wud<Long>>> {
    private final wlc<wug> a;

    private ule(wlc<wug> wlc) {
        this.a = wlc;
    }

    public static ule a(wlc<wug> wlc) {
        return new ule(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wut) vuf.a(new uln((wug) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
