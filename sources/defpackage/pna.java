package defpackage;

/* renamed from: pna reason: default package */
public final class pna implements wig<String> {
    private final wzi<vos> a;

    private pna(wzi<vos> wzi) {
        this.a = wzi;
    }

    public static pna a(wzi<vos> wzi) {
        return new pna(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((vos) this.a.get()).b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
