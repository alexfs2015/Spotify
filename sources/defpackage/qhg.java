package defpackage;

/* renamed from: qhg reason: default package */
public final class qhg implements wig<sit> {
    private final wzi<siq> a;
    private final wzi<String> b;
    private final wzi<Boolean> c;

    private qhg(wzi<siq> wzi, wzi<String> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qhg a(wzi<siq> wzi, wzi<String> wzi2, wzi<Boolean> wzi3) {
        return new qhg(wzi, wzi2, wzi3);
    }

    public static sit a(siq siq, String str, boolean z) {
        return (sit) wil.a(qhc.a(siq, str, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((siq) this.a.get(), (String) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
