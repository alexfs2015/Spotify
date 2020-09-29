package defpackage;

/* renamed from: slc reason: default package */
public final class slc implements wig<slb> {
    private final wzi<fqn> a;

    private slc(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static slc a(wzi<fqn> wzi) {
        return new slc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new slb((fqn) this.a.get());
    }
}
