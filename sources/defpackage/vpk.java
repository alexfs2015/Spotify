package defpackage;

/* renamed from: vpk reason: default package */
public final class vpk implements wig<vpj> {
    private final wzi<vpl> a;
    private final wzi<vpw> b;
    private final wzi<vqf> c;

    private vpk(wzi<vpl> wzi, wzi<vpw> wzi2, wzi<vqf> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static vpk a(wzi<vpl> wzi, wzi<vpw> wzi2, wzi<vqf> wzi3) {
        return new vpk(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new vpj((vpl) this.a.get(), (vpw) this.b.get(), (vqf) this.c.get());
    }
}
