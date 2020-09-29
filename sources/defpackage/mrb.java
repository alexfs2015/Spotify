package defpackage;

/* renamed from: mrb reason: default package */
public final class mrb implements wig<mra> {
    private final wzi<mqy> a;
    private final wzi<a> b;
    private final wzi<a> c;

    private mrb(wzi<mqy> wzi, wzi<a> wzi2, wzi<a> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mrb a(wzi<mqy> wzi, wzi<a> wzi2, wzi<a> wzi3) {
        return new mrb(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mra((mqy) this.a.get(), (a) this.b.get(), (a) this.c.get());
    }
}
