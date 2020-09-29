package defpackage;

/* renamed from: pxh reason: default package */
public final class pxh implements vua<sfn> {
    private final wlc<Boolean> a;
    private final wlc<sfq> b;
    private final wlc<sfo> c;

    private pxh(wlc<Boolean> wlc, wlc<sfq> wlc2, wlc<sfo> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pxh a(wlc<Boolean> wlc, wlc<sfq> wlc2, wlc<sfo> wlc3) {
        return new pxh(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        sfn sfn;
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        wlc<sfq> wlc = this.b;
        wlc<sfo> wlc2 = this.c;
        if (booleanValue) {
            sfn = (sfn) wlc2.get();
        } else {
            sfn = (sfn) wlc.get();
        }
        return (sfn) vuf.a(sfn, "Cannot return null from a non-@Nullable @Provides method");
    }
}
