package defpackage;

/* renamed from: nje reason: default package */
public final class nje implements vua<njd> {
    private final wlc<ndh> a;

    private nje(wlc<ndh> wlc) {
        this.a = wlc;
    }

    public static nje a(wlc<ndh> wlc) {
        return new nje(wlc);
    }

    public final /* synthetic */ Object get() {
        return new njd((ndh) this.a.get());
    }
}
