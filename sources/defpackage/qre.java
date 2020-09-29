package defpackage;

/* renamed from: qre reason: default package */
public final class qre implements wig<Integer> {
    private final wzi<Boolean> a;

    private qre(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static qre a(wzi<Boolean> wzi) {
        return new qre(wzi);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((Boolean) this.a.get()).booleanValue() ? 0 : 3);
    }
}
