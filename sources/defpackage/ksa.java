package defpackage;

/* renamed from: ksa reason: default package */
public final class ksa implements wig<krz> {
    private final wzi<jlr> a;
    private final wzi<jtz> b;

    private ksa(wzi<jlr> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ksa a(wzi<jlr> wzi, wzi<jtz> wzi2) {
        return new ksa(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new krz((jlr) this.a.get(), (jtz) this.b.get());
    }
}
