package defpackage;

/* renamed from: jzp reason: default package */
public final class jzp implements wig<jzo> {
    private final wzi<jvf> a;
    private final wzi<uiu> b;
    private final wzi<kal> c;

    private jzp(wzi<jvf> wzi, wzi<uiu> wzi2, wzi<kal> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static jzp a(wzi<jvf> wzi, wzi<uiu> wzi2, wzi<kal> wzi3) {
        return new jzp(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new jzo((jvf) this.a.get(), (uiu) this.b.get(), (kal) this.c.get());
    }
}
