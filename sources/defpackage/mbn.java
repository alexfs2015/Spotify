package defpackage;

/* renamed from: mbn reason: default package */
public final class mbn implements wig<ssl> {
    private final wzi<fqn> a;
    private final wzi<rqb> b;
    private final wzi<ssf> c;

    private mbn(wzi<fqn> wzi, wzi<rqb> wzi2, wzi<ssf> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mbn a(wzi<fqn> wzi, wzi<rqb> wzi2, wzi<ssf> wzi3) {
        return new mbn(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (ssl) wil.a(((rqb) this.b.get()).a((fqn) this.a.get()) ? (ssl) wif.b(this.c).get() : ssl.a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
