package defpackage;

/* renamed from: vpd reason: default package */
public final class vpd implements vua<vpt> {
    private static final vpd a = new vpd();

    public static vpd a() {
        return a;
    }

    public static vpt b() {
        return (vpt) vuf.a(new vpu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
