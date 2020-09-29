package defpackage;

/* renamed from: jqb reason: default package */
public final class jqb implements wig<jqa> {
    private final wzi<uiu> a;
    private final wzi<jlr> b;

    private jqb(wzi<uiu> wzi, wzi<jlr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jqb a(wzi<uiu> wzi, wzi<jlr> wzi2) {
        return new jqb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jqa((uiu) this.a.get(), (jlr) this.b.get());
    }
}
