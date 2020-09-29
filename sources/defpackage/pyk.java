package defpackage;

/* renamed from: pyk reason: default package */
public final class pyk implements vua<sfn> {
    private final wlc<Boolean> a;
    private final wlc<sfq> b;
    private final wlc<sfs> c;

    private pyk(wlc<Boolean> wlc, wlc<sfq> wlc2, wlc<sfs> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pyk a(wlc<Boolean> wlc, wlc<sfq> wlc2, wlc<sfs> wlc3) {
        return new pyk(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        sfn sfn;
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        wlc<sfq> wlc = this.b;
        wlc<sfs> wlc2 = this.c;
        if (booleanValue) {
            sfn = (sfn) wlc2.get();
        } else {
            sfn = (sfn) wlc.get();
        }
        return (sfn) vuf.a(sfn, "Cannot return null from a non-@Nullable @Provides method");
    }
}
