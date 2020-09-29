package defpackage;

/* renamed from: pas reason: default package */
public final class pas implements wig<String> {
    private final wzi<String> a;

    private pas(wzi<String> wzi) {
        this.a = wzi;
    }

    public static pas a(wzi<String> wzi) {
        return new pas(wzi);
    }

    public final /* synthetic */ Object get() {
        String b = jva.a((String) this.a.get()).b();
        if (b == null) {
            b = "";
        }
        return (String) wil.a(b, "Cannot return null from a non-@Nullable @Provides method");
    }
}
