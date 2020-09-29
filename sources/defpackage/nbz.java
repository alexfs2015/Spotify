package defpackage;

/* renamed from: nbz reason: default package */
public final class nbz implements wig<String> {
    private final wzi<String> a;

    private nbz(wzi<String> wzi) {
        this.a = wzi;
    }

    public static nbz a(wzi<String> wzi) {
        return new nbz(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a((String) this.a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
