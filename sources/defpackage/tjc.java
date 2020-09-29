package defpackage;

/* renamed from: tjc reason: default package */
public final class tjc implements vua<tjb> {
    private final wlc<tis> a;

    private tjc(wlc<tis> wlc) {
        this.a = wlc;
    }

    public static tjc a(wlc<tis> wlc) {
        return new tjc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tjb((tis) this.a.get());
    }
}
