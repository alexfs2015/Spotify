package defpackage;

/* renamed from: ngr reason: default package */
public final class ngr implements vua<wud<Boolean>> {
    private final wlc<hec> a;

    private ngr(wlc<hec> wlc) {
        this.a = wlc;
    }

    public static ngr a(wlc<hec> wlc) {
        return new ngr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(vun.a((wrf<T>) ((hec) this.a.get()).a(kzc.a)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
