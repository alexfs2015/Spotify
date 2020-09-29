package defpackage;

/* renamed from: rdt reason: default package */
public final class rdt implements wig<rds> {
    private final wzi<rbg> a;
    private final wzi<irb> b;
    private final wzi<rgf> c;
    private final wzi<ipf> d;

    private rdt(wzi<rbg> wzi, wzi<irb> wzi2, wzi<rgf> wzi3, wzi<ipf> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rdt a(wzi<rbg> wzi, wzi<irb> wzi2, wzi<rgf> wzi3, wzi<ipf> wzi4) {
        return new rdt(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rds((rbg) this.a.get(), (irb) this.b.get(), (rgf) this.c.get(), (ipf) this.d.get());
    }
}
