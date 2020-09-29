package defpackage;

/* renamed from: ubq reason: default package */
public final class ubq implements wig<twr> {
    private final wzi<tws> a;
    private final wzi<ksq> b;
    private final wzi<Boolean> c;

    private ubq(wzi<tws> wzi, wzi<ksq> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ubq a(wzi<tws> wzi, wzi<ksq> wzi2, wzi<Boolean> wzi3) {
        return new ubq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        Object obj = (tws) this.a.get();
        Object obj2 = (ksq) this.b.get();
        if (((Boolean) this.c.get()).booleanValue()) {
            obj = obj2;
        }
        return (twr) wil.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
