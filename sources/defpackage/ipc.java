package defpackage;

/* renamed from: ipc reason: default package */
public final class ipc implements wig<ipb> {
    private final wzi<ipd> a;
    private final wzi<iso> b;

    private ipc(wzi<ipd> wzi, wzi<iso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ipc a(wzi<ipd> wzi, wzi<iso> wzi2) {
        return new ipc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ipb((ipd) this.a.get(), (iso) this.b.get());
    }
}
