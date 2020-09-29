package defpackage;

/* renamed from: gji reason: default package */
public final class gji implements wig<giw> {
    private final wzi<gio> a;

    private gji(wzi<gio> wzi) {
        this.a = wzi;
    }

    public static gji a(wzi<gio> wzi) {
        return new gji(wzi);
    }

    public final /* synthetic */ Object get() {
        return (giw) wil.a((gio) this.a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
