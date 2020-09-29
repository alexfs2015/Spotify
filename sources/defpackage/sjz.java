package defpackage;

/* renamed from: sjz reason: default package */
public final class sjz implements vua<sjy> {
    private final wlc<sjv> a;

    private sjz(wlc<sjv> wlc) {
        this.a = wlc;
    }

    public static sjz a(wlc<sjv> wlc) {
        return new sjz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sjy((sjv) this.a.get());
    }
}
