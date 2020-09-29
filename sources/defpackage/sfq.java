package defpackage;

/* renamed from: sfq reason: default package */
public final class sfq implements wig<sfp> {
    private final wzi<vsu> a;

    private sfq(wzi<vsu> wzi) {
        this.a = wzi;
    }

    public static sfq a(wzi<vsu> wzi) {
        return new sfq(wzi);
    }

    public final /* synthetic */ Object get() {
        return new sfp((vsu) this.a.get());
    }
}
