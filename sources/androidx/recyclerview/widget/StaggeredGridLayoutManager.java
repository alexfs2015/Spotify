package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends i implements androidx.recyclerview.widget.RecyclerView.r.b {
    private int A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private c F;
    private int G;
    private final Rect H;
    private final a I;
    private boolean J;
    private boolean K;
    private int[] L;
    private final Runnable M;
    d[] a;
    oh b;
    boolean c;
    b d;
    private int e;
    private oh f;
    private int g;
    private int w;
    private final oc x;
    private boolean y;
    private BitSet z;

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        d a;

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

        public final int a() {
            d dVar = this.a;
            if (dVar == null) {
                return -1;
            }
            return dVar.c;
        }
    }

    class a {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;

        a() {
            a();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.a.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = dVarArr[i].a(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            int i;
            if (this.c) {
                i = StaggeredGridLayoutManager.this.b.c();
            } else {
                i = StaggeredGridLayoutManager.this.b.b();
            }
            this.b = i;
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.b.c() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.b.b() + i;
            }
        }
    }

    static class b {
        int[] a;
        List<a> b;

        static class a implements Parcelable {
            public static final Creator<a> CREATOR = new Creator<a>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new a[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }
            };
            int a;
            int b;
            int[] c;
            boolean d;

            public int describeContents() {
                return 0;
            }

            a(Parcel parcel) {
                this.a = parcel.readInt();
                this.b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.c = new int[readInt];
                    parcel.readIntArray(this.c);
                }
            }

            a() {
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.c);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
                sb.append(this.a);
                sb.append(", mGapDir=");
                sb.append(this.b);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.d);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.c));
                sb.append('}');
                return sb.toString();
            }
        }

        b() {
        }

        /* access modifiers changed from: 0000 */
        public final int a(int i) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.b.get(size)).a >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return b(i);
        }

        /* access modifiers changed from: 0000 */
        public final int b(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = g(i);
            if (g == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: 0000 */
        public final int c(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, d dVar) {
            f(i);
            this.a[i] = dVar.c;
        }

        private int e(int i) {
            int length = this.a.length;
            while (length <= i) {
                length <<= 1;
            }
            return length;
        }

        private void f(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                this.a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.a, -1);
                return;
            }
            if (i >= iArr.length) {
                this.a = new int[e(i)];
                System.arraycopy(iArr, 0, this.a, 0, iArr.length);
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                f(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                c(i, i2);
            }
        }

        private void c(int i, int i2) {
            List<a> list = this.b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.b.get(size);
                    if (aVar.a >= i) {
                        if (aVar.a < i3) {
                            this.b.remove(size);
                        } else {
                            aVar.a -= i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                f(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.a, i, i3, -1);
                d(i, i2);
            }
        }

        private void d(int i, int i2) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.b.get(size);
                    if (aVar.a >= i) {
                        aVar.a += i2;
                    }
                }
            }
        }

        private int g(int i) {
            if (this.b == null) {
                return -1;
            }
            a d = d(i);
            if (d != null) {
                this.b.remove(d);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((a) this.b.get(i2)).a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            a aVar = (a) this.b.get(i2);
            this.b.remove(i2);
            return aVar.a;
        }

        public final a d(int i) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public final a a(int i, int i2, int i3, boolean z) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = (a) this.b.get(i4);
                if (aVar.a >= i2) {
                    return null;
                }
                if (aVar.a >= i && (i3 == 0 || aVar.b == i3 || aVar.d)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public static class c implements Parcelable {
        public static final Creator<c> CREATOR = new Creator<c>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }
        };
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        List<a> g;
        boolean h;
        boolean i;
        boolean j;

        public final int describeContents() {
            return 0;
        }

        public c() {
        }

        c(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            int i2 = this.c;
            if (i2 > 0) {
                this.d = new int[i2];
                parcel.readIntArray(this.d);
            }
            this.e = parcel.readInt();
            int i3 = this.e;
            if (i3 > 0) {
                this.f = new int[i3];
                parcel.readIntArray(this.f);
            }
            boolean z = false;
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.j = z;
            this.g = parcel.readArrayList(a.class.getClassLoader());
        }

        public c(c cVar) {
            this.c = cVar.c;
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.h = cVar.h;
            this.i = cVar.i;
            this.j = cVar.j;
            this.g = cVar.g;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }
    }

    class d {
        ArrayList<View> a = new ArrayList<>();
        int b = 0;
        final int c;
        private int d = Integer.MIN_VALUE;
        private int e = Integer.MIN_VALUE;

        d(int i) {
            this.c = i;
        }

        /* access modifiers changed from: 0000 */
        public final int a(int i) {
            int i2 = this.d;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            h();
            return this.d;
        }

        private void h() {
            View view = (View) this.a.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.d = StaggeredGridLayoutManager.this.b.a(view);
        }

        /* access modifiers changed from: 0000 */
        public final int a() {
            int i = this.d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            h();
            return this.d;
        }

        /* access modifiers changed from: 0000 */
        public final int b(int i) {
            int i2 = this.e;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            i();
            return this.e;
        }

        private void i() {
            ArrayList<View> arrayList = this.a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.e = StaggeredGridLayoutManager.this.b.b(view);
        }

        /* access modifiers changed from: 0000 */
        public final int b() {
            int i = this.e;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            i();
            return this.e;
        }

        /* access modifiers changed from: 0000 */
        public final void a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = b(Integer.MIN_VALUE);
            } else {
                i2 = a(Integer.MIN_VALUE);
            }
            c();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= StaggeredGridLayoutManager.this.b.c()) && (z || i2 <= StaggeredGridLayoutManager.this.b.b())) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.e = i2;
                    this.d = i2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            this.a.clear();
            j();
            this.b = 0;
        }

        private void j() {
            this.d = Integer.MIN_VALUE;
            this.e = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        public final void c(int i) {
            this.d = i;
            this.e = i;
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            int size = this.a.size();
            View view = (View) this.a.remove(size - 1);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.a = null;
            if (layoutParams.c.n() || layoutParams.c.u()) {
                this.b -= StaggeredGridLayoutManager.this.b.e(view);
            }
            if (size == 1) {
                this.d = Integer.MIN_VALUE;
            }
            this.e = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        public final void e() {
            View view = (View) this.a.remove(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.a = null;
            if (this.a.size() == 0) {
                this.e = Integer.MIN_VALUE;
            }
            if (layoutParams.c.n() || layoutParams.c.u()) {
                this.b -= StaggeredGridLayoutManager.this.b.e(view);
            }
            this.d = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        public final void d(int i) {
            int i2 = this.d;
            if (i2 != Integer.MIN_VALUE) {
                this.d = i2 + i;
            }
            int i3 = this.e;
            if (i3 != Integer.MIN_VALUE) {
                this.e = i3 + i;
            }
        }

        public final int f() {
            if (StaggeredGridLayoutManager.this.c) {
                return a(this.a.size() - 1, -1, true);
            }
            return a(0, this.a.size(), true);
        }

        public final int g() {
            if (StaggeredGridLayoutManager.this.c) {
                return a(0, this.a.size(), true);
            }
            return a(this.a.size() - 1, -1, true);
        }

        private int a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int b2 = StaggeredGridLayoutManager.this.b.b();
            int c2 = StaggeredGridLayoutManager.this.b.c();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.a.get(i);
                int a2 = StaggeredGridLayoutManager.this.b.a(view);
                int b3 = StaggeredGridLayoutManager.this.b.b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? a2 < c2 : a2 <= c2;
                if (!z3 ? b3 > b2 : b3 >= b2) {
                    z4 = true;
                }
                if (z5 && z4 && (a2 < b2 || b3 > c2)) {
                    return StaggeredGridLayoutManager.c(view);
                }
                i += i3;
            }
            return -1;
        }

        private int a(int i, int i2, boolean z) {
            return a(i, i2, false, false, true);
        }

        public final View a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.a.get(size);
                    if ((StaggeredGridLayoutManager.this.c && StaggeredGridLayoutManager.c(view2) >= i) || ((!StaggeredGridLayoutManager.this.c && StaggeredGridLayoutManager.c(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.a.get(i3);
                    if ((StaggeredGridLayoutManager.this.c && StaggeredGridLayoutManager.c(view3) <= i) || ((!StaggeredGridLayoutManager.this.c && StaggeredGridLayoutManager.c(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: 0000 */
        public final void a(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.a = this;
            this.a.add(0, view);
            this.d = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.e = Integer.MIN_VALUE;
            }
            if (layoutParams.c.n() || layoutParams.c.u()) {
                this.b += StaggeredGridLayoutManager.this.b.e(view);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.a = this;
            this.a.add(view);
            this.e = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.d = Integer.MIN_VALUE;
            }
            if (layoutParams.c.n() || layoutParams.c.u()) {
                this.b += StaggeredGridLayoutManager.this.b.e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = -1;
        this.c = false;
        this.y = false;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.d = new b();
        this.C = 2;
        this.H = new Rect();
        this.I = new a();
        this.J = false;
        this.K = true;
        this.M = new Runnable() {
            public final void run() {
                StaggeredGridLayoutManager.this.g();
            }
        };
        androidx.recyclerview.widget.RecyclerView.i.b a2 = a(context, attributeSet, i, i2);
        int i3 = a2.a;
        if (i3 == 0 || i3 == 1) {
            a((String) null);
            if (i3 != this.g) {
                this.g = i3;
                oh ohVar = this.b;
                this.b = this.f;
                this.f = ohVar;
                o_();
            }
            b(a2.b);
            a(a2.c);
            this.x = new oc();
            h();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.e = -1;
        this.c = false;
        this.y = false;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.d = new b();
        this.C = 2;
        this.H = new Rect();
        this.I = new a();
        this.J = false;
        this.K = true;
        this.M = new Runnable() {
            public final void run() {
                StaggeredGridLayoutManager.this.g();
            }
        };
        this.g = 0;
        b(2);
        this.x = new oc();
        h();
    }

    public final boolean p_() {
        return this.C != 0;
    }

    private void h() {
        this.b = oh.a(this, this.g);
        this.f = oh.a(this, 1 - this.g);
    }

    /* access modifiers changed from: 0000 */
    public final boolean g() {
        int i;
        int i2;
        if (r() == 0 || this.C == 0 || !this.m) {
            return false;
        }
        if (this.y) {
            i2 = v();
            i = w();
        } else {
            i2 = w();
            i = v();
        }
        if (i2 == 0 && j() != null) {
            this.d.a();
            this.l = true;
            o_();
            return true;
        } else if (!this.J) {
            return false;
        } else {
            int i3 = this.y ? -1 : 1;
            int i4 = i + 1;
            a a2 = this.d.a(i2, i4, i3, true);
            if (a2 == null) {
                this.J = false;
                this.d.a(i4);
                return false;
            }
            a a3 = this.d.a(i2, a2.a, -i3, true);
            if (a3 == null) {
                this.d.a(a2.a);
            } else {
                this.d.a(a3.a + 1);
            }
            this.l = true;
            o_();
            return true;
        }
    }

    public final void j(int i) {
        if (i == 0) {
            g();
        }
    }

    public final void a(RecyclerView recyclerView, o oVar) {
        super.a(recyclerView, oVar);
        a(this.M);
        for (int i = 0; i < this.e; i++) {
            this.a[i].c();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r10 == r11) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r10 == r11) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View j() {
        /*
            r12 = this;
            int r0 = r12.r()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.e
            r2.<init>(r3)
            int r3 = r12.e
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.g
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.l()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.y
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00a3
            android.view.View r7 = r12.g(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.a
            int r9 = r9.c
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.a
            boolean r9 = r12.a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.a
            int r9 = r9.c
            r2.clear(r9)
        L_0x0054:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x002e
            android.view.View r9 = r12.g(r0)
            boolean r10 = r12.y
            if (r10 == 0) goto L_0x0071
            oh r10 = r12.b
            int r10 = r10.b(r7)
            oh r11 = r12.b
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x006e
            return r7
        L_0x006e:
            if (r10 != r11) goto L_0x0084
            goto L_0x0082
        L_0x0071:
            oh r10 = r12.b
            int r10 = r10.a(r7)
            oh r11 = r12.b
            int r11 = r11.a(r9)
            if (r10 <= r11) goto L_0x0080
            return r7
        L_0x0080:
            if (r10 != r11) goto L_0x0084
        L_0x0082:
            r10 = 1
            goto L_0x0085
        L_0x0084:
            r10 = 0
        L_0x0085:
            if (r10 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.a
            int r8 = r8.c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.a
            int r9 = r9.c
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x009a
            r8 = 1
            goto L_0x009b
        L_0x009a:
            r8 = 0
        L_0x009b:
            if (r3 >= 0) goto L_0x009f
            r9 = 1
            goto L_0x00a0
        L_0x009f:
            r9 = 0
        L_0x00a0:
            if (r8 == r9) goto L_0x002e
            return r7
        L_0x00a3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.j():android.view.View");
    }

    private boolean a(d dVar) {
        if (this.y) {
            if (dVar.b() < this.b.c()) {
                LayoutParams layoutParams = (LayoutParams) ((View) dVar.a.get(dVar.a.size() - 1)).getLayoutParams();
                return true;
            }
        } else if (dVar.a() > this.b.b()) {
            LayoutParams layoutParams2 = (LayoutParams) ((View) dVar.a.get(0)).getLayoutParams();
            return true;
        }
        return false;
    }

    private void b(int i) {
        a((String) null);
        if (i != this.e) {
            this.d.a();
            o_();
            this.e = i;
            this.z = new BitSet(this.e);
            this.a = new d[this.e];
            for (int i2 = 0; i2 < this.e; i2++) {
                this.a[i2] = new d(i2);
            }
            o_();
        }
    }

    private void a(boolean z2) {
        a((String) null);
        c cVar = this.F;
        if (!(cVar == null || cVar.h == z2)) {
            this.F.h = z2;
        }
        this.c = z2;
        o_();
    }

    public final void a(int i) {
        a((String) null);
        if (2 != this.C) {
            this.C = 2;
            o_();
        }
    }

    public final void a(String str) {
        if (this.F == null) {
            super.a(str);
        }
    }

    private void k() {
        boolean z2 = true;
        if (this.g == 1 || !l()) {
            z2 = this.c;
        } else if (this.c) {
            z2 = false;
        }
        this.y = z2;
    }

    public final void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.g == 1) {
            i4 = a(i2, rect.height() + paddingTop, ip.m(this.h));
            i3 = a(i, (this.w * this.e) + paddingLeft, ip.l(this.h));
        } else {
            i3 = a(i, rect.width() + paddingLeft, ip.l(this.h));
            i4 = a(i2, (this.w * this.e) + paddingTop, ip.m(this.h));
        }
        d(i3, i4);
    }

    public final void c(o oVar, s sVar) {
        a(oVar, sVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015f, code lost:
        if (g() != false) goto L_0x0163;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(androidx.recyclerview.widget.RecyclerView.o r9, androidx.recyclerview.widget.RecyclerView.s r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
        L_0x0001:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r1 = r8.I
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r2 = r8.F
            r3 = -1
            if (r2 != 0) goto L_0x000c
            int r2 = r8.A
            if (r2 == r3) goto L_0x0019
        L_0x000c:
            int r2 = r10.a()
            if (r2 != 0) goto L_0x0019
            r8.c(r9)
            r1.a()
            return
        L_0x0019:
            boolean r2 = r1.e
            r4 = 1
            if (r2 == 0) goto L_0x0029
            int r2 = r8.A
            if (r2 != r3) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r2 = r8.F
            if (r2 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            if (r2 == 0) goto L_0x0043
            r1.a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = r8.F
            if (r5 == 0) goto L_0x0037
            r8.a(r1)
            goto L_0x003e
        L_0x0037:
            r8.k()
            boolean r5 = r8.y
            r1.c = r5
        L_0x003e:
            r8.a(r10, r1)
            r1.e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = r8.F
            if (r5 != 0) goto L_0x0060
            int r5 = r8.A
            if (r5 != r3) goto L_0x0060
            boolean r5 = r1.c
            boolean r6 = r8.D
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.l()
            boolean r6 = r8.E
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r5 = r8.d
            r5.a()
            r1.d = r4
        L_0x0060:
            int r5 = r8.r()
            if (r5 <= 0) goto L_0x00cb
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = r8.F
            if (r5 == 0) goto L_0x006e
            int r5 = r5.c
            if (r5 > 0) goto L_0x00cb
        L_0x006e:
            boolean r5 = r1.d
            if (r5 == 0) goto L_0x0090
            r2 = 0
        L_0x0073:
            int r5 = r8.e
            if (r2 >= r5) goto L_0x00cb
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.a
            r5 = r5[r2]
            r5.c()
            int r5 = r1.b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.a
            r5 = r5[r2]
            int r6 = r1.b
            r5.c(r6)
        L_0x008d:
            int r2 = r2 + 1
            goto L_0x0073
        L_0x0090:
            if (r2 != 0) goto L_0x00b1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r2 = r8.I
            int[] r2 = r2.f
            if (r2 != 0) goto L_0x0099
            goto L_0x00b1
        L_0x0099:
            r2 = 0
        L_0x009a:
            int r5 = r8.e
            if (r2 >= r5) goto L_0x00cb
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.a
            r5 = r5[r2]
            r5.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r6 = r8.I
            int[] r6 = r6.f
            r6 = r6[r2]
            r5.c(r6)
            int r2 = r2 + 1
            goto L_0x009a
        L_0x00b1:
            r2 = 0
        L_0x00b2:
            int r5 = r8.e
            if (r2 >= r5) goto L_0x00c4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.a
            r5 = r5[r2]
            boolean r6 = r8.y
            int r7 = r1.b
            r5.a(r6, r7)
            int r2 = r2 + 1
            goto L_0x00b2
        L_0x00c4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r2 = r8.I
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.a
            r2.a(r5)
        L_0x00cb:
            r8.a(r9)
            oc r2 = r8.x
            r2.a = r0
            r8.J = r0
            oh r2 = r8.f
            int r2 = r2.e()
            r8.f(r2)
            int r2 = r1.a
            r8.a(r2, r10)
            boolean r2 = r1.c
            if (r2 == 0) goto L_0x0102
            r8.k(r3)
            oc r2 = r8.x
            r8.a(r9, r2, r10)
            r8.k(r4)
            oc r2 = r8.x
            int r3 = r1.a
            oc r5 = r8.x
            int r5 = r5.d
            int r3 = r3 + r5
            r2.c = r3
            oc r2 = r8.x
            r8.a(r9, r2, r10)
            goto L_0x011d
        L_0x0102:
            r8.k(r4)
            oc r2 = r8.x
            r8.a(r9, r2, r10)
            r8.k(r3)
            oc r2 = r8.x
            int r3 = r1.a
            oc r5 = r8.x
            int r5 = r5.d
            int r3 = r3 + r5
            r2.c = r3
            oc r2 = r8.x
            r8.a(r9, r2, r10)
        L_0x011d:
            r8.m()
            int r2 = r8.r()
            if (r2 <= 0) goto L_0x0137
            boolean r2 = r8.y
            if (r2 == 0) goto L_0x0131
            r8.b(r9, r10, r4)
            r8.c(r9, r10, r0)
            goto L_0x0137
        L_0x0131:
            r8.c(r9, r10, r4)
            r8.b(r9, r10, r0)
        L_0x0137:
            if (r11 == 0) goto L_0x0162
            boolean r11 = r10.g
            if (r11 != 0) goto L_0x0162
            int r11 = r8.C
            if (r11 == 0) goto L_0x0153
            int r11 = r8.r()
            if (r11 <= 0) goto L_0x0153
            boolean r11 = r8.J
            if (r11 != 0) goto L_0x0151
            android.view.View r11 = r8.j()
            if (r11 == 0) goto L_0x0153
        L_0x0151:
            r11 = 1
            goto L_0x0154
        L_0x0153:
            r11 = 0
        L_0x0154:
            if (r11 == 0) goto L_0x0162
            java.lang.Runnable r11 = r8.M
            r8.a(r11)
            boolean r11 = r8.g()
            if (r11 == 0) goto L_0x0162
            goto L_0x0163
        L_0x0162:
            r4 = 0
        L_0x0163:
            boolean r11 = r10.g
            if (r11 == 0) goto L_0x016c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r11 = r8.I
            r11.a()
        L_0x016c:
            boolean r11 = r1.c
            r8.D = r11
            boolean r11 = r8.l()
            r8.E = r11
            if (r4 == 0) goto L_0x0180
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r11 = r8.I
            r11.a()
            r11 = 0
            goto L_0x0001
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s, boolean):void");
    }

    public final void a(s sVar) {
        super.a(sVar);
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.F = null;
        this.I.a();
    }

    private void m() {
        if (this.f.g() != 1073741824) {
            int r = r();
            float f2 = 0.0f;
            for (int i = 0; i < r; i++) {
                View g2 = g(i);
                float e2 = (float) this.f.e(g2);
                if (e2 >= f2) {
                    LayoutParams layoutParams = (LayoutParams) g2.getLayoutParams();
                    f2 = Math.max(f2, e2);
                }
            }
            int i2 = this.w;
            int round = Math.round(f2 * ((float) this.e));
            if (this.f.g() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f.e());
            }
            f(round);
            if (this.w != i2) {
                for (int i3 = 0; i3 < r; i3++) {
                    View g3 = g(i3);
                    LayoutParams layoutParams2 = (LayoutParams) g3.getLayoutParams();
                    if (!l() || this.g != 1) {
                        int i4 = layoutParams2.a.c * this.w;
                        int i5 = layoutParams2.a.c * i2;
                        if (this.g == 1) {
                            g3.offsetLeftAndRight(i4 - i5);
                        } else {
                            g3.offsetTopAndBottom(i4 - i5);
                        }
                    } else {
                        g3.offsetLeftAndRight(((-((this.e - 1) - layoutParams2.a.c)) * this.w) - ((-((this.e - 1) - layoutParams2.a.c)) * i2));
                    }
                }
            }
        }
    }

    private void a(a aVar) {
        int i;
        if (this.F.c > 0) {
            if (this.F.c == this.e) {
                for (int i2 = 0; i2 < this.e; i2++) {
                    this.a[i2].c();
                    int i3 = this.F.d[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (this.F.i) {
                            i = this.b.c();
                        } else {
                            i = this.b.b();
                        }
                        i3 += i;
                    }
                    this.a[i2].c(i3);
                }
            } else {
                this.F.a();
                c cVar = this.F;
                cVar.a = cVar.b;
            }
        }
        this.E = this.F.j;
        a(this.F.h);
        k();
        if (this.F.a != -1) {
            this.A = this.F.a;
            aVar.c = this.F.i;
        } else {
            aVar.c = this.y;
        }
        if (this.F.e > 1) {
            this.d.a = this.F.f;
            this.d.b = this.F.g;
        }
    }

    private void a(s sVar, a aVar) {
        if (!c(sVar, aVar)) {
            b(sVar, aVar);
        }
    }

    private boolean b(s sVar, a aVar) {
        int i;
        if (this.D) {
            i = s(sVar.a());
        } else {
            i = r(sVar.a());
        }
        aVar.a = i;
        aVar.b = Integer.MIN_VALUE;
        return true;
    }

    private void f(int i) {
        this.w = i / this.e;
        this.G = MeasureSpec.makeMeasureSpec(i, this.f.g());
    }

    public final boolean q_() {
        return this.F == null;
    }

    public final int b(s sVar) {
        return h(sVar);
    }

    private int h(s sVar) {
        if (r() == 0) {
            return 0;
        }
        return ok.a(sVar, this.b, b(!this.K), c(!this.K), this, this.K, this.y);
    }

    public final int c(s sVar) {
        return h(sVar);
    }

    public final int d(s sVar) {
        return i(sVar);
    }

    private int i(s sVar) {
        if (r() == 0) {
            return 0;
        }
        return ok.a(sVar, this.b, b(!this.K), c(!this.K), this, this.K);
    }

    public final int e(s sVar) {
        return i(sVar);
    }

    public final int f(s sVar) {
        return j(sVar);
    }

    private int j(s sVar) {
        if (r() == 0) {
            return 0;
        }
        return ok.b(sVar, this.b, b(!this.K), c(!this.K), this, this.K);
    }

    public final int g(s sVar) {
        return j(sVar);
    }

    private void a(View view, LayoutParams layoutParams, boolean z2) {
        if (this.g == 1) {
            a(view, a(this.w, this.s, 0, layoutParams.width, false), a(this.v, this.t, getPaddingTop() + getPaddingBottom(), layoutParams.height, true), false);
        } else {
            a(view, a(this.u, this.s, getPaddingLeft() + getPaddingRight(), layoutParams.width, true), a(this.w, this.t, 0, layoutParams.height, false), false);
        }
    }

    private void a(View view, int i, int i2, boolean z2) {
        boolean z3;
        b(view, this.H);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int b2 = b(i, layoutParams.leftMargin + this.H.left, layoutParams.rightMargin + this.H.right);
        int b3 = b(i2, layoutParams.topMargin + this.H.top, layoutParams.bottomMargin + this.H.bottom);
        if (z2) {
            z3 = a(view, b2, b3, (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
        } else {
            z3 = b(view, b2, b3, layoutParams);
        }
        if (z3) {
            view.measure(b2, b3);
        }
    }

    private static int b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof c) {
            this.F = (c) parcelable;
            o_();
        }
    }

    public final Parcelable d() {
        int i;
        View view;
        int i2;
        int i3;
        c cVar = this.F;
        if (cVar != null) {
            return new c(cVar);
        }
        c cVar2 = new c();
        cVar2.h = this.c;
        cVar2.i = this.D;
        cVar2.j = this.E;
        b bVar = this.d;
        if (bVar == null || bVar.a == null) {
            cVar2.e = 0;
        } else {
            cVar2.f = this.d.a;
            cVar2.e = cVar2.f.length;
            cVar2.g = this.d.b;
        }
        int i4 = -1;
        if (r() > 0) {
            if (this.D) {
                i = v();
            } else {
                i = w();
            }
            cVar2.a = i;
            if (this.y) {
                view = c(true);
            } else {
                view = b(true);
            }
            if (view != null) {
                i4 = c(view);
            }
            cVar2.b = i4;
            int i5 = this.e;
            cVar2.c = i5;
            cVar2.d = new int[i5];
            for (int i6 = 0; i6 < this.e; i6++) {
                if (this.D) {
                    i2 = this.a[i6].b(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.b.c();
                    } else {
                        cVar2.d[i6] = i2;
                    }
                } else {
                    i2 = this.a[i6].a(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.b.b();
                    } else {
                        cVar2.d[i6] = i2;
                    }
                }
                i2 -= i3;
                cVar2.d[i6] = i2;
            }
        } else {
            cVar2.a = -1;
            cVar2.b = -1;
            cVar2.c = 0;
        }
        return cVar2;
    }

    public final void a(o oVar, s sVar, View view, ja jaVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.a(view, jaVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.g == 0) {
            jaVar.a((Object) defpackage.ja.c.a(layoutParams2.a(), 1, -1, -1, false, false));
        } else {
            jaVar.a((Object) defpackage.ja.c.a(-1, -1, layoutParams2.a(), 1, false, false));
        }
    }

    public final void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (r() > 0) {
            View b2 = b(false);
            View c2 = c(false);
            if (!(b2 == null || c2 == null)) {
                int c3 = c(b2);
                int c4 = c(c2);
                if (c3 < c4) {
                    accessibilityEvent.setFromIndex(c3);
                    accessibilityEvent.setToIndex(c4);
                    return;
                }
                accessibilityEvent.setFromIndex(c4);
                accessibilityEvent.setToIndex(c3);
            }
        }
    }

    public final int a(o oVar, s sVar) {
        if (this.g == 0) {
            return this.e;
        }
        return super.a(oVar, sVar);
    }

    public final int b(o oVar, s sVar) {
        if (this.g == 1) {
            return this.e;
        }
        return super.b(oVar, sVar);
    }

    private View b(boolean z2) {
        int b2 = this.b.b();
        int c2 = this.b.c();
        int r = r();
        View view = null;
        for (int i = 0; i < r; i++) {
            View g2 = g(i);
            int a2 = this.b.a(g2);
            if (this.b.b(g2) > b2 && a2 < c2) {
                if (a2 >= b2 || !z2) {
                    return g2;
                }
                if (view == null) {
                    view = g2;
                }
            }
        }
        return view;
    }

    private View c(boolean z2) {
        int b2 = this.b.b();
        int c2 = this.b.c();
        View view = null;
        for (int r = r() - 1; r >= 0; r--) {
            View g2 = g(r);
            int a2 = this.b.a(g2);
            int b3 = this.b.b(g2);
            if (b3 > b2 && a2 < c2) {
                if (b3 <= c2 || !z2) {
                    return g2;
                }
                if (view == null) {
                    view = g2;
                }
            }
        }
        return view;
    }

    private void b(o oVar, s sVar, boolean z2) {
        int n = n(Integer.MIN_VALUE);
        if (n != Integer.MIN_VALUE) {
            int c2 = this.b.c() - n;
            if (c2 > 0) {
                int i = c2 - (-c(-c2, oVar, sVar));
                if (z2 && i > 0) {
                    this.b.a(i);
                }
            }
        }
    }

    private void c(o oVar, s sVar, boolean z2) {
        int m = m(Integer.MAX_VALUE);
        if (m != Integer.MAX_VALUE) {
            int b2 = m - this.b.b();
            if (b2 > 0) {
                int c2 = b2 - c(b2, oVar, sVar);
                if (z2 && c2 > 0) {
                    this.b.a(-c2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r5, androidx.recyclerview.widget.RecyclerView.s r6) {
        /*
            r4 = this;
            oc r0 = r4.x
            r1 = 0
            r0.b = r1
            r0.c = r5
            boolean r0 = r4.p()
            r2 = 1
            if (r0 == 0) goto L_0x002c
            int r6 = r6.a
            r0 = -1
            if (r6 == r0) goto L_0x002c
            boolean r0 = r4.y
            if (r6 >= r5) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r0 != r5) goto L_0x0023
            oh r5 = r4.b
            int r5 = r5.e()
            goto L_0x002d
        L_0x0023:
            oh r5 = r4.b
            int r5 = r5.e()
            r6 = r5
            r5 = 0
            goto L_0x002e
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = 0
        L_0x002e:
            boolean r0 = r4.o()
            if (r0 == 0) goto L_0x004b
            oc r0 = r4.x
            oh r3 = r4.b
            int r3 = r3.b()
            int r3 = r3 - r6
            r0.f = r3
            oc r6 = r4.x
            oh r0 = r4.b
            int r0 = r0.c()
            int r0 = r0 + r5
            r6.g = r0
            goto L_0x005b
        L_0x004b:
            oc r0 = r4.x
            oh r3 = r4.b
            int r3 = r3.d()
            int r3 = r3 + r5
            r0.g = r3
            oc r5 = r4.x
            int r6 = -r6
            r5.f = r6
        L_0x005b:
            oc r5 = r4.x
            r5.h = r1
            r5.a = r2
            oh r6 = r4.b
            int r6 = r6.g()
            if (r6 != 0) goto L_0x0072
            oh r6 = r4.b
            int r6 = r6.d()
            if (r6 != 0) goto L_0x0072
            r1 = 1
        L_0x0072:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    private void k(int i) {
        oc ocVar = this.x;
        ocVar.e = i;
        int i2 = 1;
        if (this.y != (i == -1)) {
            i2 = -1;
        }
        ocVar.d = i2;
    }

    public final void h(int i) {
        super.h(i);
        for (int i2 = 0; i2 < this.e; i2++) {
            this.a[i2].d(i);
        }
    }

    public final void i(int i) {
        super.i(i);
        for (int i2 = 0; i2 < this.e; i2++) {
            this.a[i2].d(i);
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 2);
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 1);
    }

    public final void a(RecyclerView recyclerView) {
        this.d.a();
        o_();
    }

    public final void a(RecyclerView recyclerView, int i, int i2, int i3) {
        c(i, i2, 8);
    }

    public final void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        c(i, i2, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.y
            if (r0 == 0) goto L_0x0009
            int r0 = r6.v()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.w()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r4 = r6.d
            r4.b(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r9 = r6.d
            r9.a(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r6.d
            r7.b(r8, r4)
            goto L_0x0043
        L_0x0038:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r9 = r6.d
            r9.a(r7, r8)
            goto L_0x0043
        L_0x003e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r9 = r6.d
            r9.b(r7, r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.y
            if (r7 == 0) goto L_0x004f
            int r7 = r6.w()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.v()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.o_()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(int, int, int):void");
    }

    private int a(o oVar, oc ocVar, s sVar) {
        int i;
        int i2;
        d dVar;
        int i3;
        int i4;
        int i5;
        int i6;
        this.z.set(0, this.e, true);
        int i7 = this.x.i ? ocVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : ocVar.e == 1 ? ocVar.g + ocVar.b : ocVar.f - ocVar.b;
        a(ocVar.e, i7);
        if (this.y) {
            i = this.b.c();
        } else {
            i = this.b.b();
        }
        boolean z2 = false;
        while (ocVar.a(sVar) && (this.x.i || !this.z.isEmpty())) {
            View a2 = ocVar.a(oVar);
            LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
            int d2 = layoutParams.c.d();
            int c2 = this.d.c(d2);
            if (c2 == -1) {
                dVar = a(ocVar);
                this.d.a(d2, dVar);
            } else {
                dVar = this.a[c2];
            }
            layoutParams.a = dVar;
            if (ocVar.e == 1) {
                a(a2);
            } else {
                b(a2, 0);
            }
            a(a2, layoutParams, false);
            if (ocVar.e == 1) {
                i4 = dVar.b(i);
                i3 = this.b.e(a2) + i4;
            } else {
                i3 = dVar.a(i);
                i4 = i3 - this.b.e(a2);
            }
            a(a2, layoutParams, ocVar);
            if (!l() || this.g != 1) {
                i5 = this.f.b() + (dVar.c * this.w);
                i6 = this.f.e(a2) + i5;
            } else {
                i6 = this.f.c() - (((this.e - 1) - dVar.c) * this.w);
                i5 = i6 - this.f.e(a2);
            }
            if (this.g == 1) {
                b(a2, i5, i4, i6, i3);
            } else {
                b(a2, i4, i5, i3, i6);
            }
            a(dVar, this.x.e, i7);
            a(oVar, this.x);
            if (this.x.h && a2.hasFocusable()) {
                this.z.set(dVar.c, false);
            }
            z2 = true;
        }
        if (!z2) {
            a(oVar, this.x);
        }
        if (this.x.e == -1) {
            i2 = this.b.b() - m(this.b.b());
        } else {
            i2 = n(this.b.c()) - this.b.c();
        }
        if (i2 > 0) {
            return Math.min(ocVar.b, i2);
        }
        return 0;
    }

    private void a(View view, LayoutParams layoutParams, oc ocVar) {
        if (ocVar.e == 1) {
            layoutParams.a.b(view);
        } else {
            layoutParams.a.a(view);
        }
    }

    private void a(o oVar, oc ocVar) {
        int i;
        int i2;
        if (ocVar.a && !ocVar.i) {
            if (ocVar.b == 0) {
                if (ocVar.e == -1) {
                    b(oVar, ocVar.g);
                } else {
                    a(oVar, ocVar.f);
                }
            } else if (ocVar.e == -1) {
                int l = ocVar.f - l(ocVar.f);
                if (l < 0) {
                    i2 = ocVar.g;
                } else {
                    i2 = ocVar.g - Math.min(l, ocVar.b);
                }
                b(oVar, i2);
            } else {
                int o = o(ocVar.g) - ocVar.g;
                if (o < 0) {
                    i = ocVar.f;
                } else {
                    i = Math.min(o, ocVar.b) + ocVar.f;
                }
                a(oVar, i);
            }
        }
    }

    private void a(int i, int i2) {
        for (int i3 = 0; i3 < this.e; i3++) {
            if (!this.a[i3].a.isEmpty()) {
                a(this.a[i3], i, i2);
            }
        }
    }

    private int l(int i) {
        int a2 = this.a[0].a(i);
        for (int i2 = 1; i2 < this.e; i2++) {
            int a3 = this.a[i2].a(i);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int m(int i) {
        int a2 = this.a[0].a(i);
        for (int i2 = 1; i2 < this.e; i2++) {
            int a3 = this.a[i2].a(i);
            if (a3 < a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int n(int i) {
        int b2 = this.a[0].b(i);
        for (int i2 = 1; i2 < this.e; i2++) {
            int b3 = this.a[i2].b(i);
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int o(int i) {
        int b2 = this.a[0].b(i);
        for (int i2 = 1; i2 < this.e; i2++) {
            int b3 = this.a[i2].b(i);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private void a(o oVar, int i) {
        while (r() > 0) {
            View g2 = g(0);
            if (this.b.b(g2) > i || this.b.c(g2) > i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) g2.getLayoutParams();
            if (layoutParams.a.a.size() != 1) {
                layoutParams.a.e();
                a(g2, oVar);
            } else {
                return;
            }
        }
    }

    private void b(o oVar, int i) {
        int r = r() - 1;
        while (r >= 0) {
            View g2 = g(r);
            if (this.b.a(g2) < i || this.b.d(g2) < i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) g2.getLayoutParams();
            if (layoutParams.a.a.size() != 1) {
                layoutParams.a.d();
                a(g2, oVar);
                r--;
            } else {
                return;
            }
        }
    }

    private boolean p(int i) {
        if (this.g == 0) {
            return (i == -1) != this.y;
        }
        return ((i == -1) == this.y) == l();
    }

    private d a(oc ocVar) {
        int i;
        int i2;
        int i3 = -1;
        if (p(ocVar.e)) {
            i2 = this.e - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.e;
            i = 1;
        }
        d dVar = null;
        if (ocVar.e == 1) {
            int i4 = Integer.MAX_VALUE;
            int b2 = this.b.b();
            while (i2 != i3) {
                d dVar2 = this.a[i2];
                int b3 = dVar2.b(b2);
                if (b3 < i4) {
                    dVar = dVar2;
                    i4 = b3;
                }
                i2 += i;
            }
            return dVar;
        }
        int i5 = Integer.MIN_VALUE;
        int c2 = this.b.c();
        while (i2 != i3) {
            d dVar3 = this.a[i2];
            int a2 = dVar3.a(c2);
            if (a2 > i5) {
                dVar = dVar3;
                i5 = a2;
            }
            i2 += i;
        }
        return dVar;
    }

    public final boolean f() {
        return this.g == 1;
    }

    public final boolean e() {
        return this.g == 0;
    }

    public final int a(int i, o oVar, s sVar) {
        return c(i, oVar, sVar);
    }

    public final int b(int i, o oVar, s sVar) {
        return c(i, oVar, sVar);
    }

    private int q(int i) {
        if (r() == 0) {
            return this.y ? 1 : -1;
        }
        return (i < w()) != this.y ? -1 : 1;
    }

    public final PointF d(int i) {
        int q = q(i);
        PointF pointF = new PointF();
        if (q == 0) {
            return null;
        }
        if (this.g == 0) {
            pointF.x = (float) q;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) q;
        }
        return pointF;
    }

    public final void a(RecyclerView recyclerView, s sVar, int i) {
        od odVar = new od(recyclerView.getContext());
        odVar.b = i;
        a((r) odVar);
    }

    public final void e(int i) {
        c cVar = this.F;
        if (!(cVar == null || cVar.a == i)) {
            c cVar2 = this.F;
            cVar2.d = null;
            cVar2.c = 0;
            cVar2.a = -1;
            cVar2.b = -1;
        }
        this.A = i;
        this.B = Integer.MIN_VALUE;
        o_();
    }

    public final void a(int i, int i2, s sVar, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        int i3;
        int i4;
        if (this.g != 0) {
            i = i2;
        }
        if (r() != 0 && i != 0) {
            b(i, sVar);
            int[] iArr = this.L;
            if (iArr == null || iArr.length < this.e) {
                this.L = new int[this.e];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.e; i6++) {
                if (this.x.d == -1) {
                    i4 = this.x.f;
                    i3 = this.a[i6].a(this.x.f);
                } else {
                    i4 = this.a[i6].b(this.x.g);
                    i3 = this.x.g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.L[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.L, 0, i5);
            for (int i8 = 0; i8 < i5 && this.x.a(sVar); i8++) {
                aVar.a(this.x.c, this.L[i8]);
                this.x.c += this.x.d;
            }
        }
    }

    private void b(int i, s sVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = v();
            i2 = 1;
        } else {
            i3 = w();
            i2 = -1;
        }
        this.x.a = true;
        a(i3, sVar);
        k(i2);
        oc ocVar = this.x;
        ocVar.c = i3 + ocVar.d;
        this.x.b = Math.abs(i);
    }

    private int c(int i, o oVar, s sVar) {
        if (r() == 0 || i == 0) {
            return 0;
        }
        b(i, sVar);
        int a2 = a(oVar, this.x, sVar);
        if (this.x.b >= a2) {
            i = i < 0 ? -a2 : a2;
        }
        this.b.a(-i);
        this.D = this.y;
        oc ocVar = this.x;
        ocVar.b = 0;
        a(oVar, ocVar);
        return i;
    }

    private int v() {
        int r = r();
        if (r == 0) {
            return 0;
        }
        return c(g(r - 1));
    }

    private int w() {
        if (r() == 0) {
            return 0;
        }
        return c(g(0));
    }

    private int r(int i) {
        int r = r();
        for (int i2 = 0; i2 < r; i2++) {
            int c2 = c(g(i2));
            if (c2 >= 0 && c2 < i) {
                return c2;
            }
        }
        return 0;
    }

    private int s(int i) {
        for (int r = r() - 1; r >= 0; r--) {
            int c2 = c(g(r));
            if (c2 >= 0 && c2 < i) {
                return c2;
            }
        }
        return 0;
    }

    public final androidx.recyclerview.widget.RecyclerView.LayoutParams a() {
        if (this.g == 0) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r8.g == 1) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r8.g == 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (l() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (l() == false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.o r11, androidx.recyclerview.widget.RecyclerView.s r12) {
        /*
            r8 = this;
            int r0 = r8.r()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.e(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.k()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r10 == r3) goto L_0x004f
            r4 = 2
            if (r10 == r4) goto L_0x0042
            r4 = 17
            if (r10 == r4) goto L_0x003d
            r4 = 33
            if (r10 == r4) goto L_0x0038
            r4 = 66
            if (r10 == r4) goto L_0x0033
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x002e
        L_0x002b:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005c
        L_0x002e:
            int r10 = r8.g
            if (r10 != r3) goto L_0x002b
            goto L_0x0046
        L_0x0033:
            int r10 = r8.g
            if (r10 != 0) goto L_0x002b
            goto L_0x0046
        L_0x0038:
            int r10 = r8.g
            if (r10 != r3) goto L_0x002b
            goto L_0x0053
        L_0x003d:
            int r10 = r8.g
            if (r10 != 0) goto L_0x002b
            goto L_0x0053
        L_0x0042:
            int r10 = r8.g
            if (r10 != r3) goto L_0x0048
        L_0x0046:
            r10 = 1
            goto L_0x005c
        L_0x0048:
            boolean r10 = r8.l()
            if (r10 == 0) goto L_0x0046
            goto L_0x0053
        L_0x004f:
            int r10 = r8.g
            if (r10 != r3) goto L_0x0055
        L_0x0053:
            r10 = -1
            goto L_0x005c
        L_0x0055:
            boolean r10 = r8.l()
            if (r10 == 0) goto L_0x0053
            goto L_0x0046
        L_0x005c:
            if (r10 != r0) goto L_0x005f
            return r1
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r0.a
            if (r10 != r3) goto L_0x006e
            int r4 = r8.v()
            goto L_0x0072
        L_0x006e:
            int r4 = r8.w()
        L_0x0072:
            r8.a(r4, r12)
            r8.k(r10)
            oc r5 = r8.x
            int r6 = r5.d
            int r6 = r6 + r4
            r5.c = r6
            oc r5 = r8.x
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            oh r7 = r8.b
            int r7 = r7.e()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.b = r6
            oc r5 = r8.x
            r5.h = r3
            r6 = 0
            r5.a = r6
            r8.a(r11, r5, r12)
            boolean r11 = r8.y
            r8.D = r11
            android.view.View r11 = r0.a(r4, r10)
            if (r11 == 0) goto L_0x00a7
            if (r11 == r9) goto L_0x00a7
            return r11
        L_0x00a7:
            boolean r11 = r8.p(r10)
            if (r11 == 0) goto L_0x00c2
            int r11 = r8.e
            int r11 = r11 - r3
        L_0x00b0:
            if (r11 < 0) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r12 = r8.a
            r12 = r12[r11]
            android.view.View r12 = r12.a(r4, r10)
            if (r12 == 0) goto L_0x00bf
            if (r12 == r9) goto L_0x00bf
            return r12
        L_0x00bf:
            int r11 = r11 + -1
            goto L_0x00b0
        L_0x00c2:
            r11 = 0
        L_0x00c3:
            int r12 = r8.e
            if (r11 >= r12) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r12 = r8.a
            r12 = r12[r11]
            android.view.View r12 = r12.a(r4, r10)
            if (r12 == 0) goto L_0x00d4
            if (r12 == r9) goto L_0x00d4
            return r12
        L_0x00d4:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00d7:
            boolean r11 = r8.c
            r11 = r11 ^ r3
            if (r10 != r2) goto L_0x00de
            r12 = 1
            goto L_0x00df
        L_0x00de:
            r12 = 0
        L_0x00df:
            if (r11 != r12) goto L_0x00e3
            r11 = 1
            goto L_0x00e4
        L_0x00e3:
            r11 = 0
        L_0x00e4:
            if (r11 == 0) goto L_0x00eb
            int r12 = r0.f()
            goto L_0x00ef
        L_0x00eb:
            int r12 = r0.g()
        L_0x00ef:
            android.view.View r12 = r8.c(r12)
            if (r12 == 0) goto L_0x00f8
            if (r12 == r9) goto L_0x00f8
            return r12
        L_0x00f8:
            boolean r10 = r8.p(r10)
            if (r10 == 0) goto L_0x0126
            int r10 = r8.e
            int r10 = r10 - r3
        L_0x0101:
            if (r10 < 0) goto L_0x0149
            int r12 = r0.c
            if (r10 == r12) goto L_0x0123
            if (r11 == 0) goto L_0x0112
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r12 = r8.a
            r12 = r12[r10]
            int r12 = r12.f()
            goto L_0x011a
        L_0x0112:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r12 = r8.a
            r12 = r12[r10]
            int r12 = r12.g()
        L_0x011a:
            android.view.View r12 = r8.c(r12)
            if (r12 == 0) goto L_0x0123
            if (r12 == r9) goto L_0x0123
            return r12
        L_0x0123:
            int r10 = r10 + -1
            goto L_0x0101
        L_0x0126:
            int r10 = r8.e
            if (r6 >= r10) goto L_0x0149
            if (r11 == 0) goto L_0x0135
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r10 = r8.a
            r10 = r10[r6]
            int r10 = r10.f()
            goto L_0x013d
        L_0x0135:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r10 = r8.a
            r10 = r10[r6]
            int r10 = r10.g()
        L_0x013d:
            android.view.View r10 = r8.c(r10)
            if (r10 == 0) goto L_0x0146
            if (r10 == r9) goto L_0x0146
            return r10
        L_0x0146:
            int r6 = r6 + 1
            goto L_0x0126
        L_0x0149:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):android.view.View");
    }

    private boolean l() {
        return ip.f(this.h) == 1;
    }

    private boolean c(s sVar, a aVar) {
        int i;
        int i2;
        boolean z2 = false;
        if (!sVar.g) {
            int i3 = this.A;
            if (i3 != -1) {
                if (i3 < 0 || i3 >= sVar.a()) {
                    this.A = -1;
                    this.B = Integer.MIN_VALUE;
                } else {
                    c cVar = this.F;
                    if (cVar == null || cVar.a == -1 || this.F.c <= 0) {
                        View c2 = c(this.A);
                        if (c2 != null) {
                            if (this.y) {
                                i = v();
                            } else {
                                i = w();
                            }
                            aVar.a = i;
                            if (this.B != Integer.MIN_VALUE) {
                                if (aVar.c) {
                                    aVar.b = (this.b.c() - this.B) - this.b.b(c2);
                                } else {
                                    aVar.b = (this.b.b() + this.B) - this.b.a(c2);
                                }
                                return true;
                            } else if (this.b.e(c2) > this.b.e()) {
                                if (aVar.c) {
                                    i2 = this.b.c();
                                } else {
                                    i2 = this.b.b();
                                }
                                aVar.b = i2;
                                return true;
                            } else {
                                int a2 = this.b.a(c2) - this.b.b();
                                if (a2 < 0) {
                                    aVar.b = -a2;
                                    return true;
                                }
                                int c3 = this.b.c() - this.b.b(c2);
                                if (c3 < 0) {
                                    aVar.b = c3;
                                    return true;
                                }
                                aVar.b = Integer.MIN_VALUE;
                            }
                        } else {
                            aVar.a = this.A;
                            int i4 = this.B;
                            if (i4 == Integer.MIN_VALUE) {
                                if (q(aVar.a) == 1) {
                                    z2 = true;
                                }
                                aVar.c = z2;
                                aVar.b();
                            } else {
                                aVar.a(i4);
                            }
                            aVar.d = true;
                        }
                    } else {
                        aVar.b = Integer.MIN_VALUE;
                        aVar.a = this.A;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void a(d dVar, int i, int i2) {
        int i3 = dVar.b;
        if (i == -1) {
            if (dVar.a() + i3 <= i2) {
                this.z.set(dVar.c, false);
            }
            return;
        }
        if (dVar.b() - i3 >= i2) {
            this.z.set(dVar.c, false);
        }
    }
}
