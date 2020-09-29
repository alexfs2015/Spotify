package defpackage;

/* renamed from: phj reason: default package */
public final class phj implements wig<phi> {
    private final wzi<tyx> a;
    private final wzi<tyt> b;
    private final wzi<Boolean> c;

    private phj(wzi<tyx> wzi, wzi<tyt> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static phj a(wzi<tyx> wzi, wzi<tyt> wzi2, wzi<Boolean> wzi3) {
        return new phj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new phi((tyx) this.a.get(), (tyt) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
