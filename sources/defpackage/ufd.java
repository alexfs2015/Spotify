package defpackage;

/* renamed from: ufd reason: default package */
public final class ufd implements wig<ufc> {
    private final wzi<szp> a;
    private final wzi<ufi> b;
    private final wzi<uhz> c;

    private ufd(wzi<szp> wzi, wzi<ufi> wzi2, wzi<uhz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ufd a(wzi<szp> wzi, wzi<ufi> wzi2, wzi<uhz> wzi3) {
        return new ufd(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ufc((szp) this.a.get(), (ufi) this.b.get(), (uhz) this.c.get());
    }
}
