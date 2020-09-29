package defpackage;

/* renamed from: qso reason: default package */
public final class qso implements wig<qsn> {
    private final wzi<lay> a;
    private final wzi<qqc> b;

    private qso(wzi<lay> wzi, wzi<qqc> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qso a(wzi<lay> wzi, wzi<qqc> wzi2) {
        return new qso(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qsn((lay) this.a.get(), (qqc) this.b.get());
    }
}
