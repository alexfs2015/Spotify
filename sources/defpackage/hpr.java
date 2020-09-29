package defpackage;

/* renamed from: hpr reason: default package */
public final class hpr implements hpx {
    private final vti<hqo> a;

    public hpr(vti<hqo> vti) {
        this.a = vti;
    }

    public final hqx a() {
        return (hqx) this.a.get();
    }

    public final boolean a(String str) {
        return str.contains("spotify:genre:");
    }
}
