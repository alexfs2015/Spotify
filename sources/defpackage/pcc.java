package defpackage;

/* renamed from: pcc reason: default package */
public final class pcc implements wig<pcb> {
    private final wzi<pch> a;
    private final wzi<rll> b;

    private pcc(wzi<pch> wzi, wzi<rll> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pcc a(wzi<pch> wzi, wzi<rll> wzi2) {
        return new pcc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pcb((pch) this.a.get(), (rll) this.b.get());
    }
}
