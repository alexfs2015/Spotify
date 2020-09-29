package defpackage;

/* renamed from: krx reason: default package */
public final class krx implements wig<krw> {
    private final wzi<jlr> a;
    private final wzi<jtz> b;

    private krx(wzi<jlr> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static krx a(wzi<jlr> wzi, wzi<jtz> wzi2) {
        return new krx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new krw((jlr) this.a.get(), (jtz) this.b.get());
    }
}
