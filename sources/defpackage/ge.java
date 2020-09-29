package defpackage;

import android.graphics.Path;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;

/* renamed from: ge reason: default package */
public final class ge {

    /* renamed from: ge$a */
    static class a {
        int a;
        boolean b;

        a() {
        }
    }

    /* renamed from: ge$b */
    public static class b {
        public char a;
        public float[] b;

        b(char c, float[] fArr) {
            this.a = c;
            this.b = fArr;
        }

        b(b bVar) {
            this.a = bVar.a;
            float[] fArr = bVar.b;
            this.b = ge.a(fArr, 0, fArr.length);
        }

        private static void a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = (double) ceil;
            Double.isNaN(d18);
            double d19 = d9 / d18;
            double d20 = d5;
            double d21 = d6;
            double d22 = d17;
            double d23 = d14;
            int i = 0;
            double d24 = d8;
            while (i < ceil) {
                double d25 = d24 + d19;
                double sin3 = Math.sin(d25);
                double cos3 = Math.cos(d25);
                double d26 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d27 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d28 = (d12 * sin3) - (d13 * cos3);
                double d29 = (sin3 * d15) + (cos3 * d16);
                double d30 = d25 - d24;
                double tan = Math.tan(d30 / 2.0d);
                double sin4 = (Math.sin(d30) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                int i2 = ceil;
                double d31 = cos;
                double d32 = d20 + (d23 * sin4);
                double d33 = sin;
                double d34 = d21 + (d22 * sin4);
                double d35 = d19;
                double d36 = d26 - (sin4 * d28);
                int i3 = i2;
                double d37 = d15;
                double d38 = d27 - (sin4 * d29);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d32, (float) d34, (float) d36, (float) d38, (float) d26, (float) d27);
                i++;
                d19 = d35;
                ceil = i3;
                sin = d33;
                d21 = d27;
                d15 = d37;
                d24 = d25;
                d22 = d29;
                d23 = d28;
                cos = d31;
                d10 = d3;
                d20 = d26;
            }
        }

