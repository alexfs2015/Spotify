package defpackage;

/* renamed from: qiv reason: default package */
public final class qiv implements vua<Integer> {
    private final wlc<Boolean> a;

    private qiv(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static qiv a(wlc<Boolean> wlc) {
        return new qiv(wlc);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((Boolean) this.a.get()).booleanValue() ? 0 : 3);
    }
}
