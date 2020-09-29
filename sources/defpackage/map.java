package defpackage;

/* renamed from: map reason: default package */
public final class map implements wig<Boolean> {
    private final wzi<lyl> a;

    private map(wzi<lyl> wzi) {
        this.a = wzi;
    }

    public static map a(wzi<lyl> wzi) {
        return new map(wzi);
    }

    public final /* synthetic */ Object get() {
        lyl lyl = (lyl) this.a.get();
        return Boolean.valueOf(lyl.e().a() && lyl.g());
    }
}
