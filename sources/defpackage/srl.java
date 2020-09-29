package defpackage;

/* renamed from: srl reason: default package */
public final class srl implements wig<srk> {
    private final wzi<srg> a;
    private final wzi<siv> b;

    private srl(wzi<srg> wzi, wzi<siv> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static srl a(wzi<srg> wzi, wzi<siv> wzi2) {
        return new srl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new srk((srg) this.a.get(), (siv) this.b.get());
    }
}
