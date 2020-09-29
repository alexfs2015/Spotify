package defpackage;

/* renamed from: uyr reason: default package */
public final class uyr implements wig<uyq> {
    private final wzi<jlr> a;
    private final wzi<jtz> b;

    private uyr(wzi<jlr> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uyr a(wzi<jlr> wzi, wzi<jtz> wzi2) {
        return new uyr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uyq((jlr) this.a.get(), (jtz) this.b.get());
    }
}
