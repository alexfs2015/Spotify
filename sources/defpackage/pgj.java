package defpackage;

/* renamed from: pgj reason: default package */
public final class pgj implements wig<pgi> {
    private final wzi<fsz> a;
    private final wzi<String> b;
    private final wzi<peh> c;

    private pgj(wzi<fsz> wzi, wzi<String> wzi2, wzi<peh> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static pgj a(wzi<fsz> wzi, wzi<String> wzi2, wzi<peh> wzi3) {
        return new pgj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new pgi((fsz) this.a.get(), (String) this.b.get(), (peh) this.c.get());
    }
}
