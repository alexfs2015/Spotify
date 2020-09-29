package defpackage;

/* renamed from: vpe reason: default package */
public final class vpe implements vua<vre> {
    private static final vpe a = new vpe();

    public static vpe a() {
        return a;
    }

    public static vre b() {
        return (vre) vuf.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
