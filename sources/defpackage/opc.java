package defpackage;

/* renamed from: opc reason: default package */
public final class opc implements wig<opb> {
    private final wzi<opj> a;

    private opc(wzi<opj> wzi) {
        this.a = wzi;
    }

    public static opc a(wzi<opj> wzi) {
        return new opc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new opb((opj) this.a.get());
    }
}
