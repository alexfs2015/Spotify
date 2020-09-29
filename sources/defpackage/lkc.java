package defpackage;

/* renamed from: lkc reason: default package */
public final class lkc implements vua<lkj> {
    private final wlc<jro> a;

    private lkc(wlc<jro> wlc) {
        this.a = wlc;
    }

    public static lkc a(wlc<jro> wlc) {
        return new lkc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (lkj) vuf.a(new lkj(((jro) this.a.get()).c()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
