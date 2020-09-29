package defpackage;

/* renamed from: hsr reason: default package */
public final class hsr implements wig<hga> {
    private final wzi<htk> a;

    private hsr(wzi<htk> wzi) {
        this.a = wzi;
    }

    public static hsr a(wzi<htk> wzi) {
        return new hsr(wzi);
    }

    public final /* synthetic */ Object get() {
        return (hga) wil.a(((htk) this.a.get()).get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
