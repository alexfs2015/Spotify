package defpackage;

/* renamed from: nmq reason: default package */
public final class nmq implements wig<ssl> {
    private final wzi<fqn> a;
    private final wzi<ssf> b;

    private nmq(wzi<fqn> wzi, wzi<ssf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nmq a(wzi<fqn> wzi, wzi<ssf> wzi2) {
        return new nmq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (ssl) wil.a(jus.b((fqn) this.a.get()) ? ssl.a : (ssl) wif.b(this.b).get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
