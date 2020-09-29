package defpackage;

/* renamed from: ley reason: default package */
public final class ley implements vua<String> {
    private final wlc<a> a;

    private ley(wlc<a> wlc) {
        this.a = wlc;
    }

    public static ley a(wlc<a> wlc) {
        return new ley(wlc);
    }

    public static String a(a aVar) {
        return (String) vuf.a(CC.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
