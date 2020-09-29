package defpackage;

/* renamed from: rcv reason: default package */
public final class rcv implements wig<rcu> {
    private final wzi<rbg> a;
    private final wzi<iqv> b;
    private final wzi<rgf> c;

    private rcv(wzi<rbg> wzi, wzi<iqv> wzi2, wzi<rgf> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rcv a(wzi<rbg> wzi, wzi<iqv> wzi2, wzi<rgf> wzi3) {
        return new rcv(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rcu(this.a, this.b, this.c);
    }
}
