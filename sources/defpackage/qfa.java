package defpackage;

/* renamed from: qfa reason: default package */
public final class qfa implements wig<qez> {
    private final wzi<skq> a;
    private final wzi<sqe> b;
    private final wzi<squ> c;
    private final wzi<stj> d;
    private final wzi<sue> e;

    private qfa(wzi<skq> wzi, wzi<sqe> wzi2, wzi<squ> wzi3, wzi<stj> wzi4, wzi<sue> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static qfa a(wzi<skq> wzi, wzi<sqe> wzi2, wzi<squ> wzi3, wzi<stj> wzi4, wzi<sue> wzi5) {
        qfa qfa = new qfa(wzi, wzi2, wzi3, wzi4, wzi5);
        return qfa;
    }

    public final /* synthetic */ Object get() {
        qez qez = new qez((skq) this.a.get(), (sqe) this.b.get(), (squ) this.c.get(), (stj) this.d.get(), (sue) this.e.get());
        return qez;
    }
}
