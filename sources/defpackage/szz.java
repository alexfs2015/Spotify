package defpackage;

/* renamed from: szz reason: default package */
public final class szz implements vua<szw> {
    private static final szz a = new szz();

    public static szz a() {
        return a;
    }

    public static szw b() {
        return (szw) vuf.a(szw.a(true), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
