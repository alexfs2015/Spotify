package defpackage;

/* renamed from: nxb reason: default package */
public final class nxb implements vua<String> {
    private final wlc<a> a;

    private nxb(wlc<a> wlc) {
        this.a = wlc;
    }

    public static nxb a(wlc<a> wlc) {
        return new nxb(wlc);
    }

    public static String a(a aVar) {
        return (String) vuf.a(CC.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
