package defpackage;

/* renamed from: hnr reason: default package */
public final class hnr implements wig<hnq> {
    private final wzi<Boolean> a;
    private final wzi<Boolean> b;
    private final wzi<Boolean> c;
    private final wzi<Boolean> d;

    private hnr(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<Boolean> wzi3, wzi<Boolean> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hnr a(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<Boolean> wzi3, wzi<Boolean> wzi4) {
        return new hnr(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hnq(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue(), ((Boolean) this.c.get()).booleanValue(), ((Boolean) this.d.get()).booleanValue());
    }
}
