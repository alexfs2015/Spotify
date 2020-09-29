package defpackage;

/* renamed from: nhj reason: default package */
public final class nhj implements wig<nhb> {
    private final wzi<nhc> a;

    private nhj(wzi<nhc> wzi) {
        this.a = wzi;
    }

    public static nhj a(wzi<nhc> wzi) {
        return new nhj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (nhb) wil.a(CC.a((nhc) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
