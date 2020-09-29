package defpackage;

/* renamed from: qkb reason: default package */
public final class qkb implements wig<qka> {
    private final wzi<fqn> a;
    private final wzi<Boolean> b;

    private qkb(wzi<fqn> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qkb a(wzi<fqn> wzi, wzi<Boolean> wzi2) {
        return new qkb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qka((fqn) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
