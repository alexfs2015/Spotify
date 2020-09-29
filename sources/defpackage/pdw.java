package defpackage;

/* renamed from: pdw reason: default package */
public final class pdw implements wig<pdv> {
    private final wzi<String> a;
    private final wzi<peh> b;
    private final wzi<fsz> c;

    private pdw(wzi<String> wzi, wzi<peh> wzi2, wzi<fsz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static pdw a(wzi<String> wzi, wzi<peh> wzi2, wzi<fsz> wzi3) {
        return new pdw(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new pdv((String) this.a.get(), (peh) this.b.get(), (fsz) this.c.get());
    }
}
