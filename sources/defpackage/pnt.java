package defpackage;

/* renamed from: pnt reason: default package */
public final class pnt implements wig<pns> {
    private final wzi<vuj> a;

    private pnt(wzi<vuj> wzi) {
        this.a = wzi;
    }

    public static pnt a(wzi<vuj> wzi) {
        return new pnt(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pns((vuj) this.a.get());
    }
}
