package defpackage;

/* renamed from: vra reason: default package */
public final class vra implements wig<vqy> {
    private final wzi<vub> a;

    private vra(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vra a(wzi<vub> wzi) {
        return new vra(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vqy) wil.a(vqz.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
