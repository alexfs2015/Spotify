package defpackage;

/* renamed from: ksa reason: default package */
public final class ksa implements vua<krz> {
    private final wlc<jwv> a;

    private ksa(wlc<jwv> wlc) {
        this.a = wlc;
    }

    public static ksa a(wlc<jwv> wlc) {
        return new ksa(wlc);
    }

    public final /* synthetic */ Object get() {
        return new krz((jwv) this.a.get());
    }
}
