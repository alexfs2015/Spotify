package defpackage;

/* renamed from: nes reason: default package */
public final class nes implements wig<String> {
    private final wzi<uqm> a;

    private nes(wzi<uqm> wzi) {
        this.a = wzi;
    }

    public static nes a(wzi<uqm> wzi) {
        return new nes(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((uqm) this.a.get()).toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
