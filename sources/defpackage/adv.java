package defpackage;

import com.bmwgroup.connected.car.internal.SdkManager;

/* renamed from: adv reason: default package */
public class adv extends adc implements afh {
    private static final afp h = afp.a("connected.car.sdk");
    protected b d;
    protected a e;
    protected c f;
    protected afx g;

    public adv(acc acc, acd acd) {
        super(acc, acd);
        h.b("InternalPlayerScreen() constructor", new Object[0]);
    }

    public b b() {
        h.b("getArtist() -> %s", this.b);
        if (this.d == null) {
            String str = "%s$%d";
            this.d = new adx(String.format(str, new Object[]{this.b, Integer.valueOf(32)}), String.format(str, new Object[]{this.b, Integer.valueOf(29)}), String.format(str, new Object[]{this.b, Integer.valueOf(42)}), String.format(str, new Object[]{this.b, Integer.valueOf(39)}));
        }
        return this.d;
    }

    public a c() {
        h.b("getAlbum() -> %s", this.b);
        if (this.e == null) {
            String str = "%s$%d";
            this.e = new adw(String.format(str, new Object[]{this.b, Integer.valueOf(33)}), String.format(str, new Object[]{this.b, Integer.valueOf(30)}), String.format(str, new Object[]{this.b, Integer.valueOf(43)}), String.format(str, new Object[]{this.b, Integer.valueOf(40)}));
        }
        return this.e;
    }

    public c d() {
        h.b("getTitle() -> %s", this.b);
        if (this.f == null) {
            String str = "%s$%d";
            this.f = new aeb(String.format(str, new Object[]{this.b, Integer.valueOf(34)}), String.format(str, new Object[]{this.b, Integer.valueOf(31)}), String.format(str, new Object[]{this.b, Integer.valueOf(44)}), String.format(str, new Object[]{this.b, Integer.valueOf(41)}));
        }
        return this.f;
    }

    public afx e() {
        h.b("getCover() -> %s", this.b);
        if (this.g == null) {
            String str = "%s$%d";
            this.g = new ady(String.format(str, new Object[]{this.b, Integer.valueOf(27)}), String.format(str, new Object[]{this.b, Integer.valueOf(38)}));
        }
        return this.g;
    }

    public final afy a(int i) {
        if (i < 0 || i >= 8) {
            throw new IndexOutOfBoundsException();
        }
        if (this.c[i] == null) {
            this.c[i] = new aew(String.format("%s:%d", new Object[]{SdkManager.INSTANCE.c(), Integer.valueOf(i)}));
        }
        return this.c[i];
    }
}
