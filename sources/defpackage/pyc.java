package defpackage;

/* renamed from: pyc reason: default package */
public final class pyc implements vua<String> {
    private final wlc<a> a;

    private pyc(wlc<a> wlc) {
        this.a = wlc;
    }

    public static pyc a(wlc<a> wlc) {
        return new pyc(wlc);
    }

    public static String a(a aVar) {
        return (String) vuf.a(aVar.e, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
