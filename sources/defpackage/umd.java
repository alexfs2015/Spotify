package defpackage;

/* renamed from: umd reason: default package */
public final class umd implements vua<umc> {
    private final wlc<jjf> a;

    private umd(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static umd a(wlc<jjf> wlc) {
        return new umd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new umc((jjf) this.a.get());
    }
}
