package defpackage;

import com.bmwgroup.connected.car.internal.SdkManager;

/* renamed from: aej reason: default package */
public class aej extends adq implements afv {
    private static final agd h = agd.a("connected.car.sdk");
    protected b d;
    protected a e;
    protected c f;
    protected agl g;

    public aej(acq acq, acr acr) {
        super(acq, acr);
        h.b("InternalPlayerScreen() constructor", new Object[0]);
    }

    public final agm a(int i) {
        if (i < 0 || i >= 8) {
            throw new IndexOutOfBoundsException();
        }
        if (this.c[i] == null) {
            this.c[i] = new afk(String.format("%s:%d", new Object[]{SdkManager.INSTANCE.c(), Integer.valueOf(i)}));
        }
        return this.c[i];
    }

    public b b() {
        h.b("getArtist() -> %s", this.b);
        if (this.d == null) {
            String str = "%s$%d";
            this.d = new ael(String.format(str, new Object[]{this.b, Integer.valueOf(32)}), String.format(str, new Object[]{this.b, Integer.valueOf(29)}), String.format(str, new Object[]{this.b, Integer.valueOf(42)}), String.format(str, new Object[]{this.b, Integer.valueOf(39)}));
        }
        return this.d;
    }

    public a c() {
        h.b("getAlbum() -> %s", this.b);
        if (this.e == null) {
            String str = "%s$%d";
            this.e = new aek(String.format(str, new Object[]{this.b, Integer.valueOf(33)}), String.format(str, new Object[]{this.b, Integer.valueOf(30)}), String.format(str, new Object[]{this.b, Integer.valueOf(43)}), String.format(str, new Object[]{this.b, Integer.valueOf(40)}));
        }
        return this.e;
    }

    public c d() {
        h.b("getTitle() -> %s", this.b);
        if (this.f == null) {
            String str = "%s$%d";
            this.f = new aep(String.format(str, new Object[]{this.b, Integer.valueOf(34)}), String.format(str, new Object[]{this.b, Integer.valueOf(31)}), String.format(str, new Object[]{this.b, Integer.valueOf(44)}), String.format(str, new Object[]{this.b, Integer.valueOf(41)}));
        }
        return this.f;
    }

    public agl e() {
        h.b("getCover() -> %s", this.b);
        if (this.g == null) {
            String str = "%s$%d";
            this.g = new aem(String.format(str, new Object[]{this.b, Integer.valueOf(27)}), String.format(str, new Object[]{this.b, Integer.valueOf(38)}));
        }
        return this.g;
    }
}
