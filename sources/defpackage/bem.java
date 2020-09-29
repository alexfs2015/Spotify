package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bem reason: default package */
public class bem {
    private static /* synthetic */ boolean f = (!bem.class.desiredAssertionStatus());
    public int[] a;
    public long[] b;
    private final bej c;
    private boolean[] d;
    private long[] e;

    /* renamed from: bem$a */
    public static class a {
        public List<bel> a;
        public int b;

        public final void a() {
            this.a = null;
            this.b = 0;
        }
    }

    /* renamed from: bem$b */
    static class b implements Comparable<b> {
        int a;
        int b;

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            b bVar = (b) obj;
            int i = this.b;
            int i2 = bVar.b;
            if (i != i2) {
                return i - i2;
            }
            return this.a - bVar.a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.b);
            sb.append(", index=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    public static int a(long j) {
        return (int) j;
    }

    public static int b(long j) {
        return (int) (j >> 32);
    }

    private static long b(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    public bem(bej bej) {
        this.c = bej;
    }

    public final int[] a(View view, int i, LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int b2 = this.c.b();
        List e2 = e(b2);
        b bVar = new b(0);
        if (view == null || !(layoutParams instanceof bek)) {
            bVar.b = 1;
        } else {
            bVar.b = ((bek) layoutParams).c();
        }
        if (i == -1 || i == b2) {
            bVar.a = b2;
        } else if (i < this.c.b()) {
            bVar.a = i;
            while (i < b2) {
                b bVar2 = (b) e2.get(i);
                bVar2.a++;
                i++;
            }
        } else {
            bVar.a = b2;
        }
        e2.add(bVar);
        return a(b2 + 1, e2, sparseIntArray);
    }

    public final int[] a(SparseIntArray sparseIntArray) {
        int b2 = this.c.b();
        return a(b2, e(b2), sparseIntArray);
    }

    private List<b> e(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            bek bek = (bek) this.c.a(i2).getLayoutParams();
            b bVar = new b(0);
            bVar.b = bek.c();
            bVar.a = i2;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final boolean b(SparseIntArray sparseIntArray) {
        int b2 = this.c.b();
        if (sparseIntArray.size() != b2) {
            return true;
        }
        for (int i = 0; i < b2; i++) {
            View a2 = this.c.a(i);
            if (a2 != null && ((bek) a2.getLayoutParams()).c() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    private static int[] a(int i, List<b> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (b bVar : list) {
            iArr[i2] = bVar.a;
            sparseIntArray.append(bVar.a, bVar.b);
            i2++;
        }
        return iArr;
    }

    public final void a(a aVar, int i, int i2, int i3, int i4, List<bel> list) {
        a(aVar, i, i2, i3, i4, -1, list);
    }

    public final void b(a aVar, int i, int i2, int i3, int i4, List<bel> list) {
        a(aVar, i, i2, i3, 0, i4, list);
    }

    public final void a(a aVar, int i, int i2) {
        a(aVar, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    public final void c(a aVar, int i, int i2, int i3, int i4, List<bel> list) {
        a(aVar, i2, i, i3, i4, -1, list);
    }

    public final void d(a aVar, int i, int i2, int i3, int i4, List<bel> list) {
        a(aVar, i2, i, i3, 0, i4, list);
    }

    public final void a(a aVar, int i, int i2, int i3, int i4, int i5, List<bel> list) {
        int i6;
        int i7;
        a aVar2;
        int i8;
        int i9;
        List<bel> list2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View view;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        bel bel;
        a aVar3 = aVar;
        int i20 = i;
        int i21 = i2;
        int i22 = i5;
        boolean j = this.c.j();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        List<bel> arrayList = list == null ? new ArrayList<>() : list;
        aVar3.a = arrayList;
        boolean z = i22 == -1;
        int a2 = a(j);
        int b2 = b(j);
        int c2 = c(j);
        int d2 = d(j);
        bel bel2 = new bel();
        int i23 = i4;
        bel2.o = i23;
        int i24 = b2 + a2;
        bel2.e = i24;
        int b3 = this.c.b();
        boolean z2 = z;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = Integer.MIN_VALUE;
        while (true) {
            if (i6 >= b3) {
                i7 = i26;
                aVar2 = aVar;
                break;
            }
            View b4 = this.c.b(i6);
            if (b4 == null) {
                if (a(i6, b3, bel2)) {
                    a(arrayList, bel2, i6, i25);
                }
            } else if (b4.getVisibility() == 8) {
                bel2.i++;
                bel2.h++;
                if (a(i6, b3, bel2)) {
                    a(arrayList, bel2, i6, i25);
                }
            } else {
                bek bek = (bek) b4.getLayoutParams();
                int i29 = b3;
                if (bek.f() == 4) {
                    bel2.n.add(Integer.valueOf(i6));
                }
                int a3 = a(bek, j);
                if (bek.l() != -1.0f && mode == 1073741824) {
                    a3 = Math.round(((float) size) * bek.l());
                }
                if (j) {
                    int a_ = this.c.a_(i20, i24 + c(bek, true) + d(bek, true), a3);
                    i9 = size;
                    i8 = mode;
                    int b5 = this.c.b(i21, c2 + d2 + e(bek, true) + f(bek, true) + i25, b(bek, true));
                    b4.measure(a_, b5);
                    a(i6, a_, b5, b4);
                    i14 = a_;
                } else {
                    i9 = size;
                    i8 = mode;
                    int a_2 = this.c.a_(i21, c2 + d2 + e(bek, false) + f(bek, false) + i25, b(bek, false));
                    int b6 = this.c.b(i20, c(bek, false) + i24 + d(bek, false), a3);
                    b4.measure(a_2, b6);
                    a(i6, a_2, b6, b4);
                    i14 = b6;
                }
                this.c.a(i6, b4);
                a(b4, i6);
                i26 = View.combineMeasuredStates(i26, b4.getMeasuredState());
                int i30 = i25;
                int i31 = i29;
                bel bel3 = bel2;
                int i32 = i24;
                int i33 = i6;
                View view2 = b4;
                list2 = arrayList;
                int i34 = i33;
                int i35 = i14;
                if (a(b4, i8, i9, bel2.e, d(bek, j) + a(b4, j) + c(bek, j), bek, i33, i27, arrayList.size())) {
                    if (bel3.a() > 0) {
                        if (i34 > 0) {
                            i19 = i34 - 1;
                            bel = bel3;
                        } else {
                            bel = bel3;
                            i19 = 0;
                        }
                        a(list2, bel, i19, i30);
                        i18 = bel.g + i30;
                    } else {
                        i18 = i30;
                    }
                    if (!j) {
                        i12 = i2;
                        view = view2;
                        i6 = i34;
                        int i36 = i35;
                        if (bek.a() == -1) {
                            bej bej = this.c;
                            view.measure(bej.a_(i12, bej.getPaddingLeft() + this.c.getPaddingRight() + bek.m() + bek.o() + i18, bek.a()), i36);
                            a(view, i6);
                        }
                    } else if (bek.b() == -1) {
                        bej bej2 = this.c;
                        i12 = i2;
                        i6 = i34;
                        view = view2;
                        view.measure(i35, bej2.b(i12, bej2.getPaddingTop() + this.c.getPaddingBottom() + bek.n() + bek.p() + i18, bek.b()));
                        a(view, i6);
                    } else {
                        i12 = i2;
                        view = view2;
                        i6 = i34;
                    }
                    bel2 = new bel();
                    bel2.h = 1;
                    i11 = i32;
                    bel2.e = i11;
                    bel2.o = i6;
                    i30 = i18;
                    i16 = Integer.MIN_VALUE;
                    i15 = 0;
                } else {
                    i12 = i2;
                    view = view2;
                    i6 = i34;
                    bel2 = bel3;
                    i11 = i32;
                    bel2.h++;
                    i15 = i27 + 1;
                    i16 = i28;
                }
                int[] iArr = this.a;
                if (iArr != null) {
                    iArr[i6] = list2.size();
                }
                bel2.e += a(view, j) + c(bek, j) + d(bek, j);
                bel2.j += bek.d();
                bel2.k += bek.e();
                this.c.a(view, i6, i15, bel2);
                int max = Math.max(i16, b(view, j) + e(bek, j) + f(bek, j) + this.c.a_(view));
                bel2.g = Math.max(bel2.g, max);
                if (j) {
                    if (this.c.g() != 2) {
                        bel2.l = Math.max(bel2.l, view.getBaseline() + bek.n());
                    } else {
                        bel2.l = Math.max(bel2.l, (view.getMeasuredHeight() - view.getBaseline()) + bek.p());
                    }
                }
                i13 = i29;
                if (a(i6, i13, bel2)) {
                    a(list2, bel2, i6, i30);
                    i30 += bel2.g;
                }
                i10 = i5;
                if (i10 != -1 && list2.size() > 0) {
                    if (((bel) list2.get(list2.size() - 1)).p >= i10 && i6 >= i10 && !z2) {
                        i17 = -bel2.g;
                        z2 = true;
                        if (i17 <= i3 && z2) {
                            aVar2 = aVar;
                            i7 = i26;
                            break;
                        }
                        i28 = max;
                        i27 = i15;
                        i25 = i17;
                        i23 = i6 + 1;
                        a aVar4 = aVar;
                        i20 = i;
                        b3 = i13;
                        i21 = i12;
                        i24 = i11;
                        arrayList = list2;
                        mode = i8;
                        i22 = i10;
                        size = i9;
                    }
                }
                i17 = i30;
                if (i17 <= i3) {
                }
                i28 = max;
                i27 = i15;
                i25 = i17;
                i23 = i6 + 1;
                a aVar42 = aVar;
                i20 = i;
                b3 = i13;
                i21 = i12;
                i24 = i11;
                arrayList = list2;
                mode = i8;
                i22 = i10;
                size = i9;
            }
            int i37 = i3;
            i9 = size;
            i8 = mode;
            i12 = i21;
            i10 = i22;
            list2 = arrayList;
            i11 = i24;
            i13 = b3;
            i23 = i6 + 1;
            a aVar422 = aVar;
            i20 = i;
            b3 = i13;
            i21 = i12;
            i24 = i11;
            arrayList = list2;
            mode = i8;
            i22 = i10;
            size = i9;
        }
        aVar2.b = i7;
    }

    private int a(boolean z) {
        if (z) {
            return this.c.getPaddingStart();
        }
        return this.c.getPaddingTop();
    }

    private int b(boolean z) {
        if (z) {
            return this.c.getPaddingEnd();
        }
        return this.c.getPaddingBottom();
    }

    private int c(boolean z) {
        if (z) {
            return this.c.getPaddingTop();
        }
        return this.c.getPaddingStart();
    }

    private int d(boolean z) {
        if (z) {
            return this.c.getPaddingBottom();
        }
        return this.c.getPaddingEnd();
    }

    private static int a(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static int b(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private static int a(bek bek, boolean z) {
        if (z) {
            return bek.a();
        }
        return bek.b();
    }

    private static int b(bek bek, boolean z) {
        if (z) {
            return bek.b();
        }
        return bek.a();
    }

    private static int c(bek bek, boolean z) {
        if (z) {
            return bek.m();
        }
        return bek.n();
    }

    private static int d(bek bek, boolean z) {
        if (z) {
            return bek.o();
        }
        return bek.p();
    }

    private static int e(bek bek, boolean z) {
        if (z) {
            return bek.n();
        }
        return bek.m();
    }

    private static int f(bek bek, boolean z) {
        if (z) {
            return bek.p();
        }
        return bek.o();
    }

    private boolean a(View view, int i, int i2, int i3, int i4, bek bek, int i5, int i6, int i7) {
        if (this.c.g() == 0) {
            return false;
        }
        if (bek.k()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int m = this.c.m();
        if (m != -1 && m <= i7 + 1) {
            return false;
        }
        int a2 = this.c.a(view, i5, i6);
        if (a2 > 0) {
            i4 += a2;
        }
        if (i2 < i3 + i4) {
            return true;
        }
        return false;
    }

    private static boolean a(int i, int i2, bel bel) {
        return i == i2 - 1 && bel.a() != 0;
    }

    private void a(List<bel> list, bel bel, int i, int i2) {
        bel.m = i2;
        this.c.a(bel);
        bel.p = i;
        list.add(bel);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            bek r0 = (defpackage.bek) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.g()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.g()
        L_0x0019:
            r3 = 1
            goto L_0x0027
        L_0x001b:
            int r3 = r0.i()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.i()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.h()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.h()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.j()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.j()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.a(r8, r1, r0, r7)
            bej r0 = r6.c
            r0.a(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bem.a(android.view.View, int):void");
    }

    public final void a(int i, int i2) {
        a(i, i2, 0);
    }

    public final void a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        f(this.c.b());
        if (i3 < this.c.b()) {
            int c2 = this.c.c();
            int c3 = this.c.c();
            if (c3 == 0 || c3 == 1) {
                int mode = MeasureSpec.getMode(i);
                int size = MeasureSpec.getSize(i);
                if (mode != 1073741824) {
                    size = this.c.k();
                }
                i6 = this.c.getPaddingLeft();
                i4 = this.c.getPaddingRight();
            } else if (c3 == 2 || c3 == 3) {
                int mode2 = MeasureSpec.getMode(i2);
                i5 = MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.c.k();
                }
                i6 = this.c.getPaddingTop();
                i4 = this.c.getPaddingBottom();
            } else {
                StringBuilder sb = new StringBuilder("Invalid flex direction: ");
                sb.append(c2);
                throw new IllegalArgumentException(sb.toString());
            }
            int i7 = i6 + i4;
            int i8 = 0;
            int[] iArr = this.a;
            if (iArr != null) {
                i8 = iArr[i3];
            }
            List n = this.c.n();
            int size2 = n.size();
            for (int i9 = i8; i9 < size2; i9++) {
                bel bel = (bel) n.get(i9);
                if (bel.e < i5) {
                    a(i, i2, bel, i5, i7, false);
                } else {
                    b(i, i2, bel, i5, i7, false);
                }
            }
        }
    }

    private void f(int i) {
        boolean[] zArr = this.d;
        if (zArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.d = new boolean[i];
        } else if (zArr.length < i) {
            int length = zArr.length << 1;
            if (length >= i) {
                i = length;
            }
            this.d = new boolean[i];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void a(int i, int i2, bel bel, int i3, int i4, boolean z) {
        float f2;
        int i5;
        int i6;
        int i7;
        double d2;
        double d3;
        bel bel2 = bel;
        int i8 = i3;
        int i9 = 1;
        boolean z2 = z;
        while (bel2.j > 0.0f && i8 >= bel2.e) {
            int i10 = bel2.e;
            float f3 = ((float) (i8 - bel2.e)) / bel2.j;
            bel2.e = i4 + bel2.f;
            if (!z2) {
                bel2.g = Integer.MIN_VALUE;
            }
            int i11 = 0;
            boolean z3 = false;
            float f4 = 0.0f;
            int i12 = 0;
            while (i11 < bel2.h) {
                int i13 = bel2.o + i11;
                View b2 = this.c.b(i13);
                if (b2 == null || b2.getVisibility() == 8) {
                    int i14 = i2;
                    f2 = f3;
                    int i15 = i;
                } else {
                    bek bek = (bek) b2.getLayoutParams();
                    int c2 = this.c.c();
                    if (c2 == 0 || c2 == i9) {
                        f2 = f3;
                        int i16 = i;
                        int measuredWidth = b2.getMeasuredWidth();
                        long[] jArr = this.e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i13];
                        }
                        int measuredHeight = b2.getMeasuredHeight();
                        long[] jArr2 = this.e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i13] >> 32);
                        }
                        if (this.d[i13] || bek.d() <= 0.0f) {
                            int i17 = i2;
                            i7 = measuredWidth;
                            i6 = measuredHeight;
                        } else {
                            float d4 = ((float) measuredWidth) + (bek.d() * f2);
                            if (i11 == bel2.h - 1) {
                                d4 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(d4);
                            if (round > bek.i()) {
                                round = bek.i();
                                this.d[i13] = true;
                                bel2.j -= bek.d();
                                z3 = true;
                            } else {
                                f4 += d4 - ((float) round);
                                double d5 = (double) f4;
                                if (d5 > 1.0d) {
                                    round++;
                                    Double.isNaN(d5);
                                    d2 = d5 - 1.0d;
                                } else if (d5 < -1.0d) {
                                    round--;
                                    Double.isNaN(d5);
                                    d2 = d5 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int b3 = b(i2, bek, bel2.m);
                            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(round, 1073741824);
                            b2.measure(makeMeasureSpec, b3);
                            i7 = b2.getMeasuredWidth();
                            i6 = b2.getMeasuredHeight();
                            a(i13, makeMeasureSpec, b3, b2);
                            this.c.a(i13, b2);
                        }
                        i5 = Math.max(i12, i6 + bek.n() + bek.p() + this.c.a_(b2));
                        bel2.e += i7 + bek.m() + bek.o();
                    } else {
                        int measuredHeight2 = b2.getMeasuredHeight();
                        long[] jArr3 = this.e;
                        if (jArr3 != null) {
                            measuredHeight2 = (int) (jArr3[i13] >> 32);
                        }
                        int measuredWidth2 = b2.getMeasuredWidth();
                        long[] jArr4 = this.e;
                        f2 = f3;
                        if (jArr4 != null) {
                            measuredWidth2 = (int) jArr4[i13];
                        }
                        if (this.d[i13] || bek.d() <= 0.0f) {
                            int i18 = i;
                        } else {
                            float d6 = ((float) measuredHeight2) + (f2 * bek.d());
                            if (i11 == bel2.h - 1) {
                                d6 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(d6);
                            if (round2 > bek.j()) {
                                round2 = bek.j();
                                this.d[i13] = true;
                                bel2.j -= bek.d();
                                z3 = true;
                            } else {
                                f4 += d6 - ((float) round2);
                                double d7 = (double) f4;
                                if (d7 > 1.0d) {
                                    round2++;
                                    Double.isNaN(d7);
                                    d3 = d7 - 1.0d;
                                } else if (d7 < -1.0d) {
                                    round2--;
                                    Double.isNaN(d7);
                                    d3 = d7 + 1.0d;
                                }
                                f4 = (float) d3;
                            }
                            int a2 = a(i, bek, bel2.m);
                            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            b2.measure(a2, makeMeasureSpec2);
                            measuredWidth2 = b2.getMeasuredWidth();
                            measuredHeight2 = b2.getMeasuredHeight();
                            a(i13, a2, makeMeasureSpec2, b2);
                            this.c.a(i13, b2);
                        }
                        i5 = Math.max(i12, measuredWidth2 + bek.m() + bek.o() + this.c.a_(b2));
                        bel2.e += measuredHeight2 + bek.n() + bek.p();
                        int i19 = i2;
                    }
                    bel2.g = Math.max(bel2.g, i5);
                    i12 = i5;
                }
                i11++;
                f3 = f2;
                i9 = 1;
            }
            int i20 = i;
            int i21 = i2;
            if (z3 && i10 != bel2.e) {
                i9 = 1;
                z2 = true;
            } else {
                return;
            }
        }
    }

    private void b(int i, int i2, bel bel, int i3, int i4, boolean z) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        bel bel2 = bel;
        int i8 = i3;
        int i9 = 1;
        boolean z4 = z;
        while (true) {
            int i10 = bel2.e;
            if (bel2.k > 0.0f && i8 <= bel2.e) {
                float f2 = ((float) (bel2.e - i8)) / bel2.k;
                bel2.e = i4 + bel2.f;
                if (!z4) {
                    bel2.g = Integer.MIN_VALUE;
                }
                int i11 = 0;
                boolean z5 = false;
                float f3 = 0.0f;
                int i12 = 0;
                while (i11 < bel2.h) {
                    int i13 = bel2.o + i11;
                    View b2 = this.c.b(i13);
                    if (b2 == null || b2.getVisibility() == 8) {
                        int i14 = i2;
                        z2 = z5;
                    } else {
                        bek bek = (bek) b2.getLayoutParams();
                        int c2 = this.c.c();
                        if (c2 == 0 || c2 == i9) {
                            boolean z6 = z5;
                            int measuredWidth = b2.getMeasuredWidth();
                            long[] jArr = this.e;
                            if (jArr != null) {
                                measuredWidth = (int) jArr[i13];
                            }
                            int measuredHeight = b2.getMeasuredHeight();
                            long[] jArr2 = this.e;
                            if (jArr2 != null) {
                                measuredHeight = (int) (jArr2[i13] >> 32);
                            }
                            if (this.d[i13] || bek.e() <= 0.0f) {
                                int i15 = i2;
                                i7 = measuredWidth;
                                i6 = measuredHeight;
                            } else {
                                float e2 = ((float) measuredWidth) - (bek.e() * f2);
                                if (i11 == bel2.h - 1) {
                                    e2 += f3;
                                    f3 = 0.0f;
                                }
                                int round = Math.round(e2);
                                if (round < bek.g()) {
                                    round = bek.g();
                                    this.d[i13] = true;
                                    bel2.k -= bek.e();
                                    z6 = true;
                                } else {
                                    f3 += e2 - ((float) round);
                                    double d2 = (double) f3;
                                    if (d2 > 1.0d) {
                                        round++;
                                        f3 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round--;
                                        f3 += 1.0f;
                                    }
                                }
                                int b3 = b(i2, bek, bel2.m);
                                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(round, 1073741824);
                                b2.measure(makeMeasureSpec, b3);
                                i7 = b2.getMeasuredWidth();
                                i6 = b2.getMeasuredHeight();
                                a(i13, makeMeasureSpec, b3, b2);
                                this.c.a(i13, b2);
                            }
                            i5 = Math.max(i12, i6 + bek.n() + bek.p() + this.c.a_(b2));
                            bel2.e += i7 + bek.m() + bek.o();
                        } else {
                            int measuredHeight2 = b2.getMeasuredHeight();
                            long[] jArr3 = this.e;
                            if (jArr3 != null) {
                                measuredHeight2 = (int) (jArr3[i13] >> 32);
                            }
                            int measuredWidth2 = b2.getMeasuredWidth();
                            long[] jArr4 = this.e;
                            z2 = z5;
                            if (jArr4 != null) {
                                measuredWidth2 = (int) jArr4[i13];
                            }
                            if (!this.d[i13] && bek.e() > 0.0f) {
                                float e3 = ((float) measuredHeight2) - (bek.e() * f2);
                                if (i11 == bel2.h - 1) {
                                    e3 += f3;
                                    f3 = 0.0f;
                                }
                                int round2 = Math.round(e3);
                                if (round2 < bek.h()) {
                                    round2 = bek.h();
                                    this.d[i13] = true;
                                    bel2.k -= bek.e();
                                    z3 = true;
                                } else {
                                    f3 += e3 - ((float) round2);
                                    double d3 = (double) f3;
                                    if (d3 > 1.0d) {
                                        round2++;
                                        f3 -= 1.0f;
                                    } else if (d3 < -1.0d) {
                                        round2--;
                                        f3 += 1.0f;
                                    }
                                    z3 = z2;
                                }
                                int a2 = a(i, bek, bel2.m);
                                int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                b2.measure(a2, makeMeasureSpec2);
                                measuredWidth2 = b2.getMeasuredWidth();
                                int measuredHeight3 = b2.getMeasuredHeight();
                                a(i13, a2, makeMeasureSpec2, b2);
                                this.c.a(i13, b2);
                                z2 = z3;
                                measuredHeight2 = measuredHeight3;
                            }
                            i5 = Math.max(i12, measuredWidth2 + bek.m() + bek.o() + this.c.a_(b2));
                            bel2.e += measuredHeight2 + bek.n() + bek.p();
                            int i16 = i2;
                        }
                        bel2.g = Math.max(bel2.g, i5);
                        i12 = i5;
                    }
                    i11++;
                    z5 = z2;
                    i9 = 1;
                }
                int i17 = i2;
                if (z5 && i10 != bel2.e) {
                    i9 = 1;
                    z4 = true;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private int a(int i, bek bek, int i2) {
        bej bej = this.c;
        int a_ = bej.a_(i, bej.getPaddingLeft() + this.c.getPaddingRight() + bek.m() + bek.o() + i2, bek.a());
        int size = MeasureSpec.getSize(a_);
        if (size > bek.i()) {
            return MeasureSpec.makeMeasureSpec(bek.i(), MeasureSpec.getMode(a_));
        }
        return size < bek.g() ? MeasureSpec.makeMeasureSpec(bek.g(), MeasureSpec.getMode(a_)) : a_;
    }

    private int b(int i, bek bek, int i2) {
        bej bej = this.c;
        int b2 = bej.b(i, bej.getPaddingTop() + this.c.getPaddingBottom() + bek.n() + bek.p() + i2, bek.b());
        int size = MeasureSpec.getSize(b2);
        if (size > bek.j()) {
            return MeasureSpec.makeMeasureSpec(bek.j(), MeasureSpec.getMode(b2));
        }
        return size < bek.h() ? MeasureSpec.makeMeasureSpec(bek.h(), MeasureSpec.getMode(b2)) : b2;
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        int i5;
        int c2 = this.c.c();
        if (c2 == 0 || c2 == 1) {
            i5 = MeasureSpec.getMode(i2);
            i4 = MeasureSpec.getSize(i2);
        } else if (c2 == 2 || c2 == 3) {
            int mode = MeasureSpec.getMode(i);
            i4 = MeasureSpec.getSize(i);
            i5 = mode;
        } else {
            StringBuilder sb = new StringBuilder("Invalid flex direction: ");
            sb.append(c2);
            throw new IllegalArgumentException(sb.toString());
        }
        List<bel> n = this.c.n();
        if (i5 == 1073741824) {
            int l = this.c.l() + i3;
            int i6 = 0;
            if (n.size() == 1) {
                ((bel) n.get(0)).g = i4 - i3;
            } else if (n.size() >= 2) {
                int h = this.c.h();
                if (h == 1) {
                    int i7 = i4 - l;
                    bel bel = new bel();
                    bel.g = i7;
                    n.add(0, bel);
                } else if (h == 2) {
                    this.c.a(a(n, i4, l));
                } else if (h != 3) {
                    if (h != 4) {
                        if (h == 5 && l < i4) {
                            float size = ((float) (i4 - l)) / ((float) n.size());
                            int size2 = n.size();
                            float f2 = 0.0f;
                            while (i6 < size2) {
                                bel bel2 = (bel) n.get(i6);
                                float f3 = ((float) bel2.g) + size;
                                if (i6 == n.size() - 1) {
                                    f3 += f2;
                                    f2 = 0.0f;
                                }
                                int round = Math.round(f3);
                                f2 += f3 - ((float) round);
                                if (f2 > 1.0f) {
                                    round++;
                                    f2 -= 1.0f;
                                } else if (f2 < -1.0f) {
                                    round--;
                                    f2 += 1.0f;
                                }
                                bel2.g = round;
                                i6++;
                            }
                        }
                    } else if (l >= i4) {
                        this.c.a(a(n, i4, l));
                    } else {
                        int size3 = (i4 - l) / (n.size() << 1);
                        ArrayList arrayList = new ArrayList();
                        bel bel3 = new bel();
                        bel3.g = size3;
                        for (bel bel4 : n) {
                            arrayList.add(bel3);
                            arrayList.add(bel4);
                            arrayList.add(bel3);
                        }
                        this.c.a((List<bel>) arrayList);
                    }
                } else if (l < i4) {
                    float size4 = ((float) (i4 - l)) / ((float) (n.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size5 = n.size();
                    float f4 = 0.0f;
                    while (i6 < size5) {
                        arrayList2.add((bel) n.get(i6));
                        if (i6 != n.size() - 1) {
                            bel bel5 = new bel();
                            if (i6 == n.size() - 2) {
                                bel5.g = Math.round(f4 + size4);
                                f4 = 0.0f;
                            } else {
                                bel5.g = Math.round(size4);
                            }
                            f4 += size4 - ((float) bel5.g);
                            if (f4 > 1.0f) {
                                bel5.g++;
                                f4 -= 1.0f;
                            } else if (f4 < -1.0f) {
                                bel5.g--;
                                f4 += 1.0f;
                            }
                            arrayList2.add(bel5);
                        }
                        i6++;
                    }
                    this.c.a((List<bel>) arrayList2);
                }
            }
        }
    }

    private static List<bel> a(List<bel> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        bel bel = new bel();
        bel.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(bel);
            }
            arrayList.add((bel) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(bel);
            }
        }
        return arrayList;
    }

    public final void a() {
        a(0);
    }

    public final void a(int i) {
        int i2 = i;
        if (i2 < this.c.b()) {
            int c2 = this.c.c();
            String str = "Invalid flex direction: ";
            if (this.c.i() == 4) {
                int[] iArr = this.a;
                List n = this.c.n();
                int size = n.size();
                for (int i3 = iArr != null ? iArr[i2] : 0; i3 < size; i3++) {
                    bel bel = (bel) n.get(i3);
                    int i4 = bel.h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = bel.o + i5;
                        if (i5 < this.c.b()) {
                            View b2 = this.c.b(i6);
                            if (!(b2 == null || b2.getVisibility() == 8)) {
                                bek bek = (bek) b2.getLayoutParams();
                                if (bek.f() == -1 || bek.f() == 4) {
                                    if (c2 == 0 || c2 == 1) {
                                        a(b2, bel.g, i6);
                                    } else if (c2 == 2 || c2 == 3) {
                                        b(b2, bel.g, i6);
                                    } else {
                                        StringBuilder sb = new StringBuilder(str);
                                        sb.append(c2);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (bel bel2 : this.c.n()) {
                Iterator it = bel2.n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View b3 = this.c.b(num.intValue());
                        if (c2 == 0 || c2 == 1) {
                            a(b3, bel2.g, num.intValue());
                        } else if (c2 == 2 || c2 == 3) {
                            b(b3, bel2.g, num.intValue());
                        } else {
                            StringBuilder sb2 = new StringBuilder(str);
                            sb2.append(c2);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                }
            }
        }
    }

    private void a(View view, int i, int i2) {
        int i3;
        bek bek = (bek) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bek.n()) - bek.p()) - this.c.a_(view), bek.h()), bek.j());
        long[] jArr = this.e;
        if (jArr != null) {
            i3 = (int) jArr[i2];
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        a(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.c.a(i2, view);
    }

    private void b(View view, int i, int i2) {
        int i3;
        bek bek = (bek) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bek.m()) - bek.o()) - this.c.a_(view), bek.g()), bek.i());
        long[] jArr = this.e;
        if (jArr != null) {
            i3 = (int) (jArr[i2] >> 32);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        a(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.c.a(i2, view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r1 != 4) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r6, defpackage.bel r7, int r8, int r9, int r10, int r11) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            bek r0 = (defpackage.bek) r0
            bej r1 = r5.c
            int r1 = r1.i()
            int r2 = r0.f()
            r3 = -1
            if (r2 == r3) goto L_0x0017
            int r1 = r0.f()
        L_0x0017:
            int r2 = r7.g
            r3 = 2
            if (r1 == 0) goto L_0x00c2
            r4 = 1
            if (r1 == r4) goto L_0x008b
            if (r1 == r3) goto L_0x005f
            r2 = 3
            if (r1 == r2) goto L_0x0028
            r7 = 4
            if (r1 == r7) goto L_0x00c2
            goto L_0x008a
        L_0x0028:
            bej r1 = r5.c
            int r1 = r1.g()
            if (r1 == r3) goto L_0x0045
            int r7 = r7.l
            int r1 = r6.getBaseline()
            int r7 = r7 - r1
            int r0 = r0.n()
            int r7 = java.lang.Math.max(r7, r0)
            int r9 = r9 + r7
            int r11 = r11 + r7
            r6.layout(r8, r9, r10, r11)
            return
        L_0x0045:
            int r7 = r7.l
            int r1 = r6.getMeasuredHeight()
            int r7 = r7 - r1
            int r1 = r6.getBaseline()
            int r7 = r7 + r1
            int r0 = r0.p()
            int r7 = java.lang.Math.max(r7, r0)
            int r9 = r9 - r7
            int r11 = r11 - r7
            r6.layout(r8, r9, r10, r11)
            return
        L_0x005f:
            int r7 = r6.getMeasuredHeight()
            int r2 = r2 - r7
            int r7 = r0.n()
            int r2 = r2 + r7
            int r7 = r0.p()
            int r2 = r2 - r7
            int r2 = r2 / r3
            bej r7 = r5.c
            int r7 = r7.g()
            if (r7 == r3) goto L_0x0081
            int r9 = r9 + r2
            int r7 = r6.getMeasuredHeight()
            int r7 = r7 + r9
            r6.layout(r8, r9, r10, r7)
            return
        L_0x0081:
            int r9 = r9 - r2
            int r7 = r6.getMeasuredHeight()
            int r7 = r7 + r9
            r6.layout(r8, r9, r10, r7)
        L_0x008a:
            return
        L_0x008b:
            bej r7 = r5.c
            int r7 = r7.g()
            if (r7 == r3) goto L_0x00a8
            int r9 = r9 + r2
            int r7 = r6.getMeasuredHeight()
            int r7 = r9 - r7
            int r11 = r0.p()
            int r7 = r7 - r11
            int r11 = r0.p()
            int r9 = r9 - r11
            r6.layout(r8, r7, r10, r9)
            return
        L_0x00a8:
            int r9 = r9 - r2
            int r7 = r6.getMeasuredHeight()
            int r9 = r9 + r7
            int r7 = r0.n()
            int r9 = r9 + r7
            int r11 = r11 - r2
            int r7 = r6.getMeasuredHeight()
            int r11 = r11 + r7
            int r7 = r0.n()
            int r11 = r11 + r7
            r6.layout(r8, r9, r10, r11)
            return
        L_0x00c2:
            bej r7 = r5.c
            int r7 = r7.g()
            if (r7 == r3) goto L_0x00d8
            int r7 = r0.n()
            int r9 = r9 + r7
            int r7 = r0.n()
            int r11 = r11 + r7
            r6.layout(r8, r9, r10, r11)
            return
        L_0x00d8:
            int r7 = r0.p()
            int r9 = r9 - r7
            int r7 = r0.p()
            int r11 = r11 - r7
            r6.layout(r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bem.a(android.view.View, bel, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r1 != 4) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r5, defpackage.bel r6, boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            bek r0 = (defpackage.bek) r0
            bej r1 = r4.c
            int r1 = r1.i()
            int r2 = r0.f()
            r3 = -1
            if (r2 == r3) goto L_0x0017
            int r1 = r0.f()
        L_0x0017:
            int r6 = r6.g
            if (r1 == 0) goto L_0x0082
            r2 = 1
            if (r1 == r2) goto L_0x004c
            r2 = 2
            if (r1 == r2) goto L_0x0028
            r6 = 3
            if (r1 == r6) goto L_0x0082
            r6 = 4
            if (r1 == r6) goto L_0x0082
            goto L_0x004b
        L_0x0028:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r5.getMeasuredWidth()
            int r6 = r6 - r1
            int r1 = defpackage.ia.a(r0)
            int r6 = r6 + r1
            int r0 = defpackage.ia.b(r0)
            int r6 = r6 - r0
            int r6 = r6 / r2
            if (r7 != 0) goto L_0x0046
            int r8 = r8 + r6
            int r10 = r10 + r6
            r5.layout(r8, r9, r10, r11)
            return
        L_0x0046:
            int r8 = r8 - r6
            int r10 = r10 - r6
            r5.layout(r8, r9, r10, r11)
        L_0x004b:
            return
        L_0x004c:
            if (r7 != 0) goto L_0x0068
            int r8 = r8 + r6
            int r7 = r5.getMeasuredWidth()
            int r8 = r8 - r7
            int r7 = r0.o()
            int r8 = r8 - r7
            int r10 = r10 + r6
            int r6 = r5.getMeasuredWidth()
            int r10 = r10 - r6
            int r6 = r0.o()
            int r10 = r10 - r6
            r5.layout(r8, r9, r10, r11)
            return
        L_0x0068:
            int r8 = r8 - r6
            int r7 = r5.getMeasuredWidth()
            int r8 = r8 + r7
            int r7 = r0.m()
            int r8 = r8 + r7
            int r10 = r10 - r6
            int r6 = r5.getMeasuredWidth()
            int r10 = r10 + r6
            int r6 = r0.m()
            int r10 = r10 + r6
            r5.layout(r8, r9, r10, r11)
            return
        L_0x0082:
            if (r7 != 0) goto L_0x0092
            int r6 = r0.m()
            int r8 = r8 + r6
            int r6 = r0.m()
            int r10 = r10 + r6
            r5.layout(r8, r9, r10, r11)
            return
        L_0x0092:
            int r6 = r0.o()
            int r8 = r8 - r6
            int r6 = r0.o()
            int r10 = r10 - r6
            r5.layout(r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bem.a(android.view.View, bel, boolean, int, int, int, int):void");
    }

    public final void b(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.e = new long[i];
            return;
        }
        if (jArr.length < i) {
            int length = jArr.length << 1;
            if (length >= i) {
                i = length;
            }
            this.e = Arrays.copyOf(this.e, i);
        }
    }

    public final void c(int i) {
        long[] jArr = this.b;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.b = new long[i];
            return;
        }
        if (jArr.length < i) {
            int length = jArr.length << 1;
            if (length >= i) {
                i = length;
            }
            this.b = Arrays.copyOf(this.b, i);
        }
    }

    private void a(int i, int i2, int i3, View view) {
        long[] jArr = this.b;
        if (jArr != null) {
            jArr[i] = b(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = b(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void d(int i) {
        int[] iArr = this.a;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.a = new int[i];
            return;
        }
        if (iArr.length < i) {
            int length = iArr.length << 1;
            if (length >= i) {
                i = length;
            }
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public final void a(List<bel> list, int i) {
        if (!f && this.a == null) {
            throw new AssertionError();
        } else if (f || this.b != null) {
            int i2 = this.a[i];
            if (i2 == -1) {
                i2 = 0;
            }
            for (int size = list.size() - 1; size >= i2; size--) {
                list.remove(size);
            }
            int[] iArr = this.a;
            int length = iArr.length - 1;
            if (i > length) {
                Arrays.fill(iArr, -1);
            } else {
                Arrays.fill(iArr, i, length, -1);
            }
            long[] jArr = this.b;
            int length2 = jArr.length - 1;
            if (i > length2) {
                Arrays.fill(jArr, 0);
            } else {
                Arrays.fill(jArr, i, length2, 0);
            }
        } else {
            throw new AssertionError();
        }
    }
}
