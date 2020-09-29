package defpackage;

/* renamed from: mcm reason: default package */
public final class mcm implements wig<mcl> {
    private final wzi<String> a;
    private final wzi<Boolean> b;
    private final wzi<mad> c;
    private final wzi<Boolean> d;

    private mcm(wzi<String> wzi, wzi<Boolean> wzi2, wzi<mad> wzi3, wzi<Boolean> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mcm a(wzi<String> wzi, wzi<Boolean> wzi2, wzi<mad> wzi3, wzi<Boolean> wzi4) {
        return new mcm(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mcl((String) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (mad) this.c.get(), ((Boolean) this.d.get()).booleanValue());
    }
}
