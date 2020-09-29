package defpackage;

/* renamed from: ubp reason: default package */
public final class ubp implements wig<tza> {
    private final wzi<tzb> a;

    private ubp(wzi<tzb> wzi) {
        this.a = wzi;
    }

    public static tza a(tzb tzb) {
        return (tza) wil.a(tzb.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static ubp a(wzi<tzb> wzi) {
        return new ubp(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((tzb) this.a.get());
    }
}
