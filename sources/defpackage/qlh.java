package defpackage;

/* renamed from: qlh reason: default package */
public final class qlh implements wig<qlg> {
    private final wzi<skq> a;

    private qlh(wzi<skq> wzi) {
        this.a = wzi;
    }

    public static qlh a(wzi<skq> wzi) {
        return new qlh(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qlg((skq) this.a.get());
    }
}
