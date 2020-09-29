package defpackage;

/* renamed from: pcj reason: default package */
public final class pcj implements wig<pci> {
    private final wzi<owh> a;
    private final wzi<owk> b;
    private final wzi<wbt> c;

    private pcj(wzi<owh> wzi, wzi<owk> wzi2, wzi<wbt> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static pcj a(wzi<owh> wzi, wzi<owk> wzi2, wzi<wbt> wzi3) {
        return new pcj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new pci(this.a, this.b, this.c);
    }
}
