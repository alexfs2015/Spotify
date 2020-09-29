package defpackage;

/* renamed from: rcc reason: default package */
public final class rcc implements wig<rcb> {
    private final wzi<rim> a;

    private rcc(wzi<rim> wzi) {
        this.a = wzi;
    }

    public static rcc a(wzi<rim> wzi) {
        return new rcc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rcb((rim) this.a.get());
    }
}
