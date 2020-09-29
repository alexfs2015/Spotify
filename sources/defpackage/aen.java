package defpackage;

/* renamed from: aen reason: default package */
public final class aen extends aej implements afw {
    private static final agd h = agd.a("connected.car.sdk");
    private afz i;

    public aen(acq acq, acr acr) {
        super(acq, acr);
    }

    public final b b() {
        h.b("getArtist() -> %s", this.b);
        if (this.d == null) {
            String str = "%s$%d";
            this.d = new ael(String.format(str, new Object[]{this.b, Integer.valueOf(7001)}), String.format(str, new Object[]{this.b, Integer.valueOf(7001)}), String.format(str, new Object[]{this.b, Integer.valueOf(7001)}), String.format(str, new Object[]{this.b, Integer.valueOf(7001)}));
        }
        return this.d;
    }

    public final a c() {
        h.b("getAlbum() -> %s", this.b);
        if (this.e == null) {
            String str = "%s$%d";
            this.e = new aek(String.format(str, new Object[]{this.b, Integer.valueOf(7002)}), String.format(str, new Object[]{this.b, Integer.valueOf(7002)}), String.format(str, new Object[]{this.b, Integer.valueOf(7002)}), String.format(str, new Object[]{this.b, Integer.valueOf(7002)}));
        }
        return this.e;
    }

    public final c d() {
        h.b("getTitle() -> %s", this.b);
        if (this.f == null) {
            String str = "%s$%d";
            this.f = new aep(String.format(str, new Object[]{this.b, Integer.valueOf(7006)}), String.format(str, new Object[]{this.b, Integer.valueOf(7006)}), String.format(str, new Object[]{this.b, Integer.valueOf(7006)}), String.format(str, new Object[]{this.b, Integer.valueOf(7006)}));
        }
        return this.f;
    }

    public final agl e() {
        h.b("getCover() -> %s", this.b);
        if (this.g == null) {
            String str = "%s$%d";
            this.g = new aem(String.format(str, new Object[]{this.b, Integer.valueOf(7003)}), String.format(str, new Object[]{this.b, Integer.valueOf(7003)}));
        }
        return this.g;
    }

    public final afz f() {
        if (this.i == null) {
            this.i = new aeq(String.format("%s$%d", new Object[]{this.b, Integer.valueOf(7011)}));
        }
        return this.i;
    }
}
