package defpackage;

/* renamed from: qgx reason: default package */
public final class qgx implements wig<Boolean> {
    private final wzi<qeh> a;

    private qgx(wzi<qeh> wzi) {
        this.a = wzi;
    }

    public static qgx a(wzi<qeh> wzi) {
        return new qgx(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((qeh) this.a.get()).a);
    }
}
