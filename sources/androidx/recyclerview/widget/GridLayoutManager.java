package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    private SparseIntArray A = new SparseIntArray();
    private Rect B = new Rect();
    public int a = -1;
    public b b = new a();
    private boolean w = false;
    private int[] x;
    private View[] y;
    private SparseIntArray z = new SparseIntArray();

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        int a = -1;
        int b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static final class a extends b {
        public final int a(int i) {
            return 1;
        }

        public final int a(int i, int i2) {
            return i % i2;
        }
    }

    public static abstract class b {
        final SparseIntArray a = new SparseIntArray();
        public boolean b = false;

        public abstract int a(int i);

        /* access modifiers changed from: 0000 */
        public final int b(int i, int i2) {
            if (!this.b) {
                return a(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a2 = a(i, i2);
            this.a.put(i, a2);
            return a2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x006a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(int r7, int r8) {
            /*
                r6 = this;
                int r0 = r6.a(r7)
                r1 = 0
                if (r0 != r8) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r6.b
                if (r2 == 0) goto L_0x0054
                android.util.SparseIntArray r2 = r6.a
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0054
                android.util.SparseIntArray r2 = r6.a
                int r2 = r2.size()
                int r2 = r2 + -1
                r3 = r2
                r2 = 0
            L_0x001e:
                if (r2 > r3) goto L_0x0032
                int r4 = r2 + r3
                int r4 = r4 >>> 1
                android.util.SparseIntArray r5 = r6.a
                int r5 = r5.keyAt(r4)
                if (r5 >= r7) goto L_0x002f
                int r2 = r4 + 1
                goto L_0x001e
            L_0x002f:
                int r3 = r4 + -1
                goto L_0x001e
            L_0x0032:
                int r2 = r2 + -1
                if (r2 < 0) goto L_0x0045
                android.util.SparseIntArray r3 = r6.a
                int r3 = r3.size()
                if (r2 >= r3) goto L_0x0045
                android.util.SparseIntArray r3 = r6.a
                int r2 = r3.keyAt(r2)
                goto L_0x0046
            L_0x0045:
                r2 = -1
            L_0x0046:
                if (r2 < 0) goto L_0x0054
                android.util.SparseIntArray r3 = r6.a
                int r3 = r3.get(r2)
                int r4 = r6.a(r2)
                int r3 = r3 + r4
                goto L_0x0064
            L_0x0054:
                r2 = 0
                r3 = 0
            L_0x0056:
                if (r2 >= r7) goto L_0x0067
                int r4 = r6.a(r2)
                int r3 = r3 + r4
                if (r3 != r8) goto L_0x0061
                r3 = 0
                goto L_0x0064
            L_0x0061:
                if (r3 <= r8) goto L_0x0064
                r3 = r4
            L_0x0064:
                int r2 = r2 + 1
                goto L_0x0056
            L_0x0067:
                int r0 = r0 + r3
                if (r0 > r8) goto L_0x006b
                return r3
            L_0x006b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b.a(int, int):int");
        }

        public final int c(int i, int i2) {
            int a2 = a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a3 = a(i5);
                i3 += a3;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a3;
                }
            }
            return i3 + a2 > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        e_(a(context, attributeSet, i, i2).b);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        e_(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z2) {
        super(0, false);
        e_(2);
    }

    public final void a(boolean z2) {
        if (!z2) {
            super.a(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int a(o oVar, s sVar) {
        if (this.c == 0) {
            return this.a;
        }
        if (sVar.a() <= 0) {
            return 0;
        }
        return a(oVar, sVar, sVar.a() - 1) + 1;
    }

    public final int b(o oVar, s sVar) {
        if (this.c == 1) {
            return this.a;
        }
        if (sVar.a() <= 0) {
            return 0;
        }
        return a(oVar, sVar, sVar.a() - 1) + 1;
    }

    public final void a(o oVar, s sVar, View view, ja jaVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.a(view, jaVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int a2 = a(oVar, sVar, layoutParams2.c.d());
        if (this.c == 0) {
            jaVar.a((Object) c.a(layoutParams2.a, layoutParams2.b, a2, 1, this.a > 1 && layoutParams2.b == this.a, false));
        } else {
            jaVar.a((Object) c.a(a2, 1, layoutParams2.a, layoutParams2.b, this.a > 1 && layoutParams2.b == this.a, false));
        }
    }

    public final void a(s sVar) {
        super.a(sVar);
        this.w = false;
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        this.b.a.clear();
    }

    public void a(RecyclerView recyclerView) {
        this.b.a.clear();
    }

    public void b(RecyclerView recyclerView, int i, int i2) {
        this.b.a.clear();
    }

    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.b.a.clear();
    }

    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.b.a.clear();
    }

    public final androidx.recyclerview.widget.RecyclerView.LayoutParams a() {
        if (this.c == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public final androidx.recyclerview.widget.RecyclerView.LayoutParams a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final androidx.recyclerview.widget.RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public final boolean a(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.x == null) {
            super.a(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.c == 1) {
            i4 = a(i2, rect.height() + paddingTop, ip.m(this.h));
            int[] iArr = this.x;
            i3 = a(i, iArr[iArr.length - 1] + paddingLeft, ip.l(this.h));
        } else {
            i3 = a(i, rect.width() + paddingLeft, ip.l(this.h));
            int[] iArr2 = this.x;
            i4 = a(i2, iArr2[iArr2.length - 1] + paddingTop, ip.m(this.h));
        }
        d(i3, i4);
    }

    private void k(int i) {
        this.x = a(this.x, this.a, i);
    }

    private static int[] a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private int e(int i, int i2) {
        if (this.c != 1 || !g()) {
            int[] iArr = this.x;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.x;
        int i3 = this.a;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* access modifiers changed from: 0000 */
    public final void a(o oVar, s sVar, a aVar, int i) {
        super.a(oVar, sVar, aVar, i);
        v();
        if (sVar.a() > 0 && !sVar.g) {
            boolean z2 = i == 1;
            int b2 = b(oVar, sVar, aVar.b);
            if (z2) {
                while (b2 > 0 && aVar.b > 0) {
                    aVar.b--;
                    b2 = b(oVar, sVar, aVar.b);
                }
            } else {
                int a2 = sVar.a() - 1;
                int i2 = aVar.b;
                while (i2 < a2) {
                    int i3 = i2 + 1;
                    int b3 = b(oVar, sVar, i3);
                    if (b3 <= b2) {
                        break;
                    }
                    i2 = i3;
                    b2 = b3;
                }
                aVar.b = i2;
            }
        }
        w();
    }

    private void w() {
        View[] viewArr = this.y;
        if (viewArr == null || viewArr.length != this.a) {
            this.y = new View[this.a];
        }
    }

    public final int a(int i, o oVar, s sVar) {
        v();
        w();
        return super.a(i, oVar, sVar);
    }

    public int b(int i, o oVar, s sVar) {
        v();
        w();
        return super.b(i, oVar, sVar);
    }

    /* access modifiers changed from: 0000 */
    public final View a(o oVar, s sVar, int i, int i2, int i3) {
        h();
        int b2 = this.d.b();
        int c = this.d.c();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g = g(i);
            int c2 = c(g);
            if (c2 >= 0 && c2 < i3 && b(oVar, sVar, c2) == 0) {
                if (((androidx.recyclerview.widget.RecyclerView.LayoutParams) g.getLayoutParams()).c.n()) {
                    if (view2 == null) {
                        view2 = g;
                    }
                } else if (this.d.a(g) < c && this.d.b(g) >= b2) {
                    return g;
                } else {
                    if (view == null) {
                        view = g;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: 0000 */
    public final void a(s sVar, c cVar, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        int i = this.a;
        for (int i2 = 0; i2 < this.a && cVar.a(sVar) && i > 0; i2++) {
            int i3 = cVar.d;
            aVar.a(i3, Math.max(0, cVar.g));
            i -= this.b.a(i3);
            cVar.d += cVar.e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(o oVar, s sVar, c cVar, androidx.recyclerview.widget.LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        o oVar2 = oVar;
        s sVar2 = sVar;
        c cVar2 = cVar;
        androidx.recyclerview.widget.LinearLayoutManager.b bVar2 = bVar;
        int h = this.d.h();
        boolean z2 = false;
        boolean z3 = h != 1073741824;
        int i7 = r() > 0 ? this.x[this.a] : 0;
        if (z3) {
            v();
        }
        boolean z4 = cVar2.e == 1;
        int i8 = this.a;
        if (!z4) {
            i8 = b(oVar2, sVar2, cVar2.d) + c(oVar2, sVar2, cVar2.d);
        }
        int i9 = i8;
        int i10 = 0;
        while (i10 < this.a && cVar2.a(sVar2) && i9 > 0) {
            int i11 = cVar2.d;
            int c = c(oVar2, sVar2, i11);
            if (c <= this.a) {
                i9 -= c;
                if (i9 < 0) {
                    break;
                }
                View a2 = cVar2.a(oVar2);
                if (a2 == null) {
                    break;
                }
                this.y[i10] = a2;
                i10++;
            } else {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i11);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.a);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i10 == 0) {
            bVar2.b = true;
            return;
        }
        float f = 0.0f;
        a(oVar2, sVar2, i10, z4);
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            View view = this.y[i12];
            if (cVar2.k == null) {
                if (z4) {
                    b(view, -1);
                } else {
                    b(view, (int) z2);
                }
            } else if (z4) {
                a(view, -1);
            } else {
                a(view, z2 ? 1 : 0);
            }
            b(view, this.B);
            a(view, h, z2);
            int e = this.d.e(view);
            if (e > i13) {
                i13 = e;
            }
            float f2 = (((float) this.d.f(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).b);
            if (f2 > f) {
                f = f2;
            }
            i12++;
            z2 = false;
        }
        if (z3) {
            k(Math.max(Math.round(f * ((float) this.a)), i7));
            i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                View view2 = this.y[i14];
                a(view2, 1073741824, true);
                int e2 = this.d.e(view2);
                if (e2 > i13) {
                    i13 = e2;
                }
            }
        }
        for (int i15 = 0; i15 < i10; i15++) {
            View view3 = this.y[i15];
            if (this.d.e(view3) != i13) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.d;
                int i16 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i17 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int e3 = e(layoutParams.a, layoutParams.b);
                if (this.c == 1) {
                    i6 = a(e3, 1073741824, i17, layoutParams.width, false);
                    i5 = MeasureSpec.makeMeasureSpec(i13 - i16, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i13 - i17, 1073741824);
                    i5 = a(e3, 1073741824, i16, layoutParams.height, false);
                    i6 = makeMeasureSpec;
                }
                a(view3, i6, i5, true);
            }
        }
        bVar2.a = i13;
        if (this.c != 1) {
            if (cVar2.f == -1) {
                int i18 = cVar2.b;
                i2 = i18 - i13;
                i4 = i18;
            } else {
                int i19 = cVar2.b;
                i4 = i19 + i13;
                i2 = i19;
            }
            i3 = 0;
            i = 0;
        } else if (cVar2.f == -1) {
            int i20 = cVar2.b;
            int i21 = i20 - i13;
            i3 = i20;
            i2 = 0;
            i = i21;
            i4 = 0;
        } else {
            i = cVar2.b;
            i3 = i + i13;
            i4 = 0;
            i2 = 0;
        }
        for (int i22 = 0; i22 < i10; i22++) {
            View view4 = this.y[i22];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.c != 1) {
                int paddingTop = getPaddingTop() + this.x[layoutParams2.a];
                i = paddingTop;
                i3 = this.d.f(view4) + paddingTop;
            } else if (g()) {
                i4 = getPaddingLeft() + this.x[this.a - layoutParams2.a];
                i2 = i4 - this.d.f(view4);
            } else {
                int paddingLeft = getPaddingLeft() + this.x[layoutParams2.a];
                i2 = paddingLeft;
                i4 = this.d.f(view4) + paddingLeft;
            }
            b(view4, i2, i, i4, i3);
            if (layoutParams2.c.n() || layoutParams2.c.u()) {
                bVar2.c = true;
            }
            bVar2.d = view4.hasFocusable() | bVar2.d;
        }
        Arrays.fill(this.y, null);
    }

    private void a(View view, int i, boolean z2) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.d;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int e = e(layoutParams.a, layoutParams.b);
        if (this.c == 1) {
            i2 = a(e, i, i5, layoutParams.width, false);
            i3 = a(this.d.e(), this.t, i4, layoutParams.height, true);
        } else {
            int a2 = a(e, i, i4, layoutParams.height, false);
            int a3 = a(this.d.e(), this.s, i5, layoutParams.width, true);
            i3 = a2;
            i2 = a3;
        }
        a(view, i2, i3, z2);
    }

    private void a(View view, int i, int i2, boolean z2) {
        boolean z3;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z2) {
            z3 = a(view, i, i2, layoutParams);
        } else {
            z3 = b(view, i, i2, layoutParams);
        }
        if (z3) {
            view.measure(i, i2);
        }
    }

    private void a(o oVar, s sVar, int i, boolean z2) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z2) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.y[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.b = c(oVar, sVar, c(view));
            layoutParams.a = i4;
            i4 += layoutParams.b;
            i3 += i2;
        }
    }

    public void e_(int i) {
        if (i != this.a) {
            this.w = true;
            if (i > 0) {
                this.a = i;
                this.b.a.clear();
                o_();
                return;
            }
            StringBuilder sb = new StringBuilder("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        if (r13 == (r2 > r8)) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0106, code lost:
        if (r13 == r14) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.o r25, androidx.recyclerview.widget.RecyclerView.s r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.e(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.a
            int r7 = r5.a
            int r5 = r5.b
            int r7 = r7 + r5
            android.view.View r5 = super.a(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0022
            return r4
        L_0x0022:
            r5 = r24
            int r5 = r0.f(r5)
            r9 = 1
            if (r5 != r9) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            boolean r10 = r0.f
            if (r5 == r10) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            r10 = -1
            if (r5 == 0) goto L_0x0040
            int r5 = r22.r()
            int r5 = r5 - r9
            r11 = -1
            r12 = -1
            goto L_0x0047
        L_0x0040:
            int r5 = r22.r()
            r11 = r5
            r5 = 0
            r12 = 1
        L_0x0047:
            int r13 = r0.c
            if (r13 != r9) goto L_0x0053
            boolean r13 = r22.g()
            if (r13 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            int r14 = r0.a(r1, r2, r5)
            r10 = r4
            r8 = -1
            r15 = 0
            r16 = 0
            r17 = -1
        L_0x005f:
            if (r5 == r11) goto L_0x0152
            int r9 = r0.a(r1, r2, r5)
            android.view.View r1 = r0.g(r5)
            if (r1 == r3) goto L_0x0152
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r9 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x0077
            goto L_0x0152
        L_0x0077:
            r18 = r3
            r20 = r8
            r19 = r11
            r21 = r14
            r8 = r16
            r11 = r17
            goto L_0x013e
        L_0x0085:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.a
            r18 = r3
            int r3 = r9.a
            r19 = r11
            int r11 = r9.b
            int r3 = r3 + r11
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a1
            if (r2 != r6) goto L_0x00a1
            if (r3 != r7) goto L_0x00a1
            return r1
        L_0x00a1:
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a9
            if (r4 == 0) goto L_0x00b1
        L_0x00a9:
            boolean r11 = r1.hasFocusable()
            if (r11 != 0) goto L_0x00bb
            if (r10 != 0) goto L_0x00bb
        L_0x00b1:
            r20 = r8
            r21 = r14
            r8 = r16
            r11 = r17
        L_0x00b9:
            r14 = 1
            goto L_0x0112
        L_0x00bb:
            int r11 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r11 = r20 - r11
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x00d8
            if (r11 <= r15) goto L_0x00ce
            goto L_0x00b1
        L_0x00ce:
            if (r11 != r15) goto L_0x0109
            if (r2 <= r8) goto L_0x00d4
            r11 = 1
            goto L_0x00d5
        L_0x00d4:
            r11 = 0
        L_0x00d5:
            if (r13 != r11) goto L_0x0109
            goto L_0x00b1
        L_0x00d8:
            if (r4 != 0) goto L_0x0109
            r20 = r8
            op r8 = r0.i
            r21 = r14
            r14 = 24579(0x6003, float:3.4443E-41)
            boolean r8 = r8.a(r1, r14)
            if (r8 == 0) goto L_0x00f2
            op r8 = r0.j
            boolean r8 = r8.a(r1, r14)
            if (r8 == 0) goto L_0x00f2
            r8 = 1
            goto L_0x00f3
        L_0x00f2:
            r8 = 0
        L_0x00f3:
            r14 = 1
            r8 = r8 ^ r14
            if (r8 == 0) goto L_0x010d
            r8 = r16
            if (r11 <= r8) goto L_0x00fe
            r11 = r17
            goto L_0x0112
        L_0x00fe:
            if (r11 != r8) goto L_0x010f
            r11 = r17
            if (r2 <= r11) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r14 = 0
        L_0x0106:
            if (r13 != r14) goto L_0x0111
            goto L_0x00b9
        L_0x0109:
            r20 = r8
            r21 = r14
        L_0x010d:
            r8 = r16
        L_0x010f:
            r11 = r17
        L_0x0111:
            r14 = 0
        L_0x0112:
            if (r14 == 0) goto L_0x013e
            boolean r14 = r1.hasFocusable()
            if (r14 == 0) goto L_0x012d
            int r4 = r9.a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r16 = r8
            r17 = r11
            r8 = r4
            r4 = r1
            goto L_0x0144
        L_0x012d:
            int r8 = r9.a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r16 = r3
            r17 = r8
            goto L_0x0142
        L_0x013e:
            r16 = r8
            r17 = r11
        L_0x0142:
            r8 = r20
        L_0x0144:
            int r5 = r5 + r12
            r1 = r25
            r2 = r26
            r3 = r18
            r11 = r19
            r14 = r21
            r9 = 1
            goto L_0x005f
        L_0x0152:
            if (r4 == 0) goto L_0x0155
            return r4
        L_0x0155:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):android.view.View");
    }

    public final boolean q_() {
        return this.g == null && !this.w;
    }

    public void c(o oVar, s sVar) {
        if (sVar.g) {
            int r = r();
            for (int i = 0; i < r; i++) {
                LayoutParams layoutParams = (LayoutParams) g(i).getLayoutParams();
                int d = layoutParams.c.d();
                this.z.put(d, layoutParams.b);
                this.A.put(d, layoutParams.a);
            }
        }
        super.c(oVar, sVar);
        this.z.clear();
        this.A.clear();
    }

    private void v() {
        int i;
        int i2;
        if (this.c == 1) {
            i2 = this.u - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = this.v - getPaddingBottom();
            i = getPaddingTop();
        }
        k(i2 - i);
    }

    private int a(o oVar, s sVar, int i) {
        if (!sVar.g) {
            return this.b.c(i, this.a);
        }
        int a2 = oVar.a(i);
        if (a2 != -1) {
            return this.b.c(a2, this.a);
        }
        new StringBuilder("Cannot find span size for pre layout position. ").append(i);
        return 0;
    }

    private int b(o oVar, s sVar, int i) {
        if (!sVar.g) {
            return this.b.b(i, this.a);
        }
        int i2 = this.A.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = oVar.a(i);
        if (a2 != -1) {
            return this.b.b(a2, this.a);
        }
        new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i);
        return 0;
    }

    private int c(o oVar, s sVar, int i) {
        if (!sVar.g) {
            return this.b.a(i);
        }
        int i2 = this.z.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = oVar.a(i);
        if (a2 != -1) {
            return this.b.a(a2);
        }
        new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i);
        return 1;
    }
}
