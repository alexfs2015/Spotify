package defpackage;

/* renamed from: qhs reason: default package */
public final class qhs implements wig<qhr> {
    private final wzi<jlr> a;
    private final wzi<jtz> b;

    private qhs(wzi<jlr> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qhs a(wzi<jlr> wzi, wzi<jtz> wzi2) {
        return new qhs(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qhr((jlr) this.a.get(), (jtz) this.b.get());
    }
}
