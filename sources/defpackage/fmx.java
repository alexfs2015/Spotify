package defpackage;

import com.comscore.streaming.ContentType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;

/* renamed from: fmx reason: default package */
public class fmx {
    private static fmx[] f;
    final int a;
    final int b;
    public final int c;
    public final int d;
    final int e;
    private final boolean g;
    private final int h;
    private final int i;

    static {
        fmx fmx = new fmx(false, 3, 5, 8, 8, 1);
        fmx fmx2 = new fmx(false, 5, 7, 10, 10, 1);
        fmx fmx3 = new fmx(true, 5, 7, 16, 6, 1);
        fmx fmx4 = new fmx(false, 8, 10, 12, 12, 1);
        fmx fmx5 = new fmx(true, 10, 11, 14, 6, 2);
        fmx fmx6 = new fmx(false, 12, 12, 14, 14, 1);
        fmx fmx7 = new fmx(true, 16, 14, 24, 10, 1);
        fmx fmx8 = new fmx(false, 18, 14, 16, 16, 1);
        fmx fmx9 = new fmx(false, 22, 18, 18, 18, 1);
        fmx fmx10 = new fmx(true, 22, 18, 16, 10, 2);
        fmx fmx11 = new fmx(false, 30, 20, 20, 20, 1);
        fmx fmx12 = new fmx(true, 32, 24, 16, 14, 2);
        fmx fmx13 = new fmx(false, 36, 24, 22, 22, 1);
        fmx fmx14 = new fmx(false, 44, 28, 24, 24, 1);
        fmx fmx15 = new fmx(true, 49, 28, 22, 14, 2);
        fmx fmx16 = new fmx(false, 62, 36, 14, 14, 4);
        fmx fmx17 = new fmx(false, 86, 42, 16, 16, 4);
        fmx fmx18 = new fmx(false, a.aB, 48, 18, 18, 4);
        fmx fmx19 = new fmx(false, 144, 56, 20, 20, 4);
        fmx fmx20 = new fmx(false, 174, 68, 22, 22, 4);
        fmx fmx21 = new fmx(false, 204, 84, 24, 24, 4, 102, 42);
        fmx fmx22 = new fmx(false, 280, ContentType.LONG_FORM_ON_DEMAND, 14, 14, 16, 140, 56);
        fmx fmx23 = new fmx(false, 368, 144, 16, 16, 16, 92, 36);
        fmx fmx24 = new fmx(false, 456, 192, 18, 18, 16, a.aB, 48);
        fmx fmx25 = new fmx(false, 576, 224, 20, 20, 16, 144, 56);
        fmx fmx26 = new fmx(false, 696, 272, 22, 22, 16, 174, 68);
        fmx fmx27 = new fmx(false, 816, 336, 24, 24, 16, 136, 56);
        fmx fmx28 = new fmx(false, 1050, 408, 18, 18, 36, 175, 68);
        fmx fmx29 = new fmx(false, 1304, 496, 20, 20, 36, 163, 62);
        f = new fmx[]{fmx, fmx2, fmx3, fmx4, fmx5, fmx6, fmx7, fmx8, fmx9, fmx10, fmx11, fmx12, fmx13, fmx14, fmx15, fmx16, fmx17, fmx18, fmx19, fmx20, fmx21, fmx22, fmx23, fmx24, fmx25, fmx26, fmx27, fmx28, fmx29, new fmq()};
    }

    private fmx(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    fmx(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.g = z;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.h = i6;
        this.i = i7;
        this.e = i8;
    }

    public static fmx a(int i2, SymbolShapeHint symbolShapeHint, flw flw, flw flw2, boolean z) {
        fmx[] fmxArr;
        for (fmx fmx : f) {
            if ((symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !fmx.g) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || fmx.g) && ((flw == null || (fmx.d() >= flw.a && fmx.e() >= flw.b)) && ((flw2 == null || (fmx.d() <= flw2.a && fmx.e() <= flw2.b)) && i2 <= fmx.a)))) {
                return fmx;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
    }

    private int f() {
        int i2 = this.h;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (!(i2 == 2 || i2 == 4)) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    private int g() {
        int i2 = this.h;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public int a() {
        return this.a / this.i;
    }

    public int a(int i2) {
        return this.i;
    }

    public final int b() {
        return f() * this.c;
    }

    public final int c() {
        return g() * this.d;
    }

    public final int d() {
        return b() + (f() << 1);
    }

    public final int e() {
        return c() + (g() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.g ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.c);
        sb.append('x');
        sb.append(this.d);
        sb.append(", symbol size ");
        sb.append(d());
        sb.append('x');
        sb.append(e());
        sb.append(", symbol data size ");
        sb.append(b());
        sb.append('x');
        sb.append(c());
        sb.append(", codewords ");
        sb.append(this.a);
        sb.append('+');
        sb.append(this.b);
        return sb.toString();
    }
}
