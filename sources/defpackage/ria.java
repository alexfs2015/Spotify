package defpackage;

/* renamed from: ria reason: default package */
public final class ria implements wig<rhz> {
    private final wzi<irb> a;
    private final wzi<jwo> b;

    private ria(wzi<irb> wzi, wzi<jwo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ria a(wzi<irb> wzi, wzi<jwo> wzi2) {
        return new ria(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rhz((irb) this.a.get(), (jwo) this.b.get());
    }
}
