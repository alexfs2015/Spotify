package defpackage;

/* renamed from: unv reason: default package */
public final class unv implements vua<b> {
    private final wlc<jro> a;

    private unv(wlc<jro> wlc) {
        this.a = wlc;
    }

    public static unv a(wlc<jro> wlc) {
        return new unv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new b((jro) this.a.get());
    }
}
