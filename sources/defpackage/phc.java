package defpackage;

/* renamed from: phc reason: default package */
public final class phc implements wig<phb> {
    private final wzi<pjm> a;

    private phc(wzi<pjm> wzi) {
        this.a = wzi;
    }

    public static phc a(wzi<pjm> wzi) {
        return new phc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new phb((pjm) this.a.get());
    }
}
