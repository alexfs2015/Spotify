package defpackage;

/* renamed from: mbd reason: default package */
public final class mbd implements wig<String> {
    private final wzi<String> a;

    private mbd(wzi<String> wzi) {
        this.a = wzi;
    }

    public static mbd a(wzi<String> wzi) {
        return new mbd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(mdk.a((String) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
