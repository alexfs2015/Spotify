package defpackage;

/* renamed from: mqd reason: default package */
public final class mqd implements wig<mqc> {
    private final wzi<jlr> a;
    private final wzi<jtz> b;
    private final wzi<sso> c;

    private mqd(wzi<jlr> wzi, wzi<jtz> wzi2, wzi<sso> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mqd a(wzi<jlr> wzi, wzi<jtz> wzi2, wzi<sso> wzi3) {
        return new mqd(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mqc((jlr) this.a.get(), (jtz) this.b.get(), (sso) this.c.get());
    }
}
