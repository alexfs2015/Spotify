package defpackage;

/* renamed from: qfu reason: default package */
public final class qfu implements wig<Boolean> {
    private final wzi<Boolean> a;
    private final wzi<Boolean> b;

    private qfu(wzi<Boolean> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qfu a(wzi<Boolean> wzi, wzi<Boolean> wzi2) {
        return new qfu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Boolean) this.a.get()).booleanValue() && !((Boolean) this.b.get()).booleanValue());
    }
}
