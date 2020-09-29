package defpackage;

/* renamed from: loc reason: default package */
public final class loc implements wig<loj> {
    private final wzi<jty> a;

    private loc(wzi<jty> wzi) {
        this.a = wzi;
    }

    public static loc a(wzi<jty> wzi) {
        return new loc(wzi);
    }

    public final /* synthetic */ Object get() {
        return (loj) wil.a(new loj(((jty) this.a.get()).c()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
