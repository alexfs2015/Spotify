package defpackage;

/* renamed from: lkd reason: default package */
public final class lkd implements vua<gdy> {
    private final wlc<gec> a;

    private lkd(wlc<gec> wlc) {
        this.a = wlc;
    }

    public static lkd a(wlc<gec> wlc) {
        return new lkd(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gdy) vuf.a(((gec) this.a.get()).a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
