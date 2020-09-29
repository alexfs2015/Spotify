package defpackage;

/* renamed from: ski reason: default package */
public final class ski implements vua<skh> {
    private final wlc<sjv> a;

    private ski(wlc<sjv> wlc) {
        this.a = wlc;
    }

    public static ski a(wlc<sjv> wlc) {
        return new ski(wlc);
    }

    public final /* synthetic */ Object get() {
        return new skh((sjv) this.a.get());
    }
}
