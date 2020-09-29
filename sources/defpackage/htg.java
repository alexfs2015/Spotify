package defpackage;

/* renamed from: htg reason: default package */
public final class htg implements wig<htf> {
    private final wzi<hrg> a;
    private final wzi<htx> b;

    private htg(wzi<hrg> wzi, wzi<htx> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static htg a(wzi<hrg> wzi, wzi<htx> wzi2) {
        return new htg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new htf((hrg) this.a.get(), (htx) this.b.get());
    }
}
