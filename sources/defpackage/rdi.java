package defpackage;

/* renamed from: rdi reason: default package */
public final class rdi implements vua<rdh> {
    private final wlc<b> a;

    private rdi(wlc<b> wlc) {
        this.a = wlc;
    }

    public static rdi a(wlc<b> wlc) {
        return new rdi(wlc);
    }

    public static rdh a(b bVar) {
        return (rdh) vuf.a(bVar.af(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((b) this.a.get());
    }
}
