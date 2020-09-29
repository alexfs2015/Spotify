package defpackage;

import android.util.Pair;

/* renamed from: bbc reason: default package */
public abstract class bbc extends bbf {
    private a c;

    /* renamed from: bbc$a */
    public static final class a {
        final int a;
        final int[] b;
        final axx[] c;
        @Deprecated
        private int d = this.a;
        private final int[] e;
        private final int[][][] f;
        private final axx g;

        a(int[] iArr, axx[] axxArr, int[] iArr2, int[][][] iArr3, axx axx) {
            this.b = iArr;
            this.c = axxArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = axx;
            this.a = iArr.length;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Pair<aqq[], bbd[]> a(a aVar, int[][][] iArr, int[] iArr2);

    public final void a(Object obj) {
        this.c = (a) obj;
    }

    public final bbg a(aqp[] aqpArr, axx axx) {
        int[] iArr;
        int[] iArr2 = new int[(aqpArr.length + 1)];
        axw[][] axwArr = new axw[(aqpArr.length + 1)][];
        int[][][] iArr3 = new int[(aqpArr.length + 1)][][];
        for (int i = 0; i < axwArr.length; i++) {
            axwArr[i] = new axw[axx.b];
            iArr3[i] = new int[axx.b][];
        }
        int[] iArr4 = new int[aqpArr.length];
        for (int i2 = 0; i2 < iArr4.length; i2++) {
            iArr4[i2] = aqpArr[i2].m();
        }
        for (int i3 = 0; i3 < axx.b; i3++) {
            axw axw = axx.c[i3];
            int length = aqpArr.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= aqpArr.length) {
                    i4 = length;
                    break;
                }
                aqp aqp = aqpArr[i4];
                int i6 = length;
                int i7 = i5;
                for (int i8 = 0; i8 < axw.a; i8++) {
                    int a2 = aqp.a(axw.b[i8]) & 7;
                    if (a2 > i7) {
                        if (a2 == 4) {
                            break;
                        }
                        i6 = i4;
                        i7 = a2;
                    }
                }
                i4++;
                i5 = i7;
                length = i6;
            }
            if (i4 == aqpArr.length) {
                iArr = new int[axw.a];
            } else {
                aqp aqp2 = aqpArr[i4];
                int[] iArr5 = new int[axw.a];
                for (int i9 = 0; i9 < axw.a; i9++) {
                    iArr5[i9] = aqp2.a(axw.b[i9]);
                }
                iArr = iArr5;
            }
            int i10 = iArr2[i4];
            axwArr[i4][i10] = axw;
            iArr3[i4][i10] = iArr;
            iArr2[i4] = iArr2[i4] + 1;
        }
        axx[] axxArr = new axx[aqpArr.length];
        int[] iArr6 = new int[aqpArr.length];
        for (int i11 = 0; i11 < aqpArr.length; i11++) {
            int i12 = iArr2[i11];
            axxArr[i11] = new axx((axw[]) bdw.a((T[]) axwArr[i11], i12));
            iArr3[i11] = (int[][]) bdw.a((T[]) iArr3[i11], i12);
            iArr6[i11] = aqpArr[i11].a();
        }
        int[] iArr7 = iArr4;
        int[][][] iArr8 = iArr3;
        a aVar = new a(iArr6, axxArr, iArr7, iArr8, new axx((axw[]) bdw.a((T[]) axwArr[aqpArr.length], iArr2[aqpArr.length])));
        Pair a3 = a(aVar, iArr3, iArr4);
        return new bbg((aqq[]) a3.first, (bbd[]) a3.second, aVar);
    }
}
