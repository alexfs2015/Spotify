package defpackage;

/* renamed from: rhx reason: default package */
public final class rhx implements wig<rhw> {
    private final wzi<rhy> a;
    private final wzi<rhv> b;
    private final wzi<String> c;
    private final wzi<rwl> d;

    private rhx(wzi<rhy> wzi, wzi<rhv> wzi2, wzi<String> wzi3, wzi<rwl> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rhx a(wzi<rhy> wzi, wzi<rhv> wzi2, wzi<String> wzi3, wzi<rwl> wzi4) {
        return new rhx(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rhw((rhy) this.a.get(), (rhv) this.b.get(), (String) this.c.get(), (rwl) this.d.get());
    }
}
