package defpackage;

/* renamed from: njj reason: default package */
public final class njj implements wig<nji> {
    private final wzi<rwj> a;
    private final wzi<Boolean> b;

    private njj(wzi<rwj> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static njj a(wzi<rwj> wzi, wzi<Boolean> wzi2) {
        return new njj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nji((rwj) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
