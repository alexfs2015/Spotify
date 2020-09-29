package defpackage;

/* renamed from: pxx reason: default package */
public final class pxx implements vua<String> {
    private final wlc<b> a;

    private pxx(wlc<b> wlc) {
        this.a = wlc;
    }

    public static pxx a(wlc<b> wlc) {
        return new pxx(wlc);
    }

    public static String a(b bVar) {
        return (String) vuf.a(CC.a(bVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((b) this.a.get());
    }
}
