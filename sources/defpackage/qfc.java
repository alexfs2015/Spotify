package defpackage;

/* renamed from: qfc reason: default package */
public final class qfc implements wig<qfb> {
    private final wzi<sin> a;
    private final wzi<sqe> b;
    private final wzi<squ> c;

    private qfc(wzi<sin> wzi, wzi<sqe> wzi2, wzi<squ> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qfc a(wzi<sin> wzi, wzi<sqe> wzi2, wzi<squ> wzi3) {
        return new qfc(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qfb((sin) this.a.get(), (sqe) this.b.get(), (squ) this.c.get());
    }
}
