package defpackage;

/* renamed from: tfv reason: default package */
public final class tfv implements wig<uzq> {
    private final wzi<uzb> a;
    private final wzi<uzi> b;

    private tfv(wzi<uzb> wzi, wzi<uzi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tfv a(wzi<uzb> wzi, wzi<uzi> wzi2) {
        return new tfv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (uzq) wil.a(new uzq((uzb) this.a.get(), (uzi) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
