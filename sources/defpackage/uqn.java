package defpackage;

/* renamed from: uqn reason: default package */
public final class uqn implements wig<uqm> {
    private final wzi<a> a;

    private uqn(wzi<a> wzi) {
        this.a = wzi;
    }

    public static uqm a(a aVar) {
        return (uqm) wil.a(aVar.ag(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static uqn a(wzi<a> wzi) {
        return new uqn(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
