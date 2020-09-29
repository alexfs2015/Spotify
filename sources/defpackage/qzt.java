package defpackage;

/* renamed from: qzt reason: default package */
public final class qzt implements wig<gkm> {
    private final wzi<uqm> a;

    private qzt(wzi<uqm> wzi) {
        this.a = wzi;
    }

    public static qzt a(wzi<uqm> wzi) {
        return new qzt(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gkm) wil.a(gkm.a((uqm) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
