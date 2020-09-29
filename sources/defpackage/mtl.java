package defpackage;

/* renamed from: mtl reason: default package */
public final class mtl implements vua<String> {
    private final wlc<udr> a;

    private mtl(wlc<udr> wlc) {
        this.a = wlc;
    }

    public static mtl a(wlc<udr> wlc) {
        return new mtl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((udr) this.a.get()).toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
