package defpackage;

/* renamed from: maq reason: default package */
public final class maq implements wig<Boolean> {
    private final wzi<lyl> a;

    private maq(wzi<lyl> wzi) {
        this.a = wzi;
    }

    public static maq a(wzi<lyl> wzi) {
        return new maq(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((lyl) this.a.get()).g());
    }
}
