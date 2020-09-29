package defpackage;

/* renamed from: uht reason: default package */
public final class uht implements wig<uhs> {
    private final wzi<jwo> a;
    private final wzi<uhk> b;

    private uht(wzi<jwo> wzi, wzi<uhk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uht a(wzi<jwo> wzi, wzi<uhk> wzi2) {
        return new uht(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uhs((jwo) this.a.get(), (uhk) this.b.get());
    }
}
