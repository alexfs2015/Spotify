package defpackage;

/* renamed from: hqa reason: default package */
public final class hqa implements hpx {
    private final vti<hre> a;

    public hqa(vti<hre> vti) {
        this.a = vti;
    }

    public final boolean a(String str) {
        return str.startsWith("spotify:space_item:");
    }

    public final hqx a() {
        return (hqx) this.a.get();
    }
}
