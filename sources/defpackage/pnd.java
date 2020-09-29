package defpackage;

/* renamed from: pnd reason: default package */
public final class pnd implements wig<String> {
    private final wzi<vos> a;

    private pnd(wzi<vos> wzi) {
        this.a = wzi;
    }

    public static pnd a(wzi<vos> wzi) {
        return new pnd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((vos) this.a.get()).c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
