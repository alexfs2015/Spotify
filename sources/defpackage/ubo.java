package defpackage;

/* renamed from: ubo reason: default package */
public final class ubo implements wig<twk> {
    private final wzi<uba> a;
    private final wzi<ksn> b;
    private final wzi<Boolean> c;

    private ubo(wzi<uba> wzi, wzi<ksn> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ubo a(wzi<uba> wzi, wzi<ksn> wzi2, wzi<Boolean> wzi3) {
        return new ubo(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        Object obj = (uba) this.a.get();
        Object obj2 = (ksn) this.b.get();
        if (((Boolean) this.c.get()).booleanValue()) {
            obj = obj2;
        }
        return (twk) wil.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
