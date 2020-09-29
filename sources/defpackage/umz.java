package defpackage;

/* renamed from: umz reason: default package */
public final class umz implements wig<umw> {
    private final wzi<une> a;
    private final wzi<umu> b;

    private umz(wzi<une> wzi, wzi<umu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static umz a(wzi<une> wzi, wzi<umu> wzi2) {
        return new umz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new umw((une) this.a.get(), (umu) this.b.get());
    }
}
