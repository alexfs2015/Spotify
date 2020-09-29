package defpackage;

/* renamed from: lih reason: default package */
public final class lih implements vua<String> {
    private final wlc<jro> a;

    private lih(wlc<jro> wlc) {
        this.a = wlc;
    }

    public static lih a(wlc<jro> wlc) {
        return new lih(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((jro) this.a.get()).c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
