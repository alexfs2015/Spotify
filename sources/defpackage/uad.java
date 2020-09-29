package defpackage;

/* renamed from: uad reason: default package */
public final class uad implements wig<tza> {
    private final wzi<tzb> a;

    private uad(wzi<tzb> wzi) {
        this.a = wzi;
    }

    public static tza a(tzb tzb) {
        return (tza) wil.a(tzb.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static uad a(wzi<tzb> wzi) {
        return new uad(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((tzb) this.a.get());
    }
}
