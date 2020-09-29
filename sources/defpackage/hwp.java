package defpackage;

/* renamed from: hwp reason: default package */
public final class hwp implements vua<igl> {
    private final wlc<hxk> a;

    private hwp(wlc<hxk> wlc) {
        this.a = wlc;
    }

    public static hwp a(wlc<hxk> wlc) {
        return new hwp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (igl) vuf.a(new igl((hxk) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
