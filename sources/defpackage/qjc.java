package defpackage;

/* renamed from: qjc reason: default package */
public final class qjc implements wig<slr> {
    private final wzi<Boolean> a;
    private final wzi<Boolean> b;
    private final wzi<sld> c;

    private qjc(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<sld> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qjc a(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<sld> wzi3) {
        return new qjc(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        return (slr) wil.a(slr.d().a(booleanValue).b(((Boolean) this.b.get()).booleanValue()).a(((sld) this.c.get()).a()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
