package defpackage;

/* renamed from: lzi reason: default package */
public final class lzi implements wig<lzh> {
    private final wzi<Boolean> a;
    private final wzi<Boolean> b;
    private final wzi<lzl> c;

    private lzi(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<lzl> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lzi a(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<lzl> wzi3) {
        return new lzi(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new lzh(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue(), (lzl) this.c.get());
    }
}
