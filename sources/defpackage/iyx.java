package defpackage;

/* renamed from: iyx reason: default package */
public final class iyx implements wig<gsv> {
    private final wzi<tkk> a;
    private final wzi<rym> b;
    private final wzi<gkq> c;
    private final wzi<sso> d;

    private iyx(wzi<tkk> wzi, wzi<rym> wzi2, wzi<gkq> wzi3, wzi<sso> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static iyx a(wzi<tkk> wzi, wzi<rym> wzi2, wzi<gkq> wzi3, wzi<sso> wzi4) {
        return new iyx(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gsv) wil.a(new iyw((tkk) this.a.get(), (rym) this.b.get(), (gkq) this.c.get(), (sso) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
