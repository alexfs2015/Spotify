package defpackage;

/* renamed from: lxc reason: default package */
public final class lxc implements vua<String> {
    private final wlc<String> a;

    private lxc(wlc<String> wlc) {
        this.a = wlc;
    }

    public static lxc a(wlc<String> wlc) {
        return new lxc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(lzj.a((String) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
