package defpackage;

/* renamed from: adz reason: default package */
public final class adz extends adv implements afi {
    private static final afp h = afp.a("connected.car.sdk");
    private afl i;

    public adz(acc acc, acd acd) {
        super(acc, acd);
    }

    public final b b() {
        h.b("getArtist() -> %s", this.b);
        if (this.d == null) {
            String str = "%s$%d";
            this.d = new adx(String.format(str, new Object[]{this.b, Integer.valueOf(7001)}), String.format(str, new Object[]{this.b, Integer.valueOf(7001)}), String.format(str, new Object[]{this.b, Integer.valueOf(7001)}), String.format(str, new Object[]{this.b, Integer.valueOf(7001)}));
        }
        return this.d;
    }

    public final a c() {
        h.b("getAlbum() -> %s", this.b);
        if (this.e == null) {
            String str = "%s$%d";
            this.e = new adw(String.format(str, new Object[]{this.b, Integer.valueOf(7002)}), String.format(str, new Object[]{this.b, Integer.valueOf(7002)}), String.format(str, new Object[]{this.b, Integer.valueOf(7002)}), String.format(str, new Object[]{this.b, Integer.valueOf(7002)}));
        }
        return this.e;
    }

    public final c d() {
        h.b("getTitle() -> %s", this.b);
        if (this.f == null) {
            String str = "%s$%d";
            this.f = new aeb(String.format(str, new Object[]{this.b, Integer.valueOf(7006)}), String.format(str, new Object[]{this.b, Integer.valueOf(7006)}), String.format(str, new Object[]{this.b, Integer.valueOf(7006)}), String.format(str, new Object[]{this.b, Integer.valueOf(7006)}));
        }
        return this.f;
    }

    public final afx e() {
        h.b("getCover() -> %s", this.b);
        if (this.g == null) {
            String str = "%s$%d";
            this.g = new ady(String.format(str, new Object[]{this.b, Integer.valueOf(7003)}), String.format(str, new Object[]{this.b, Integer.valueOf(7003)}));
        }
        return this.g;
    }

    public final afl f() {
        if (this.i == null) {
            this.i = new aec(String.format("%s$%d", new Object[]{this.b, Integer.valueOf(7011)}));
        }
        return this.i;
    }
}
