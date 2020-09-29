package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements ii {
    private static String d;
    private static Class<?>[] e = {Context.class, AttributeSet.class};
    private static ThreadLocal<Map<String, Constructor<Behavior>>> f = new ThreadLocal<>();
    private static Comparator<View> g;
    private static final defpackage.hq.a<Rect> h = new defpackage.hq.c(12);
    public iw a;
    boolean b;
    OnHierarchyChangeListener c;
    private final List<View> i;
    private final ew<View> j;
    private final List<View> k;
    private final List<View> l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private e s;
    private boolean t;
    private Drawable u;
    private il v;
    private final ik w;

    public static abstract class Behavior<V extends View> {
        public static iw a(iw iwVar) {
            return iwVar;
        }

        @Deprecated
        public void a(V v, int i) {
        }

        public void a(d dVar) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        @Deprecated
        public boolean a(int i) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return a(i);
            }
            return false;
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                a(v, i2);
            }
        }

        public Parcelable a(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }
    }

    public interface a {
        Behavior a();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        Class<? extends Behavior> a();
    }

    class c implements OnHierarchyChangeListener {
        c() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.c != null) {
                CoordinatorLayout.this.c.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.a(2);
            if (CoordinatorLayout.this.c != null) {
                CoordinatorLayout.this.c.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class d extends MarginLayoutParams {
        public Behavior a;
        boolean b = false;
        public int c = 0;
        public int d = 0;
        public int e = -1;
        public int f = -1;
        public int g = 0;
        public int h = 0;
        int i;
        int j;
        View k;
        View l;
        boolean m;
        boolean n;
        final Rect o = new Rect();
        private boolean p;
        private boolean q;
        private Object r;

        public d(int i2, int i3) {
            super(i2, i3);
        }

        d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ev.a.d);
            this.c = obtainStyledAttributes.getInteger(defpackage.ev.a.e, 0);
            this.f = obtainStyledAttributes.getResourceId(defpackage.ev.a.f, -1);
            this.d = obtainStyledAttributes.getInteger(defpackage.ev.a.g, 0);
            this.e = obtainStyledAttributes.getInteger(defpackage.ev.a.k, -1);
            this.g = obtainStyledAttributes.getInt(defpackage.ev.a.j, 0);
            this.h = obtainStyledAttributes.getInt(defpackage.ev.a.i, 0);
            this.b = obtainStyledAttributes.hasValue(defpackage.ev.a.h);
            if (this.b) {
                this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(defpackage.ev.a.h));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.a;
            if (behavior != null) {
                behavior.a(this);
            }
        }

        public d(d dVar) {
            super(dVar);
        }

        public d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void a(Behavior behavior) {
            if (this.a != behavior) {
                this.a = behavior;
                this.r = null;
                this.b = true;
                if (behavior != null) {
                    behavior.a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2, boolean z) {
            if (i2 != 0) {
                if (i2 == 1) {
                    this.q = z;
                }
                return;
            }
            this.p = z;
        }

        /* access modifiers changed from: 0000 */
        public final boolean b(int i2) {
            if (i2 == 0) {
                return this.p;
            }
            if (i2 != 1) {
                return false;
            }
            return this.q;
        }

        public final void a(int i2) {
            this.l = null;
            this.k = null;
            this.f = i2;
        }
    }

    class e implements OnPreDrawListener {
        e() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.a(0);
            return true;
        }
    }

    public static class f extends jt {
        public static final Creator<f> CREATOR = new ClassLoaderCreator<f>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new f[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        };
        SparseArray<Parcelable> a;

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static class g implements Comparator<View> {
        g() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            View view = (View) obj2;
            float C = ip.C((View) obj);
            float C2 = ip.C(view);
            if (C > C2) {
                return -1;
            }
            return C < C2 ? 1 : 0;
        }
    }

    private static int c(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & ContentType.LONG_FORM_ON_DEMAND) == 0 ? i2 | 48 : i2;
    }

    private static int d(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static int e(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        d = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            g = new g();
        } else {
            g = null;
        }
    }

    private static Rect a() {
        Rect rect = (Rect) h.a();
        return rect == null ? new Rect() : rect;
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        h.a(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArray;
        super(context, attributeSet, i2);
        this.i = new ArrayList();
        this.j = new ew<>();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new int[2];
        this.w = new ik();
        if (i2 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, defpackage.ev.a.a, 0, 2132018070);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, defpackage.ev.a.a, i2, 0);
        }
        int resourceId = typedArray.getResourceId(defpackage.ev.a.b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.p;
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.u = typedArray.getDrawable(defpackage.ev.a.c);
        typedArray.recycle();
        c();
        super.setOnHierarchyChangeListener(new c());
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.c = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.t) {
            if (this.s == null) {
                this.s = new e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.a == null && ip.t(this)) {
            ip.s(this);
        }
        this.o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        View view = this.r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.o = false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.u;
        if (drawable != null && drawable.isVisible() != z) {
            this.u.setVisible(z, false);
        }
    }

    private void a(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Behavior behavior = ((d) childAt.getLayoutParams()).a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.a(this, childAt, obtain);
                } else {
                    behavior.b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((d) getChildAt(i3).getLayoutParams()).m = false;
        }
        this.q = null;
        this.n = false;
    }

    private boolean a(MotionEvent motionEvent, int i2) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i4 = childCount - 1;
        while (i4 >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
            i4--;
        }
        Comparator<View> comparator = g;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) list.get(i5);
            d dVar = (d) view.getLayoutParams();
            Behavior behavior = dVar.a;
            boolean z4 = true;
            if ((!z2 && !z3) || actionMasked == 0) {
                if (!z2 && behavior != null) {
                    if (i3 == 0) {
                        z2 = behavior.a(this, view, motionEvent2);
                    } else if (i3 == 1) {
                        z2 = behavior.b(this, view, motionEvent2);
                    }
                    if (z2) {
                        this.q = view;
                    }
                }
                if (dVar.a == null) {
                    dVar.m = false;
                }
                boolean z5 = dVar.m;
                if (dVar.m) {
                    z = true;
                } else {
                    z = dVar.m;
                    if (dVar.a != null) {
                        Behavior behavior2 = dVar.a;
                    }
                    dVar.m = z;
                }
                if (!z || z5) {
                    z4 = false;
                }
                if (z && !z4) {
                    break;
                }
                z3 = z4;
            } else if (behavior != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i3 == 0) {
                    behavior.a(this, view, motionEvent3);
                } else if (i3 == 1) {
                    behavior.b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.q
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.a(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.q
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.q
            boolean r6 = r6.b(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            android.view.View r7 = r0.q
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.a(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.n) {
            a(false);
            this.n = true;
        }
    }

    private int b(int i2) {
        int[] iArr = this.p;
        String str = "CoordinatorLayout";
        if (iArr == null) {
            StringBuilder sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
            Log.e(str, sb.toString());
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            StringBuilder sb2 = new StringBuilder("Keyline index ");
            sb2.append(i2);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e(str, sb2.toString());
            return 0;
        }
    }

    static Behavior a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(d)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f.get();
            if (map == null) {
                map = new HashMap();
                f.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(e);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e2) {
            StringBuilder sb3 = new StringBuilder("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e2);
        }
    }

    private static d d(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.b) {
            if (view instanceof a) {
                dVar.a(((a) view).a());
                dVar.b = true;
            } else {
                b bVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (b) cls.getAnnotation(b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        dVar.a((Behavior) bVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder("Default behavior class ");
                        sb.append(bVar.a().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), e2);
                    }
                }
                dVar.b = true;
            }
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public final void b(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        int i3 = 0;
        if (!(dVar.k == null && dVar.f != -1)) {
            if (dVar.k != null) {
                View view2 = dVar.k;
                Rect a2 = a();
                Rect a3 = a();
                try {
                    ex.a((ViewGroup) this, view2, a2);
                    d dVar2 = (d) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    a(i2, a2, a3, dVar2, measuredWidth, measuredHeight);
                    a(dVar2, a3, measuredWidth, measuredHeight);
                    view.layout(a3.left, a3.top, a3.right, a3.bottom);
                } finally {
                    a(a2);
                    a(a3);
                }
            } else if (dVar.e >= 0) {
                int i4 = dVar.e;
                d dVar3 = (d) view.getLayoutParams();
                int a4 = hx.a(d(dVar3.c), i2);
                int i5 = a4 & 7;
                int i6 = a4 & ContentType.LONG_FORM_ON_DEMAND;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i2 == 1) {
                    i4 = width - i4;
                }
                int b2 = b(i4) - measuredWidth2;
                if (i5 == 1) {
                    b2 += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    b2 += measuredWidth2;
                }
                if (i6 == 16) {
                    i3 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i3 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + dVar3.leftMargin, Math.min(b2, ((width - getPaddingRight()) - measuredWidth2) - dVar3.rightMargin));
                int max2 = Math.max(getPaddingTop() + dVar3.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - dVar3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            } else {
                d dVar4 = (d) view.getLayoutParams();
                Rect a5 = a();
                a5.set(getPaddingLeft() + dVar4.leftMargin, getPaddingTop() + dVar4.topMargin, (getWidth() - getPaddingRight()) - dVar4.rightMargin, (getHeight() - getPaddingBottom()) - dVar4.bottomMargin);
                if (this.a != null && ip.t(this) && !ip.t(view)) {
                    a5.left += this.a.a();
                    a5.top += this.a.b();
                    a5.right -= this.a.c();
                    a5.bottom -= this.a.d();
                }
                Rect a6 = a();
                hx.a(c(dVar4.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a5, a6, i2);
                view.layout(a6.left, a6.top, a6.right, a6.bottom);
                a(a5);
                a(a6);
            }
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int f2 = ip.f(this);
        int size = this.i.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.i.get(i6);
            if (view.getVisibility() != 8) {
                Behavior behavior = ((d) view.getLayoutParams()).a;
                if (behavior == null || !behavior.a(this, view, f2)) {
                    b(view, f2);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b && this.u != null) {
            iw iwVar = this.a;
            int b2 = iwVar != null ? iwVar.b() : 0;
            if (b2 > 0) {
                this.u.setBounds(0, 0, getWidth(), b2);
                this.u.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        c();
    }

    private void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            ex.a((ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private static void a(int i2, Rect rect, Rect rect2, d dVar, int i3, int i4) {
        int i5;
        int i6;
        int a2 = hx.a(e(dVar.c), i2);
        int a3 = hx.a(c(dVar.d), i2);
        int i7 = a2 & 7;
        int i8 = a2 & ContentType.LONG_FORM_ON_DEMAND;
        int i9 = a3 & 7;
        int i10 = a3 & ContentType.LONG_FORM_ON_DEMAND;
        if (i9 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i9 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i10 == 16) {
            i6 = rect.top + (rect.height() / 2);
        } else if (i10 != 80) {
            i6 = rect.top;
        } else {
            i6 = rect.bottom;
        }
        if (i7 == 1) {
            i5 -= i3 / 2;
        } else if (i7 != 5) {
            i5 -= i3;
        }
        if (i8 == 16) {
            i6 -= i4 / 2;
        } else if (i8 != 80) {
            i6 -= i4;
        }
        rect2.set(i5, i6, i3 + i5, i4 + i6);
    }

    private void a(d dVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - dVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            int r8 = defpackage.ip.f(r24)
            java.util.List<android.view.View> r2 = r0.i
            int r9 = r2.size()
            android.graphics.Rect r10 = a()
            android.graphics.Rect r11 = a()
            android.graphics.Rect r12 = a()
            r14 = 0
        L_0x001b:
            if (r14 >= r9) goto L_0x02be
            java.util.List<android.view.View> r2 = r0.i
            java.lang.Object r2 = r2.get(r14)
            r15 = r2
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            r7 = r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r7
            if (r1 != 0) goto L_0x003f
            int r2 = r15.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r3 = r9
            r4 = r12
            r18 = r14
        L_0x003c:
            r9 = 0
            goto L_0x02b8
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r6 >= r14) goto L_0x00eb
            java.util.List<android.view.View> r2 = r0.i
            java.lang.Object r2 = r2.get(r6)
            android.view.View r2 = (android.view.View) r2
            android.view.View r3 = r7.l
            if (r3 != r2) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            r4 = r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r4
            android.view.View r2 = r4.k
            if (r2 == 0) goto L_0x00d5
            android.graphics.Rect r3 = a()
            android.graphics.Rect r2 = a()
            android.graphics.Rect r13 = a()
            android.view.View r5 = r4.k
            defpackage.ex.a(r0, r5, r3)
            r5 = 0
            r0.a(r15, r5, r2)
            int r5 = r15.getMeasuredWidth()
            r17 = r9
            int r9 = r15.getMeasuredHeight()
            r18 = r14
            r14 = r2
            r2 = r8
            r19 = r3
            r20 = r4
            r4 = r13
            r21 = r5
            r16 = r12
            r12 = 1
            r5 = r20
            r22 = r6
            r6 = r21
            r23 = r7
            r7 = r9
            a(r2, r3, r4, r5, r6, r7)
            int r2 = r13.left
            int r3 = r14.left
            if (r2 != r3) goto L_0x00a5
            int r2 = r13.top
            int r3 = r14.top
            if (r2 == r3) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            r2 = r20
            r3 = r21
            r12 = 0
            goto L_0x00a9
        L_0x00a5:
            r2 = r20
            r3 = r21
        L_0x00a9:
            r0.a(r2, r13, r3, r9)
            int r3 = r13.left
            int r4 = r14.left
            int r3 = r3 - r4
            int r4 = r13.top
            int r5 = r14.top
            int r4 = r4 - r5
            if (r3 == 0) goto L_0x00bb
            defpackage.ip.g(r15, r3)
        L_0x00bb:
            if (r4 == 0) goto L_0x00c0
            defpackage.ip.f(r15, r4)
        L_0x00c0:
            if (r12 == 0) goto L_0x00cb
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r2.a
            if (r3 == 0) goto L_0x00cb
            android.view.View r2 = r2.k
            r3.b(r0, r15, r2)
        L_0x00cb:
            a(r19)
            a(r14)
            a(r13)
            goto L_0x00df
        L_0x00d5:
            r22 = r6
            r23 = r7
            r17 = r9
            r16 = r12
            r18 = r14
        L_0x00df:
            int r6 = r22 + 1
            r12 = r16
            r9 = r17
            r14 = r18
            r7 = r23
            goto L_0x0040
        L_0x00eb:
            r23 = r7
            r17 = r9
            r16 = r12
            r18 = r14
            r12 = 1
            r0.a(r15, r12, r11)
            r2 = r23
            int r3 = r2.g
            r4 = 5
            r5 = 3
            r6 = 80
            r7 = 48
            if (r3 == 0) goto L_0x0151
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L_0x0151
            int r3 = r2.g
            int r3 = defpackage.hx.a(r3, r8)
            r9 = r3 & 112(0x70, float:1.57E-43)
            if (r9 == r7) goto L_0x0126
            if (r9 == r6) goto L_0x0116
            goto L_0x0130
        L_0x0116:
            int r9 = r10.bottom
            int r13 = r24.getHeight()
            int r14 = r11.top
            int r13 = r13 - r14
            int r9 = java.lang.Math.max(r9, r13)
            r10.bottom = r9
            goto L_0x0130
        L_0x0126:
            int r9 = r10.top
            int r13 = r11.bottom
            int r9 = java.lang.Math.max(r9, r13)
            r10.top = r9
        L_0x0130:
            r3 = r3 & 7
            if (r3 == r5) goto L_0x0147
            if (r3 == r4) goto L_0x0137
            goto L_0x0151
        L_0x0137:
            int r3 = r10.right
            int r9 = r24.getWidth()
            int r13 = r11.left
            int r9 = r9 - r13
            int r3 = java.lang.Math.max(r3, r9)
            r10.right = r3
            goto L_0x0151
        L_0x0147:
            int r3 = r10.left
            int r9 = r11.right
            int r3 = java.lang.Math.max(r3, r9)
            r10.left = r3
        L_0x0151:
            int r2 = r2.h
            if (r2 == 0) goto L_0x0252
            int r2 = r15.getVisibility()
            if (r2 != 0) goto L_0x0252
            boolean r2 = defpackage.ip.B(r15)
            if (r2 == 0) goto L_0x0252
            int r2 = r15.getWidth()
            if (r2 <= 0) goto L_0x0252
            int r2 = r15.getHeight()
            if (r2 > 0) goto L_0x016f
            goto L_0x0252
        L_0x016f:
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r2.a
            android.graphics.Rect r9 = a()
            android.graphics.Rect r13 = a()
            int r14 = r15.getLeft()
            int r12 = r15.getTop()
            int r4 = r15.getRight()
            int r5 = r15.getBottom()
            r13.set(r14, r12, r4, r5)
            if (r3 == 0) goto L_0x01c5
            boolean r3 = r3.a(r0, r15, r9)
            if (r3 == 0) goto L_0x01c5
            boolean r3 = r13.contains(r9)
            if (r3 == 0) goto L_0x01a1
            goto L_0x01c8
        L_0x01a1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r13.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c5:
            r9.set(r13)
        L_0x01c8:
            a(r13)
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L_0x024f
            int r3 = r2.h
            int r3 = defpackage.hx.a(r3, r8)
            r4 = r3 & 48
            if (r4 != r7) goto L_0x01ef
            int r4 = r9.top
            int r5 = r2.topMargin
            int r4 = r4 - r5
            int r5 = r2.j
            int r4 = r4 - r5
            int r5 = r10.top
            if (r4 >= r5) goto L_0x01ef
            int r5 = r10.top
            int r5 = r5 - r4
            d(r15, r5)
            r5 = 1
            goto L_0x01f0
        L_0x01ef:
            r5 = 0
        L_0x01f0:
            r4 = r3 & 80
            if (r4 != r6) goto L_0x020c
            int r4 = r24.getHeight()
            int r6 = r9.bottom
            int r4 = r4 - r6
            int r6 = r2.bottomMargin
            int r4 = r4 - r6
            int r6 = r2.j
            int r4 = r4 + r6
            int r6 = r10.bottom
            if (r4 >= r6) goto L_0x020c
            int r5 = r10.bottom
            int r4 = r4 - r5
            d(r15, r4)
            r5 = 1
        L_0x020c:
            if (r5 != 0) goto L_0x0212
            r4 = 0
            d(r15, r4)
        L_0x0212:
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L_0x022b
            int r4 = r9.left
            int r5 = r2.leftMargin
            int r4 = r4 - r5
            int r5 = r2.i
            int r4 = r4 - r5
            int r5 = r10.left
            if (r4 >= r5) goto L_0x022b
            int r5 = r10.left
            int r5 = r5 - r4
            c(r15, r5)
            r5 = 1
            goto L_0x022c
        L_0x022b:
            r5 = 0
        L_0x022c:
            r3 = r3 & 5
            r4 = 5
            if (r3 != r4) goto L_0x0249
            int r3 = r24.getWidth()
            int r4 = r9.right
            int r3 = r3 - r4
            int r4 = r2.rightMargin
            int r3 = r3 - r4
            int r2 = r2.i
            int r3 = r3 + r2
            int r2 = r10.right
            if (r3 >= r2) goto L_0x0249
            int r2 = r10.right
            int r3 = r3 - r2
            c(r15, r3)
            r5 = 1
        L_0x0249:
            if (r5 != 0) goto L_0x024f
            r2 = 0
            c(r15, r2)
        L_0x024f:
            a(r9)
        L_0x0252:
            r2 = 2
            if (r1 == r2) goto L_0x0278
            android.view.ViewGroup$LayoutParams r3 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r3
            android.graphics.Rect r3 = r3.o
            r4 = r16
            r4.set(r3)
            boolean r3 = r4.equals(r11)
            if (r3 != 0) goto L_0x0274
            android.view.ViewGroup$LayoutParams r3 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r3
            android.graphics.Rect r3 = r3.o
            r3.set(r11)
            goto L_0x027a
        L_0x0274:
            r3 = r17
            goto L_0x003c
        L_0x0278:
            r4 = r16
        L_0x027a:
            int r14 = r18 + 1
            r3 = r17
        L_0x027e:
            if (r14 >= r3) goto L_0x003c
            java.util.List<android.view.View> r5 = r0.i
            java.lang.Object r5 = r5.get(r14)
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r7 = r6.a
            if (r7 == 0) goto L_0x02b3
            boolean r9 = r7.a(r0, r5, r15)
            if (r9 == 0) goto L_0x02b3
            if (r1 != 0) goto L_0x02a3
            boolean r9 = r6.n
            if (r9 == 0) goto L_0x02a3
            r9 = 0
            r6.n = r9
            r7 = 1
            goto L_0x02b5
        L_0x02a3:
            r9 = 0
            if (r1 == r2) goto L_0x02ac
            boolean r5 = r7.b(r0, r5, r15)
        L_0x02aa:
            r7 = 1
            goto L_0x02ae
        L_0x02ac:
            r5 = 1
            goto L_0x02aa
        L_0x02ae:
            if (r1 != r7) goto L_0x02b5
            r6.n = r5
            goto L_0x02b5
        L_0x02b3:
            r7 = 1
            r9 = 0
        L_0x02b5:
            int r14 = r14 + 1
            goto L_0x027e
        L_0x02b8:
            int r14 = r18 + 1
            r9 = r3
            r12 = r4
            goto L_0x001b
        L_0x02be:
            r4 = r12
            a(r10)
            a(r11)
            a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.a(int):void");
    }

    private static void c(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        if (dVar.i != i2) {
            ip.g(view, i2 - dVar.i);
            dVar.i = i2;
        }
    }

    private static void d(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        if (dVar.j != i2) {
            ip.f(view, i2 - dVar.j);
            dVar.j = i2;
        }
    }

    public final void a(View view) {
        List b2 = this.j.b(view);
        if (b2 != null && !b2.isEmpty()) {
            for (int i2 = 0; i2 < b2.size(); i2++) {
                View view2 = (View) b2.get(i2);
                Behavior behavior = ((d) view2.getLayoutParams()).a;
                if (behavior != null) {
                    behavior.b(this, view2, view);
                }
            }
        }
    }

    public final List<View> b(View view) {
        ew<View> ewVar = this.j;
        int size = ewVar.b.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = (ArrayList) ewVar.b.c(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ewVar.b.b(i2));
            }
        }
        this.l.clear();
        if (arrayList != null) {
            this.l.addAll(arrayList);
        }
        return this.l;
    }

    public final List<View> c(View view) {
        List b2 = this.j.b(view);
        this.l.clear();
        if (b2 != null) {
            this.l.addAll(b2);
        }
        return this.l;
    }

    private void b() {
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i2);
            ew<View> ewVar = this.j;
            int size = ewVar.b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z2 = false;
                    break;
                }
                ArrayList arrayList = (ArrayList) ewVar.b.c(i3);
                if (arrayList != null && arrayList.contains(childAt)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                z = true;
                break;
            }
            i2++;
        }
        if (z != this.t) {
            if (z) {
                if (this.o) {
                    if (this.s == null) {
                        this.s = new e();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.s);
                }
                this.t = true;
                return;
            }
            if (this.o && this.s != null) {
                getViewTreeObserver().removeOnPreDrawListener(this.s);
            }
            this.t = false;
        }
    }

    public final boolean a(View view, int i2, int i3) {
        Rect a2 = a();
        ex.a((ViewGroup) this, view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a(a2);
        }
    }

    protected static d a(LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new d((MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    public final boolean a(View view, View view2, int i2, int i3) {
        int i4 = i3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                Behavior behavior = dVar.a;
                if (behavior != null) {
                    boolean a2 = behavior.a(this, childAt, view, view2, i2, i3);
                    boolean z2 = z | a2;
                    dVar.a(i4, a2);
                    z = z2;
                } else {
                    dVar.a(i4, false);
                }
            }
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    public final void b(View view, View view2, int i2, int i3) {
        this.w.a(i2, i3);
        this.r = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).getLayoutParams();
        }
    }

    public void onStopNestedScroll(View view) {
        a(view, 0);
    }

    public final void a(View view, int i2) {
        this.w.a(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.b(i2)) {
                Behavior behavior = dVar.a;
                if (behavior != null) {
                    behavior.a(this, childAt, view, i2);
                }
                dVar.a(i2, false);
                dVar.n = false;
            }
        }
        this.r = null;
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.b(i6)) {
                    Behavior behavior = dVar.a;
                    if (behavior != null) {
                        behavior.a(this, childAt, view, i2, i3, i4, i5, i6);
                        z = true;
                    }
                }
            } else {
                int i8 = i6;
            }
        }
        if (z) {
            a(1);
        }
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.b(i4)) {
                    Behavior behavior = dVar.a;
                    if (behavior != null) {
                        int[] iArr2 = this.m;
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        behavior.a(this, childAt, view, i2, i3, iArr2, i4);
                        int[] iArr3 = this.m;
                        if (i2 > 0) {
                            i5 = Math.max(i7, iArr3[0]);
                        } else {
                            i5 = Math.min(i7, iArr3[0]);
                        }
                        int[] iArr4 = this.m;
                        if (i3 > 0) {
                            i6 = Math.max(i8, iArr4[1]);
                        } else {
                            i6 = Math.min(i8, iArr4[1]);
                        }
                        i7 = i5;
                        i8 = i6;
                        z = true;
                    }
                }
            } else {
                int i10 = i4;
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z) {
            a(1);
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.b(0)) {
                    Behavior behavior = dVar.a;
                    if (behavior != null) {
                        z |= behavior.a(this, childAt, view, f2, f3);
                    }
                }
            }
        }
        return z;
    }

    public int getNestedScrollAxes() {
        return this.w.a();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.d);
        SparseArray<Parcelable> sparseArray = fVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            Behavior behavior = d(childAt).a;
            if (!(id == -1 || behavior == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    behavior.a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            Behavior behavior = ((d) childAt.getLayoutParams()).a;
            if (!(id == -1 || behavior == null)) {
                Parcelable a2 = behavior.a(this, childAt);
                if (a2 != null) {
                    sparseArray.append(id, a2);
                }
            }
        }
        fVar.a = sparseArray;
        return fVar;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((d) view.getLayoutParams()).a;
        if (behavior == null || !behavior.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void c() {
        if (VERSION.SDK_INT >= 21) {
            if (ip.t(this)) {
                if (this.v == null) {
                    this.v = new il() {
                        public final iw onApplyWindowInsets(View view, iw iwVar) {
                            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                            if (!hn.a(coordinatorLayout.a, iwVar)) {
                                coordinatorLayout.a = iwVar;
                                boolean z = true;
                                coordinatorLayout.b = iwVar != null && iwVar.b() > 0;
                                if (coordinatorLayout.b || coordinatorLayout.getBackground() != null) {
                                    z = false;
                                }
                                coordinatorLayout.setWillNotDraw(z);
                                if (!iwVar.e()) {
                                    int childCount = coordinatorLayout.getChildCount();
                                    for (int i = 0; i < childCount; i++) {
                                        View childAt = coordinatorLayout.getChildAt(i);
                                        if (ip.t(childAt) && ((d) childAt.getLayoutParams()).a != null) {
                                            iwVar = Behavior.a(iwVar);
                                            if (iwVar.e()) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                coordinatorLayout.requestLayout();
                            }
                            return iwVar;
                        }
                    };
                }
                ip.a((View) this, this.v);
                setSystemUiVisibility(1280);
                return;
            }
            ip.a((View) this, (il) null);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02b4, code lost:
        if (r0.a(r30, r20, r8, r21, r23, 0) == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r5 != false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x016b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            java.util.List<android.view.View> r0 = r7.i
            r0.clear()
            ew<android.view.View> r0 = r7.j
            dv<T, java.util.ArrayList<T>> r1 = r0.b
            int r1 = r1.size()
            r2 = 0
        L_0x0010:
            if (r2 >= r1) goto L_0x0027
            dv<T, java.util.ArrayList<T>> r3 = r0.b
            java.lang.Object r3 = r3.c(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x0024
            r3.clear()
            hq$a<java.util.ArrayList<T>> r4 = r0.a
            r4.a(r3)
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0027:
            dv<T, java.util.ArrayList<T>> r0 = r0.b
            r0.clear()
            int r0 = r30.getChildCount()
            r1 = 0
        L_0x0031:
            r2 = 1
            if (r1 >= r0) goto L_0x0199
            android.view.View r3 = r7.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r4 = d(r3)
            int r5 = r4.f
            r6 = -1
            r9 = 0
            if (r5 != r6) goto L_0x0048
            r4.l = r9
            r4.k = r9
            goto L_0x00dc
        L_0x0048:
            android.view.View r5 = r4.k
            if (r5 == 0) goto L_0x007d
            android.view.View r5 = r4.k
            int r5 = r5.getId()
            int r6 = r4.f
            if (r5 == r6) goto L_0x0058
        L_0x0056:
            r5 = 0
            goto L_0x007b
        L_0x0058:
            android.view.View r5 = r4.k
            android.view.View r6 = r4.k
            android.view.ViewParent r6 = r6.getParent()
        L_0x0060:
            if (r6 == r7) goto L_0x0078
            if (r6 == 0) goto L_0x0073
            if (r6 != r3) goto L_0x0067
            goto L_0x0073
        L_0x0067:
            boolean r10 = r6 instanceof android.view.View
            if (r10 == 0) goto L_0x006e
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x006e:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0060
        L_0x0073:
            r4.l = r9
            r4.k = r9
            goto L_0x0056
        L_0x0078:
            r4.l = r5
            r5 = 1
        L_0x007b:
            if (r5 != 0) goto L_0x00da
        L_0x007d:
            int r5 = r4.f
            android.view.View r5 = r7.findViewById(r5)
            r4.k = r5
            android.view.View r5 = r4.k
            if (r5 == 0) goto L_0x00d0
            android.view.View r5 = r4.k
            if (r5 != r7) goto L_0x00a0
            boolean r5 = r30.isInEditMode()
            if (r5 == 0) goto L_0x0098
            r4.l = r9
            r4.k = r9
            goto L_0x00da
        L_0x0098:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x00a0:
            android.view.View r5 = r4.k
            android.view.View r6 = r4.k
            android.view.ViewParent r6 = r6.getParent()
        L_0x00a8:
            if (r6 == r7) goto L_0x00cd
            if (r6 == 0) goto L_0x00cd
            if (r6 != r3) goto L_0x00c1
            boolean r5 = r30.isInEditMode()
            if (r5 == 0) goto L_0x00b9
            r4.l = r9
            r4.k = r9
            goto L_0x00da
        L_0x00b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00c1:
            boolean r10 = r6 instanceof android.view.View
            if (r10 == 0) goto L_0x00c8
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00c8:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x00a8
        L_0x00cd:
            r4.l = r5
            goto L_0x00da
        L_0x00d0:
            boolean r5 = r30.isInEditMode()
            if (r5 == 0) goto L_0x0173
            r4.l = r9
            r4.k = r9
        L_0x00da:
            android.view.View r5 = r4.k
        L_0x00dc:
            ew<android.view.View> r5 = r7.j
            r5.a(r3)
            r5 = 0
        L_0x00e2:
            if (r5 >= r0) goto L_0x016f
            if (r5 == r1) goto L_0x016b
            android.view.View r6 = r7.getChildAt(r5)
            android.view.View r9 = r4.l
            if (r6 == r9) goto L_0x011d
            int r9 = defpackage.ip.f(r30)
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r10
            int r10 = r10.g
            int r10 = defpackage.hx.a(r10, r9)
            if (r10 == 0) goto L_0x010b
            int r11 = r4.h
            int r9 = defpackage.hx.a(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x010b
            r9 = 1
            goto L_0x010c
        L_0x010b:
            r9 = 0
        L_0x010c:
            if (r9 != 0) goto L_0x011d
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r9 = r4.a
            if (r9 == 0) goto L_0x011b
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r9 = r4.a
            boolean r9 = r9.a(r7, r3, r6)
            if (r9 == 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r9 = 0
            goto L_0x011e
        L_0x011d:
            r9 = 1
        L_0x011e:
            if (r9 == 0) goto L_0x016b
            ew<android.view.View> r9 = r7.j
            dv<T, java.util.ArrayList<T>> r9 = r9.b
            boolean r9 = r9.containsKey(r6)
            if (r9 != 0) goto L_0x012f
            ew<android.view.View> r9 = r7.j
            r9.a(r6)
        L_0x012f:
            ew<android.view.View> r9 = r7.j
            dv<T, java.util.ArrayList<T>> r10 = r9.b
            boolean r10 = r10.containsKey(r6)
            if (r10 == 0) goto L_0x0163
            dv<T, java.util.ArrayList<T>> r10 = r9.b
            boolean r10 = r10.containsKey(r3)
            if (r10 == 0) goto L_0x0163
            dv<T, java.util.ArrayList<T>> r10 = r9.b
            java.lang.Object r10 = r10.get(r6)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x015f
            hq$a<java.util.ArrayList<T>> r10 = r9.a
            java.lang.Object r10 = r10.a()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x015a
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x015a:
            dv<T, java.util.ArrayList<T>> r9 = r9.b
            r9.put(r6, r10)
        L_0x015f:
            r10.add(r3)
            goto L_0x016b
        L_0x0163:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x016b:
            int r5 = r5 + 1
            goto L_0x00e2
        L_0x016f:
            int r1 = r1 + 1
            goto L_0x0031
        L_0x0173:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r2)
            android.content.res.Resources r2 = r30.getResources()
            int r4 = r4.f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0199:
            java.util.List<android.view.View> r0 = r7.i
            ew<android.view.View> r1 = r7.j
            java.util.ArrayList r1 = r1.a()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r7.i
            java.util.Collections.reverse(r0)
            r30.b()
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r11 = defpackage.ip.f(r30)
            if (r11 != r2) goto L_0x01c4
            r12 = 1
            goto L_0x01c5
        L_0x01c4:
            r12 = 0
        L_0x01c5:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            iw r3 = r7.a
            if (r3 == 0) goto L_0x01ee
            boolean r3 = defpackage.ip.t(r30)
            if (r3 == 0) goto L_0x01ee
            r19 = 1
            goto L_0x01f0
        L_0x01ee:
            r19 = 0
        L_0x01f0:
            java.util.List<android.view.View> r2 = r7.i
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x01fa:
            if (r5 >= r6) goto L_0x0311
            java.util.List<android.view.View> r0 = r7.i
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0303
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r1
            int r0 = r1.e
            if (r0 < 0) goto L_0x0257
            if (r13 == 0) goto L_0x0257
            int r0 = r1.e
            int r0 = r7.b(r0)
            int r8 = r1.c
            int r8 = d(r8)
            int r8 = defpackage.hx.a(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L_0x0234
            if (r12 == 0) goto L_0x0239
        L_0x0234:
            r2 = 5
            if (r8 != r2) goto L_0x0245
            if (r12 == 0) goto L_0x0245
        L_0x0239:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r8 = 0
            goto L_0x025c
        L_0x0245:
            if (r8 != r2) goto L_0x0249
            if (r12 == 0) goto L_0x024e
        L_0x0249:
            r2 = 3
            if (r8 != r2) goto L_0x0259
            if (r12 == 0) goto L_0x0259
        L_0x024e:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x025c
        L_0x0257:
            r22 = r2
        L_0x0259:
            r8 = 0
            r21 = 0
        L_0x025c:
            if (r19 == 0) goto L_0x028e
            boolean r0 = defpackage.ip.t(r20)
            if (r0 != 0) goto L_0x028e
            iw r0 = r7.a
            int r0 = r0.a()
            iw r2 = r7.a
            int r2 = r2.c()
            int r0 = r0 + r2
            iw r2 = r7.a
            int r2 = r2.b()
            iw r8 = r7.a
            int r8 = r8.d()
            int r2 = r2 + r8
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x0292
        L_0x028e:
            r8 = r31
            r23 = r32
        L_0x0292:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.a
            if (r0 == 0) goto L_0x02b7
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r8
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x02d0
            goto L_0x02c3
        L_0x02b7:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x02c3:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.a(r1, r2, r3, r4, r5)
        L_0x02d0:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r27
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r4 = r0
            r3 = r2
            goto L_0x030a
        L_0x0303:
            r1 = r2
            r8 = r3
            r2 = r4
            r22 = r5
            r29 = r6
        L_0x030a:
            r2 = r1
            int r5 = r22 + 1
            r6 = r29
            goto L_0x01fa
        L_0x0311:
            r1 = r2
            r8 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new d(-2, -2);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }
}
