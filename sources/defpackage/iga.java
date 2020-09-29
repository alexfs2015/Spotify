package defpackage;

/* renamed from: iga reason: default package */
public final class iga implements wig<ifz> {
    private final wzi<igb> a;
    private final wzi<igf> b;

    private iga(wzi<igb> wzi, wzi<igf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static iga a(wzi<igb> wzi, wzi<igf> wzi2) {
        return new iga(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ifz((igb) this.a.get(), (igf) this.b.get());
    }
}
