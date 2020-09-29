package defpackage;

/* renamed from: uxu reason: default package */
public final class uxu implements wig<uxg> {
    private final wzi<jlr> a;

    private uxu(wzi<jlr> wzi) {
        this.a = wzi;
    }

    public static uxu a(wzi<jlr> wzi) {
        return new uxu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (uxg) wil.a(new uxg((jlr) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
