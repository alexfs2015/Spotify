package defpackage;

/* renamed from: hro reason: default package */
public final class hro implements hrw {
    private final who<hsw> a;

    public hro(who<hsw> who) {
        this.a = who;
    }

    public final hth a() {
        return (hth) this.a.get();
    }

    public final boolean a(huo huo) {
        return huo.b().contains("spotify:genre:");
    }
}
