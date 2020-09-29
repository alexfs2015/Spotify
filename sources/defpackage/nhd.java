package defpackage;

/* renamed from: nhd reason: default package */
public final class nhd implements vua<nhc> {
    private final wlc<wud<Boolean>> a;

    private nhd(wlc<wud<Boolean>> wlc) {
        this.a = wlc;
    }

    public static nhd a(wlc<wud<Boolean>> wlc) {
        return new nhd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nhc((wud) this.a.get());
    }
}
