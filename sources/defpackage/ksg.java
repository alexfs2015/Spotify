package defpackage;

/* renamed from: ksg reason: default package */
public final class ksg implements wig<a> {
    private final wzi<krr> a;

    private ksg(wzi<krr> wzi) {
        this.a = wzi;
    }

    public static ksg a(wzi<krr> wzi) {
        return new ksg(wzi);
    }

    public final /* synthetic */ Object get() {
        return (a) wil.a(CC.a((krr) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
