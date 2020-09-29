package defpackage;

/* renamed from: vdb reason: default package */
public final class vdb implements vua<vda> {
    private final wlc<vdi> a;
    private final wlc<jro> b;

    private vdb(wlc<vdi> wlc, wlc<jro> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static vdb a(wlc<vdi> wlc, wlc<jro> wlc2) {
        return new vdb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new vda((vdi) this.a.get(), (jro) this.b.get());
    }
}
