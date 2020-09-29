package defpackage;

/* renamed from: uxl reason: default package */
public final class uxl implements wig<uxk> {
    private final wzi<uxe> a;
    private final wzi<uxc> b;
    private final wzi<uxg> c;

    private uxl(wzi<uxe> wzi, wzi<uxc> wzi2, wzi<uxg> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static uxl a(wzi<uxe> wzi, wzi<uxc> wzi2, wzi<uxg> wzi3) {
        return new uxl(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new uxk((uxe) this.a.get(), (uxc) this.b.get(), (uxg) this.c.get());
    }
}
