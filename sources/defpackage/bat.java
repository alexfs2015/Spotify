package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: bat reason: default package */
public final class bat extends baa {
    private final bea c = new bea();
    private final bea d = new bea();
    private final a e = new a();
    private Inflater f;

    /* renamed from: bat$a */
    static final class a {
        final bea a = new bea();
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        private final int[] h = new int[256];
        private boolean i;

        public final azz a() {
            int c2;
            if (this.b == 0 || this.c == 0 || this.f == 0 || this.g == 0 || this.a.c == 0 || this.a.b != this.a.c || !this.i) {
                return null;
            }
            this.a.c(0);
            int[] iArr = new int[(this.f * this.g)];
            int i2 = 0;
            while (i2 < iArr.length) {
                int c3 = this.a.c();
                if (c3 != 0) {
                    c2 = i2 + 1;
                    iArr[i2] = this.h[c3];
                } else {
                    int c4 = this.a.c();
                    if (c4 != 0) {
                        c2 = ((c4 & 64) == 0 ? c4 & 63 : ((c4 & 63) << 8) | this.a.c()) + i2;
                        Arrays.fill(iArr, i2, c2, (c4 & 128) == 0 ? 0 : this.h[this.a.c()]);
                    }
                }
                i2 = c2;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f, this.g, Config.ARGB_8888);
            float f2 = (float) this.d;
            int i3 = this.b;
            float f3 = f2 / ((float) i3);
            float f4 = (float) this.e;
            int i4 = this.c;
            azz azz = new azz(createBitmap, f3, 0, f4 / ((float) i4), 0, ((float) this.f) / ((float) i3), ((float) this.g) / ((float) i4));
            return azz;
        }

        /* access modifiers changed from: 0000 */
        public void a(bea bea, int i2) {
            if (i2 % 5 == 2) {
                bea.d(2);
                Arrays.fill(this.h, 0);
                int i3 = i2 / 5;
                int i4 = 0;
                while (i4 < i3) {
                    int c2 = bea.c();
                    int c3 = bea.c();
                    int c4 = bea.c();
                    int c5 = bea.c();
                    int c6 = bea.c();
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
                    this.h[c2] = ben.a(i8, 0, 255) | (ben.a(i7, 0, 255) << 8) | (c6 << 24) | (ben.a(i5, 0, 255) << 16);
                    i4 = i6 + 1;
                }
                this.i = true;
            }
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

    public bat() {
        super("PgsDecoder");
    }

    public final bac a(byte[] bArr, int i, boolean z) {
        this.c.a(bArr, i);
        bea bea = this.c;
        if (bea.b() > 0 && (bea.a[bea.b] & 255) == 120) {
            if (this.f == null) {
                this.f = new Inflater();
            }
            if (ben.a(bea, this.d, this.f)) {
                bea.a(this.d.a, this.d.c);
            }
        }
        this.e.b();
        ArrayList arrayList = new ArrayList();
        while (this.c.b() >= 3) {
            bea bea2 = this.c;
            a aVar = this.e;
            int i2 = bea2.c;
            int c2 = bea2.c();
            int d2 = bea2.d();
            int i3 = bea2.b + d2;
            azz azz = null;
            if (i3 > i2) {
                bea2.c(i2);
            } else {
                if (c2 != 128) {
                    switch (c2) {
                        case 20:
                            aVar.a(bea2, d2);
                            break;
                        case 21:
                            if (d2 >= 4) {
                                bea2.d(3);
                                int i4 = d2 - 4;
                                if ((bea2.c() & 128) != 0) {
                                    if (i4 >= 7) {
                                        int f2 = bea2.f();
                                        if (f2 >= 4) {
                                            aVar.f = bea2.d();
                                            aVar.g = bea2.d();
                                            aVar.a.a(f2 - 4);
                                            i4 -= 7;
                                        }
                                    }
                                }
                                int i5 = aVar.a.b;
                                int i6 = aVar.a.c;
                                if (i5 < i6 && i4 > 0) {
                                    int min = Math.min(i4, i6 - i5);
                                    bea2.a(aVar.a.a, i5, min);
                                    aVar.a.c(i5 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (d2 >= 19) {
                                aVar.b = bea2.d();
                                aVar.c = bea2.d();
                                bea2.d(11);
                                aVar.d = bea2.d();
                                aVar.e = bea2.d();
                                break;
                            }
                            break;
                    }
                } else {
                    azz = aVar.a();
                    aVar.b();
                }
                bea2.c(i3);
            }
            if (azz != null) {
                arrayList.add(azz);
            }
        }
        return new bau(Collections.unmodifiableList(arrayList));
    }
}
