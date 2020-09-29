package defpackage;

/* renamed from: hzb reason: default package */
public final class hzb implements wig<iiy> {
    private final wzi<hzw> a;

    private hzb(wzi<hzw> wzi) {
        this.a = wzi;
    }

    public static hzb a(wzi<hzw> wzi) {
        return new hzb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (iiy) wil.a(new iiy((hzw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
