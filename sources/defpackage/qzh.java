package defpackage;

/* renamed from: qzh reason: default package */
public final class qzh implements wig<qzg> {
    private final wzi<hit> a;

    private qzh(wzi<hit> wzi) {
        this.a = wzi;
    }

    public static qzg a(hit hit) {
        return new qzg(hit);
    }

    public static qzh a(wzi<hit> wzi) {
        return new qzh(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qzg((hit) this.a.get());
    }
}
