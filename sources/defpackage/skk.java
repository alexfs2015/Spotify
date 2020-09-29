package defpackage;

/* renamed from: skk reason: default package */
public final class skk implements wig<skj> {
    private final wzi<Boolean> a;
    private final wzi<sjs> b;

    private skk(wzi<Boolean> wzi, wzi<sjs> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static skk a(wzi<Boolean> wzi, wzi<sjs> wzi2) {
        return new skk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new skj(((Boolean) this.a.get()).booleanValue(), (sjs) this.b.get());
    }
}
