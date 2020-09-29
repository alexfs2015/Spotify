package defpackage;

/* renamed from: jqj reason: default package */
public final class jqj implements wig<jqi> {
    private final wzi<jpc> a;
    private final wzi<jos> b;
    private final wzi<jpq> c;

    private jqj(wzi<jpc> wzi, wzi<jos> wzi2, wzi<jpq> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static jqj a(wzi<jpc> wzi, wzi<jos> wzi2, wzi<jpq> wzi3) {
        return new jqj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new jqi((jpc) this.a.get(), (jos) this.b.get(), (jpq) this.c.get());
    }
}
