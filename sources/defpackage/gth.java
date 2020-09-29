package defpackage;

/* renamed from: gth reason: default package */
public final class gth implements wig<String> {
    private final wzi<jty> a;

    private gth(wzi<jty> wzi) {
        this.a = wzi;
    }

    public static gth a(wzi<jty> wzi) {
        return new gth(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((jty) this.a.get()).d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
