package defpackage;

/* renamed from: rmg reason: default package */
public final class rmg implements wig<rmf> {
    private final wzi<b> a;

    private rmg(wzi<b> wzi) {
        this.a = wzi;
    }

    public static rmf a(b bVar) {
        return (rmf) wil.a(bVar.af(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static rmg a(wzi<b> wzi) {
        return new rmg(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((b) this.a.get());
    }
}
