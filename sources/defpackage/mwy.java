package defpackage;

/* renamed from: mwy reason: default package */
public final class mwy implements vua<String> {
    private final wlc<String> a;

    private mwy(wlc<String> wlc) {
        this.a = wlc;
    }

    public static mwy a(wlc<String> wlc) {
        return new mwy(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a((String) this.a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
