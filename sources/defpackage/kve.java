package defpackage;

/* renamed from: kve reason: default package */
public final class kve implements vua<kvd> {
    private final wlc<kvf> a;

    private kve(wlc<kvf> wlc) {
        this.a = wlc;
    }

    public static kve a(wlc<kvf> wlc) {
        return new kve(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kvd((kvf) this.a.get());
    }
}
