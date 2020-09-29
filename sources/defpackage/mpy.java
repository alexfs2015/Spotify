package defpackage;

/* renamed from: mpy reason: default package */
public final class mpy implements wig<Boolean> {
    private final wzi<rzo> a;

    private mpy(wzi<rzo> wzi) {
        this.a = wzi;
    }

    public static mpy a(wzi<rzo> wzi) {
        return new mpy(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Boolean) wil.a(Boolean.valueOf(((rzo) this.a.get()).a(false)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
