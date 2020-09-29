package defpackage;

/* renamed from: ser reason: default package */
public final class ser implements wig<seq> {
    private final wzi<ses> a;
    private final wzi<obi> b;

    private ser(wzi<ses> wzi, wzi<obi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ser a(wzi<ses> wzi, wzi<obi> wzi2) {
        return new ser(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new seq((ses) this.a.get(), (obi) this.b.get());
    }
}
