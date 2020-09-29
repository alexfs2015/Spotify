package defpackage;

/* renamed from: tzn reason: default package */
public final class tzn implements wig<tzm> {
    private final wzi<tzv> a;
    private final wzi<ual> b;
    private final wzi<ubm> c;

    private tzn(wzi<tzv> wzi, wzi<ual> wzi2, wzi<ubm> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tzn a(wzi<tzv> wzi, wzi<ual> wzi2, wzi<ubm> wzi3) {
        return new tzn(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tzm((tzv) this.a.get(), (ual) this.b.get(), (ubm) this.c.get());
    }
}
