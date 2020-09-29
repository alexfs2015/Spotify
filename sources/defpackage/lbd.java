package defpackage;

/* renamed from: lbd reason: default package */
public final class lbd implements wig<lbb> {
    private final wzi<lbe> a;

    private lbd(wzi<lbe> wzi) {
        this.a = wzi;
    }

    public static lbd a(wzi<lbe> wzi) {
        return new lbd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (lbb) wil.a(new lbc((lbe) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
