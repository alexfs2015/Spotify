package defpackage;

/* renamed from: rek reason: default package */
public final class rek implements wig<rhy> {
    private final wzi<rbg> a;
    private final wzi<rhz> b;
    private final wzi<rib> c;

    private rek(wzi<rbg> wzi, wzi<rhz> wzi2, wzi<rib> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rek a(wzi<rbg> wzi, wzi<rhz> wzi2, wzi<rib> wzi3) {
        return new rek(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        Object obj = (rhz) this.b.get();
        Object obj2 = (rib) this.c.get();
        if (((rbg) this.a.get()).b.a.a()) {
            obj = obj2;
        }
        return (rhy) wil.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
