package defpackage;

/* renamed from: qbd reason: default package */
public final class qbd implements wig<qbc> {
    private final wzi<jlr> a;
    private final wzi<jtz> b;

    private qbd(wzi<jlr> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qbd a(wzi<jlr> wzi, wzi<jtz> wzi2) {
        return new qbd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qbc((jlr) this.a.get(), (jtz) this.b.get());
    }
}
