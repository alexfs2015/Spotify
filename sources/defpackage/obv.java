package defpackage;

/* renamed from: obv reason: default package */
public final class obv implements wig<obs> {
    private final wzi<jgy> a;
    private final wzi<jhc> b;

    private obv(wzi<jgy> wzi, wzi<jhc> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static obv a(wzi<jgy> wzi, wzi<jhc> wzi2) {
        return new obv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new obs((jgy) this.a.get(), (jhc) this.b.get());
    }
}
