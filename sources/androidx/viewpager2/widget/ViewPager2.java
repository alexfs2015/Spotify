package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;

public final class ViewPager2 extends ViewGroup {
    private static boolean n = true;
    public sl a = new sl(3);
    public int b;
    boolean c = false;
    public androidx.recyclerview.widget.RecyclerView.c d = new c() {
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.c = true;
            viewPager2.f.c = true;
        }
    };
    public RecyclerView e;
    public so f;
    sm g;
    public sn h;
    public androidx.recyclerview.widget.RecyclerView.f i = null;
    public boolean j = false;
    boolean k = true;
    public int l = -1;
    public a m;
    private final Rect o = new Rect();
    private final Rect p = new Rect();
    private LinearLayoutManager q;
    private int r = -1;
    private Parcelable s;
    private on t;
    private sl u;

    public abstract class a {
        private a() {
        }

        /* synthetic */ a(ViewPager2 viewPager2, byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public void a(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: 0000 */
        public void a(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void a(androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
        }

        /* access modifiers changed from: 0000 */
        public void a(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: 0000 */
        public void a(ja jaVar) {
        }

        /* access modifiers changed from: 0000 */
        public boolean a() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(int i) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            throw new IllegalStateException("Not implemented.");
        }

        public void b(androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
        }

        /* access modifiers changed from: 0000 */
        public boolean b(int i) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void c() {
        }

        /* access modifiers changed from: 0000 */
        public boolean c(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: 0000 */
        public void d() {
        }

        /* access modifiers changed from: 0000 */
        public void e() {
        }

        /* access modifiers changed from: 0000 */
        public void f() {
        }

        /* access modifiers changed from: 0000 */
        public boolean g() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public CharSequence h() {
            throw new IllegalStateException("Not implemented.");
        }
    }

    class b extends a {
        b() {
            super(ViewPager2.this, 0);
        }

        public final void a(ja jaVar) {
            if (!ViewPager2.this.k) {
                jaVar.b(defpackage.ja.a.e);
                jaVar.b(defpackage.ja.a.d);
                jaVar.j(false);
            }
        }

        public final boolean b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.k;
        }

        public final boolean c(int i) {
            if (b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        public final boolean g() {
            return true;
        }

        public final CharSequence h() {
            return "androidx.viewpager.widget.ViewPager";
        }
    }

    static abstract class c extends androidx.recyclerview.widget.RecyclerView.c {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public abstract void a();

        public final void a(int i, int i2) {
            a();
        }

        public final void a(int i, int i2, int i3) {
            a();
        }

        public final void a(int i, int i2, Object obj) {
            a();
        }

        public final void b(int i, int i2) {
            a();
        }

        public final void c(int i, int i2) {
            a();
        }
    }

    class d extends LinearLayoutManager {
        d(Context context) {
            super(context);
        }

        public final void a(o oVar, s sVar, ja jaVar) {
            super.a(oVar, sVar, jaVar);
            ViewPager2.this.m.a(jaVar);
        }

        public final void a(s sVar, int[] iArr) {
            int i = ViewPager2.this.l;
            if (i == -1) {
                super.a(sVar, iArr);
                return;
            }
            int c = ViewPager2.this.c() * i;
            iArr[0] = c;
            iArr[1] = c;
        }

        public final boolean a(o oVar, s sVar, int i, Bundle bundle) {
            return ViewPager2.this.m.b(i) ? ViewPager2.this.m.c(i) : super.a(oVar, sVar, i, bundle);
        }

        public final boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int c = c(view);
            if (ViewPager2.this.b == c) {
                return false;
            }
            boolean z3 = !z;
            ViewPager2 viewPager2 = ViewPager2.this;
            if (!viewPager2.g.a()) {
                viewPager2.a(c, z3);
                return z3;
            }
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
    }

    public static abstract class e {
        public void a(int i) {
        }

        public void a(int i, float f, int i2) {
        }

        public void b(int i) {
        }
    }

    class f extends a {
        private final jc a = new jc() {
            public final boolean a(View view) {
                f.this.d(((ViewPager2) view).b + 1);
                return true;
            }
        };
        private final jc b = new jc() {
            public final boolean a(View view) {
                f.this.d(((ViewPager2) view).b - 1);
                return true;
            }
        };
        private androidx.recyclerview.widget.RecyclerView.c c;

        f() {
            super(ViewPager2.this, 0);
        }

        public final void a(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(b());
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.accessibility.AccessibilityNodeInfo r6) {
            /*
                r5 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.e
                androidx.recyclerview.widget.RecyclerView$a r0 = r0.c()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0030
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                int r0 = r0.d()
                if (r0 != r1) goto L_0x0021
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.e
                androidx.recyclerview.widget.RecyclerView$a r0 = r0.c()
                int r0 = r0.b()
                goto L_0x0031
            L_0x0021:
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.e
                androidx.recyclerview.widget.RecyclerView$a r0 = r0.c()
                int r0 = r0.b()
                r3 = r0
                r0 = 0
                goto L_0x0032
            L_0x0030:
                r0 = 0
            L_0x0031:
                r3 = 0
            L_0x0032:
                ja r4 = defpackage.ja.a(r6)
                ja$b r0 = defpackage.ja.b.a(r0, r3, r2, r2)
                r4.a(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 16
                if (r0 < r2) goto L_0x0075
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.e
                androidx.recyclerview.widget.RecyclerView$a r0 = r0.c()
                if (r0 == 0) goto L_0x0075
                int r0 = r0.b()
                if (r0 == 0) goto L_0x0075
                androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
                boolean r2 = r2.k
                if (r2 != 0) goto L_0x005a
                goto L_0x0075
            L_0x005a:
                androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
                int r2 = r2.b
                if (r2 <= 0) goto L_0x0065
                r2 = 8192(0x2000, float:1.14794E-41)
                r6.addAction(r2)
            L_0x0065:
                androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
                int r2 = r2.b
                int r0 = r0 - r1
                if (r2 >= r0) goto L_0x0071
                r0 = 4096(0x1000, float:5.74E-42)
                r6.addAction(r0)
            L_0x0071:
                r6.setScrollable(r1)
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.f.a(android.view.accessibility.AccessibilityNodeInfo):void");
        }

        public final void a(androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
            i();
            if (aVar != null) {
                aVar.a(this.c);
            }
        }

        public final void a(RecyclerView recyclerView) {
            ip.b((View) recyclerView, 2);
            this.c = new c() {
                public final void a() {
                    f.this.i();
                }
            };
            if (ip.e(ViewPager2.this) == 0) {
                ip.b((View) ViewPager2.this, 1);
            }
        }

        public final boolean a() {
            return true;
        }

        public final boolean a(int i) {
            return i == 8192 || i == 4096;
        }

        public final boolean a(int i, Bundle bundle) {
            if (a(i)) {
                d(i == 8192 ? ViewPager2.this.b - 1 : ViewPager2.this.b + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        public final String b() {
            return "androidx.viewpager.widget.ViewPager";
        }

        public final void b(androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
            if (aVar != null) {
                aVar.b(this.c);
            }
        }

        public final void c() {
            i();
        }

        public final void d() {
            i();
        }

        /* access modifiers changed from: 0000 */
        public final void d(int i) {
            if (ViewPager2.this.k) {
                ViewPager2.this.a(i, true);
            }
        }

        public final void e() {
            i();
        }

        public final void f() {
            i();
        }

        /* access modifiers changed from: 0000 */
        public final void i() {
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            ip.c((View) viewPager2, 16908360);
            ip.c((View) viewPager2, 16908361);
            ip.c((View) viewPager2, 16908358);
            ip.c((View) viewPager2, 16908359);
            if (ViewPager2.this.e.c() != null) {
                int b2 = ViewPager2.this.e.c().b();
                if (b2 == 0 || !ViewPager2.this.k) {
                    return;
                }
                if (ViewPager2.this.d() == 0) {
                    boolean e = ViewPager2.this.e();
                    int i2 = e ? 16908360 : 16908361;
                    if (e) {
                        i = 16908361;
                    }
                    if (ViewPager2.this.b < b2 - 1) {
                        ip.a(viewPager2, new defpackage.ja.a(i2, null), null, this.a);
                    }
                    if (ViewPager2.this.b > 0) {
                        ip.a(viewPager2, new defpackage.ja.a(i, null), null, this.b);
                    }
                    return;
                }
                if (ViewPager2.this.b < b2 - 1) {
                    ip.a(viewPager2, new defpackage.ja.a(16908359, null), null, this.a);
                }
                if (ViewPager2.this.b > 0) {
                    ip.a(viewPager2, new defpackage.ja.a(16908358, null), null, this.b);
                }
            }
        }
    }

    public interface g {
        void transformPage(View view, float f);
    }

    class h extends on {
        h() {
        }

        public final View a(androidx.recyclerview.widget.RecyclerView.i iVar) {
            if (ViewPager2.this.g.a()) {
                return null;
            }
            return super.a(iVar);
        }
    }

    class i extends RecyclerView {
        i(Context context) {
            super(context);
        }

        public final CharSequence getAccessibilityClassName() {
            return ViewPager2.this.m.g() ? ViewPager2.this.m.h() : super.getAccessibilityClassName();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.b);
            accessibilityEvent.setToIndex(ViewPager2.this.b);
            ViewPager2.this.m.a(accessibilityEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.k && super.onInterceptTouchEvent(motionEvent);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.k && super.onTouchEvent(motionEvent);
        }
    }

    static class j extends BaseSavedState {
        public static final Creator<j> CREATOR = new ClassLoaderCreator<j>() {
            private static j a(Parcel parcel, ClassLoader classLoader) {
                return VERSION.SDK_INT >= 24 ? new j(parcel, classLoader) : new j(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return a(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new j[i];
            }
        };
        int a;
        int b;
        Parcelable c;

        j(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        j(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readParcelable(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    static class k implements Runnable {
        private final int a;
        private final RecyclerView b;

        k(int i, RecyclerView recyclerView) {
            this.a = i;
            this.b = recyclerView;
        }

        public final void run() {
            this.b.f(this.a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet);
    }

    private void a(int i2) {
        this.q.b(i2);
        this.m.d();
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.m = n ? new f() : new b();
        this.e = new i(context);
        this.e.setId(ip.a());
        this.q = new d(context);
        this.e.a((androidx.recyclerview.widget.RecyclerView.i) this.q);
        this.e.b(1);
        b(context, attributeSet);
        this.e.setLayoutParams(new LayoutParams(-1, -1));
        this.e.a(f());
        this.f = new so(this);
        this.g = new sm(this, this.f, this.e);
        this.t = new h();
        this.t.a(this.e);
        this.e.a((m) this.f);
        this.u = new sl(3);
        this.f.a = this.u;
        this.u.a((e) new e() {
            public final void a(int i) {
                if (ViewPager2.this.b != i) {
                    ViewPager2 viewPager2 = ViewPager2.this;
                    viewPager2.b = i;
                    viewPager2.m.e();
                }
            }

            public final void b(int i) {
                if (i == 0) {
                    ViewPager2.this.b();
                }
            }
        });
        this.m.a(this.e);
        this.u.a((e) this.a);
        this.h = new sn(this.q);
        this.u.a((e) this.h);
        RecyclerView recyclerView = this.e;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.sg.a.a);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, defpackage.sg.a.a, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            a(obtainStyledAttributes.getInt(defpackage.sg.a.b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private androidx.recyclerview.widget.RecyclerView.j f() {
        return new androidx.recyclerview.widget.RecyclerView.j() {
            public final void a(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (layoutParams.width != -1 || layoutParams.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }

            public final void b(View view) {
            }
        };
    }

    public void a() {
        if (this.r != -1) {
            androidx.recyclerview.widget.RecyclerView.a c2 = this.e.c();
            if (c2 != null) {
                if (this.s != null) {
                    this.s = null;
                }
                this.b = Math.max(0, Math.min(this.r, c2.b() - 1));
                this.r = -1;
                this.e.d(this.b);
                this.m.c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, boolean z) {
        androidx.recyclerview.widget.RecyclerView.a c2 = this.e.c();
        if (c2 == null) {
            if (this.r != -1) {
                this.r = Math.max(i2, 0);
            }
        } else if (c2.b() > 0) {
            int min = Math.min(Math.max(i2, 0), c2.b() - 1);
            if (min == this.b && this.f.a()) {
                return;
            }
            if (min != this.b || !z) {
                double d2 = (double) this.b;
                this.b = min;
                this.m.e();
                if (!this.f.a()) {
                    d2 = this.f.b();
                }
                this.f.a(min, z);
                if (!z) {
                    this.e.d(min);
                    return;
                }
                double d3 = (double) min;
                Double.isNaN(d3);
                if (Math.abs(d3 - d2) > 3.0d) {
                    this.e.d(d3 > d2 ? min - 3 : min + 3);
                    RecyclerView recyclerView = this.e;
                    recyclerView.post(new k(min, recyclerView));
                    return;
                }
                this.e.f(min);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        on onVar = this.t;
        if (onVar != null) {
            View a2 = onVar.a(this.q);
            if (a2 != null) {
                int c2 = LinearLayoutManager.c(a2);
                if (c2 != this.b && this.f.b == 0) {
                    this.u.a(c2);
                }
                this.c = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final int c() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.e;
        if (this.q.c == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final int d() {
        return this.q.c;
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i2 = ((j) parcelable).a;
            sparseArray.put(this.e.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    public final boolean e() {
        return ip.f(this.q.i) == 1;
    }

    public final CharSequence getAccessibilityClassName() {
        return this.m.a() ? this.m.b() : super.getAccessibilityClassName();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.m.a(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        this.o.left = getPaddingLeft();
        this.o.right = (i4 - i2) - getPaddingRight();
        this.o.top = getPaddingTop();
        this.o.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.o, this.p);
        this.e.layout(this.p.left, this.p.top, this.p.right, this.p.bottom);
        if (this.c) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        measureChild(this.e, i2, i3);
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        int measuredState = this.e.getMeasuredState();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.r = jVar.b;
        this.s = jVar.c;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.a = this.e.getId();
        int i2 = this.r;
        if (i2 == -1) {
            i2 = this.b;
        }
        jVar.b = i2;
        Parcelable parcelable = this.s;
        if (parcelable != null) {
            jVar.c = parcelable;
        } else {
            androidx.recyclerview.widget.RecyclerView.a c2 = this.e.c();
            if (c2 instanceof sj) {
                jVar.c = ((sj) c2).a();
            }
        }
        return jVar;
    }

    public final void onViewAdded(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }

    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        return this.m.a(i2) ? this.m.a(i2, bundle) : super.performAccessibilityAction(i2, bundle);
    }

    public final void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.m.f();
    }
}
