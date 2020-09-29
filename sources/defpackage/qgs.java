package defpackage;

/* renamed from: qgs reason: default package */
public final class qgs implements wig<Boolean> {
    private final wzi<qeh> a;

    private qgs(wzi<qeh> wzi) {
        this.a = wzi;
    }

    public static qgs a(wzi<qeh> wzi) {
        return new qgs(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((qeh) this.a.get()).c);
    }
}
