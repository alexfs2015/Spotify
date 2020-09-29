package defpackage;

/* renamed from: hlg reason: default package */
public final class hlg implements wig<hlf> {
    private final wzi<kbf> a;
    private final wzi<kah> b;
    private final wzi<jtz> c;

    private hlg(wzi<kbf> wzi, wzi<kah> wzi2, wzi<jtz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hlg a(wzi<kbf> wzi, wzi<kah> wzi2, wzi<jtz> wzi3) {
        return new hlg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hlf((kbf) this.a.get(), (kah) this.b.get(), (jtz) this.c.get());
    }
}
