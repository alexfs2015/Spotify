package defpackage;

/* renamed from: rxv reason: default package */
public final class rxv implements wig<rxu> {
    private final wzi<ryk> a;

    private rxv(wzi<ryk> wzi) {
        this.a = wzi;
    }

    public static rxv a(wzi<ryk> wzi) {
        return new rxv(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rxu((ryk) this.a.get());
    }
}
