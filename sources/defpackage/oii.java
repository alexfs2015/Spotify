package defpackage;

/* renamed from: oii reason: default package */
public final class oii implements wig<wbn> {
    private final wzi<ojo> a;

    private oii(wzi<ojo> wzi) {
        this.a = wzi;
    }

    public static oii a(wzi<ojo> wzi) {
        return new oii(wzi);
    }

    public final /* synthetic */ Object get() {
        return (wbn) wil.a(new wbn(((ojo) this.a.get()).p()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
