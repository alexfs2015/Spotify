package defpackage;

/* renamed from: vul reason: default package */
public final class vul implements wig<vuj> {
    private final wzi<vub> a;

    private vul(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vuj a(vub vub) {
        return (vuj) wil.a(vuk.a(vub), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static vul a(wzi<vub> wzi) {
        return new vul(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((vub) this.a.get());
    }
}
