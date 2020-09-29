package defpackage;

/* renamed from: uff reason: default package */
public final class uff implements wig<ufe> {
    private final wzi<lbb> a;
    private final wzi<uhz> b;
    private final wzi<ufs> c;
    private final wzi<ufr> d;

    private uff(wzi<lbb> wzi, wzi<uhz> wzi2, wzi<ufs> wzi3, wzi<ufr> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static uff a(wzi<lbb> wzi, wzi<uhz> wzi2, wzi<ufs> wzi3, wzi<ufr> wzi4) {
        return new uff(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ufe((lbb) this.a.get(), (uhz) this.b.get(), (ufs) this.c.get(), wif.b(this.d));
    }
}
