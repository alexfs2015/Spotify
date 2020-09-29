package defpackage;

/* renamed from: oxj reason: default package */
public final class oxj implements wig<oxi> {
    private final wzi<oxg> a;
    private final wzi<a> b;

    private oxj(wzi<oxg> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oxj a(wzi<oxg> wzi, wzi<a> wzi2) {
        return new oxj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new oxi((oxg) this.a.get(), (a) this.b.get());
    }
}
