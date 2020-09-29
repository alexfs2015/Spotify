package defpackage;

/* renamed from: hrs reason: default package */
public final class hrs implements hrw {
    private final who<htd> a;
    private final hrk b;

    public hrs(who<htd> who, hrk hrk) {
        this.a = who;
        this.b = hrk;
    }

    public final hth a() {
        return (hth) this.a.get();
    }

    public final boolean a(huo huo) {
        return huo.a() != null && huo.a().equals("default-cars") && huo.e() && !this.b.a(huo);
    }
}
