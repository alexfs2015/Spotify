package defpackage;

/* renamed from: uxw reason: default package */
public final class uxw implements wig<uxj> {
    private final wzi<uxe> a;
    private final wzi<uxc> b;
    private final wzi<uxg> c;

    private uxw(wzi<uxe> wzi, wzi<uxc> wzi2, wzi<uxg> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static uxw a(wzi<uxe> wzi, wzi<uxc> wzi2, wzi<uxg> wzi3) {
        return new uxw(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (uxj) wil.a(new uxk((uxe) this.a.get(), (uxc) this.b.get(), (uxg) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
