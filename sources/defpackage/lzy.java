package defpackage;

/* renamed from: lzy reason: default package */
public final class lzy implements wig<lzx> {
    private final wzi<Boolean> a;

    private lzy(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static lzy a(wzi<Boolean> wzi) {
        return new lzy(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lzx(((Boolean) this.a.get()).booleanValue());
    }
}
