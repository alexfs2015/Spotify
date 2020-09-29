package defpackage;

/* renamed from: kwg reason: default package */
public final class kwg implements wig<kwf> {
    private final wzi<jgy> a;
    private final wzi<jhc> b;

    private kwg(wzi<jgy> wzi, wzi<jhc> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kwg a(wzi<jgy> wzi, wzi<jhc> wzi2) {
        return new kwg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kwf((jgy) this.a.get(), (jhc) this.b.get());
    }
}
