package defpackage;

/* renamed from: utl reason: default package */
public final class utl implements wig<uto> {
    private final wzi<jlr> a;

    private utl(wzi<jlr> wzi) {
        this.a = wzi;
    }

    public static utl a(wzi<jlr> wzi) {
        return new utl(wzi);
    }

    public final /* synthetic */ Object get() {
        return (uto) wil.a(new uto((jlr) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
