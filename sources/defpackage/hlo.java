package defpackage;

/* renamed from: hlo reason: default package */
public final class hlo implements vua<wud<Boolean>> {
    private final wlc<hlj> a;

    private hlo(wlc<hlj> wlc) {
        this.a = wlc;
    }

    public static hlo a(wlc<hlj> wlc) {
        return new hlo(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(((hlj) this.a.get()).a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
