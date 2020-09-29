package defpackage;

/* renamed from: maw reason: default package */
public final class maw implements wig<String> {
    private final wzi<lyl> a;

    private maw(wzi<lyl> wzi) {
        this.a = wzi;
    }

    public static String a(lyl lyl) {
        return (String) wil.a(lyl.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static maw a(wzi<lyl> wzi) {
        return new maw(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((lyl) this.a.get());
    }
}
