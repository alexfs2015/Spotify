package defpackage;

/* renamed from: qgw reason: default package */
public final class qgw implements wig<Boolean> {
    private final wzi<qeh> a;

    private qgw(wzi<qeh> wzi) {
        this.a = wzi;
    }

    public static qgw a(wzi<qeh> wzi) {
        return new qgw(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((qeh) this.a.get()).b);
    }
}
