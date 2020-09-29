package defpackage;

/* renamed from: qey reason: default package */
public final class qey implements wig<qex> {
    private final wzi<sin> a;
    private final wzi<sqe> b;
    private final wzi<squ> c;

    private qey(wzi<sin> wzi, wzi<sqe> wzi2, wzi<squ> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qey a(wzi<sin> wzi, wzi<sqe> wzi2, wzi<squ> wzi3) {
        return new qey(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qex((sin) this.a.get(), (sqe) this.b.get(), (squ) this.c.get());
    }
}
