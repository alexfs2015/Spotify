package defpackage;

/* renamed from: qgc reason: default package */
public final class qgc implements wig<sin> {
    private final wzi<sit> a;

    private qgc(wzi<sit> wzi) {
        this.a = wzi;
    }

    public static qgc a(wzi<sit> wzi) {
        return new qgc(wzi);
    }

    public final /* synthetic */ Object get() {
        return (sin) wil.a(new sin((sit) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
