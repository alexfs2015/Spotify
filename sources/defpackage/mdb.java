package defpackage;

/* renamed from: mdb reason: default package */
public final class mdb implements wig<mda> {
    private final wzi<mdl> a;
    private final wzi<mdg> b;
    private final wzi<Boolean> c;

    private mdb(wzi<mdl> wzi, wzi<mdg> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mdb a(wzi<mdl> wzi, wzi<mdg> wzi2, wzi<Boolean> wzi3) {
        return new mdb(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mda((mdl) this.a.get(), (mdg) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
