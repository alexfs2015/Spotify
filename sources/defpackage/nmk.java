package defpackage;

/* renamed from: nmk reason: default package */
public final class nmk implements wig<Boolean> {
    private final wzi<fqn> a;
    private final wzi<kyk> b;

    private nmk(wzi<fqn> wzi, wzi<kyk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nmk a(wzi<fqn> wzi, wzi<kyk> wzi2) {
        return new nmk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        kyk kyk = (kyk) this.b.get();
        return Boolean.valueOf(kyk.c((fqn) this.a.get()));
    }
}
