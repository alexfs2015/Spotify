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

/* renamed from: bfd reason: default package */
public class bfd {
    private static /* synthetic */ boolean f = (!bfd.class.desiredAssertionStatus());
    public int[] a;
    public long[] b;
    private final bfa c;
    private boolean[] d;
    private long[] e;

    /* renamed from: bfd$a */
    public static class a {
        public List<bfc> a;
        public int b;

        public final void a() {
            this.a = null;
            this.b = 0;
        }
    }

    /* renamed from: bfd$b */
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
            return i != i2 ? i - i2 : this.a - bVar.a;
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

    public bfd(bfa bfa) {
        this.c = bfa;
    }

    private int a(int i, bfb bfb, int i2) {
        bfa bfa = this.c;
        int a_ = bfa.a_(i, bfa.getPaddingLeft() + this.c.getPaddingRight() + bfb.m() + bfb.o() + i2, bfb.a());
        int size = MeasureSpec.getSize(a_);
        return size > bfb.i() ? MeasureSpec.makeMeasureSpec(bfb.i(), MeasureSpec.getMode(a_)) : size < bfb.g() ? MeasureSpec.makeMeasureSpec(bfb.g(), MeasureSpec.getMode(a_)) : a_;
    }

    public static int a(long j) {
        return (int) j;
    }

    private static int a(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private static int a(bfb bfb, boolean z) {
        return z ? bfb.a() : bfb.b();
    }

    private int a(boolean z) {
        return z ? this.c.getPaddingStart() : this.c.getPaddingTop();
    }

    private static List<bfc> a(List<bfc> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        bfc bfc = new bfc();
        bfc.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(bfc);
            }
            arrayList.add((bfc) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(bfc);
            }
        }
        return arrayList;
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

