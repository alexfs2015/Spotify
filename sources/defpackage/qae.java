package defpackage;

/* renamed from: qae reason: default package */
public final class qae implements vua<sbk> {
    private final wlc<Boolean> a;
    private final wlc<Boolean> b;
    private final wlc<saw> c;

    private qae(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<saw> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qae a(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<saw> wlc3) {
        return new qae(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        return (sbk) vuf.a(sbk.d().a(booleanValue).b(((Boolean) this.b.get()).booleanValue()).a(((saw) this.c.get()).a()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
