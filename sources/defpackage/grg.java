package defpackage;

/* renamed from: grg reason: default package */
public final class grg implements vua<String> {
    private final wlc<jro> a;

    private grg(wlc<jro> wlc) {
        this.a = wlc;
    }

    public static grg a(wlc<jro> wlc) {
        return new grg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((jro) this.a.get()).d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
