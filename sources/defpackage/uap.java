package defpackage;

/* renamed from: uap reason: default package */
public final class uap implements wig<uao> {
    private final wzi<sij> a;
    private final wzi<uaq> b;
    private final wzi<uah> c;
    private final wzi<jtz> d;
    private final wzi<Boolean> e;

    private uap(wzi<sij> wzi, wzi<uaq> wzi2, wzi<uah> wzi3, wzi<jtz> wzi4, wzi<Boolean> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static uap a(wzi<sij> wzi, wzi<uaq> wzi2, wzi<uah> wzi3, wzi<jtz> wzi4, wzi<Boolean> wzi5) {
        uap uap = new uap(wzi, wzi2, wzi3, wzi4, wzi5);
        return uap;
    }

    public final /* synthetic */ Object get() {
        uao uao = new uao((sij) this.a.get(), (uaq) this.b.get(), (uah) this.c.get(), (jtz) this.d.get(), ((Boolean) this.e.get()).booleanValue());
        return uao;
    }
}
