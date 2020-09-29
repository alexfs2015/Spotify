package defpackage;

/* renamed from: peb reason: default package */
public final class peb implements wig<pea> {
    private final wzi<tyo> a;
    private final wzi<xil> b;
    private final wzi<String> c;

    private peb(wzi<tyo> wzi, wzi<xil> wzi2, wzi<String> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static peb a(wzi<tyo> wzi, wzi<xil> wzi2, wzi<String> wzi3) {
        return new peb(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new pea((tyo) this.a.get(), (xil) this.b.get(), (String) this.c.get());
    }
}
