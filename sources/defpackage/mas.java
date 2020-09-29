package defpackage;

/* renamed from: mas reason: default package */
public final class mas implements wig<Boolean> {
    private final wzi<lyl> a;

    private mas(wzi<lyl> wzi) {
        this.a = wzi;
    }

    public static mas a(wzi<lyl> wzi) {
        return new mas(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((lyl) this.a.get()).b());
    }
}
