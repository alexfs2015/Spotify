package defpackage;

/* renamed from: swl reason: default package */
public final class swl implements wig<swk> {
    private final wzi<igt> a;

    private swl(wzi<igt> wzi) {
        this.a = wzi;
    }

    public static swl a(wzi<igt> wzi) {
        return new swl(wzi);
    }

    public final /* synthetic */ Object get() {
        return (swk) wil.a(new swk((igt) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
