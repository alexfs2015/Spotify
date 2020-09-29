package defpackage;

/* renamed from: gth reason: default package */
public final class gth implements vua<wud<Boolean>> {
    private final wlc<hec> a;

    private gth(wlc<hec> wlc) {
        this.a = wlc;
    }

    public static gth a(wlc<hec> wlc) {
        return new gth(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(CC.a((hec) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
