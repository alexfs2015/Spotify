package defpackage;

/* renamed from: nhq reason: default package */
public final class nhq implements vua<wud<Boolean>> {
    private final wlc<hec> a;

    private nhq(wlc<hec> wlc) {
        this.a = wlc;
    }

    public static nhq a(wlc<hec> wlc) {
        return new nhq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(vun.a((wrf<T>) ((hec) this.a.get()).a(kzc.a)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
