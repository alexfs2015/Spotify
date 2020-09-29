package defpackage;

/* renamed from: uxk reason: default package */
public final class uxk implements vua<uxj> {
    private final wlc<uxi> a;

    private uxk(wlc<uxi> wlc) {
        this.a = wlc;
    }

    public static uxk a(wlc<uxi> wlc) {
        return new uxk(wlc);
    }

    public static uxj a(Object obj) {
        return new uxj((uxi) obj);
    }

    public final /* synthetic */ Object get() {
        return new uxj((uxi) this.a.get());
    }
}
