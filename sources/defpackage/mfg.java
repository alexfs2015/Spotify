package defpackage;

/* renamed from: mfg reason: default package */
public final class mfg implements vua<mff> {
    private final wlc<mfi> a;

    private mfg(wlc<mfi> wlc) {
        this.a = wlc;
    }

    public static mfg a(wlc<mfi> wlc) {
        return new mfg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mff((mfi) this.a.get());
    }
}
