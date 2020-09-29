package defpackage;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: np reason: default package */
final class np {
    private static final Comparator<a> g = new Comparator<a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((a) obj2).a() - ((a) obj).a();
        }
    };
    final int[] a;
    final int[] b;
    final List<d> c;
    private TimingLogger d = null;
    private b[] e;
    private final float[] f = new float[3];

    /* renamed from: np$a */
    class a {
        int a;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;

        a(int i2, int i3) {
            this.c = i2;
            this.a = i3;
            c();
        }

        private int f() {
            return (this.a + 1) - this.c;
        }

        /* access modifiers changed from: 0000 */
        public final int a() {
            return ((this.f - this.e) + 1) * ((this.h - this.g) + 1) * ((this.j - this.i) + 1);
        }

        /* access modifiers changed from: 0000 */
        public final boolean b() {
            return f() > 1;
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            int[] iArr = np.this.a;
            int[] iArr2 = np.this.b;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = 0;
            for (int i9 = this.c; i9 <= this.a; i9++) {
                int i10 = iArr[i9];
                i8 += iArr2[i10];
                int a2 = np.a(i10);
                int b2 = np.b(i10);
                int c2 = np.c(i10);
                if (a2 > i3) {
                    i3 = a2;
                }
                if (a2 < i2) {
                    i2 = a2;
                }
                if (b2 > i5) {
                    i5 = b2;
                }
                if (b2 < i4) {
                    i4 = b2;
                }
                if (c2 > i7) {
                    i7 = c2;
                }
                if (c2 < i6) {
                    i6 = c2;
                }
            }
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = i7;
            this.d = i8;
        }

        /* access modifiers changed from: 0000 */
        public final int d() {
            int i2 = this.f - this.e;
            int i3 = this.h - this.g;
            int i4 = this.j - this.i;
            int i5 = (i2 < i3 || i2 < i4) ? (i3 < i2 || i3 < i4) ? -1 : -2 : -3;
            int[] iArr = np.this.a;
            int[] iArr2 = np.this.b;
            np.a(iArr, i5, this.c, this.a);
            Arrays.sort(iArr, this.c, this.a + 1);
            np.a(iArr, i5, this.c, this.a);
            int i6 = this.d / 2;
            int i7 = this.c;
            int i8 = 0;
            while (true) {
                int i9 = this.a;
                if (i7 > i9) {
                    return this.c;
                }
                i8 += iArr2[iArr[i7]];
                if (i8 >= i6) {
                    return Math.min(i9 - 1, i7);
                }
                i7++;
            }
        }

        /* access modifiers changed from: 0000 */
        public final d e() {
            int[] iArr = np.this.a;
            int[] iArr2 = np.this.b;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = this.c; i6 <= this.a; i6++) {
                int i7 = iArr[i6];
                int i8 = iArr2[i7];
                i3 += i8;
                i2 += np.a(i7) * i8;
                i4 += np.b(i7) * i8;
                i5 += i8 * np.c(i7);
            }
            float f2 = (float) i3;
            return new d(np.a(Math.round(((float) i2) / f2), Math.round(((float) i4) / f2), Math.round(((float) i5) / f2)), i3);
        }
    }

    np(int[] iArr, int i, b[] bVarArr) {
        this.e = bVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int b2 = b(Color.blue(i3), 8, 5) | (b(Color.red(i3), 8, 5) << 10) | (b(Color.green(i3), 8, 5) << 5);
            iArr[i2] = b2;
            iArr2[b2] = iArr2[b2] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int d2 = d(i5);
                gd.a(d2, this.f);
                if (a(d2, this.f)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.a = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                int i8 = i6 + 1;
                iArr3[i6] = i7;
                i6 = i8;
            }
        }
        if (i4 <= i) {
            this.c = new ArrayList();
            for (int i9 : iArr3) {
                this.c.add(new d(d(i9), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, g);
        priorityQueue.offer(new a(0, this.a.length - 1));
        a(priorityQueue, i);
        this.c = a((Collection<a>) priorityQueue);
    }

    static int a(int i) {
        return (i >> 10) & 31;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(b(i, 5, 8), b(i2, 5, 8), b(i3, 5, 8));
    }

    private List<d> a(Collection<a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (a e2 : collection) {
            d e3 = e2.e();
            if (!a(e3.a, e3.a())) {
                arrayList.add(e3);
            }
        }
        return arrayList;
    }

    private static void a(PriorityQueue<a> priorityQueue, int i) {
        while (priorityQueue.size() < i) {
            a aVar = (a) priorityQueue.poll();
            if (aVar != null && aVar.b()) {
                if (aVar.b()) {
                    int d2 = aVar.d();
                    a aVar2 = new a(d2 + 1, aVar.a);
                    aVar.a = d2;
                    aVar.c();
                    priorityQueue.offer(aVar2);
                    priorityQueue.offer(aVar);
                } else {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
            } else {
                return;
            }
        }
    }

    static void a(int[] iArr, int i, int i2, int i3) {
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    while (i2 <= i3) {
                        int i4 = iArr[i2];
                        iArr[i2] = ((i4 >> 10) & 31) | ((i4 & 31) << 10) | (((i4 >> 5) & 31) << 5);
                        i2++;
                    }
                }
                return;
            }
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
                i2++;
            }
        }
    }

    private boolean a(int i, float[] fArr) {
        b[] bVarArr = this.e;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.e[i2].a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    static int b(int i) {
        return (i >> 5) & 31;
    }

    private static int b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    static int c(int i) {
        return i & 31;
    }

    private static int d(int i) {
        return a((i >> 10) & 31, (i >> 5) & 31, i & 31);
    }
}
