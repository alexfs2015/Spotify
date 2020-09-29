package defpackage;

/* renamed from: usr reason: default package */
public final class usr implements wig<usq> {
    private final wzi<usj> a;
    private final wzi<jvf> b;

    private usr(wzi<usj> wzi, wzi<jvf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static usr a(wzi<usj> wzi, wzi<jvf> wzi2) {
        return new usr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new usq((usj) this.a.get(), (jvf) this.b.get());
    }
}
