package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;

public class ActionMenuView extends LinearLayoutCompat implements defpackage.ax.b, be {
    public ax a;
    public boolean b;
    public bm c;
    defpackage.ax.a d;
    d e;
    private Context j;
    private int k;
    private defpackage.bd.a l;
    private boolean m;
    private int n;
    private int o;
    private int p;

    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty
        public boolean a;
        @ExportedProperty
        public int b;
        @ExportedProperty
        public int c;
        @ExportedProperty
        public boolean d;
        @ExportedProperty
        public boolean e;
        boolean f;

        public LayoutParams(int i, int i2) {
            super(-2, -2);
            this.a = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.a = layoutParams.a;
        }
    }

    public interface a {
        boolean c_();

        boolean e();
    }

    static class b implements defpackage.bd.a {
        b() {
        }

        public final void a(ax axVar, boolean z) {
        }

        public final boolean a(ax axVar) {
            return false;
        }
    }

    class c implements defpackage.ax.a {
        c() {
        }

        public final void a(ax axVar) {
            if (ActionMenuView.this.d != null) {
                ActionMenuView.this.d.a(axVar);
            }
        }

        public final boolean a(ax axVar, MenuItem menuItem) {
            return ActionMenuView.this.e != null && ActionMenuView.this.e.a(menuItem);
        }
    }

    public interface d {
        boolean a(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.o = (int) (56.0f * f);
        this.p = (int) (f * 4.0f);
        this.j = context;
        this.k = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private boolean d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).e();
        }
        if (i > 0 && (childAt2 instanceof a)) {
            z |= ((a) childAt2).c_();
        }
        return z;
    }

    private static LayoutParams e() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.h = 16;
        return layoutParams;
    }

    public final LayoutParams a() {
        LayoutParams e2 = e();
        e2.a = true;
        return e2;
    }

    /* renamed from: a */
    public final LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return e();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.h <= 0) {
            layoutParams2.h = 16;
        }
        return layoutParams2;
    }

    public final void a(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
                return;
            }
            this.j = new ContextThemeWrapper(getContext(), i);
        }
    }

    public final void a(ax axVar) {
        this.a = axVar;
    }

    public final void a(defpackage.bd.a aVar, defpackage.ax.a aVar2) {
        this.l = aVar;
        this.d = aVar2;
    }

    public final void a(bm bmVar) {
        this.c = bmVar;
        this.c.a(this);
    }

    public final void a(boolean z) {
        this.c.h = true;
    }

    public final boolean a(az azVar) {
        return this.a.a((MenuItem) azVar, (bd) null, 0);
    }

    public final Menu b() {
        if (this.a == null) {
            Context context = getContext();
            this.a = new ax(context);
            this.a.a((defpackage.ax.a) new c());
            this.c = new bm(context);
            this.c.b(true);
            bm bmVar = this.c;
            defpackage.bd.a aVar = this.l;
            if (aVar == null) {
                aVar = new b();
            }
            bmVar.d = aVar;
            this.a.a((bd) this.c, this.j);
            this.c.a(this);
        }
        return this.a;
    }

    public final void c() {
        bm bmVar = this.c;
        if (bmVar != null) {
            bmVar.g();
        }
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams d() {
        return e();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return e();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bm bmVar = this.c;
        if (bmVar != null) {
            bmVar.a(false);
            if (this.c.i()) {
                this.c.e();
                this.c.d();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.m) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int i10 = this.i;
        int i11 = i3 - i;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = cv.a(this);
        int i12 = paddingRight;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (d(i15)) {
                        measuredWidth += i10;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i7 = getPaddingLeft() + layoutParams.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i16 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i16, i8, measuredHeight + i16);
                    i12 -= measuredWidth;
                    i13 = 1;
                } else {
                    i12 -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    d(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i11 / 2) - (measuredWidth2 / 2);
            int i18 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        if (i19 > 0) {
            i5 = i12 / i19;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a2) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.a) {
                    int i20 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width = i20 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.a) {
                int i22 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = i22 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
            i6++;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        boolean z3 = this.m;
        this.m = MeasureSpec.getMode(i) == 1073741824;
        if (z3 != this.m) {
            this.n = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.m) {
            ax axVar = this.a;
            if (!(axVar == null || size == this.n)) {
                this.n = size;
                axVar.b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.m || childCount <= 0) {
            int i11 = i2;
            for (int i12 = 0; i12 < childCount; i12++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i12).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
        } else {
            int mode = MeasureSpec.getMode(i2);
            int size2 = MeasureSpec.getSize(i);
            int size3 = MeasureSpec.getSize(i2);
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int i13 = size2 - paddingLeft;
            int i14 = this.o;
            int i15 = i13 / i14;
            int i16 = i13 % i14;
            if (i15 == 0) {
                setMeasuredDimension(i13, 0);
            } else {
                int i17 = i14 + (i16 / i15);
                int childCount2 = getChildCount();
                int i18 = i15;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                boolean z4 = false;
                int i23 = 0;
                long j2 = 0;
                while (i20 < childCount2) {
                    View childAt = getChildAt(i20);
                    int i24 = size3;
                    if (childAt.getVisibility() != 8) {
                        boolean z5 = childAt instanceof ActionMenuItemView;
                        int i25 = i23 + 1;
                        if (z5) {
                            int i26 = this.p;
                            i9 = i25;
                            z2 = false;
                            childAt.setPadding(i26, 0, i26, 0);
                        } else {
                            i9 = i25;
                            z2 = false;
                        }
                        LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                        layoutParams2.f = z2;
                        layoutParams2.c = z2 ? 1 : 0;
                        layoutParams2.b = z2;
                        layoutParams2.d = z2;
                        layoutParams2.leftMargin = z2;
                        layoutParams2.rightMargin = z2;
                        layoutParams2.e = z5 && ((ActionMenuItemView) childAt).c();
                        int i27 = layoutParams2.a ? 1 : i18;
                        i7 = i13;
                        LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                        i6 = mode;
                        i8 = paddingTop;
                        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(childMeasureSpec) - paddingTop, MeasureSpec.getMode(childMeasureSpec));
                        ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                        boolean z6 = actionMenuItemView != null && actionMenuItemView.c();
                        if (i27 <= 0 || (z6 && i27 < 2)) {
                            i10 = 0;
                        } else {
                            childAt.measure(MeasureSpec.makeMeasureSpec(i27 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                            int measuredWidth = childAt.getMeasuredWidth();
                            i10 = measuredWidth / i17;
                            if (measuredWidth % i17 != 0) {
                                i10++;
                            }
                            if (z6 && i10 < 2) {
                                i10 = 2;
                            }
                        }
                        layoutParams3.d = !layoutParams3.a && z6;
                        layoutParams3.b = i10;
                        childAt.measure(MeasureSpec.makeMeasureSpec(i10 * i17, 1073741824), makeMeasureSpec);
                        int max = Math.max(i21, i10);
                        if (layoutParams2.d) {
                            i22++;
                        }
                        if (layoutParams2.a) {
                            z4 = true;
                        }
                        i18 -= i10;
                        int max2 = Math.max(i19, childAt.getMeasuredHeight());
                        if (i10 == 1) {
                            i21 = max;
                            i19 = max2;
                            j2 |= (long) (1 << i20);
                        } else {
                            i21 = max;
                            i19 = max2;
                        }
                        i23 = i9;
                    } else {
                        i6 = mode;
                        i7 = i13;
                        i8 = paddingTop;
                    }
                    i20++;
                    size3 = i24;
                    paddingTop = i8;
                    i13 = i7;
                    mode = i6;
                }
                int i28 = mode;
                int i29 = i13;
                int i30 = size3;
                boolean z7 = z4 && i23 == 2;
                int i31 = i18;
                boolean z8 = false;
                while (true) {
                    if (i22 > 0 && i31 > 0) {
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = Integer.MAX_VALUE;
                        long j3 = 0;
                        while (i32 < childCount2) {
                            LayoutParams layoutParams4 = (LayoutParams) getChildAt(i32).getLayoutParams();
                            boolean z9 = z8;
                            if (layoutParams4.d) {
                                if (layoutParams4.b < i34) {
                                    j3 = 1 << i32;
                                    i34 = layoutParams4.b;
                                    i33 = 1;
                                } else if (layoutParams4.b == i34) {
                                    j3 |= 1 << i32;
                                    i33++;
                                }
                            }
                            i32++;
                            z8 = z9;
                        }
                        z = z8;
                        j2 |= j3;
                        if (i33 > i31) {
                            break;
                        }
                        int i35 = i34 + 1;
                        int i36 = i31;
                        int i37 = 0;
                        while (i37 < childCount2) {
                            View childAt2 = getChildAt(i37);
                            LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                            int i38 = i19;
                            int i39 = childMeasureSpec;
                            long j4 = (long) (1 << i37);
                            if ((j3 & j4) != 0) {
                                if (z7 && layoutParams5.e && i36 == 1) {
                                    int i40 = this.p;
                                    childAt2.setPadding(i40 + i17, 0, i40, 0);
                                }
                                layoutParams5.b++;
                                layoutParams5.f = true;
                                i36--;
                            } else if (layoutParams5.b == i35) {
                                j2 |= j4;
                            }
                            i37++;
                            i19 = i38;
                            childMeasureSpec = i39;
                        }
                        i31 = i36;
                        z8 = true;
                    } else {
                        z = z8;
                    }
                }
                z = z8;
                int i41 = i19;
                int i42 = childMeasureSpec;
                boolean z10 = !z4 && i23 == 1;
                if (i31 > 0 && j2 != 0 && (i31 < i23 - 1 || z10 || i21 > 1)) {
                    float bitCount = (float) Long.bitCount(j2);
                    if (!z10) {
                        if ((j2 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).e) {
                            bitCount -= 0.5f;
                        }
                        int i43 = childCount2 - 1;
                        if ((j2 & ((long) (1 << i43))) != 0 && !((LayoutParams) getChildAt(i43).getLayoutParams()).e) {
                            bitCount -= 0.5f;
                        }
                    }
                    int i44 = bitCount > 0.0f ? (int) (((float) (i31 * i17)) / bitCount) : 0;
                    boolean z11 = z;
                    for (int i45 = 0; i45 < childCount2; i45++) {
                        if ((j2 & ((long) (1 << i45))) != 0) {
                            View childAt3 = getChildAt(i45);
                            LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                layoutParams6.c = i44;
                                layoutParams6.f = true;
                                if (i45 == 0 && !layoutParams6.e) {
                                    layoutParams6.leftMargin = (-i44) / 2;
                                }
                            } else if (layoutParams6.a) {
                                layoutParams6.c = i44;
                                layoutParams6.f = true;
                                layoutParams6.rightMargin = (-i44) / 2;
                            } else {
                                if (i45 != 0) {
                                    layoutParams6.leftMargin = i44 / 2;
                                }
                                if (i45 != childCount2 - 1) {
                                    layoutParams6.rightMargin = i44 / 2;
                                }
                            }
                            z11 = true;
                        }
                    }
                    z = z11;
                }
                if (z) {
                    int i46 = 0;
                    while (i46 < childCount2) {
                        View childAt4 = getChildAt(i46);
                        LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                        if (layoutParams7.f) {
                            i5 = i42;
                            childAt4.measure(MeasureSpec.makeMeasureSpec((layoutParams7.b * i17) + layoutParams7.c, 1073741824), i5);
                        } else {
                            i5 = i42;
                        }
                        i46++;
                        i42 = i5;
                    }
                }
                if (i28 != 1073741824) {
                    i3 = i29;
                    i4 = i41;
                } else {
                    i4 = i30;
                    i3 = i29;
                }
                setMeasuredDimension(i3, i4);
            }
        }
    }
}
