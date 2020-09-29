package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: bac reason: default package */
public final class bac extends azj {
    private final bdj c = new bdj();
    private final bdj d = new bdj();
    private final a e = new a();
    private Inflater f;

    /* renamed from: bac$a */
    static final class a {
        final bdj a = new bdj();
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        private final int[] h = new int[256];
        private boolean i;

        /* access modifiers changed from: 0000 */
        public void a(bdj bdj, int i2) {
            if (i2 % 5 == 2) {
                bdj.d(2);
                Arrays.fill(this.h, 0);
                int i3 = i2 / 5;
                int i4 = 0;
                while (i4 < i3) {
                    int c2 = bdj.c();
                    int c3 = bdj.c();
                    int c4 = bdj.c();
                    int c5 = bdj.c();
                    int c6 = bdj.c();
                    double d2 = (double) c3;
                    double d3 = (double) (c4 - 128);
                    Double.isNaN(d3);
                    double d4 = 1.402d * d3;
                    Double.isNaN(d2);
                    int i5 = (int) (d4 + d2);
                    int i6 = i4;
                    double d5 = (double) (c5 - 128);
                    Double.isNaN(d5);
                    double d6 = 0.34414d * d5;
                    Double.isNaN(d2);
                    double d7 = d2 - d6;
                    Double.isNaN(d3);
                    int i7 = (int) (d7 - (d3 * 0.71414d));
                    Double.isNaN(d5);
                    double d8 = d5 * 1.772d;
                    Double.isNaN(d2);
                    int i8 = (int) (d2 + d8);
                    this.h[c2] = bdw.a(i8, 0, 255) | (bdw.a(i7, 0, 255) << 8) | (c6 << 24) | (bdw.a(i5, 0, 255) << 16);
                    i4 = i6 + 1;
                }
                this.i = true;
            }
        }

        public final azi a() {
            int i2;
            int i3;
            int i4;
            if (this.b == 0 || this.c == 0 || this.f == 0 || this.g == 0 || this.a.c == 0 || this.a.b != this.a.c || !this.i) {
                return null;
            }
            this.a.c(0);
            int[] iArr = new int[(this.f * this.g)];
            int i5 = 0;
            while (i5 < iArr.length) {
                int c2 = this.a.c();
                if (c2 != 0) {
                    i4 = i5 + 1;
                    iArr[i5] = this.h[c2];
                } else {
                    int c3 = this.a.c();
                    if (c3 != 0) {
                        if ((c3 & 64) == 0) {
                            i2 = c3 & 63;
                        } else {
                            i2 = ((c3 & 63) << 8) | this.a.c();
                        }
                        if ((c3 & 128) == 0) {
                            i3 = 0;
                        } else {
                            i3 = this.h[this.a.c()];
                        }
                        i4 = i2 + i5;
                        Arrays.fill(iArr, i5, i4, i3);
                    }
                }
                i5 = i4;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f, this.g, Config.ARGB_8888);
            float f2 = (float) this.d;
            int i6 = this.b;
            float f3 = f2 / ((float) i6);
            float f4 = (float) this.e;
            int i7 = this.c;
            azi azi = new azi(createBitmap, f3, 0, f4 / ((float) i7), 0, ((float) this.f) / ((float) i6), ((float) this.g) / ((float) i7));
            return azi;
        }

        public final void b() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.a.a(0);
            this.i = false;
        }
    }

    public bac() {
        super("PgsDecoder");
    }

    public final azl a(byte[] bArr, int i, boolean z) {
        this.c.a(bArr, i);
        bdj bdj = this.c;
        if (bdj.b() > 0 && (bdj.a[bdj.b] & 255) == 120) {
            if (this.f == null) {
                this.f = new Inflater();
            }
            if (bdw.a(bdj, this.d, this.f)) {
                bdj.a(this.d.a, this.d.c);
            }
        }
        this.e.b();
        ArrayList arrayList = new ArrayList();
        while (this.c.b() >= 3) {
            bdj bdj2 = this.c;
            a aVar = this.e;
            int i2 = bdj2.c;
            int c2 = bdj2.c();
            int d2 = bdj2.d();
            int i3 = bdj2.b + d2;
            azi azi = null;
            if (i3 > i2) {
                bdj2.c(i2);
            } else {
                if (c2 != 128) {
                    switch (c2) {
                        case 20:
                            aVar.a(bdj2, d2);
                            break;
                        case 21:
                            if (d2 >= 4) {
                                bdj2.d(3);
                                int i4 = d2 - 4;
                                if ((bdj2.c() & 128) != 0) {
                                    if (i4 >= 7) {
                                        int f2 = bdj2.f();
                                        if (f2 >= 4) {
                                            aVar.f = bdj2.d();
                                            aVar.g = bdj2.d();
                                            aVar.a.a(f2 - 4);
                                            i4 -= 7;
                                        }
                                    }
                                }
                                int i5 = aVar.a.b;
                                int i6 = aVar.a.c;
                                if (i5 < i6 && i4 > 0) {
                                    int min = Math.min(i4, i6 - i5);
                                    bdj2.a(aVar.a.a, i5, min);
                                    aVar.a.c(i5 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (d2 >= 19) {
                                aVar.b = bdj2.d();
                                aVar.c = bdj2.d();
                                bdj2.d(11);
                                aVar.d = bdj2.d();
                                aVar.e = bdj2.d();
                                break;
                            }
                            break;
                    }
                } else {
                    azi = aVar.a();
                    aVar.b();
                }
                bdj2.c(i3);
            }
            if (azi != null) {
                arrayList.add(azi);
            }
        }
        return new bad(Collections.unmodifiableList(arrayList));
    }
}
