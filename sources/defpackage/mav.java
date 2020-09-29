package defpackage;

/* renamed from: mav reason: default package */
public final class mav implements wig<String> {
    private final wzi<lyl> a;

    private mav(wzi<lyl> wzi) {
        this.a = wzi;
    }

    public static mav a(wzi<lyl> wzi) {
        return new mav(wzi);
    }

    public final /* synthetic */ Object get() {
        lyl lyl = (lyl) this.a.get();
        return (String) wil.a(lyl.h(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
