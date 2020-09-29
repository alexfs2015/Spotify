package defpackage;

/* renamed from: sua reason: default package */
public final class sua implements wig<stz> {
    private final wzi<suc> a;
    private final wzi<str> b;

    private sua(wzi<suc> wzi, wzi<str> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sua a(wzi<suc> wzi, wzi<str> wzi2) {
        return new sua(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new stz((suc) this.a.get(), (str) this.b.get());
    }
}
