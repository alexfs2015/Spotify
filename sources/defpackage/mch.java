package defpackage;

/* renamed from: mch reason: default package */
public final class mch implements wig<a> {
    private final wzi<fqn> a;
    private final wzi<String> b;
    private final wzi<jtz> c;
    private final wzi<String> d;
    private final wzi<Boolean> e;
    private final wzi<Boolean> f;

    private mch(wzi<fqn> wzi, wzi<String> wzi2, wzi<jtz> wzi3, wzi<String> wzi4, wzi<Boolean> wzi5, wzi<Boolean> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static mch a(wzi<fqn> wzi, wzi<String> wzi2, wzi<jtz> wzi3, wzi<String> wzi4, wzi<Boolean> wzi5, wzi<Boolean> wzi6) {
        mch mch = new mch(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return mch;
    }

    public final /* synthetic */ Object get() {
        a aVar = new a((fqn) this.a.get(), (String) this.b.get(), (jtz) this.c.get(), (String) this.d.get(), ((Boolean) this.e.get()).booleanValue(), ((Boolean) this.f.get()).booleanValue());
        return aVar;
    }
}
