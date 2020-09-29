package defpackage;

/* renamed from: mhl reason: default package */
public final class mhl implements wig<mhk> {
    private final wzi<jlr> a;
    private final wzi<hgy> b;

    private mhl(wzi<jlr> wzi, wzi<hgy> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mhl a(wzi<jlr> wzi, wzi<hgy> wzi2) {
        return new mhl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mhk((jlr) this.a.get(), (hgy) this.b.get());
    }
}
