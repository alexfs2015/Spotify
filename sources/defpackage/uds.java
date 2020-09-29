package defpackage;

/* renamed from: uds reason: default package */
public final class uds implements vua<udr> {
    private final wlc<a> a;

    private uds(wlc<a> wlc) {
        this.a = wlc;
    }

    public static uds a(wlc<a> wlc) {
        return new uds(wlc);
    }

    public static udr a(a aVar) {
        return (udr) vuf.a(aVar.ag(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
