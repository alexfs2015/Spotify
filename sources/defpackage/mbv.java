package defpackage;

/* renamed from: mbv reason: default package */
public final class mbv implements wig<mbu> {
    private final wzi<Boolean> a;

    private mbv(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static mbv a(wzi<Boolean> wzi) {
        return new mbv(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mbu(((Boolean) this.a.get()).booleanValue());
    }
}
