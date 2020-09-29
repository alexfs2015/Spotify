package defpackage;

/* renamed from: uzh reason: default package */
public final class uzh implements wig<uzg> {
    private final wzi<uzo> a;
    private final wzi<fqn> b;

    private uzh(wzi<uzo> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uzh a(wzi<uzo> wzi, wzi<fqn> wzi2) {
        return new uzh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uzg((uzo) this.a.get(), (fqn) this.b.get());
    }
}
