package defpackage;

/* renamed from: meq reason: default package */
public final class meq implements wig<mep> {
    private final wzi<mer> a;
    private final wzi<mel> b;
    private final wzi<a> c;
    private final wzi<men> d;

    private meq(wzi<mer> wzi, wzi<mel> wzi2, wzi<a> wzi3, wzi<men> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static meq a(wzi<mer> wzi, wzi<mel> wzi2, wzi<a> wzi3, wzi<men> wzi4) {
        return new meq(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mep((mer) this.a.get(), (mel) this.b.get(), (a) this.c.get(), (men) this.d.get());
    }
}
