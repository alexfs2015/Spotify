package defpackage;

import com.comscore.streaming.ContentType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;

/* renamed from: fmd reason: default package */
public class fmd {
    private static fmd[] f;
    final int a;
    final int b;
    public final int c;
    public final int d;
    final int e;
    private final boolean g;
    private final int h;
    private final int i;

    static {
        fmd fmd = new fmd(false, 3, 5, 8, 8, 1);
        fmd fmd2 = new fmd(false, 5, 7, 10, 10, 1);
        fmd fmd3 = new fmd(true, 5, 7, 16, 6, 1);
        fmd fmd4 = new fmd(false, 8, 10, 12, 12, 1);
        fmd fmd5 = new fmd(true, 10, 11, 14, 6, 2);
        fmd fmd6 = new fmd(false, 12, 12, 14, 14, 1);
        fmd fmd7 = new fmd(true, 16, 14, 24, 10, 1);
        fmd fmd8 = new fmd(false, 18, 14, 16, 16, 1);
        fmd fmd9 = new fmd(false, 22, 18, 18, 18, 1);
        fmd fmd10 = new fmd(true, 22, 18, 16, 10, 2);
        fmd fmd11 = new fmd(false, 30, 20, 20, 20, 1);
        fmd fmd12 = new fmd(true, 32, 24, 16, 14, 2);
        fmd fmd13 = new fmd(false, 36, 24, 22, 22, 1);
        fmd fmd14 = new fmd(false, 44, 28, 24, 24, 1);
        fmd fmd15 = new fmd(true, 49, 28, 22, 14, 2);
        fmd fmd16 = new fmd(false, 62, 36, 14, 14, 4);
        fmd fmd17 = new fmd(false, 86, 42, 16, 16, 4);
        fmd fmd18 = new fmd(false, a.aB, 48, 18, 18, 4);
        fmd fmd19 = new fmd(false, 144, 56, 20, 20, 4);
        fmd fmd20 = new fmd(false, 174, 68, 22, 22, 4);
        fmd fmd21 = new fmd(false, 204, 84, 24, 24, 4, 102, 42);
        fmd fmd22 = new fmd(false, 280, ContentType.LONG_FORM_ON_DEMAND, 14, 14, 16, 140, 56);
        fmd fmd23 = new fmd(false, 368, 144, 16, 16, 16, 92, 36);
        fmd fmd24 = new fmd(false, 456, 192, 18, 18, 16, a.aB, 48);
        fmd fmd25 = new fmd(false, 576, 224, 20, 20, 16, 144, 56);
        fmd fmd26 = new fmd(false, 696, 272, 22, 22, 16, 174, 68);
        fmd fmd27 = new fmd(false, 816, 336, 24, 24, 16, 136, 56);
        fmd fmd28 = new fmd(false, 1050, 408, 18, 18, 36, 175, 68);
        fmd fmd29 = new fmd(false, 1304, 496, 20, 20, 36, 163, 62);
        f = new fmd[]{fmd, fmd2, fmd3, fmd4, fmd5, fmd6, fmd7, fmd8, fmd9, fmd10, fmd11, fmd12, fmd13, fmd14, fmd15, fmd16, fmd17, fmd18, fmd19, fmd20, fmd21, fmd22, fmd23, fmd24, fmd25, fmd26, fmd27, fmd28, fmd29, new flw()};
    }

    private fmd(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    fmd(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.g = z;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.h = i6;
        this.i = i7;
        this.e = i8;
    }

    public static fmd a(int i2, SymbolShapeHint symbolShapeHint, flc flc, flc flc2, boolean z) {
        fmd[] fmdArr;
        for (fmd fmd : f) {
            if ((symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !fmd.g) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || fmd.g) && ((flc == null || (fmd.d() >= flc.a && fmd.e() >= flc.b)) && ((flc2 == null || (fmd.d() <= flc2.a && fmd.e() <= flc2.b)) && i2 <= fmd.a)))) {
                return fmd;
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

    public int a() {
        return this.a / this.i;
    }

    public int a(int i2) {
        return this.i;
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
