package defpackage;

/* renamed from: syc reason: default package */
public final class syc implements wig<syb> {
    private final wzi<sya> a;

    private syc(wzi<sya> wzi) {
        this.a = wzi;
    }

    public static syc a(wzi<sya> wzi) {
        return new syc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new syb((sya) this.a.get());
    }
}
