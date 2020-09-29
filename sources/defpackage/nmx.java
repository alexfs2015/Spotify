package defpackage;

/* renamed from: nmx reason: default package */
public final class nmx implements wig<nmw> {
    private final wzi<nki> a;
    private final wzi<has> b;

    private nmx(wzi<nki> wzi, wzi<has> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nmx a(wzi<nki> wzi, wzi<has> wzi2) {
        return new nmx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nmw((nki) this.a.get(), (has) this.b.get());
    }
}
