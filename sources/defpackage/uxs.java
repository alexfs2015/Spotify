package defpackage;

/* renamed from: uxs reason: default package */
public final class uxs implements wig<uxc> {
    private final wzi<jlr> a;

    private uxs(wzi<jlr> wzi) {
        this.a = wzi;
    }

    public static uxs a(wzi<jlr> wzi) {
        return new uxs(wzi);
    }

    public final /* synthetic */ Object get() {
        return (uxc) wil.a(new uxc((jlr) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
