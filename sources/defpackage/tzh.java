package defpackage;

/* renamed from: tzh reason: default package */
public final class tzh implements wig<tzg> {
    private final wzi<szl> a;
    private final wzi<tzi> b;
    private final wzi<Boolean> c;
    private final wzi<ksk> d;

    private tzh(wzi<szl> wzi, wzi<tzi> wzi2, wzi<Boolean> wzi3, wzi<ksk> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static tzh a(wzi<szl> wzi, wzi<tzi> wzi2, wzi<Boolean> wzi3, wzi<ksk> wzi4) {
        return new tzh(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new tzg((szl) this.a.get(), (tzi) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (ksk) this.d.get());
    }
}
