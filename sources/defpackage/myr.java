package defpackage;

/* renamed from: myr reason: default package */
public final class myr implements wig<Boolean> {
    private final wzi<stz> a;

    private myr(wzi<stz> wzi) {
        this.a = wzi;
    }

    public static myr a(wzi<stz> wzi) {
        return new myr(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((stz) this.a.get()).a());
    }
}
