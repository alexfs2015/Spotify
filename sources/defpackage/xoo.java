package defpackage;

/* renamed from: xoo reason: default package */
public final class xoo implements wig<String> {
    private final wzi<juc> a;

    private xoo(wzi<juc> wzi) {
        this.a = wzi;
    }

    public static xoo a(wzi<juc> wzi) {
        return new xoo(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((juc) this.a.get()).b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
