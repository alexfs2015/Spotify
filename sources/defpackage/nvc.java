package defpackage;

/* renamed from: nvc reason: default package */
public final class nvc implements vua<b<nvn, nvl>> {
    private final wlc<c<nvn, nvl, nvk>> a;

    private nvc(wlc<c<nvn, nvl, nvk>> wlc) {
        this.a = wlc;
    }

    public static nvc a(wlc<c<nvn, nvl, nvk>> wlc) {
        return new nvc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (b) vuf.a(kjt.a((c) this.a.get(), nvn.a, kkd.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
