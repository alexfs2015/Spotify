package defpackage;

/* renamed from: lmi reason: default package */
public final class lmi implements wig<String> {
    private final wzi<jty> a;

    private lmi(wzi<jty> wzi) {
        this.a = wzi;
    }

    public static lmi a(wzi<jty> wzi) {
        return new lmi(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((jty) this.a.get()).c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
