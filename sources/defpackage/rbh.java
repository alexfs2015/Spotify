package defpackage;

/* renamed from: rbh reason: default package */
public final class rbh implements vua<rbg> {
    private final wlc<ram> a;

    private rbh(wlc<ram> wlc) {
        this.a = wlc;
    }

    public static rbh a(wlc<ram> wlc) {
        return new rbh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rbg((ram) this.a.get());
    }
}
