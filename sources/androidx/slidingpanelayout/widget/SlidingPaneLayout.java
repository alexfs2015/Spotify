package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    int a;
    View b;
    float c;
    int d;
    boolean e;
    final jw f;
    boolean g;
    final ArrayList<b> h;
    private final int i;
    private boolean j;
    private float k;
    private float l;
    private boolean m;
    private final Rect n;
    private Method o;
    private Field p;
    private boolean q;

    public static class LayoutParams extends MarginLayoutParams {
        private static final int[] e = {16843137};
        public float a = 0.0f;
        boolean b;
        boolean c;
        Paint d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    class a extends ht {
        private final Rect c = new Rect();

        a() {
        }

        public final void a(View view, ja jaVar) {
            ja a = ja.a(jaVar);
            super.a(view, a);
            Rect rect = this.c;
            a.a(rect);
            jaVar.b(rect);
            a.c(rect);
            jaVar.d(rect);
            jaVar.d(a.b());
            jaVar.a(a.a.getPackageName());
            jaVar.b(a.a.getClassName());
            jaVar.e(a.a.getContentDescription());
            jaVar.i(a.a.isEnabled());
            jaVar.g(a.a.isClickable());
            jaVar.b(a.a.isFocusable());
            jaVar.c(a.a.isFocused());
            jaVar.e(a.c());
            jaVar.f(a.a.isSelected());
            jaVar.h(a.a.isLongClickable());
            jaVar.a(a.a.getActions());
            int movementGranularities = VERSION.SDK_INT >= 16 ? a.a.getMovementGranularities() : 0;
            if (VERSION.SDK_INT >= 16) {
                jaVar.a.setMovementGranularities(movementGranularities);
            }
            a.a.recycle();
            jaVar.b((CharSequence) SlidingPaneLayout.class.getName());
            jaVar.b(view);
            ViewParent g = ip.g(view);
            if (g instanceof View) {
                jaVar.d((View) g);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!c(childAt) && childAt.getVisibility() == 0) {
                    ip.b(childAt, 1);
                    jaVar.c(childAt);
                }
            }
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!c(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private boolean c(View view) {
            return SlidingPaneLayout.this.c(view);
        }
    }

    class b implements Runnable {
        private View a;

        b(View view) {
            this.a = view;
        }

        public final void run() {
            if (this.a.getParent() == SlidingPaneLayout.this) {
                this.a.setLayerType(0, null);
                SlidingPaneLayout.this.b(this.a);
            }
            SlidingPaneLayout.this.h.remove(this);
        }
    }

    class c extends defpackage.jw.a {
        c() {
        }

        public final boolean b(View view, int i) {
            if (SlidingPaneLayout.this.e) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).b;
        }

        public final void a(int i) {
            if (SlidingPaneLayout.this.f.a == 0) {
                if (SlidingPaneLayout.this.c == 0.0f) {
                    SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                    slidingPaneLayout.a(slidingPaneLayout.b);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    View view = slidingPaneLayout2.b;
                    slidingPaneLayout2.sendAccessibilityEvent(32);
                    SlidingPaneLayout.this.g = false;
                    return;
                }
                SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
                View view2 = slidingPaneLayout3.b;
                slidingPaneLayout3.sendAccessibilityEvent(32);
                SlidingPaneLayout.this.g = true;
            }
        }

        public final void a(View view, int i) {
            SlidingPaneLayout.this.a();
        }

        public final void a(View view, int i, int i2, int i3) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.b == null) {
                slidingPaneLayout.c = 0.0f;
            } else {
                boolean b = slidingPaneLayout.b();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.b.getLayoutParams();
                int width = slidingPaneLayout.b.getWidth();
                if (b) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                slidingPaneLayout.c = ((float) (i - ((b ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (b ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) slidingPaneLayout.d);
                if (layoutParams.c) {
                    slidingPaneLayout.a(slidingPaneLayout.b, slidingPaneLayout.c, slidingPaneLayout.a);
                }
            }
            SlidingPaneLayout.this.invalidate();
        }

        public final void a(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.b()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.c > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.d;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.b.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.c > 0.5f)) {
                    i += SlidingPaneLayout.this.d;
                }
            }
            SlidingPaneLayout.this.f.a(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public final int a(View view) {
            return SlidingPaneLayout.this.d;
        }

        public final int c(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.b.getLayoutParams();
            if (SlidingPaneLayout.this.b()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.b.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.d);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.d + paddingLeft);
        }

        public final int d(View view, int i) {
            return view.getTop();
        }

        public final void a(int i, int i2) {
            SlidingPaneLayout.this.f.a(SlidingPaneLayout.this.b, i2);
        }
    }

    static class d extends jt {
        public static final Creator<d> CREATOR = new ClassLoaderCreator<d>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, null);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }
        };
        boolean a;

        d(Parcelable parcelable) {
            super(parcelable);
        }

        d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, null);
            this.a = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = -858993460;
        this.m = true;
        this.n = new Rect();
        this.h = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.i = (int) ((32.0f * f2) + 0.5f);
        setWillNotDraw(false);
        ip.a((View) this, (ht) new a());
        ip.b((View) this, 1);
        this.f = jw.a((ViewGroup) this, 0.5f, (defpackage.jw.a) new c());
        this.f.g = f2 * 400.0f;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r7.getOpacity() == -1) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r18) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = r17.b()
            if (r1 == 0) goto L_0x0012
            int r2 = r17.getWidth()
            int r3 = r17.getPaddingRight()
            int r2 = r2 - r3
            goto L_0x0016
        L_0x0012:
            int r2 = r17.getPaddingLeft()
        L_0x0016:
            if (r1 == 0) goto L_0x001d
            int r3 = r17.getPaddingLeft()
            goto L_0x0026
        L_0x001d:
            int r3 = r17.getWidth()
            int r4 = r17.getPaddingRight()
            int r3 = r3 - r4
        L_0x0026:
            int r4 = r17.getPaddingTop()
            int r5 = r17.getHeight()
            int r6 = r17.getPaddingBottom()
            int r5 = r5 - r6
            if (r0 == 0) goto L_0x0065
            boolean r7 = r18.isOpaque()
            r8 = 1
            if (r7 == 0) goto L_0x003d
            goto L_0x0052
        L_0x003d:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 18
            if (r7 >= r9) goto L_0x0051
            android.graphics.drawable.Drawable r7 = r18.getBackground()
            if (r7 == 0) goto L_0x0051
            int r7 = r7.getOpacity()
            r9 = -1
            if (r7 != r9) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            if (r8 == 0) goto L_0x0065
            int r7 = r18.getLeft()
            int r8 = r18.getRight()
            int r9 = r18.getTop()
            int r10 = r18.getBottom()
            goto L_0x0069
        L_0x0065:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0069:
            int r11 = r17.getChildCount()
            r12 = 0
        L_0x006e:
            r13 = r17
            if (r12 >= r11) goto L_0x00c4
            android.view.View r14 = r13.getChildAt(r12)
            if (r14 == r0) goto L_0x00c4
            int r15 = r14.getVisibility()
            r6 = 8
            if (r15 == r6) goto L_0x00bb
            if (r1 == 0) goto L_0x0084
            r6 = r3
            goto L_0x0085
        L_0x0084:
            r6 = r2
        L_0x0085:
            int r15 = r14.getLeft()
            int r6 = java.lang.Math.max(r6, r15)
            int r15 = r14.getTop()
            int r15 = java.lang.Math.max(r4, r15)
            r16 = r1
            if (r1 == 0) goto L_0x009b
            r0 = r2
            goto L_0x009c
        L_0x009b:
            r0 = r3
        L_0x009c:
            int r1 = r14.getRight()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r14.getBottom()
            int r1 = java.lang.Math.min(r5, r1)
            if (r6 < r7) goto L_0x00b6
            if (r15 < r9) goto L_0x00b6
            if (r0 > r8) goto L_0x00b6
            if (r1 > r10) goto L_0x00b6
            r6 = 4
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            r14.setVisibility(r6)
            goto L_0x00bd
        L_0x00bb:
            r16 = r1
        L_0x00bd:
            int r12 = r12 + 1
            r0 = r18
            r1 = r16
            goto L_0x006e
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.a(android.view.View):void");
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
        int size = this.h.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.h.get(i2)).run();
        }
        this.h.clear();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size2 = MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i5 = 0;
        } else if (mode2 != 1073741824) {
            i5 = 0;
            i4 = 0;
        } else {
            i5 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = i5;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.b = null;
        int i14 = i5;
        int i15 = paddingLeft;
        int i16 = 0;
        boolean z2 = false;
        float f2 = 0.0f;
        while (true) {
            i6 = 8;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.c = z;
            } else {
                if (layoutParams.a > 0.0f) {
                    f2 += layoutParams.a;
                    if (layoutParams.width == 0) {
                    }
                }
                int i17 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    i12 = MeasureSpec.makeMeasureSpec(paddingLeft - i17, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    i12 = MeasureSpec.makeMeasureSpec(paddingLeft - i17, 1073741824);
                } else {
                    i12 = MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i13 = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    i13 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    i13 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(i12, i13);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i14) {
                    i14 = Math.min(measuredHeight, i4);
                }
                i15 -= measuredWidth;
                boolean z3 = i15 < 0;
                layoutParams.b = z3;
                boolean z4 = z3 | z2;
                if (layoutParams.b) {
                    this.b = childAt;
                }
                z2 = z4;
            }
            i16++;
            z = false;
        }
        if (z2 || f2 > 0.0f) {
            int i18 = paddingLeft - this.i;
            int i19 = 0;
            while (i19 < childCount) {
                View childAt2 = getChildAt(i19);
                if (childAt2.getVisibility() != i6) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i6) {
                        boolean z5 = layoutParams2.width == 0 && layoutParams2.a > 0.0f;
                        if (z5) {
                            i8 = 0;
                        } else {
                            i8 = childAt2.getMeasuredWidth();
                        }
                        if (!z2 || childAt2 == this.b) {
                            if (layoutParams2.a > 0.0f) {
                                if (layoutParams2.width != 0) {
                                    i9 = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (layoutParams2.height == -2) {
                                    i9 = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                                } else if (layoutParams2.height == -1) {
                                    i9 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                } else {
                                    i9 = MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                                if (z2) {
                                    int i20 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i7 = i18;
                                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i20, 1073741824);
                                    if (i8 != i20) {
                                        childAt2.measure(makeMeasureSpec, i9);
                                    }
                                    i19++;
                                    i18 = i7;
                                    i6 = 8;
                                } else {
                                    i7 = i18;
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(i8 + ((int) ((layoutParams2.a * ((float) Math.max(0, i15))) / f2)), 1073741824), i9);
                                    i19++;
                                    i18 = i7;
                                    i6 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i8 > i18 || layoutParams2.a > 0.0f)) {
                            if (!z5) {
                                i10 = 1073741824;
                                i11 = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (layoutParams2.height == -2) {
                                i11 = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                                i10 = 1073741824;
                            } else if (layoutParams2.height == -1) {
                                i10 = 1073741824;
                                i11 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
                            } else {
                                i10 = 1073741824;
                                i11 = MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                            }
                            childAt2.measure(MeasureSpec.makeMeasureSpec(i18, i10), i11);
                        }
                    }
                }
                i7 = i18;
                i19++;
                i18 = i7;
                i6 = 8;
            }
        }
        setMeasuredDimension(size, i14 + getPaddingTop() + getPaddingBottom());
        this.j = z2;
        if (this.f.a != 0 && !z2) {
            this.f.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        boolean b2 = b();
        if (b2) {
            this.f.i = 2;
        } else {
            this.f.i = 1;
        }
        int i9 = i4 - i2;
        int paddingRight = b2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = b2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.m) {
            this.c = (!this.j || !this.g) ? 0.0f : 1.0f;
        }
        int i10 = paddingRight;
        int i11 = i10;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.b) {
                    int i13 = i9 - paddingLeft;
                    int min = (Math.min(i10, i13 - this.i) - i11) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.d = min;
                    int i14 = b2 ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.c = ((i11 + i14) + min) + (measuredWidth / 2) > i13;
                    int i15 = (int) (((float) min) * this.c);
                    i6 = i11 + i14 + i15;
                    this.c = ((float) i15) / ((float) this.d);
                } else {
                    i6 = i10;
                }
                if (b2) {
                    i8 = i9 - i6;
                    i7 = i8 - measuredWidth;
                } else {
                    i8 = i6 + measuredWidth;
                    i7 = i6;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                i10 += childAt.getWidth();
                i11 = i6;
            }
        }
        if (this.m) {
            if (!this.j) {
                for (int i16 = 0; i16 < childCount; i16++) {
                    a(getChildAt(i16), 0.0f, this.a);
                }
            } else if (((LayoutParams) this.b.getLayoutParams()).c) {
                a(this.b, this.c, this.a);
            }
            a(this.b);
        }
        this.m = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.m = true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.j) {
            this.g = view == this.b;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.j && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.g = !jw.b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (!this.j || (this.e && actionMasked != 0)) {
            this.f.a();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f.a();
            return false;
        } else {
            if (actionMasked == 0) {
                this.e = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.k = x;
                this.l = y;
                if (jw.b(this.b, (int) x, (int) y) && c(this.b)) {
                    z = true;
                    if (!this.f.a(motionEvent) || z) {
                        return true;
                    }
                    return false;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.k);
                float abs2 = Math.abs(y2 - this.l);
                if (abs > ((float) this.f.b) && abs2 > abs) {
                    this.f.a();
                    this.e = true;
                    return false;
                }
            }
            z = false;
            if (!this.f.a(motionEvent)) {
            }
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j) {
            return super.onTouchEvent(motionEvent);
        }
        this.f.b(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.k = x;
            this.l = y;
        } else if (actionMasked == 1 && c(this.b)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = x2 - this.k;
            float f3 = y2 - this.l;
            int i2 = this.f.b;
            if ((f2 * f2) + (f3 * f3) < ((float) (i2 * i2)) && jw.b(this.b, (int) x2, (int) y2)) {
                a(0);
            }
        }
        return true;
    }

    private boolean a(int i2) {
        if (!this.m && !a(0.0f)) {
            return false;
        }
        this.g = false;
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, float f2, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 <= 0.0f || i2 == 0) {
            if (view.getLayerType() != 0) {
                if (layoutParams.d != null) {
                    layoutParams.d.setColorFilter(null);
                }
                b bVar = new b(view);
                this.h.add(bVar);
                ip.a((View) this, (Runnable) bVar);
            }
            return;
        }
        int i3 = (((int) (((float) ((-16777216 & i2) >>> 24)) * f2)) << 24) | (i2 & 16777215);
        if (layoutParams.d == null) {
            layoutParams.d = new Paint();
        }
        layoutParams.d.setColorFilter(new PorterDuffColorFilter(i3, Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.d);
        }
        b(view);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.j && !layoutParams.b && this.b != null) {
            canvas.getClipBounds(this.n);
            if (b()) {
                Rect rect = this.n;
                rect.left = Math.max(rect.left, this.b.getRight());
            } else {
                Rect rect2 = this.n;
                rect2.right = Math.min(rect2.right, this.b.getLeft());
            }
            canvas.clipRect(this.n);
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: 0000 */
    public final void b(View view) {
        if (VERSION.SDK_INT >= 17) {
            ip.a(view, ((LayoutParams) view.getLayoutParams()).d);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            String str = "SlidingPaneLayout";
            if (!this.q) {
                try {
                    this.o = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException e2) {
                    Log.e(str, "Couldn't fetch getDisplayList method; dimming won't work right.", e2);
                }
                try {
                    this.p = View.class.getDeclaredField("mRecreateDisplayList");
                    this.p.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e(str, "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e3);
                }
                this.q = true;
            }
            if (this.o != null) {
                Field field = this.p;
                if (field != null) {
                    try {
                        field.setBoolean(view, true);
                        this.o.invoke(view, null);
                    } catch (Exception e4) {
                        Log.e(str, "Error refreshing display list state", e4);
                    }
                }
            }
            view.invalidate();
            return;
        }
        ip.a(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private boolean a(float f2) {
        int i2;
        if (!this.j) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.b.getLayoutParams();
        if (b()) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f2 * ((float) this.d))) + ((float) this.b.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f2 * ((float) this.d)));
        }
        jw jwVar = this.f;
        View view = this.b;
        if (!jwVar.a(view, i2, view.getTop())) {
            return false;
        }
        a();
        ip.d(this);
        return true;
    }

    public void computeScroll() {
        if (this.f.a(true)) {
            if (!this.j) {
                this.f.b();
                return;
            }
            ip.d(this);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        b();
        if (getChildCount() > 1) {
            getChildAt(1);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean c(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.j || !layoutParams.c || this.c <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        boolean z = this.j;
        boolean z2 = z ? !z || this.c == 1.0f : this.g;
        dVar.a = z2;
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.d);
        if (!dVar.a) {
            a(0);
        } else if (this.m || a(1.0f)) {
            this.g = true;
        }
        this.g = dVar.a;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return ip.f(this) == 1;
    }
}