        private static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            boolean z3 = z2;
            float f10 = f5;
            float f11 = f6;
            float f12 = f7;
            while (true) {
                double radians = Math.toRadians((double) f12);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d3 = (double) f8;
                Double.isNaN(d3);
                double d4 = d3 * cos;
                double d5 = d3;
                double d6 = (double) f2;
                Double.isNaN(d6);
                double d7 = d4 + (d6 * sin);
                double d8 = (double) f10;
                Double.isNaN(d8);
                double d9 = d7 / d8;
                double d10 = (double) (-f8);
                Double.isNaN(d10);
                double d11 = d10 * sin;
                Double.isNaN(d6);
                double d12 = d11 + (d6 * cos);
                double d13 = d6;
                double d14 = (double) f11;
                Double.isNaN(d14);
                double d15 = d12 / d14;
                float f13 = f10;
                float f14 = f11;
                double d16 = (double) f9;
                Double.isNaN(d16);
                double d17 = d16 * cos;
                double d18 = d15;
                double d19 = (double) f4;
                Double.isNaN(d19);
                double d20 = d17 + (d19 * sin);
                Double.isNaN(d8);
                double d21 = d20 / d8;
                double d22 = (double) (-f9);
                Double.isNaN(d22);
                double d23 = d22 * sin;
                Double.isNaN(d19);
                double d24 = d23 + (d19 * cos);
                Double.isNaN(d14);
                double d25 = d24 / d14;
                double d26 = d9 - d21;
                double d27 = d18 - d25;
                double d28 = (d9 + d21) / 2.0d;
                double d29 = (d18 + d25) / 2.0d;
                double d30 = d8;
                double d31 = (d26 * d26) + (d27 * d27);
                if (d31 != 0.0d) {
                    double d32 = (1.0d / d31) - 0.25d;
                    if (d32 < 0.0d) {
                        new StringBuilder("Points are too far apart ").append(d31);
                        float sqrt = (float) (Math.sqrt(d31) / 1.99999d);
                        f10 = f13 * sqrt;
                        f11 = f14 * sqrt;
                        f8 = f;
                        f9 = f3;
                        f12 = f7;
                        boolean z4 = z2;
                    } else {
                        double sqrt2 = Math.sqrt(d32);
                        double d33 = d26 * sqrt2;
                        double d34 = sqrt2 * d27;
                        double d35 = d5;
                        double d36 = d30;
                        boolean z5 = z2;
                        if (z == z5) {
                            d2 = d28 - d34;
                            d = d29 + d33;
                        } else {
                            d2 = d28 + d34;
                            d = d29 - d33;
                        }
                        double atan2 = Math.atan2(d18 - d, d9 - d2);
                        double atan22 = Math.atan2(d25 - d, d21 - d2) - atan2;
                        if (z5 != (atan22 >= 0.0d)) {
                            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                        }
                        Double.isNaN(d36);
                        double d37 = d2 * d36;
                        Double.isNaN(d14);
                        double d38 = d * d14;
                        a(path, (d37 * cos) - (d38 * sin), (d37 * sin) + (d38 * cos), d36, d14, d35, d13, radians, atan2, atan22);
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        public static void a(b[] bVarArr, Path path) {
            int i;
            char c;
            int i2;
            int i3;
            float[] fArr;
            int i4;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            b[] bVarArr2 = bVarArr;
            Path path2 = path;
            float[] fArr2 = new float[6];
            char c2 = 0;
            char c3 = 'm';
            int i6 = 0;
            while (i6 < bVarArr2.length) {
                char c4 = bVarArr2[i6].a;
                float[] fArr3 = bVarArr2[i6].b;
                float f14 = fArr2[c2];
                float f15 = fArr2[1];
                float f16 = fArr2[2];
                float f17 = fArr2[3];
                float f18 = fArr2[4];
                float f19 = fArr2[5];
                switch (c4) {
                    case defpackage.eu.b.bt /*65*/:
                    case 'a':
                        i = 7;
                        break;
                    case defpackage.eu.b.bv /*67*/:
                    case 'c':
                        i = 6;
                        break;
                    case defpackage.eu.b.bA /*72*/:
                    case 'V':
                    case 'h':
                    case defpackage.o.a.aF /*118*/:
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case ContentType.LIVE /*113*/:
                    case defpackage.o.a.aC /*115*/:
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path2.moveTo(f18, f19);
                        f14 = f18;
                        f16 = f14;
                        f15 = f19;
                        f17 = f15;
                        break;
                }
                i = 2;
                float f20 = f18;
                float f21 = f19;
                int i7 = 0;
                float f22 = f14;
                float f23 = f15;
                while (i7 < fArr3.length) {
                    if (c4 != 'A') {
                        if (c4 == 'C') {
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            i2 = i6;
                            int i8 = i3 + 2;
                            int i9 = i3 + 3;
                            int i10 = i3 + 4;
                            int i11 = i3 + 5;
                            path.cubicTo(fArr[i3], fArr[i3 + 1], fArr[i8], fArr[i9], fArr[i10], fArr[i11]);
                            f22 = fArr[i10];
                            f23 = fArr[i11];
                            float f24 = fArr[i8];
                            f17 = fArr[i9];
                            f16 = f24;
                        } else if (c4 == 'H') {
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            i2 = i6;
                            path2.lineTo(fArr[i3], f23);
                            f22 = fArr[i3];
                        } else if (c4 == 'Q') {
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            i2 = i6;
                            int i12 = i3 + 1;
                            int i13 = i3 + 2;
                            int i14 = i3 + 3;
                            path2.quadTo(fArr[i3], fArr[i12], fArr[i13], fArr[i14]);
                            float f25 = fArr[i3];
                            float f26 = fArr[i12];
                            f22 = fArr[i13];
                            f23 = fArr[i14];
                            f16 = f25;
                            f17 = f26;
                        } else if (c4 == 'V') {
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            i2 = i6;
                            path2.lineTo(f22, fArr[i3]);
                            f23 = fArr[i3];
                        } else if (c4 != 'a') {
                            if (c4 != 'c') {
                                if (c4 == 'h') {
                                    float f27 = f23;
                                    i2 = i6;
                                    float f28 = f22;
                                    path2.rLineTo(fArr3[i7], 0.0f);
                                    f22 = f28 + fArr3[i7];
                                } else if (c4 != 'q') {
                                    if (c4 == 'v') {
                                        f6 = f23;
                                        i2 = i6;
                                        float f29 = f22;
                                        path2.rLineTo(0.0f, fArr3[i7]);
                                        f7 = fArr3[i7];
                                    } else if (c4 != 'L') {
                                        if (c4 == 'M') {
                                            i2 = i6;
                                            f22 = fArr3[i7];
                                            int i15 = i7 + 1;
                                            f23 = fArr3[i15];
                                            if (i7 > 0) {
                                                path2.lineTo(fArr3[i7], fArr3[i15]);
                                            } else {
                                                path2.moveTo(fArr3[i7], fArr3[i15]);
                                            }
                                        } else if (c4 == 'S') {
                                            float f30 = f23;
                                            i2 = i6;
                                            float f31 = f22;
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f8 = (f30 * 2.0f) - f17;
                                                f9 = (f31 * 2.0f) - f16;
                                            } else {
                                                f8 = f30;
                                                f9 = f31;
                                            }
                                            int i16 = i7 + 1;
                                            int i17 = i7 + 2;
                                            int i18 = i7 + 3;
                                            path.cubicTo(f9, f8, fArr3[i7], fArr3[i16], fArr3[i17], fArr3[i18]);
                                            float f32 = fArr3[i7];
                                            float f33 = fArr3[i16];
                                            f22 = fArr3[i17];
                                            f23 = fArr3[i18];
                                            f17 = f33;
                                            f16 = f32;
                                        } else if (c4 == 'T') {
                                            float f34 = f23;
                                            i2 = i6;
                                            float f35 = f22;
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f34 = (f34 * 2.0f) - f17;
                                                f35 = (f35 * 2.0f) - f16;
                                            }
                                            int i19 = i7 + 1;
                                            path2.quadTo(f35, f34, fArr3[i7], fArr3[i19]);
                                            f22 = fArr3[i7];
                                            f23 = fArr3[i19];
                                            f17 = f34;
                                            i3 = i7;
                                            fArr = fArr3;
                                            c = c4;
                                            f16 = f35;
                                        } else if (c4 == 'l') {
                                            f6 = f23;
                                            i2 = i6;
                                            float f36 = f22;
                                            int i20 = i7 + 1;
                                            path2.rLineTo(fArr3[i7], fArr3[i20]);
                                            f22 = f36 + fArr3[i7];
                                            f7 = fArr3[i20];
                                        } else if (c4 == 'm') {
                                            i2 = i6;
                                            f22 += fArr3[i7];
                                            int i21 = i7 + 1;
                                            f23 += fArr3[i21];
                                            if (i7 > 0) {
                                                path2.rLineTo(fArr3[i7], fArr3[i21]);
                                            } else {
                                                path2.rMoveTo(fArr3[i7], fArr3[i21]);
                                            }
                                        } else if (c4 != 's') {
                                            if (c4 == 't') {
                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                    f12 = f22 - f16;
                                                    f13 = f23 - f17;
                                                } else {
                                                    f13 = 0.0f;
                                                    f12 = 0.0f;
                                                }
                                                int i22 = i7 + 1;
                                                path2.rQuadTo(f12, f13, fArr3[i7], fArr3[i22]);
                                                float f37 = f12 + f22;
                                                float f38 = f13 + f23;
                                                f22 += fArr3[i7];
                                                f23 += fArr3[i22];
                                                f17 = f38;
                                                f16 = f37;
                                            }
                                            i3 = i7;
                                            fArr = fArr3;
                                            c = c4;
                                            i2 = i6;
                                        } else {
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f10 = f23 - f17;
                                                f11 = f22 - f16;
                                            } else {
                                                f11 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i23 = i7 + 1;
                                            int i24 = i7 + 2;
                                            int i25 = i7 + 3;
                                            f5 = f23;
                                            i5 = i6;
                                            float f39 = f22;
                                            path.rCubicTo(f11, f10, fArr3[i7], fArr3[i23], fArr3[i24], fArr3[i25]);
                                            f = f39 + fArr3[i7];
                                            f2 = f5 + fArr3[i23];
                                            f4 = fArr3[i24] + f39;
                                            f3 = fArr3[i25];
                                        }
                                        f21 = f23;
                                        f20 = f22;
                                    } else {
                                        i2 = i6;
                                        int i26 = i7 + 1;
                                        path2.lineTo(fArr3[i7], fArr3[i26]);
                                        f22 = fArr3[i7];
                                        f23 = fArr3[i26];
                                    }
                                    f23 = f6 + f7;
                                } else {
                                    float f40 = f23;
                                    i2 = i6;
                                    float f41 = f22;
                                    int i27 = i7 + 1;
                                    int i28 = i7 + 2;
                                    int i29 = i7 + 3;
                                    path2.rQuadTo(fArr3[i7], fArr3[i27], fArr3[i28], fArr3[i29]);
                                    float f42 = fArr3[i27] + f40;
                                    float f43 = fArr3[i28] + f41;
                                    f23 = f40 + fArr3[i29];
                                    f17 = f42;
                                    f16 = f41 + fArr3[i7];
                                    i3 = i7;
                                    fArr = fArr3;
                                    c = c4;
                                    f22 = f43;
                                }
                                i3 = i7;
                                fArr = fArr3;
                                c = c4;
                            } else {
                                f5 = f23;
                                i5 = i6;
                                float f44 = f22;
                                int i30 = i7 + 2;
                                int i31 = i7 + 3;
                                int i32 = i7 + 4;
                                int i33 = i7 + 5;
                                path.rCubicTo(fArr3[i7], fArr3[i7 + 1], fArr3[i30], fArr3[i31], fArr3[i32], fArr3[i33]);
                                f = f44 + fArr3[i30];
                                f2 = f5 + fArr3[i31];
                                f4 = fArr3[i32] + f44;
                                f3 = fArr3[i33];
                            }
                            f17 = f2;
                            f16 = f;
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            f23 = f5 + f3;
                            f22 = f4;
                        } else {
                            float f45 = f23;
                            i4 = i6;
                            float f46 = f22;
                            int i34 = i7 + 5;
                            float f47 = fArr3[i34] + f46;
                            int i35 = i7 + 6;
                            float f48 = fArr3[i35] + f45;
                            float f49 = fArr3[i7];
                            float f50 = fArr3[i7 + 1];
                            float f51 = fArr3[i7 + 2];
                            boolean z = fArr3[i7 + 3] != 0.0f;
                            boolean z2 = fArr3[i7 + 4] != 0.0f;
                            i3 = i7;
                            float f52 = f51;
                            fArr = fArr3;
                            c = c4;
                            a(path, f46, f45, f47, f48, f49, f50, f52, z, z2);
                            f22 = f46 + fArr[i34];
                            f23 = f45 + fArr[i35];
                        }
                        i7 = i3 + i;
                        b[] bVarArr3 = bVarArr;
                        fArr3 = fArr;
                        i6 = i2;
                        c3 = c;
                        c4 = c3;
                    } else {
                        i3 = i7;
                        fArr = fArr3;
                        c = c4;
                        i4 = i6;
                        int i36 = i3 + 5;
                        int i37 = i3 + 6;
                        a(path, f22, f23, fArr[i36], fArr[i37], fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3] != 0.0f, fArr[i3 + 4] != 0.0f);
                        f22 = fArr[i36];
                        f23 = fArr[i37];
                    }
                    f17 = f23;
                    f16 = f22;
                    i7 = i3 + i;
                    b[] bVarArr32 = bVarArr;
                    fArr3 = fArr;
                    i6 = i2;
                    c3 = c;
                    c4 = c3;
                }
                float f53 = f23;
                int i38 = i6;
                fArr2[0] = f22;
                fArr2[1] = f53;
                fArr2[2] = f16;
                fArr2[3] = f17;
                fArr2[4] = f20;
                fArr2[5] = f21;
                i6 = i38 + 1;
                c3 = bVarArr[i38].a;
                c2 = 0;
                bVarArr2 = bVarArr;
            }
        }

        public final void a(b bVar, b bVar2, float f) {
            this.a = bVar.a;
            int i = 0;
            while (true) {
                float[] fArr = bVar.b;
                if (i < fArr.length) {
                    this.b[i] = (fArr[i] * (1.0f - f)) + (bVar2.b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static Path a(String str) {
        Path path = new Path();
        b[] b2 = b(str);
        if (b2 == null) {
            return null;
        }
        try {
            b.a(b2, path);
            return path;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Error in parsing ");
            sb.append(str);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private static void a(ArrayList<b> arrayList, char c, float[] fArr) {
        arrayList.add(new b(c, fArr));
    }

    public static boolean a(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].a != bVarArr2[i].a || bVarArr[i].b.length != bVarArr2[i].b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] a(float[] fArr, int i, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i2, length);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static b[] a(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new b(bVarArr[i]);
        }
        return bVarArr2;
    }

    public static b[] b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a2 = a(str, i);
            String trim = str.substring(i2, a2).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), c(trim));
            }
            i2 = a2;
            i = a2 + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(arrayList, str.charAt(i2), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r8 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ NumberFormatException -> 0x0082 }, LOOP:1: B:8:0x002d->B:28:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0061 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] c(java.lang.String r13) {
        /*
            r0 = 0
            char r1 = r13.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L_0x009c
            char r1 = r13.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L_0x0013
            goto L_0x009c
        L_0x0013:
            int r1 = r13.length()     // Catch:{ NumberFormatException -> 0x0082 }
            float[] r1 = new float[r1]     // Catch:{ NumberFormatException -> 0x0082 }
            ge$a r2 = new ge$a     // Catch:{ NumberFormatException -> 0x0082 }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x0082 }
            int r3 = r13.length()     // Catch:{ NumberFormatException -> 0x0082 }
            r4 = 1
            r5 = 1
            r6 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x007d
            r2.b = r0     // Catch:{ NumberFormatException -> 0x0082 }
            r7 = r5
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x002d:
            int r11 = r13.length()     // Catch:{ NumberFormatException -> 0x0082 }
            if (r7 >= r11) goto L_0x0061
            char r11 = r13.charAt(r7)     // Catch:{ NumberFormatException -> 0x0082 }
            r12 = 32
            if (r11 == r12) goto L_0x005a
            r12 = 69
            if (r11 == r12) goto L_0x0058
            r12 = 101(0x65, float:1.42E-43)
            if (r11 == r12) goto L_0x0058
            switch(r11) {
                case 44: goto L_0x005a;
                case 45: goto L_0x004f;
                case 46: goto L_0x0047;
                default: goto L_0x0046;
            }     // Catch:{ NumberFormatException -> 0x0082 }
        L_0x0046:
            goto L_0x0056
        L_0x0047:
            if (r9 != 0) goto L_0x004c
            r8 = 0
            r9 = 1
            goto L_0x005c
        L_0x004c:
            r2.b = r4     // Catch:{ NumberFormatException -> 0x0082 }
            goto L_0x005a
        L_0x004f:
            if (r7 == r5) goto L_0x0056
            if (r8 != 0) goto L_0x0056
            r2.b = r4     // Catch:{ NumberFormatException -> 0x0082 }
            goto L_0x005a
        L_0x0056:
            r8 = 0
            goto L_0x005c
        L_0x0058:
            r8 = 1
            goto L_0x005c
        L_0x005a:
            r8 = 0
            r10 = 1
        L_0x005c:
            if (r10 != 0) goto L_0x0061
            int r7 = r7 + 1
            goto L_0x002d
        L_0x0061:
            r2.a = r7     // Catch:{ NumberFormatException -> 0x0082 }
            int r7 = r2.a     // Catch:{ NumberFormatException -> 0x0082 }
            if (r5 >= r7) goto L_0x0074
            int r8 = r6 + 1
            java.lang.String r5 = r13.substring(r5, r7)     // Catch:{ NumberFormatException -> 0x0082 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x0082 }
            r1[r6] = r5     // Catch:{ NumberFormatException -> 0x0082 }
            r6 = r8
        L_0x0074:
            boolean r5 = r2.b     // Catch:{ NumberFormatException -> 0x0082 }
            if (r5 == 0) goto L_0x007a
            r5 = r7
            goto L_0x0025
        L_0x007a:
            int r5 = r7 + 1
            goto L_0x0025
        L_0x007d:
            float[] r13 = a(r1, r0, r6)     // Catch:{ NumberFormatException -> 0x0082 }
            return r13
        L_0x0082:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error in parsing \""
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r13 = "\""
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r1.<init>(r13, r0)
            throw r1
        L_0x009c:
            float[] r13 = new float[r0]
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge.c(java.lang.String):float[]");
    }
}