    private void a(int i, int i2, bfc bfc, int i3, int i4, boolean z) {
        float f2;
        int i5;
        int i6;
        int i7;
        double d2;
        double d3;
        bfc bfc2 = bfc;
        int i8 = i3;
        int i9 = 1;
        boolean z2 = z;
        while (bfc2.j > 0.0f && i8 >= bfc2.e) {
            int i10 = bfc2.e;
            float f3 = ((float) (i8 - bfc2.e)) / bfc2.j;
            bfc2.e = i4 + bfc2.f;
            if (!z2) {
                bfc2.g = Integer.MIN_VALUE;
            }
            int i11 = 0;
            boolean z3 = false;
            float f4 = 0.0f;
            int i12 = 0;
            while (i11 < bfc2.h) {
                int i13 = bfc2.o + i11;
                View b2 = this.c.b(i13);
                if (b2 == null || b2.getVisibility() == 8) {
                    int i14 = i2;
                    f2 = f3;
                    int i15 = i;
                } else {
                    bfb bfb = (bfb) b2.getLayoutParams();
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
                        if (this.d[i13] || bfb.d() <= 0.0f) {
                            int i17 = i2;
                            i7 = measuredWidth;
                            i6 = measuredHeight;
                        } else {
                            float d4 = ((float) measuredWidth) + (bfb.d() * f2);
                            if (i11 == bfc2.h - 1) {
                                d4 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(d4);
                            if (round > bfb.i()) {
                                round = bfb.i();
                                this.d[i13] = true;
                                bfc2.j -= bfb.d();
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
                            int b3 = b(i2, bfb, bfc2.m);
                            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(round, 1073741824);
                            b2.measure(makeMeasureSpec, b3);
                            i7 = b2.getMeasuredWidth();
                            i6 = b2.getMeasuredHeight();
                            a(i13, makeMeasureSpec, b3, b2);
                            this.c.a(i13, b2);
                        }
                        i5 = Math.max(i12, i6 + bfb.n() + bfb.p() + this.c.a_(b2));
                        bfc2.e += i7 + bfb.m() + bfb.o();
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
                        if (this.d[i13] || bfb.d() <= 0.0f) {
                            int i18 = i;
                        } else {
                            float d6 = ((float) measuredHeight2) + (f2 * bfb.d());
                            if (i11 == bfc2.h - 1) {
                                d6 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(d6);
                            if (round2 > bfb.j()) {
                                round2 = bfb.j();
                                this.d[i13] = true;
                                bfc2.j -= bfb.d();
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
                            int a2 = a(i, bfb, bfc2.m);
                            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            b2.measure(a2, makeMeasureSpec2);
                            measuredWidth2 = b2.getMeasuredWidth();
                            measuredHeight2 = b2.getMeasuredHeight();
                            a(i13, a2, makeMeasureSpec2, b2);
                            this.c.a(i13, b2);
                        }
                        i5 = Math.max(i12, measuredWidth2 + bfb.m() + bfb.o() + this.c.a_(b2));
                        bfc2.e += measuredHeight2 + bfb.n() + bfb.p();
                        int i19 = i2;
                    }
                    bfc2.g = Math.max(bfc2.g, i5);
                    i12 = i5;
                }
                i11++;
                f3 = f2;
                i9 = 1;
            }
            int i20 = i;
            int i21 = i2;
            if (z3 && i10 != bfc2.e) {
                i9 = 1;
                z2 = true;
            } else {
                return;
            }
        }
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
            bfb r0 = (defpackage.bfb) r0
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
            bfa r0 = r6.c
            r0.a(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfd.a(android.view.View, int):void");
    }

    private void a(View view, int i, int i2) {
        bfb bfb = (bfb) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bfb.n()) - bfb.p()) - this.c.a_(view), bfb.h()), bfb.j());
        long[] jArr = this.e;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        a(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.c.a(i2, view);
    }

    private void a(List<bfc> list, bfc bfc, int i, int i2) {
        bfc.m = i2;
        this.c.a(bfc);
        bfc.p = i;
        list.add(bfc);
    }

    private static boolean a(int i, int i2, bfc bfc) {
        return i == i2 - 1 && bfc.a() != 0;
    }

    private boolean a(View view, int i, int i2, int i3, int i4, bfb bfb, int i5, int i6, int i7) {
        if (this.c.g() == 0) {
            return false;
        }
        if (bfb.k()) {
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
        return i2 < i3 + i4;
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

    private int b(int i, bfb bfb, int i2) {
        bfa bfa = this.c;
        int b2 = bfa.b(i, bfa.getPaddingTop() + this.c.getPaddingBottom() + bfb.n() + bfb.p() + i2, bfb.b());
        int size = MeasureSpec.getSize(b2);
        return size > bfb.j() ? MeasureSpec.makeMeasureSpec(bfb.j(), MeasureSpec.getMode(b2)) : size < bfb.h() ? MeasureSpec.makeMeasureSpec(bfb.h(), MeasureSpec.getMode(b2)) : b2;
    }

    public static int b(long j) {
        return (int) (j >> 32);
    }

    private static int b(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private static int b(bfb bfb, boolean z) {
        return z ? bfb.b() : bfb.a();
    }

    private int b(boolean z) {
        return z ? this.c.getPaddingEnd() : this.c.getPaddingBottom();
    }

    private static long b(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    private void b(int i, int i2, bfc bfc, int i3, int i4, boolean z) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        bfc bfc2 = bfc;
        int i8 = i3;
        int i9 = 1;
        boolean z4 = z;
        while (true) {
            int i10 = bfc2.e;
            if (bfc2.k > 0.0f && i8 <= bfc2.e) {
                float f2 = ((float) (bfc2.e - i8)) / bfc2.k;
                bfc2.e = i4 + bfc2.f;
                if (!z4) {
                    bfc2.g = Integer.MIN_VALUE;
                }
                int i11 = 0;
                boolean z5 = false;
                float f3 = 0.0f;
                int i12 = 0;
                while (i11 < bfc2.h) {
                    int i13 = bfc2.o + i11;
                    View b2 = this.c.b(i13);
                    if (b2 == null || b2.getVisibility() == 8) {
                        int i14 = i2;
                        z2 = z5;
                    } else {
                        bfb bfb = (bfb) b2.getLayoutParams();
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
                            if (this.d[i13] || bfb.e() <= 0.0f) {
                                int i15 = i2;
                                i7 = measuredWidth;
                                i6 = measuredHeight;
                            } else {
                                float e2 = ((float) measuredWidth) - (bfb.e() * f2);
                                if (i11 == bfc2.h - 1) {
                                    e2 += f3;
                                    f3 = 0.0f;
                                }
                                int round = Math.round(e2);
                                if (round < bfb.g()) {
                                    round = bfb.g();
                                    this.d[i13] = true;
                                    bfc2.k -= bfb.e();
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
                                int b3 = b(i2, bfb, bfc2.m);
                                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(round, 1073741824);
                                b2.measure(makeMeasureSpec, b3);
                                i7 = b2.getMeasuredWidth();
                                i6 = b2.getMeasuredHeight();
                                a(i13, makeMeasureSpec, b3, b2);
                                this.c.a(i13, b2);
                            }
                            i5 = Math.max(i12, i6 + bfb.n() + bfb.p() + this.c.a_(b2));
                            bfc2.e += i7 + bfb.m() + bfb.o();
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
                            if (!this.d[i13] && bfb.e() > 0.0f) {
                                float e3 = ((float) measuredHeight2) - (bfb.e() * f2);
                                if (i11 == bfc2.h - 1) {
                                    e3 += f3;
                                    f3 = 0.0f;
                                }
                                int round2 = Math.round(e3);
                                if (round2 < bfb.h()) {
                                    round2 = bfb.h();
                                    this.d[i13] = true;
                                    bfc2.k -= bfb.e();
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
                                int a2 = a(i, bfb, bfc2.m);
                                int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                b2.measure(a2, makeMeasureSpec2);
                                measuredWidth2 = b2.getMeasuredWidth();
                                int measuredHeight3 = b2.getMeasuredHeight();
                                a(i13, a2, makeMeasureSpec2, b2);
                                this.c.a(i13, b2);
                                z2 = z3;
                                measuredHeight2 = measuredHeight3;
                            }
                            i5 = Math.max(i12, measuredWidth2 + bfb.m() + bfb.o() + this.c.a_(b2));
                            bfc2.e += measuredHeight2 + bfb.n() + bfb.p();
                            int i16 = i2;
                        }
                        bfc2.g = Math.max(bfc2.g, i5);
                        i12 = i5;
                    }
                    i11++;
                    z5 = z2;
                    i9 = 1;
                }
                int i17 = i2;
                if (z5 && i10 != bfc2.e) {
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

    private void b(View view, int i, int i2) {
        bfb bfb = (bfb) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bfb.m()) - bfb.o()) - this.c.a_(view), bfb.g()), bfb.i());
        long[] jArr = this.e;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        a(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.c.a(i2, view);
    }

    private static int c(bfb bfb, boolean z) {
        return z ? bfb.m() : bfb.n();
    }

    private int c(boolean z) {
        return z ? this.c.getPaddingTop() : this.c.getPaddingStart();
    }

    private static int d(bfb bfb, boolean z) {
        return z ? bfb.o() : bfb.p();
    }

    private int d(boolean z) {
        return z ? this.c.getPaddingBottom() : this.c.getPaddingEnd();
    }

    private static int e(bfb bfb, boolean z) {
        return z ? bfb.n() : bfb.m();
    }

    private List<b> e(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            bfb bfb = (bfb) this.c.a(i2).getLayoutParams();
            b bVar = new b(0);
            bVar.b = bfb.c();
            bVar.a = i2;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    private static int f(bfb bfb, boolean z) {
        return z ? bfb.p() : bfb.o();
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
                    bfc bfc = (bfc) n.get(i3);
                    int i4 = bfc.h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = bfc.o + i5;
                        if (i5 < this.c.b()) {
                            View b2 = this.c.b(i6);
                            if (!(b2 == null || b2.getVisibility() == 8)) {
                                bfb bfb = (bfb) b2.getLayoutParams();
                                if (bfb.f() == -1 || bfb.f() == 4) {
                                    if (c2 == 0 || c2 == 1) {
                                        a(b2, bfc.g, i6);
                                    } else if (c2 == 2 || c2 == 3) {
                                        b(b2, bfc.g, i6);
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
            for (bfc bfc2 : this.c.n()) {
                Iterator it = bfc2.n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View b3 = this.c.b(num.intValue());
                        if (c2 == 0 || c2 == 1) {
                            a(b3, bfc2.g, num.intValue());
                        } else if (c2 == 2 || c2 == 3) {
                            b(b3, bfc2.g, num.intValue());
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
                bfc bfc = (bfc) n.get(i9);
                if (bfc.e < i5) {
                    a(i, i2, bfc, i5, i7, false);
                } else {
                    b(i, i2, bfc, i5, i7, false);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r1 != 4) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r6, defpackage.bfc r7, int r8, int r9, int r10, int r11) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            bfb r0 = (defpackage.bfb) r0
            bfa r1 = r5.c
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
            bfa r1 = r5.c
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
            bfa r7 = r5.c
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
            bfa r7 = r5.c
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
            bfa r7 = r5.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfd.a(android.view.View, bfc, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r1 != 4) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r5, defpackage.bfc r6, boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            bfb r0 = (defpackage.bfb) r0
            bfa r1 = r4.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfd.a(android.view.View, bfc, boolean, int, int, int, int):void");
    }

    public final void a(a aVar, int i, int i2) {
        a(aVar, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    public final void a(a aVar, int i, int i2, int i3, int i4, int i5, List<bfc> list) {
        int i6;
        int i7;
        a aVar2;
        int i8;
        int i9;
        List<bfc> list2;
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
        bfc bfc;
        a aVar3 = aVar;
        int i20 = i;
        int i21 = i2;
        int i22 = i5;
        boolean j = this.c.j();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        List<bfc> arrayList = list == null ? new ArrayList<>() : list;
        aVar3.a = arrayList;
        boolean z = i22 == -1;
        int a2 = a(j);
        int b2 = b(j);
        int c2 = c(j);
        int d2 = d(j);
        bfc bfc2 = new bfc();
        int i23 = i4;
        bfc2.o = i23;
        int i24 = b2 + a2;
        bfc2.e = i24;
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
                if (a(i6, b3, bfc2)) {
                    a(arrayList, bfc2, i6, i25);
                }
            } else if (b4.getVisibility() == 8) {
                bfc2.i++;
                bfc2.h++;
                if (a(i6, b3, bfc2)) {
                    a(arrayList, bfc2, i6, i25);
                }
            } else {
                bfb bfb = (bfb) b4.getLayoutParams();
                int i29 = b3;
                if (bfb.f() == 4) {
                    bfc2.n.add(Integer.valueOf(i6));
                }
                int a3 = a(bfb, j);
                if (bfb.l() != -1.0f && mode == 1073741824) {
                    a3 = Math.round(((float) size) * bfb.l());
                }
                if (j) {
                    int a_ = this.c.a_(i20, i24 + c(bfb, true) + d(bfb, true), a3);
                    i9 = size;
                    i8 = mode;
                    int b5 = this.c.b(i21, c2 + d2 + e(bfb, true) + f(bfb, true) + i25, b(bfb, true));
                    b4.measure(a_, b5);
                    a(i6, a_, b5, b4);
                    i14 = a_;
                } else {
                    i9 = size;
                    i8 = mode;
                    int a_2 = this.c.a_(i21, c2 + d2 + e(bfb, false) + f(bfb, false) + i25, b(bfb, false));
                    int b6 = this.c.b(i20, c(bfb, false) + i24 + d(bfb, false), a3);
                    b4.measure(a_2, b6);
                    a(i6, a_2, b6, b4);
                    i14 = b6;
                }
                this.c.a(i6, b4);
                a(b4, i6);
                i26 = View.combineMeasuredStates(i26, b4.getMeasuredState());
                int i30 = i25;
                int i31 = i29;
                bfc bfc3 = bfc2;
                int i32 = i24;
                int i33 = i6;
                View view2 = b4;
                list2 = arrayList;
                int i34 = i33;
                int i35 = i14;
                if (a(b4, i8, i9, bfc2.e, d(bfb, j) + a(b4, j) + c(bfb, j), bfb, i33, i27, arrayList.size())) {
                    if (bfc3.a() > 0) {
                        if (i34 > 0) {
                            i19 = i34 - 1;
                            bfc = bfc3;
                        } else {
                            bfc = bfc3;
                            i19 = 0;
                        }
                        a(list2, bfc, i19, i30);
                        i18 = bfc.g + i30;
                    } else {
                        i18 = i30;
                    }
                    if (!j) {
                        i12 = i2;
                        view = view2;
                        i6 = i34;
                        int i36 = i35;
                        if (bfb.a() == -1) {
                            bfa bfa = this.c;
                            view.measure(bfa.a_(i12, bfa.getPaddingLeft() + this.c.getPaddingRight() + bfb.m() + bfb.o() + i18, bfb.a()), i36);
                            a(view, i6);
                        }
                    } else if (bfb.b() == -1) {
                        bfa bfa2 = this.c;
                        i12 = i2;
                        i6 = i34;
                        view = view2;
                        view.measure(i35, bfa2.b(i12, bfa2.getPaddingTop() + this.c.getPaddingBottom() + bfb.n() + bfb.p() + i18, bfb.b()));
                        a(view, i6);
                    } else {
                        i12 = i2;
                        view = view2;
                        i6 = i34;
                    }
                    bfc2 = new bfc();
                    bfc2.h = 1;
                    i11 = i32;
                    bfc2.e = i11;
                    bfc2.o = i6;
                    i30 = i18;
                    i16 = Integer.MIN_VALUE;
                    i15 = 0;
                } else {
                    i12 = i2;
                    view = view2;
                    i6 = i34;
                    bfc2 = bfc3;
                    i11 = i32;
                    bfc2.h++;
                    i15 = i27 + 1;
                    i16 = i28;
                }
                int[] iArr = this.a;
                if (iArr != null) {
                    iArr[i6] = list2.size();
                }
                bfc2.e += a(view, j) + c(bfb, j) + d(bfb, j);
                bfc2.j += bfb.d();
                bfc2.k += bfb.e();
                this.c.a(view, i6, i15, bfc2);
                int max = Math.max(i16, b(view, j) + e(bfb, j) + f(bfb, j) + this.c.a_(view));
                bfc2.g = Math.max(bfc2.g, max);
                if (j) {
                    if (this.c.g() != 2) {
                        bfc2.l = Math.max(bfc2.l, view.getBaseline() + bfb.n());
                    } else {
                        bfc2.l = Math.max(bfc2.l, (view.getMeasuredHeight() - view.getBaseline()) + bfb.p());
                    }
                }
                i13 = i29;
                if (a(i6, i13, bfc2)) {
                    a(list2, bfc2, i6, i30);
                    i30 += bfc2.g;
                }
                i10 = i5;
                if (i10 != -1 && list2.size() > 0) {
                    if (((bfc) list2.get(list2.size() - 1)).p >= i10 && i6 >= i10 && !z2) {
                        i17 = -bfc2.g;
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

    public final void a(a aVar, int i, int i2, int i3, int i4, List<bfc> list) {
        a(aVar, i, i2, i3, i4, -1, list);
    }

    public final void a(List<bfc> list, int i) {
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

    public final int[] a(SparseIntArray sparseIntArray) {
        int b2 = this.c.b();
        return a(b2, e(b2), sparseIntArray);
    }

    public final int[] a(View view, int i, LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int b2 = this.c.b();
        List e2 = e(b2);
        b bVar = new b(0);
        if (view == null || !(layoutParams instanceof bfb)) {
            bVar.b = 1;
        } else {
            bVar.b = ((bfb) layoutParams).c();
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
        List<bfc> n = this.c.n();
        if (i5 == 1073741824) {
            int l = this.c.l() + i3;
            int i6 = 0;
            if (n.size() == 1) {
                ((bfc) n.get(0)).g = i4 - i3;
            } else if (n.size() >= 2) {
                int h = this.c.h();
                if (h == 1) {
                    int i7 = i4 - l;
                    bfc bfc = new bfc();
                    bfc.g = i7;
                    n.add(0, bfc);
                } else if (h == 2) {
                    this.c.a(a(n, i4, l));
                } else if (h != 3) {
                    if (h != 4) {
                        if (h == 5 && l < i4) {
                            float size = ((float) (i4 - l)) / ((float) n.size());
                            int size2 = n.size();
                            float f2 = 0.0f;
                            while (i6 < size2) {
                                bfc bfc2 = (bfc) n.get(i6);
                                float f3 = ((float) bfc2.g) + size;
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
                                bfc2.g = round;
                                i6++;
                            }
                        }
                    } else if (l >= i4) {
                        this.c.a(a(n, i4, l));
                    } else {
                        int size3 = (i4 - l) / (n.size() << 1);
                        ArrayList arrayList = new ArrayList();
                        bfc bfc3 = new bfc();
                        bfc3.g = size3;
                        for (bfc bfc4 : n) {
                            arrayList.add(bfc3);
                            arrayList.add(bfc4);
                            arrayList.add(bfc3);
                        }
                        this.c.a((List<bfc>) arrayList);
                    }
                } else if (l < i4) {
                    float size4 = ((float) (i4 - l)) / ((float) (n.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size5 = n.size();
                    float f4 = 0.0f;
                    while (i6 < size5) {
                        arrayList2.add((bfc) n.get(i6));
                        if (i6 != n.size() - 1) {
                            bfc bfc5 = new bfc();
                            if (i6 == n.size() - 2) {
                                bfc5.g = Math.round(f4 + size4);
                                f4 = 0.0f;
                            } else {
                                bfc5.g = Math.round(size4);
                            }
                            f4 += size4 - ((float) bfc5.g);
                            if (f4 > 1.0f) {
                                bfc5.g++;
                                f4 -= 1.0f;
                            } else if (f4 < -1.0f) {
                                bfc5.g--;
                                f4 += 1.0f;
                            }
                            arrayList2.add(bfc5);
                        }
                        i6++;
                    }
                    this.c.a((List<bfc>) arrayList2);
                }
            }
        }
    }

    public final void b(a aVar, int i, int i2, int i3, int i4, List<bfc> list) {
        a(aVar, i, i2, i3, 0, i4, list);
    }

    public final boolean b(SparseIntArray sparseIntArray) {
        int b2 = this.c.b();
        if (sparseIntArray.size() != b2) {
            return true;
        }
        for (int i = 0; i < b2; i++) {
            View a2 = this.c.a(i);
            if (a2 != null && ((bfb) a2.getLayoutParams()).c() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
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

    public final void c(a aVar, int i, int i2, int i3, int i4, List<bfc> list) {
        a(aVar, i2, i, i3, i4, -1, list);
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

    public final void d(a aVar, int i, int i2, int i3, int i4, List<bfc> list) {
        a(aVar, i2, i, i3, 0, i4, list);
    }
}
