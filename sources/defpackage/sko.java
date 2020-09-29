package defpackage;

/* renamed from: sko reason: default package */
public final class sko implements wig<skn> {
    private final wzi<Boolean> a;
    private final wzi<sjs> b;

    private sko(wzi<Boolean> wzi, wzi<sjs> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sko a(wzi<Boolean> wzi, wzi<sjs> wzi2) {
        return new sko(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new skn(((Boolean) this.a.get()).booleanValue(), (sjs) this.b.get());
    }
}
