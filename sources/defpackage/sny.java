package defpackage;

/* renamed from: sny reason: default package */
public final class sny implements wig<snx> {
    private final wzi<Boolean> a;

    private sny(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static sny a(wzi<Boolean> wzi) {
        return new sny(wzi);
    }

    public final /* synthetic */ Object get() {
        return new snx(((Boolean) this.a.get()).booleanValue());
    }
}
