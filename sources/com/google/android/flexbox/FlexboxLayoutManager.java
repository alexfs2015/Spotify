package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends i implements androidx.recyclerview.widget.RecyclerView.r.b, bej {
    private static /* synthetic */ boolean O = (!FlexboxLayoutManager.class.desiredAssertionStatus());
    private static final Rect a = new Rect();
    private b A;
    private a B;
    /* access modifiers changed from: private */
    public oh C;
    private oh D;
    private c E;
    private int F;
    private int G;
    private int H;
    private int I;
    private SparseArray<View> J;
    private final Context K;
    private View L;
    private int M;
    private defpackage.bem.a N;
    /* access modifiers changed from: private */
    public int b;
    /* access modifiers changed from: private */
    public int c;
    private int d;
    private int e;
    /* access modifiers changed from: private */
    public boolean f;
    private boolean g;
    /* access modifiers changed from: private */
    public List<bel> w;
    /* access modifiers changed from: private */
    public final bem x;
    private o y;
    private s z;

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams implements bek {
        public static final Creator<LayoutParams> CREATOR = new Creator<LayoutParams>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new LayoutParams[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }
        };
        private float a = 0.0f;
        private float b = 1.0f;
        private int g = -1;
        private float h = -1.0f;
        private int i;
        private int j;
        private int k = 16777215;
        private int l = 16777215;
        private boolean m;

        public final int c() {
            return 1;
        }

        public int describeContents() {
            return 0;
        }

        public final int a() {
            return this.width;
        }

        public final int b() {
            return this.height;
        }

        public final float d() {
            return this.a;
        }

        public final float e() {
            return this.b;
        }

        public final int f() {
            return this.g;
        }

        public final int g() {
            return this.i;
        }

        public final int h() {
            return this.j;
        }

        public final int i() {
            return this.k;
        }

        public final int j() {
            return this.l;
        }

        public final boolean k() {
            return this.m;
        }

        public final float l() {
            return this.h;
        }

        public final int m() {
            return this.leftMargin;
        }

        public final int n() {
            return this.topMargin;
        }

        public final int o() {
            return this.rightMargin;
        }

        public final int p() {
            return this.bottomMargin;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i2, int i3) {
            super(-2, -2);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.g = parcel.readInt();
            this.h = parcel.readFloat();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    class a {
        private static /* synthetic */ boolean h = (!FlexboxLayoutManager.class.desiredAssertionStatus());
        /* access modifiers changed from: private */
        public int a;
        /* access modifiers changed from: private */
        public int b;
        /* access modifiers changed from: private */
        public int c;
        /* access modifiers changed from: private */
        public int d;
        /* access modifiers changed from: private */
        public boolean e;
        /* access modifiers changed from: private */
        public boolean f;
        /* access modifiers changed from: private */
        public boolean g;

        private a() {
            this.d = 0;
        }

        /* synthetic */ a(FlexboxLayoutManager flexboxLayoutManager, byte b2) {
            this();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.d);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.e);
            sb.append(", mValid=");
            sb.append(this.f);
            sb.append(", mAssignedFromSavedState=");
            sb.append(this.g);
            sb.append('}');
            return sb.toString();
        }

        static /* synthetic */ void b(a aVar) {
            aVar.a = -1;
            aVar.b = -1;
            aVar.c = Integer.MIN_VALUE;
            boolean z = false;
            aVar.f = false;
            aVar.g = false;
            if (FlexboxLayoutManager.this.j()) {
                if (FlexboxLayoutManager.this.c == 0) {
                    if (FlexboxLayoutManager.this.b == 1) {
                        z = true;
                    }
                    aVar.e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.c == 2) {
                    z = true;
                }
                aVar.e = z;
            } else if (FlexboxLayoutManager.this.c == 0) {
                if (FlexboxLayoutManager.this.b == 3) {
                    z = true;
                }
                aVar.e = z;
            } else {
                if (FlexboxLayoutManager.this.c == 2) {
                    z = true;
                }
                aVar.e = z;
            }
        }

        static /* synthetic */ void f(a aVar) {
            int i2;
            int i3;
            if (FlexboxLayoutManager.this.j() || !FlexboxLayoutManager.this.f) {
                if (aVar.e) {
                    i2 = FlexboxLayoutManager.this.C.c();
                } else {
                    i2 = FlexboxLayoutManager.this.C.b();
                }
                aVar.c = i2;
                return;
            }
            if (aVar.e) {
                i3 = FlexboxLayoutManager.this.C.c();
            } else {
                i3 = FlexboxLayoutManager.this.u - FlexboxLayoutManager.this.C.b();
            }
            aVar.c = i3;
        }

        static /* synthetic */ void a(a aVar, View view) {
            if (FlexboxLayoutManager.this.j() || !FlexboxLayoutManager.this.f) {
                if (aVar.e) {
                    aVar.c = FlexboxLayoutManager.this.C.b(view) + FlexboxLayoutManager.this.C.a();
                } else {
                    aVar.c = FlexboxLayoutManager.this.C.a(view);
                }
            } else if (aVar.e) {
                aVar.c = FlexboxLayoutManager.this.C.a(view) + FlexboxLayoutManager.this.C.a();
            } else {
                aVar.c = FlexboxLayoutManager.this.C.b(view);
            }
            aVar.a = FlexboxLayoutManager.c(view);
            int i2 = 0;
            aVar.g = false;
            if (h || FlexboxLayoutManager.this.x.a != null) {
                int[] iArr = FlexboxLayoutManager.this.x.a;
                int i3 = aVar.a;
                if (i3 == -1) {
                    i3 = 0;
                }
                int i4 = iArr[i3];
                if (i4 != -1) {
                    i2 = i4;
                }
                aVar.b = i2;
                if (FlexboxLayoutManager.this.w.size() > aVar.b) {
                    aVar.a = ((bel) FlexboxLayoutManager.this.w.get(aVar.b)).o;
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    static class b {
        int a;
        boolean b;
        /* access modifiers changed from: 0000 */
        public int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        boolean j;

        private b() {
            this.h = 1;
            this.i = 1;
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.c);
            sb.append(", mPosition=");
            sb.append(this.d);
            sb.append(", mOffset=");
            sb.append(this.e);
            sb.append(", mScrollingOffset=");
            sb.append(this.f);
            sb.append(", mLastScrollDelta=");
            sb.append(this.g);
            sb.append(", mItemDirection=");
            sb.append(this.h);
            sb.append(", mLayoutDirection=");
            sb.append(this.i);
            sb.append('}');
            return sb.toString();
        }
    }

    static class c implements Parcelable {
        public static final Creator<c> CREATOR = new Creator<c>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel, 0);
            }
        };
        /* access modifiers changed from: private */
        public int a;
        /* access modifiers changed from: private */
        public int b;

        public final int describeContents() {
            return 0;
        }

        /* synthetic */ c(Parcel parcel, byte b2) {
            this(parcel);
        }

        /* synthetic */ c(c cVar, byte b2) {
            this(cVar);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        c() {
        }

        private c(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        private c(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.a);
            sb.append(", mAnchorOffset=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        static /* synthetic */ boolean c(c cVar, int i) {
            int i2 = cVar.a;
            return i2 >= 0 && i2 < i;
        }
    }

    public final void a(bel bel) {
    }

    public final int h() {
        return 5;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private FlexboxLayoutManager(Context context, int i, int i2) {
        this.e = -1;
        this.w = new ArrayList();
        this.x = new bem(this);
        this.B = new a(this, 0);
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.J = new SparseArray<>();
        this.M = -1;
        this.N = new defpackage.bem.a();
        f(0);
        k(1);
        l(4);
        this.n = true;
        this.K = context;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = -1;
        this.w = new ArrayList();
        this.x = new bem(this);
        this.B = new a(this, 0);
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.J = new SparseArray<>();
        this.M = -1;
        this.N = new defpackage.bem.a();
        androidx.recyclerview.widget.RecyclerView.i.b a2 = a(context, attributeSet, i, i2);
        int i3 = a2.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (a2.c) {
                    f(3);
                } else {
                    f(2);
                }
            }
        } else if (a2.c) {
            f(1);
        } else {
            f(0);
        }
        k(1);
        l(4);
        this.n = true;
        this.K = context;
    }

    public final int c() {
        return this.b;
    }

    public final void f(int i) {
        if (this.b != i) {
            q();
            this.b = i;
            this.C = null;
            this.D = null;
            z();
            o_();
        }
    }

    public final int g() {
        return this.c;
    }

    private void k(int i) {
        if (i != 2) {
            int i2 = this.c;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    q();
                    z();
                }
                this.c = i;
                this.C = null;
                this.D = null;
                o_();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    public final int i() {
        return this.d;
    }

    private void l(int i) {
        if (this.d != 4) {
            q();
            z();
            this.d = 4;
            o_();
        }
    }

    public final int m() {
        return this.e;
    }

    public final int a(View view, int i, int i2) {
        int o;
        int p;
        if (j()) {
            o = q(view);
            p = r(view);
        } else {
            o = o(view);
            p = p(view);
        }
        return o + p;
    }

    public final int a_(View view) {
        int q;
        int r;
        if (j()) {
            q = o(view);
            r = p(view);
        } else {
            q = q(view);
            r = r(view);
        }
        return q + r;
    }

    public final void a(View view, int i, int i2, bel bel) {
        b(view, a);
        if (j()) {
            int q = q(view) + r(view);
            bel.e += q;
            bel.f += q;
            return;
        }
        int o = o(view) + p(view);
        bel.e += o;
        bel.f += o;
    }

    public final int b() {
        return this.z.a();
    }

    public final View a(int i) {
        View view = (View) this.J.get(i);
        if (view != null) {
            return view;
        }
        return this.y.b(i);
    }

    public final View b(int i) {
        return a(i);
    }

    public final int k() {
        if (this.w.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.w.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((bel) this.w.get(i2)).e);
        }
        return i;
    }

    public final int l() {
        int i = 0;
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            i += ((bel) this.w.get(i2)).g;
        }
        return i;
    }

    public final void a(List<bel> list) {
        this.w = list;
    }

    public final List<bel> n() {
        return this.w;
    }

    public final void a(int i, View view) {
        this.J.put(i, view);
    }

    public final PointF d(int i) {
        if (r() == 0) {
            return null;
        }
        int i2 = i < c(g(0)) ? -1 : 1;
        if (j()) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }

    public final androidx.recyclerview.widget.RecyclerView.LayoutParams a() {
        return new LayoutParams(-2, -2);
    }

    public final androidx.recyclerview.widget.RecyclerView.LayoutParams a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final boolean a(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void a(androidx.recyclerview.widget.RecyclerView.a aVar, androidx.recyclerview.widget.RecyclerView.a aVar2) {
        q();
    }

    public final Parcelable d() {
        c cVar = this.E;
        if (cVar != null) {
            return new c(cVar, 0);
        }
        c cVar2 = new c();
        if (r() > 0) {
            View g2 = g(0);
            cVar2.a = c(g2);
            cVar2.b = this.C.a(g2) - this.C.b();
        } else {
            cVar2.a = -1;
        }
        return cVar2;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof c) {
            this.E = (c) parcelable;
            o_();
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        super.a(recyclerView, i, i2);
        m(i);
    }

    public final void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.a(recyclerView, i, i2, obj);
        m(i);
    }

    public final void c(RecyclerView recyclerView, int i, int i2) {
        super.c(recyclerView, i, i2);
        m(i);
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        super.b(recyclerView, i, i2);
        m(i);
    }

    public final void a(RecyclerView recyclerView, int i, int i2, int i3) {
        super.a(recyclerView, i, i2, i3);
        m(Math.min(i, i2));
    }

    private void m(int i) {
        if (i < B()) {
            int r = r();
            this.x.c(r);
            this.x.b(r);
            this.x.d(r);
            if (!O && this.x.a == null) {
                throw new AssertionError();
            } else if (i < this.x.a.length) {
                this.M = i;
                View v = v();
                if (v != null) {
                    this.F = c(v);
                    if (j() || !this.f) {
                        this.G = this.C.a(v) - this.C.b();
                    } else {
                        this.G = this.C.b(v) + this.C.f();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x023e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.recyclerview.widget.RecyclerView.o r19, androidx.recyclerview.widget.RecyclerView.s r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r0.y = r1
            r0.z = r2
            int r3 = r20.a()
            if (r3 != 0) goto L_0x0015
            boolean r4 = r2.g
            if (r4 == 0) goto L_0x0015
            return
        L_0x0015:
            androidx.recyclerview.widget.RecyclerView r4 = r0.h
            int r4 = defpackage.ip.f(r4)
            int r5 = r0.b
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0065
            if (r5 == r8) goto L_0x0054
            if (r5 == r6) goto L_0x0041
            r9 = 3
            if (r5 == r9) goto L_0x002e
            r0.f = r7
            r0.g = r7
            goto L_0x0075
        L_0x002e:
            if (r4 != r8) goto L_0x0032
            r4 = 1
            goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            r0.f = r4
            int r4 = r0.c
            if (r4 != r6) goto L_0x003e
            boolean r4 = r0.f
            r4 = r4 ^ r8
            r0.f = r4
        L_0x003e:
            r0.g = r8
            goto L_0x0075
        L_0x0041:
            if (r4 != r8) goto L_0x0045
            r4 = 1
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            r0.f = r4
            int r4 = r0.c
            if (r4 != r6) goto L_0x0051
            boolean r4 = r0.f
            r4 = r4 ^ r8
            r0.f = r4
        L_0x0051:
            r0.g = r7
            goto L_0x0075
        L_0x0054:
            if (r4 == r8) goto L_0x0058
            r4 = 1
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            r0.f = r4
            int r4 = r0.c
            if (r4 != r6) goto L_0x0061
            r4 = 1
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            r0.g = r4
            goto L_0x0075
        L_0x0065:
            if (r4 != r8) goto L_0x0069
            r4 = 1
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            r0.f = r4
            int r4 = r0.c
            if (r4 != r6) goto L_0x0072
            r4 = 1
            goto L_0x0073
        L_0x0072:
            r4 = 0
        L_0x0073:
            r0.g = r4
        L_0x0075:
            r18.x()
            r18.y()
            bem r4 = r0.x
            r4.c(r3)
            bem r4 = r0.x
            r4.b(r3)
            bem r4 = r0.x
            r4.d(r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.A
            r4.j = r7
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.E
            if (r4 == 0) goto L_0x00a0
            boolean r4 = com.google.android.flexbox.FlexboxLayoutManager.c.c(r4, r3)
            if (r4 == 0) goto L_0x00a0
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.E
            int r4 = r4.a
            r0.F = r4
        L_0x00a0:
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.B
            boolean r4 = r4.f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = -1
            if (r4 == 0) goto L_0x00b3
            int r4 = r0.F
            if (r4 != r6) goto L_0x00b3
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.E
            if (r4 == 0) goto L_0x024c
        L_0x00b3:
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.B
            com.google.android.flexbox.FlexboxLayoutManager.a.b(r4)
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.B
            com.google.android.flexbox.FlexboxLayoutManager$c r9 = r0.E
            boolean r10 = O
            if (r10 != 0) goto L_0x00cd
            bem r10 = r0.x
            int[] r10 = r10.a
            if (r10 == 0) goto L_0x00c7
            goto L_0x00cd
        L_0x00c7:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x00cd:
            boolean r10 = r2.g
            if (r10 != 0) goto L_0x01d2
            int r10 = r0.F
            if (r10 != r6) goto L_0x00d7
            goto L_0x01d2
        L_0x00d7:
            if (r10 < 0) goto L_0x01ce
            int r11 = r20.a()
            if (r10 < r11) goto L_0x00e1
            goto L_0x01ce
        L_0x00e1:
            int r10 = r0.F
            r4.a = r10
            bem r10 = r0.x
            int[] r10 = r10.a
            int r11 = r4.a
            r10 = r10[r11]
            r4.b = r10
            com.google.android.flexbox.FlexboxLayoutManager$c r10 = r0.E
            if (r10 == 0) goto L_0x0117
            int r11 = r20.a()
            boolean r10 = com.google.android.flexbox.FlexboxLayoutManager.c.c(r10, r11)
            if (r10 == 0) goto L_0x0117
            oh r10 = r0.C
            int r10 = r10.b()
            int r9 = r9.b
            int r10 = r10 + r9
            r4.c = r10
            r4.g = true
            r4.b = r6
            goto L_0x01cc
        L_0x0117:
            int r9 = r0.G
            if (r9 != r5) goto L_0x01a9
            int r9 = r0.F
            android.view.View r9 = r0.c(r9)
            if (r9 == 0) goto L_0x018d
            oh r10 = r0.C
            int r10 = r10.e(r9)
            oh r11 = r0.C
            int r11 = r11.e()
            if (r10 <= r11) goto L_0x0136
            com.google.android.flexbox.FlexboxLayoutManager.a.f(r4)
            goto L_0x01cc
        L_0x0136:
            oh r10 = r0.C
            int r10 = r10.a(r9)
            oh r11 = r0.C
            int r11 = r11.b()
            int r10 = r10 - r11
            if (r10 >= 0) goto L_0x0153
            oh r9 = r0.C
            int r9 = r9.b()
            r4.c = r9
            r4.e = r7
            goto L_0x01cc
        L_0x0153:
            oh r10 = r0.C
            int r10 = r10.c()
            oh r11 = r0.C
            int r11 = r11.b(r9)
            int r10 = r10 - r11
            if (r10 >= 0) goto L_0x016f
            oh r9 = r0.C
            int r9 = r9.c()
            r4.c = r9
            r4.e = r8
            goto L_0x01cc
        L_0x016f:
            boolean r10 = r4.e
            if (r10 == 0) goto L_0x0183
            oh r10 = r0.C
            int r9 = r10.b(r9)
            oh r10 = r0.C
            int r10 = r10.a()
            int r9 = r9 + r10
            goto L_0x0189
        L_0x0183:
            oh r10 = r0.C
            int r9 = r10.a(r9)
        L_0x0189:
            r4.c = r9
            goto L_0x01cc
        L_0x018d:
            int r9 = r18.r()
            if (r9 <= 0) goto L_0x01a5
            android.view.View r9 = r0.g(r7)
            int r9 = c(r9)
            int r10 = r0.F
            if (r10 >= r9) goto L_0x01a1
            r9 = 1
            goto L_0x01a2
        L_0x01a1:
            r9 = 0
        L_0x01a2:
            r4.e = r9
        L_0x01a5:
            com.google.android.flexbox.FlexboxLayoutManager.a.f(r4)
            goto L_0x01cc
        L_0x01a9:
            boolean r9 = r18.j()
            if (r9 != 0) goto L_0x01c0
            boolean r9 = r0.f
            if (r9 == 0) goto L_0x01c0
            int r9 = r0.G
            oh r10 = r0.C
            int r10 = r10.f()
            int r9 = r9 - r10
            r4.c = r9
            goto L_0x01cc
        L_0x01c0:
            oh r9 = r0.C
            int r9 = r9.b()
            int r10 = r0.G
            int r9 = r9 + r10
            r4.c = r9
        L_0x01cc:
            r9 = 1
            goto L_0x01d3
        L_0x01ce:
            r0.F = r6
            r0.G = r5
        L_0x01d2:
            r9 = 0
        L_0x01d3:
            if (r9 != 0) goto L_0x0247
            int r9 = r18.r()
            if (r9 == 0) goto L_0x023b
            boolean r9 = r4.e
            if (r9 == 0) goto L_0x01ea
            int r9 = r20.a()
            android.view.View r9 = r0.o(r9)
            goto L_0x01f2
        L_0x01ea:
            int r9 = r20.a()
            android.view.View r9 = r0.n(r9)
        L_0x01f2:
            if (r9 == 0) goto L_0x023b
            com.google.android.flexbox.FlexboxLayoutManager.a.a(r4, r9)
            boolean r10 = r2.g
            if (r10 != 0) goto L_0x0239
            boolean r10 = r18.q_()
            if (r10 == 0) goto L_0x0239
            oh r10 = r0.C
            int r10 = r10.a(r9)
            oh r11 = r0.C
            int r11 = r11.c()
            if (r10 >= r11) goto L_0x0220
            oh r10 = r0.C
            int r9 = r10.b(r9)
            oh r10 = r0.C
            int r10 = r10.b()
            if (r9 >= r10) goto L_0x021e
            goto L_0x0220
        L_0x021e:
            r9 = 0
            goto L_0x0221
        L_0x0220:
            r9 = 1
        L_0x0221:
            if (r9 == 0) goto L_0x0239
            boolean r9 = r4.e
            if (r9 == 0) goto L_0x0230
            oh r9 = r0.C
            int r9 = r9.c()
            goto L_0x0236
        L_0x0230:
            oh r9 = r0.C
            int r9 = r9.b()
        L_0x0236:
            r4.c = r9
        L_0x0239:
            r9 = 1
            goto L_0x023c
        L_0x023b:
            r9 = 0
        L_0x023c:
            if (r9 != 0) goto L_0x0247
            com.google.android.flexbox.FlexboxLayoutManager.a.f(r4)
            r4.a = r7
            r4.b = r7
        L_0x0247:
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.B
            r4.f = true
        L_0x024c:
            r18.a(r19)
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.B
            boolean r4 = r4.e
            if (r4 == 0) goto L_0x025d
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.B
            r0.b(r4, r7, r8)
            goto L_0x0262
        L_0x025d:
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.B
            r0.a(r4, r7, r8)
        L_0x0262:
            int r4 = r0.u
            int r9 = r0.s
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r9 = r0.v
            int r10 = r0.t
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = r0.u
            int r11 = r0.v
            boolean r12 = r18.j()
            if (r12 == 0) goto L_0x029d
            int r12 = r0.H
            if (r12 == r5) goto L_0x0284
            if (r12 == r10) goto L_0x0284
            r5 = 1
            goto L_0x0285
        L_0x0284:
            r5 = 0
        L_0x0285:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r0.A
            boolean r12 = r12.b
            if (r12 == 0) goto L_0x0298
            android.content.Context r12 = r0.K
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.heightPixels
            goto L_0x02bd
        L_0x0298:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r0.A
            int r12 = r12.a
            goto L_0x02bd
        L_0x029d:
            int r12 = r0.I
            if (r12 == r5) goto L_0x02a5
            if (r12 == r11) goto L_0x02a5
            r5 = 1
            goto L_0x02a6
        L_0x02a5:
            r5 = 0
        L_0x02a6:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r0.A
            boolean r12 = r12.b
            if (r12 == 0) goto L_0x02b9
            android.content.Context r12 = r0.K
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.widthPixels
            goto L_0x02bd
        L_0x02b9:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r0.A
            int r12 = r12.a
        L_0x02bd:
            r14 = r12
            r0.H = r10
            r0.I = r11
            int r10 = r0.M
            if (r10 != r6) goto L_0x0349
            int r10 = r0.F
            if (r10 != r6) goto L_0x02cc
            if (r5 == 0) goto L_0x0349
        L_0x02cc:
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.B
            boolean r3 = r3.e
            if (r3 != 0) goto L_0x03e8
            java.util.List<bel> r3 = r0.w
            r3.clear()
            boolean r3 = O
            if (r3 != 0) goto L_0x02ea
            bem r3 = r0.x
            int[] r3 = r3.a
            if (r3 == 0) goto L_0x02e4
            goto L_0x02ea
        L_0x02e4:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x02ea:
            bem$a r3 = r0.N
            r3.a()
            boolean r3 = r18.j()
            if (r3 == 0) goto L_0x0309
            bem r10 = r0.x
            bem$a r11 = r0.N
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.B
            int r15 = r3.a
            java.util.List<bel> r3 = r0.w
            r12 = r4
            r13 = r9
            r16 = r3
            r10.b(r11, r12, r13, r14, r15, r16)
            goto L_0x031c
        L_0x0309:
            bem r10 = r0.x
            bem$a r11 = r0.N
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.B
            int r15 = r3.a
            java.util.List<bel> r3 = r0.w
            r12 = r4
            r13 = r9
            r16 = r3
            r10.d(r11, r12, r13, r14, r15, r16)
        L_0x031c:
            bem$a r3 = r0.N
            java.util.List<bel> r3 = r3.a
            r0.w = r3
            bem r3 = r0.x
            r3.a(r4, r9)
            bem r3 = r0.x
            r3.a()
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.B
            bem r4 = r0.x
            int[] r4 = r4.a
            com.google.android.flexbox.FlexboxLayoutManager$a r5 = r0.B
            int r5 = r5.a
            r4 = r4[r5]
            r3.b = r4
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.A
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.B
            int r4 = r4.b
            r3.c = r4
            goto L_0x03e8
        L_0x0349:
            int r5 = r0.M
            if (r5 == r6) goto L_0x0358
            com.google.android.flexbox.FlexboxLayoutManager$a r6 = r0.B
            int r6 = r6.a
            int r5 = java.lang.Math.min(r5, r6)
            goto L_0x035e
        L_0x0358:
            com.google.android.flexbox.FlexboxLayoutManager$a r5 = r0.B
            int r5 = r5.a
        L_0x035e:
            bem$a r6 = r0.N
            r6.a()
            boolean r6 = r18.j()
            if (r6 == 0) goto L_0x03a1
            java.util.List<bel> r6 = r0.w
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x038d
            bem r3 = r0.x
            java.util.List<bel> r6 = r0.w
            r3.a(r6, r5)
            bem r10 = r0.x
            bem$a r11 = r0.N
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.B
            int r16 = r3.a
            java.util.List<bel> r3 = r0.w
            r12 = r4
            r13 = r9
            r15 = r5
            r17 = r3
            r10.a(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03d8
        L_0x038d:
            bem r6 = r0.x
            r6.d(r3)
            bem r10 = r0.x
            bem$a r11 = r0.N
            r15 = 0
            java.util.List<bel> r3 = r0.w
            r12 = r4
            r13 = r9
            r16 = r3
            r10.a(r11, r12, r13, r14, r15, r16)
            goto L_0x03d8
        L_0x03a1:
            java.util.List<bel> r6 = r0.w
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x03c5
            bem r3 = r0.x
            java.util.List<bel> r6 = r0.w
            r3.a(r6, r5)
            bem r10 = r0.x
            bem$a r11 = r0.N
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.B
            int r16 = r3.a
            java.util.List<bel> r3 = r0.w
            r12 = r9
            r13 = r4
            r15 = r5
            r17 = r3
            r10.a(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03d8
        L_0x03c5:
            bem r6 = r0.x
            r6.d(r3)
            bem r10 = r0.x
            bem$a r11 = r0.N
            r15 = 0
            java.util.List<bel> r3 = r0.w
            r12 = r4
            r13 = r9
            r16 = r3
            r10.c(r11, r12, r13, r14, r15, r16)
        L_0x03d8:
            bem$a r3 = r0.N
            java.util.List<bel> r3 = r3.a
            r0.w = r3
            bem r3 = r0.x
            r3.a(r4, r9, r5)
            bem r3 = r0.x
            r3.a(r5)
        L_0x03e8:
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.B
            boolean r3 = r3.e
            if (r3 == 0) goto L_0x0408
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.A
            r0.a(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.A
            int r3 = r3.e
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.B
            r0.a(r4, r8, r7)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.A
            r0.a(r1, r2, r4)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.A
            int r4 = r4.e
            goto L_0x041f
        L_0x0408:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.A
            r0.a(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.A
            int r4 = r3.e
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.B
            r0.b(r3, r8, r7)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.A
            r0.a(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.A
            int r3 = r3.e
        L_0x041f:
            int r5 = r18.r()
            if (r5 <= 0) goto L_0x043e
            com.google.android.flexbox.FlexboxLayoutManager$a r5 = r0.B
            boolean r5 = r5.e
            if (r5 == 0) goto L_0x0436
            int r4 = r0.b(r4, r1, r2, r8)
            int r3 = r3 + r4
            r0.a(r3, r1, r2, r7)
            return
        L_0x0436:
            int r3 = r0.a(r3, r1, r2, r8)
            int r4 = r4 + r3
            r0.b(r4, r1, r2, r7)
        L_0x043e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    private int a(int i, o oVar, s sVar, boolean z2) {
        int i2;
        if (j() || !this.f) {
            int b2 = i - this.C.b();
            if (b2 <= 0) {
                return 0;
            }
            i2 = -c(b2, oVar, sVar);
        } else {
            int c2 = this.C.c() - i;
            if (c2 <= 0) {
                return 0;
            }
            i2 = c(-c2, oVar, sVar);
        }
        int i3 = i + i2;
        if (z2) {
            int b3 = i3 - this.C.b();
            if (b3 > 0) {
                this.C.a(-b3);
                i2 -= b3;
            }
        }
        return i2;
    }

    private int b(int i, o oVar, s sVar, boolean z2) {
        int i2;
        if (!j() && this.f) {
            int b2 = i - this.C.b();
            if (b2 <= 0) {
                return 0;
            }
            i2 = c(b2, oVar, sVar);
        } else {
            int c2 = this.C.c() - i;
            if (c2 <= 0) {
                return 0;
            }
            i2 = -c(-c2, oVar, sVar);
        }
        int i3 = i + i2;
        if (z2) {
            int c3 = this.C.c() - i3;
            if (c3 > 0) {
                this.C.a(c3);
                return c3 + i2;
            }
        }
        return i2;
    }

    public final void a(s sVar) {
        super.a(sVar);
        this.E = null;
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.M = -1;
        a.b(this.B);
        this.J.clear();
    }

    private View n(int i) {
        if (O || this.x.a != null) {
            View c2 = c(0, r(), i);
            if (c2 == null) {
                return null;
            }
            int i2 = this.x.a[c(c2)];
            if (i2 == -1) {
                return null;
            }
            return a(c2, (bel) this.w.get(i2));
        }
        throw new AssertionError();
    }

    private View o(int i) {
        if (O || this.x.a != null) {
            View c2 = c(r() - 1, -1, i);
            if (c2 == null) {
                return null;
            }
            return b(c2, (bel) this.w.get(this.x.a[c(c2)]));
        }
        throw new AssertionError();
    }

    private View c(int i, int i2, int i3) {
        x();
        y();
        int b2 = this.C.b();
        int c2 = this.C.c();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g2 = g(i);
            int c3 = c(g2);
            if (c3 >= 0 && c3 < i3) {
                if (((androidx.recyclerview.widget.RecyclerView.LayoutParams) g2.getLayoutParams()).c.n()) {
                    if (view2 == null) {
                        view2 = g2;
                    }
                } else if (this.C.a(g2) >= b2 && this.C.b(g2) <= c2) {
                    return g2;
                } else {
                    if (view == null) {
                        view = g2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private View v() {
        return g(0);
    }

    private boolean d(View view, int i) {
        return (j() || !this.f) ? this.C.b(view) <= i : this.C.d() - this.C.a(view) <= i;
    }

    private boolean e(View view, int i) {
        return (j() || !this.f) ? this.C.a(view) >= this.C.d() - i : this.C.b(view) <= i;
    }

    private void a(o oVar, int i, int i2) {
        while (i2 >= i) {
            a(i2, oVar);
            i2--;
        }
    }

    private int a(bel bel, b bVar) {
        int i;
        int i2;
        View view;
        LayoutParams layoutParams;
        bel bel2 = bel;
        b bVar2 = bVar;
        if (O || this.x.b != null) {
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int i3 = this.v;
            int i4 = bVar2.e;
            int i5 = bVar2.e;
            if (bVar2.i == -1) {
                i4 -= bel2.g;
                i5 += bel2.g;
            }
            int i6 = i4;
            int i7 = i5;
            int i8 = bVar2.d;
            float g2 = ((float) paddingTop) - ((float) this.B.d);
            float g3 = ((float) (i3 - paddingBottom)) - ((float) this.B.d);
            float max = Math.max(0.0f, 0.0f);
            int i9 = 0;
            int i10 = bel2.h;
            int i11 = i8;
            while (i11 < i8 + i10) {
                View a2 = a(i11);
                if (a2 != null) {
                    long j = this.x.b[i11];
                    int a3 = bem.a(j);
                    int b2 = bem.b(j);
                    LayoutParams layoutParams2 = (LayoutParams) a2.getLayoutParams();
                    if (c(a2, a3, b2, layoutParams2)) {
                        a2.measure(a3, b2);
                    }
                    float o = g2 + ((float) (layoutParams2.topMargin + o(a2)));
                    float p = g3 - ((float) (layoutParams2.rightMargin + p(a2)));
                    if (bVar2.i == 1) {
                        b(a2, a);
                        a(a2);
                    } else {
                        b(a2, a);
                        b(a2, i9);
                        i9++;
                    }
                    int i12 = i9;
                    int q = i6 + q(a2);
                    int r = i7 - r(a2);
                    boolean z2 = this.f;
                    if (!z2) {
                        view = a2;
                        i = i11;
                        i2 = i6;
                        layoutParams = layoutParams2;
                        if (this.g) {
                            this.x.a(view, bel, z2, q, Math.round(p) - view.getMeasuredHeight(), q + view.getMeasuredWidth(), Math.round(p));
                        } else {
                            this.x.a(view, bel, z2, q, Math.round(o), q + view.getMeasuredWidth(), Math.round(o) + view.getMeasuredHeight());
                        }
                    } else if (this.g) {
                        i2 = i6;
                        layoutParams = layoutParams2;
                        int round = Math.round(p) - a2.getMeasuredHeight();
                        view = a2;
                        i = i11;
                        this.x.a(a2, bel, z2, r - a2.getMeasuredWidth(), round, r, Math.round(p));
                    } else {
                        view = a2;
                        i = i11;
                        i2 = i6;
                        layoutParams = layoutParams2;
                        this.x.a(view, bel, z2, r - view.getMeasuredWidth(), Math.round(o), r, Math.round(o) + view.getMeasuredHeight());
                    }
                    g2 = o + ((float) (view.getMeasuredHeight() + layoutParams.topMargin + p(view))) + max;
                    g3 = p - (((float) ((view.getMeasuredHeight() + layoutParams.bottomMargin) + o(view))) + max);
                    i9 = i12;
                } else {
                    i = i11;
                    i2 = i6;
                }
                i11 = i + 1;
                i6 = i2;
            }
            bVar2.c += this.A.i;
            return bel2.g;
        }
        throw new AssertionError();
    }

    public final boolean j() {
        int i = this.b;
        return i == 0 || i == 1;
    }

    private void a(a aVar, boolean z2, boolean z3) {
        if (z3) {
            w();
        } else {
            this.A.b = false;
        }
        if (j() || !this.f) {
            this.A.a = this.C.c() - aVar.c;
        } else {
            this.A.a = aVar.c - getPaddingRight();
        }
        this.A.d = aVar.a;
        b bVar = this.A;
        bVar.h = 1;
        bVar.i = 1;
        bVar.e = aVar.c;
        b bVar2 = this.A;
        bVar2.f = Integer.MIN_VALUE;
        bVar2.c = aVar.b;
        if (z2 && this.w.size() > 1 && aVar.b >= 0 && aVar.b < this.w.size() - 1) {
            bel bel = (bel) this.w.get(aVar.b);
            this.A.c = this.A.c + 1;
            this.A.d += bel.h;
        }
    }

    private void b(a aVar, boolean z2, boolean z3) {
        if (z3) {
            w();
        } else {
            this.A.b = false;
        }
        if (j() || !this.f) {
            this.A.a = aVar.c - this.C.b();
        } else {
            this.A.a = (this.L.getWidth() - aVar.c) - this.C.b();
        }
        this.A.d = aVar.a;
        b bVar = this.A;
        bVar.h = 1;
        bVar.i = -1;
        bVar.e = aVar.c;
        b bVar2 = this.A;
        bVar2.f = Integer.MIN_VALUE;
        bVar2.c = aVar.b;
        if (z2 && aVar.b > 0 && this.w.size() > aVar.b) {
            bel bel = (bel) this.w.get(aVar.b);
            this.A.c = this.A.c - 1;
            this.A.d -= bel.h;
        }
    }

    private void w() {
        int i;
        if (j()) {
            i = this.t;
        } else {
            i = this.s;
        }
        this.A.b = i == 0 || i == Integer.MIN_VALUE;
    }

    private void x() {
        if (this.C == null) {
            if (j()) {
                if (this.c != 0) {
                    this.C = oh.b((i) this);
                    this.D = oh.a((i) this);
                    return;
                }
            } else if (this.c == 0) {
                this.C = oh.b((i) this);
                this.D = oh.a((i) this);
                return;
            }
            this.C = oh.a((i) this);
            this.D = oh.b((i) this);
        }
    }

    private void y() {
        if (this.A == null) {
            this.A = new b(0);
        }
    }

    public final void e(int i) {
        this.F = i;
        this.G = Integer.MIN_VALUE;
        c cVar = this.E;
        if (cVar != null) {
            cVar.a = -1;
        }
        o_();
    }

    public final void a(RecyclerView recyclerView, s sVar, int i) {
        od odVar = new od(recyclerView.getContext());
        odVar.b = i;
        a((r) odVar);
    }

    public final void d(RecyclerView recyclerView) {
        super.d(recyclerView);
        this.L = (View) recyclerView.getParent();
    }

    public final void a(RecyclerView recyclerView, o oVar) {
        super.a(recyclerView, oVar);
    }

    public final boolean e() {
        return !j() || this.u > this.L.getWidth();
    }

    public final boolean f() {
        return j() || this.v > this.L.getHeight();
    }

    public final int a(int i, o oVar, s sVar) {
        if (!j()) {
            int c2 = c(i, oVar, sVar);
            this.J.clear();
            return c2;
        }
        int p = p(i);
        a aVar = this.B;
        aVar.d = aVar.d + p;
        this.D.a(-p);
        return p;
    }

    public final int b(int i, o oVar, s sVar) {
        if (j()) {
            int c2 = c(i, oVar, sVar);
            this.J.clear();
            return c2;
        }
        int p = p(i);
        a aVar = this.B;
        aVar.d = aVar.d + p;
        this.D.a(-p);
        return p;
    }

    private int c(int i, o oVar, s sVar) {
        if (r() == 0 || i == 0) {
            return 0;
        }
        x();
        int i2 = 1;
        this.A.j = true;
        boolean z2 = !j() && this.f;
        if (!z2 ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        a(i2, abs);
        int a2 = this.A.f + a(oVar, sVar, this.A);
        if (a2 < 0) {
            return 0;
        }
        if (z2) {
            if (abs > a2) {
                i = (-i2) * a2;
            }
        } else if (abs > a2) {
            i = i2 * a2;
        }
        this.C.a(-i);
        this.A.g = i;
        return i;
    }

    private int p(int i) {
        int i2;
        int g2;
        boolean z2 = false;
        if (r() == 0 || i == 0) {
            return 0;
        }
        x();
        boolean j = j();
        View view = this.L;
        int width = j ? view.getWidth() : view.getHeight();
        if (j) {
            i2 = this.u;
        } else {
            i2 = this.v;
        }
        if (ip.f(this.h) == 1) {
            z2 = true;
        }
        if (z2) {
            int abs = Math.abs(i);
            if (i < 0) {
                g2 = Math.min((i2 + this.B.d) - width, abs);
            } else {
                if (this.B.d + i > 0) {
                    g2 = this.B.d;
                }
                return i;
            }
        } else {
            if (i > 0) {
                i = Math.min((i2 - this.B.d) - width, i);
            } else if (this.B.d + i < 0) {
                g2 = this.B.d;
            }
            return i;
        }
        i = -g2;
        return i;
    }

    private void a(int i, int i2) {
        if (O || this.x.a != null) {
            this.A.i = i;
            boolean j = j();
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.u, this.s);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(this.v, this.t);
            int i3 = 0;
            boolean z2 = !j && this.f;
            if (i == 1) {
                View g2 = g(r() - 1);
                this.A.e = this.C.b(g2);
                int c2 = c(g2);
                View b2 = b(g2, (bel) this.w.get(this.x.a[c2]));
                b bVar = this.A;
                bVar.h = 1;
                bVar.d = c2 + bVar.h;
                if (this.x.a.length <= this.A.d) {
                    this.A.c = -1;
                } else {
                    this.A.c = this.x.a[this.A.d];
                }
                if (z2) {
                    this.A.e = this.C.a(b2);
                    this.A.f = (-this.C.a(b2)) + this.C.b();
                    b bVar2 = this.A;
                    if (bVar2.f >= 0) {
                        i3 = this.A.f;
                    }
                    bVar2.f = i3;
                } else {
                    this.A.e = this.C.b(b2);
                    this.A.f = this.C.b(b2) - this.C.c();
                }
                if ((this.A.c == -1 || this.A.c > this.w.size() - 1) && this.A.d <= this.z.a()) {
                    int i4 = i2 - this.A.f;
                    this.N.a();
                    if (i4 > 0) {
                        if (j) {
                            this.x.a(this.N, makeMeasureSpec, makeMeasureSpec2, i4, this.A.d, this.w);
                        } else {
                            this.x.c(this.N, makeMeasureSpec, makeMeasureSpec2, i4, this.A.d, this.w);
                        }
                        this.x.a(makeMeasureSpec, makeMeasureSpec2, this.A.d);
                        this.x.a(this.A.d);
                    }
                }
            } else {
                View g3 = g(0);
                this.A.e = this.C.a(g3);
                int c3 = c(g3);
                View a2 = a(g3, (bel) this.w.get(this.x.a[c3]));
                this.A.h = 1;
                int i5 = this.x.a[c3];
                if (i5 == -1) {
                    i5 = 0;
                }
                if (i5 > 0) {
                    this.A.d = c3 - ((bel) this.w.get(i5 - 1)).h;
                } else {
                    this.A.d = -1;
                }
                this.A.c = i5 > 0 ? i5 - 1 : 0;
                if (z2) {
                    this.A.e = this.C.b(a2);
                    this.A.f = this.C.b(a2) - this.C.c();
                    b bVar3 = this.A;
                    if (bVar3.f >= 0) {
                        i3 = this.A.f;
                    }
                    bVar3.f = i3;
                } else {
                    this.A.e = this.C.a(a2);
                    this.A.f = (-this.C.a(a2)) + this.C.b();
                }
            }
            b bVar4 = this.A;
            bVar4.a = i2 - bVar4.f;
            return;
        }
        throw new AssertionError();
    }

    private View a(View view, bel bel) {
        boolean j = j();
        int i = bel.h;
        for (int i2 = 1; i2 < i; i2++) {
            View g2 = g(i2);
            if (!(g2 == null || g2.getVisibility() == 8)) {
                if (!this.f || j) {
                    if (this.C.a(view) <= this.C.a(g2)) {
                    }
                } else if (this.C.b(view) >= this.C.b(g2)) {
                }
                view = g2;
            }
        }
        return view;
    }

    private View b(View view, bel bel) {
        boolean j = j();
        int r = (r() - bel.h) - 1;
        for (int r2 = r() - 2; r2 > r; r2--) {
            View g2 = g(r2);
            if (!(g2 == null || g2.getVisibility() == 8)) {
                if (!this.f || j) {
                    if (this.C.b(view) >= this.C.b(g2)) {
                    }
                } else if (this.C.a(view) <= this.C.a(g2)) {
                }
                view = g2;
            }
        }
        return view;
    }

    public final int d(s sVar) {
        return h(sVar);
    }

    public final int e(s sVar) {
        return h(sVar);
    }

    private int h(s sVar) {
        if (r() == 0) {
            return 0;
        }
        int a2 = sVar.a();
        x();
        View n = n(a2);
        View o = o(a2);
        if (sVar.a() == 0 || n == null || o == null) {
            return 0;
        }
        return Math.min(this.C.e(), this.C.b(o) - this.C.a(n));
    }

    public final int b(s sVar) {
        return i(sVar);
    }

    public final int c(s sVar) {
        return i(sVar);
    }

    private int i(s sVar) {
        if (r() == 0) {
            return 0;
        }
        int a2 = sVar.a();
        View n = n(a2);
        View o = o(a2);
        if (!(sVar.a() == 0 || n == null || o == null)) {
            if (O || this.x.a != null) {
                int c2 = c(n);
                int c3 = c(o);
                int abs = Math.abs(this.C.b(o) - this.C.a(n));
                int i = this.x.a[c2];
                if (!(i == 0 || i == -1)) {
                    return Math.round((((float) i) * (((float) abs) / ((float) ((this.x.a[c3] - i) + 1)))) + ((float) (this.C.b() - this.C.a(n))));
                }
            } else {
                throw new AssertionError();
            }
        }
        return 0;
    }

    public final int f(s sVar) {
        return j(sVar);
    }

    public final int g(s sVar) {
        return j(sVar);
    }

    private int j(s sVar) {
        if (r() == 0) {
            return 0;
        }
        int a2 = sVar.a();
        View n = n(a2);
        View o = o(a2);
        if (sVar.a() == 0 || n == null || o == null) {
            return 0;
        }
        if (O || this.x.a != null) {
            int A2 = A();
            return (int) ((((float) Math.abs(this.C.b(o) - this.C.a(n))) / ((float) ((B() - A2) + 1))) * ((float) sVar.a()));
        }
        throw new AssertionError();
    }

    private boolean c(View view, int i, int i2, androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return view.isLayoutRequested() || !this.o || !d(view.getWidth(), i, layoutParams.width) || !d(view.getHeight(), i2, layoutParams.height);
    }

    private static boolean d(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private void z() {
        this.w.clear();
        a.b(this.B);
        this.B.d = 0;
    }

    private boolean a(View view, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.u - getPaddingRight();
        int paddingBottom = this.v - getPaddingBottom();
        int k = k(view) - ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
        int l = l(view) - ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
        int m = m(view) + ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
        int n = n(view) + ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
        return z2 ? (paddingLeft <= k && paddingRight >= m) && (paddingTop <= l && paddingBottom >= n) : (k >= paddingRight || m >= paddingLeft) && (l >= paddingBottom || n >= paddingTop);
    }

    private int A() {
        View a2 = a(0, r(), false);
        if (a2 == null) {
            return -1;
        }
        return c(a2);
    }

    private int B() {
        View a2 = a(r() - 1, -1, false);
        if (a2 == null) {
            return -1;
        }
        return c(a2);
    }

    private View a(int i, int i2, boolean z2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View g2 = g(i);
            if (a(g2, false)) {
                return g2;
            }
            i += i3;
        }
        return null;
    }

    public final int a_(int i, int i2, int i3) {
        return a(this.u, this.s, i2, i3, e());
    }

    public final int b(int i, int i2, int i3) {
        return a(this.v, this.t, i2, i3, f());
    }

    private int a(o oVar, s sVar, b bVar) {
        int i;
        int i2;
        int i3;
        o oVar2 = oVar;
        b bVar2 = bVar;
        if (bVar2.f != Integer.MIN_VALUE) {
            if (bVar2.a < 0) {
                bVar2.f += bVar2.a;
            }
            a(oVar2, bVar2);
        }
        int i4 = bVar2.a;
        int i5 = bVar2.a;
        boolean j = j();
        int i6 = 0;
        while (true) {
            if (i5 <= 0 && !this.A.b) {
                break;
            }
            int i7 = 1;
            if (!(bVar2.d >= 0 && bVar2.d < sVar.a() && bVar2.c >= 0 && bVar2.c < this.w.size())) {
                break;
            }
            bel bel = (bel) this.w.get(bVar2.c);
            bVar2.d = bel.o;
            if (!j()) {
                i = a(bel, bVar2);
            } else if (O || this.x.b != null) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i8 = this.u;
                int i9 = bVar2.e;
                if (bVar2.i == -1) {
                    i9 -= bel.g;
                }
                int i10 = i9;
                int i11 = bVar2.d;
                float g2 = ((float) paddingLeft) - ((float) this.B.d);
                float g3 = ((float) (i8 - paddingRight)) - ((float) this.B.d);
                float max = Math.max(0.0f, 0.0f);
                int i12 = bel.h;
                float f2 = g2;
                float f3 = g3;
                int i13 = i11;
                int i14 = 0;
                while (i13 < i11 + i12) {
                    View a2 = a(i13);
                    if (a2 != null) {
                        int i15 = i12;
                        if (bVar2.i == i7) {
                            b(a2, a);
                            a(a2);
                        } else {
                            b(a2, a);
                            b(a2, i14);
                            i14++;
                        }
                        int i16 = i14;
                        long j2 = this.x.b[i13];
                        int a3 = bem.a(j2);
                        int b2 = bem.b(j2);
                        LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
                        if (c(a2, a3, b2, layoutParams)) {
                            a2.measure(a3, b2);
                        }
                        float q = f2 + ((float) (layoutParams.leftMargin + q(a2)));
                        float r = f3 - ((float) (layoutParams.rightMargin + r(a2)));
                        int o = i10 + o(a2);
                        if (this.f) {
                            i3 = i15;
                            i2 = i11;
                            this.x.a(a2, bel, Math.round(r) - a2.getMeasuredWidth(), o, Math.round(r), o + a2.getMeasuredHeight());
                        } else {
                            i2 = i11;
                            i3 = i15;
                            this.x.a(a2, bel, Math.round(q), o, Math.round(q) + a2.getMeasuredWidth(), o + a2.getMeasuredHeight());
                        }
                        i14 = i16;
                        f2 = q + ((float) (a2.getMeasuredWidth() + layoutParams.rightMargin + r(a2))) + max;
                        f3 = r - (((float) ((a2.getMeasuredWidth() + layoutParams.leftMargin) + q(a2))) + max);
                    } else {
                        i3 = i12;
                        i2 = i11;
                    }
                    i13++;
                    i12 = i3;
                    i11 = i2;
                    i7 = 1;
                }
                bVar2.c += this.A.i;
                i = bel.g;
            } else {
                throw new AssertionError();
            }
            i6 += i;
            if (j || !this.f) {
                bVar2.e += bel.g * bVar2.i;
            } else {
                bVar2.e -= bel.g * bVar2.i;
            }
            i5 -= bel.g;
        }
        bVar2.a -= i6;
        if (bVar2.f != Integer.MIN_VALUE) {
            bVar2.f += i6;
            if (bVar2.a < 0) {
                bVar2.f += bVar2.a;
            }
            a(oVar2, bVar2);
        }
        return i4 - bVar2.a;
    }

    private void a(o oVar, b bVar) {
        if (bVar.j) {
            if (bVar.i == -1) {
                c(oVar, bVar);
            } else {
                b(oVar, bVar);
            }
        }
    }

    private void b(o oVar, b bVar) {
        if (bVar.f >= 0) {
            if (O || this.x.a != null) {
                int r = r();
                if (r != 0) {
                    int i = this.x.a[c(g(0))];
                    if (i != -1) {
                        bel bel = (bel) this.w.get(i);
                        int i2 = i;
                        int i3 = 0;
                        int i4 = -1;
                        while (true) {
                            if (i3 >= r) {
                                break;
                            }
                            View g2 = g(i3);
                            if (!d(g2, bVar.f)) {
                                break;
                            }
                            if (bel.p == c(g2)) {
                                if (i2 >= this.w.size() - 1) {
                                    break;
                                }
                                i2 += bVar.i;
                                bel = (bel) this.w.get(i2);
                                i4 = i3;
                            }
                            i3++;
                        }
                        i3 = i4;
                        a(oVar, 0, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    private void c(o oVar, b bVar) {
        if (bVar.f >= 0) {
            if (O || this.x.a != null) {
                int r = r();
                if (r != 0) {
                    int i = r - 1;
                    int i2 = this.x.a[c(g(i))];
                    if (i2 != -1) {
                        bel bel = (bel) this.w.get(i2);
                        int i3 = r;
                        int i4 = i;
                        while (true) {
                            if (i4 < 0) {
                                break;
                            }
                            View g2 = g(i4);
                            if (!e(g2, bVar.f)) {
                                break;
                            }
                            if (bel.o == c(g2)) {
                                if (i2 <= 0) {
                                    break;
                                }
                                i2 += bVar.i;
                                bel = (bel) this.w.get(i2);
                                i3 = i4;
                            }
                            i4--;
                        }
                        i4 = i3;
                        a(oVar, i4, i);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }
}
