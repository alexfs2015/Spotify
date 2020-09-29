package defpackage;

/* renamed from: smi reason: default package */
public final class smi implements wig<smh> {
    private final wzi<sin> a;

    private smi(wzi<sin> wzi) {
        this.a = wzi;
    }

    public static smi a(wzi<sin> wzi) {
        return new smi(wzi);
    }

    public final /* synthetic */ Object get() {
        return new smh((sin) this.a.get());
    }
}
