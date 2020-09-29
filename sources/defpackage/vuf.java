package defpackage;

/* renamed from: vuf reason: default package */
public final class vuf implements wig<vud> {
    private final wzi<vub> a;

    private vuf(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vuf a(wzi<vub> wzi) {
        return new vuf(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vud) wil.a(vue.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
