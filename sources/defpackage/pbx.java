package defpackage;

/* renamed from: pbx reason: default package */
public final class pbx implements wig<pbw> {
    private final wzi<String> a;
    private final wzi<vjv> b;
    private final wzi<vjj> c;
    private final wzi<ttd> d;

    private pbx(wzi<String> wzi, wzi<vjv> wzi2, wzi<vjj> wzi3, wzi<ttd> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pbx a(wzi<String> wzi, wzi<vjv> wzi2, wzi<vjj> wzi3, wzi<ttd> wzi4) {
        return new pbx(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pbw((String) this.a.get(), (vjv) this.b.get(), (vjj) this.c.get(), (ttd) this.d.get());
    }
}
