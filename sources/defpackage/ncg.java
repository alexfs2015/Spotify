package defpackage;

/* renamed from: ncg reason: default package */
public final class ncg implements wig<String> {
    private final wzi<uqm> a;

    private ncg(wzi<uqm> wzi) {
        this.a = wzi;
    }

    public static ncg a(wzi<uqm> wzi) {
        return new ncg(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((uqm) this.a.get()).toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
