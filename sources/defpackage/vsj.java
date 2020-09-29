package defpackage;

/* renamed from: vsj reason: default package */
public final class vsj implements wig<vsh> {
    private final wzi<vub> a;

    private vsj(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vsj a(wzi<vub> wzi) {
        return new vsj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vsh) wil.a(vsi.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
