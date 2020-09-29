package defpackage;

/* renamed from: mau reason: default package */
public final class mau implements wig<Boolean> {
    private final wzi<lyl> a;

    private mau(wzi<lyl> wzi) {
        this.a = wzi;
    }

    public static mau a(wzi<lyl> wzi) {
        return new mau(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!((lyl) this.a.get()).g());
    }
}
