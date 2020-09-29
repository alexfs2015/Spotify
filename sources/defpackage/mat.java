package defpackage;

/* renamed from: mat reason: default package */
public final class mat implements wig<Boolean> {
    private final wzi<lyl> a;

    private mat(wzi<lyl> wzi) {
        this.a = wzi;
    }

    public static mat a(wzi<lyl> wzi) {
        return new mat(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((lyl) this.a.get()).c());
    }
}
