package com.google.android.material.bottomnavigation;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.spotify.music.R;

public class BottomNavigationMenuView extends ViewGroup implements be {
    private static final int[] i = {16842912};
    private static final int[] j = {-16842910};
    public final TransitionSet a;
    boolean b;
    public int c;
    public BottomNavigationItemView[] d;
    public int e;
    public int f;
    public ezi g;
    public ax h;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final OnClickListener p;
    private final a<BottomNavigationItemView> q;
    private ColorStateList r;
    private int s;
    private ColorStateList t;
    private final ColorStateList u;
    private int v;
    private int w;
    private int x;
    private int[] y;

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = new c(5);
        this.e = 0;
        this.f = 0;
        Resources resources = getResources();
        this.k = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.l = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.m = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.n = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.o = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_height);
        this.u = e(16842808);
        this.a = new AutoTransition();
        this.a.b(0);
        this.a.a(115);
        this.a.a((TimeInterpolator) new ky());
        this.a.a((Transition) new fai());
        this.p = new OnClickListener() {
            public final void onClick(View view) {
                az azVar = ((BottomNavigationItemView) view).b;
                if (!BottomNavigationMenuView.this.h.a((MenuItem) azVar, (bd) BottomNavigationMenuView.this.g, 0)) {
                    azVar.setChecked(true);
                }
            }
        };
        this.y = new int[5];
    }

    public static boolean a(int i2, int i3) {
        return i2 == -1 ? i3 > 3 : i2 == 0;
    }

    public final void a() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.d;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.q.a(bottomNavigationItemView);
                }
            }
        }
        if (this.h.size() == 0) {
            this.e = 0;
            this.f = 0;
            this.d = null;
            return;
        }
        this.d = new BottomNavigationItemView[this.h.size()];
        boolean a2 = a(this.c, this.h.i().size());
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            this.g.b = true;
            this.h.getItem(i2).setCheckable(true);
            this.g.b = false;
            BottomNavigationItemView bottomNavigationItemView2 = (BottomNavigationItemView) this.q.a();
            if (bottomNavigationItemView2 == null) {
                bottomNavigationItemView2 = new BottomNavigationItemView(getContext());
            }
            this.d[i2] = bottomNavigationItemView2;
            bottomNavigationItemView2.a(this.r);
            bottomNavigationItemView2.b(this.s);
            bottomNavigationItemView2.b(this.u);
            bottomNavigationItemView2.c(this.v);
            bottomNavigationItemView2.d(this.w);
            bottomNavigationItemView2.b(this.t);
            bottomNavigationItemView2.e(this.x);
            bottomNavigationItemView2.a(a2);
            bottomNavigationItemView2.a(this.c);
            bottomNavigationItemView2.a((az) this.h.getItem(i2), 0);
            bottomNavigationItemView2.a = i2;
            bottomNavigationItemView2.setOnClickListener(this.p);
            addView(bottomNavigationItemView2);
        }
        this.f = Math.min(this.h.size() - 1, this.f);
        this.h.getItem(this.f).setChecked(true);
    }

    public final void a(int i2) {
        this.s = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.d;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView b2 : bottomNavigationItemViewArr) {
                b2.b(i2);
            }
        }
    }

    public final void a(ColorStateList colorStateList) {
        this.r = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.d;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView a2 : bottomNavigationItemViewArr) {
                a2.a(colorStateList);
            }
        }
    }

    public final void a(ax axVar) {
        this.h = axVar;
    }

    public final void b(int i2) {
        this.v = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.d;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.c(i2);
                ColorStateList colorStateList = this.t;
                if (colorStateList != null) {
                    bottomNavigationItemView.b(colorStateList);
                }
            }
        }
    }

    public final void b(ColorStateList colorStateList) {
        this.t = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.d;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView b2 : bottomNavigationItemViewArr) {
                b2.b(colorStateList);
            }
        }
    }

    public final void c(int i2) {
        this.w = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.d;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.d(i2);
                ColorStateList colorStateList = this.t;
                if (colorStateList != null) {
                    bottomNavigationItemView.b(colorStateList);
                }
            }
        }
    }

    public final void d(int i2) {
        this.x = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.d;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView e2 : bottomNavigationItemViewArr) {
                e2.e(i2);
            }
        }
    }

    public final ColorStateList e(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = ab.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        return new ColorStateList(new int[][]{j, i, EMPTY_STATE_SET}, new int[]{a2.getColorForState(j, defaultColor), i3, defaultColor});
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (ip.f(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = MeasureSpec.getSize(i2);
        int size2 = this.h.i().size();
        int childCount = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.o, 1073741824);
        if (!a(this.c, size2) || !this.b) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.m);
            int i4 = size - (size2 * min);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getVisibility() != 8) {
                    int[] iArr = this.y;
                    iArr[i5] = min;
                    if (i4 > 0) {
                        iArr[i5] = iArr[i5] + 1;
                        i4--;
                    }
                } else {
                    this.y[i5] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f);
            int i6 = this.n;
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.m, Integer.MIN_VALUE), makeMeasureSpec);
                i6 = Math.max(i6, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.l * i7), Math.min(i6, this.m));
            int i8 = size - min2;
            int min3 = Math.min(i8 / (i7 == 0 ? 1 : i7), this.k);
            int i9 = i8 - (i7 * min3);
            int i10 = 0;
            while (i10 < childCount) {
                if (getChildAt(i10).getVisibility() != 8) {
                    this.y[i10] = i10 == this.f ? min2 : min3;
                    if (i9 > 0) {
                        int[] iArr2 = this.y;
                        iArr2[i10] = iArr2[i10] + 1;
                        i9--;
                    }
                } else {
                    this.y[i10] = 0;
                }
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(MeasureSpec.makeMeasureSpec(this.y[i12], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i11 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11, MeasureSpec.makeMeasureSpec(i11, 1073741824), 0), View.resolveSizeAndState(this.o, makeMeasureSpec, 0));
    }
}
