package defpackage;

/* renamed from: uyw reason: default package */
public final class uyw implements wig<a> {
    private final wzi<jvf> a;

    private uyw(wzi<jvf> wzi) {
        this.a = wzi;
    }

    public static uyw a(wzi<jvf> wzi) {
        return new uyw(wzi);
    }

    public final /* synthetic */ Object get() {
        return (a) wil.a(uyv.a((jvf) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
