package defpackage;

/* renamed from: sma reason: default package */
public final class sma implements vua<fxn> {
    private final wlc<fsf> a;

    private sma(wlc<fsf> wlc) {
        this.a = wlc;
    }

    public static sma a(wlc<fsf> wlc) {
        return new sma(wlc);
    }

    public final /* synthetic */ Object get() {
        return (fxn) vuf.a(((fsf) this.a.get()).b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
