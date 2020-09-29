package defpackage;

/* renamed from: sqc reason: default package */
public final class sqc implements wig<sqb> {
    private final wzi<fqn> a;
    private final wzi<Boolean> b;

    private sqc(wzi<fqn> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sqc a(wzi<fqn> wzi, wzi<Boolean> wzi2) {
        return new sqc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sqb((fqn) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
