package defpackage;

/* renamed from: new reason: invalid class name and default package */
public final class Cnew implements wig<Boolean> {
    private final wzi<stz> a;

    private Cnew(wzi<stz> wzi) {
        this.a = wzi;
    }

    public static Cnew a(wzi<stz> wzi) {
        return new Cnew(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((stz) this.a.get()).a());
    }
}
