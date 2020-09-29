package defpackage;

/* renamed from: sii reason: default package */
public final class sii implements wig<sih> {
    private final wzi<Integer> a;
    private final wzi<sig> b;

    private sii(wzi<Integer> wzi, wzi<sig> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sii a(wzi<Integer> wzi, wzi<sig> wzi2) {
        return new sii(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sih(((Integer) this.a.get()).intValue(), wif.b(this.b));
    }
}
