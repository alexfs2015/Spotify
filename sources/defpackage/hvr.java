package defpackage;

/* renamed from: hvr reason: default package */
public final class hvr implements wig<hvq> {
    private final wzi<hvo> a;
    private final wzi<lbi> b;

    private hvr(wzi<hvo> wzi, wzi<lbi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hvr a(wzi<hvo> wzi, wzi<lbi> wzi2) {
        return new hvr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hvq((hvo) this.a.get(), (lbi) this.b.get());
    }
}
