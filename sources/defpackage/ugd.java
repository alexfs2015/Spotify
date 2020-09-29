package defpackage;

/* renamed from: ugd reason: default package */
public final class ugd implements wig<ugc> {
    private final wzi<tyx> a;
    private final wzi<ufp> b;
    private final wzi<Boolean> c;
    private final wzi<ufy> d;
    private final wzi<ugi> e;

    private ugd(wzi<tyx> wzi, wzi<ufp> wzi2, wzi<Boolean> wzi3, wzi<ufy> wzi4, wzi<ugi> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static ugd a(wzi<tyx> wzi, wzi<ufp> wzi2, wzi<Boolean> wzi3, wzi<ufy> wzi4, wzi<ugi> wzi5) {
        ugd ugd = new ugd(wzi, wzi2, wzi3, wzi4, wzi5);
        return ugd;
    }

    public final /* synthetic */ Object get() {
        ugc ugc = new ugc((tyx) this.a.get(), (ufp) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (ufy) this.d.get(), (ugi) this.e.get());
        return ugc;
    }
}
