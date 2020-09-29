package defpackage;

/* renamed from: nmv reason: default package */
public final class nmv implements wig<nmu> {
    private final wzi<nki> a;
    private final wzi<has> b;

    private nmv(wzi<nki> wzi, wzi<has> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nmv a(wzi<nki> wzi, wzi<has> wzi2) {
        return new nmv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nmu((nki) this.a.get(), (has) this.b.get());
    }
}
