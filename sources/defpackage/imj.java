package defpackage;

/* renamed from: imj reason: default package */
public final class imj implements vua<imi> {
    private final wlc<uxc> a;

    private imj(wlc<uxc> wlc) {
        this.a = wlc;
    }

    public static imj a(wlc<uxc> wlc) {
        return new imj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new imi((uxc) this.a.get());
    }
}
