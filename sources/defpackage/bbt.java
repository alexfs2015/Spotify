package defpackage;

import android.util.Pair;

/* renamed from: bbt reason: default package */
public abstract class bbt extends bbw {
    private a c;

    /* renamed from: bbt$a */
    public static final class a {
        final int a;
        final int[] b;
        final ayo[] c;
        @Deprecated
        private int d = this.a;
        private final int[] e;
        private final int[][][] f;
        private final ayo g;

        a(int[] iArr, ayo[] ayoArr, int[] iArr2, int[][][] iArr3, ayo ayo) {
            this.b = iArr;
            this.c = ayoArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = ayo;
            this.a = iArr.length;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Pair<arh[], bbu[]> a(a aVar, int[][][] iArr, int[] iArr2);

    public final bbx a(arg[] argArr, ayo ayo) {
        int[] iArr;
        int[] iArr2 = new int[(argArr.length + 1)];
        ayn[][] aynArr = new ayn[(argArr.length + 1)][];
        int[][][] iArr3 = new int[(argArr.length + 1)][][];
        for (int i = 0; i < aynArr.length; i++) {
            aynArr[i] = new ayn[ayo.b];
            iArr3[i] = new int[ayo.b][];
        }
        int[] iArr4 = new int[argArr.length];
        for (int i2 = 0; i2 < iArr4.length; i2++) {
            iArr4[i2] = argArr[i2].m();
        }
        for (int i3 = 0; i3 < ayo.b; i3++) {
            ayn ayn = ayo.c[i3];
            int length = argArr.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= argArr.length) {
                    i4 = length;
                    break;
                }
                arg arg = argArr[i4];
                int i6 = length;
                int i7 = i5;
                for (int i8 = 0; i8 < ayn.a; i8++) {
                    int a2 = arg.a(ayn.b[i8]) & 7;
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
            if (i4 == argArr.length) {
                iArr = new int[ayn.a];
            } else {
                arg arg2 = argArr[i4];
                int[] iArr5 = new int[ayn.a];
                for (int i9 = 0; i9 < ayn.a; i9++) {
                    iArr5[i9] = arg2.a(ayn.b[i9]);
                }
                iArr = iArr5;
            }
            int i10 = iArr2[i4];
            aynArr[i4][i10] = ayn;
            iArr3[i4][i10] = iArr;
            iArr2[i4] = iArr2[i4] + 1;
        }
        ayo[] ayoArr = new ayo[argArr.length];
        int[] iArr6 = new int[argArr.length];
        for (int i11 = 0; i11 < argArr.length; i11++) {
            int i12 = iArr2[i11];
            ayoArr[i11] = new ayo((ayn[]) ben.a((T[]) aynArr[i11], i12));
            iArr3[i11] = (int[][]) ben.a((T[]) iArr3[i11], i12);
            iArr6[i11] = argArr[i11].a();
        }
        int[] iArr7 = iArr4;
        int[][][] iArr8 = iArr3;
        a aVar = new a(iArr6, ayoArr, iArr7, iArr8, new ayo((ayn[]) ben.a((T[]) aynArr[argArr.length], iArr2[argArr.length])));
        Pair a3 = a(aVar, iArr3, iArr4);
        return new bbx((arh[]) a3.first, (bbu[]) a3.second, aVar);
    }

    public final void a(Object obj) {
        this.c = (a) obj;
    }
}
