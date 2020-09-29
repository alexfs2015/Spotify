package defpackage;

/* renamed from: uay reason: default package */
public final class uay implements wig<tza> {
    private final wzi<tzb> a;

    private uay(wzi<tzb> wzi) {
        this.a = wzi;
    }

    public static tza a(tzb tzb) {
        return (tza) wil.a(tzb.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static uay a(wzi<tzb> wzi) {
        return new uay(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((tzb) this.a.get());
    }
}
