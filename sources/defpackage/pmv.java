package defpackage;

/* renamed from: pmv reason: default package */
public final class pmv implements wig<String> {
    private final wzi<juc> a;

    private pmv(wzi<juc> wzi) {
        this.a = wzi;
    }

    public static pmv a(wzi<juc> wzi) {
        return new pmv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((juc) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
