package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar.d;
import com.spotify.music.R;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] h = {R.attr.snackbarButtonStyle};
    private final AccessibilityManager f;
    private boolean g;

    public static final class SnackbarLayout extends d {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, faf faf) {
        super(viewGroup, view, faf);
        this.f = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public final void c() {
        super.c();
    }

    public final void d() {
        super.d();
    }

    public final boolean e() {
        return super.e();
    }

    public final Snackbar a(CharSequence charSequence, final OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.c.getChildAt(0)).b;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.g = false;
        } else {
            this.g = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    onClickListener.onClick(view);
                    Snackbar.this.a(1);
                }
            });
        }
        return this;
    }

    public final int a() {
        if (!this.g || !this.f.isTouchExplorationEnabled()) {
            return super.a();
        }
        return -2;
    }

    public final Snackbar a(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.c.getChildAt(0)).b.setTextColor(colorStateList);
        return this;
    }

    public static Snackbar a(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(h);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroup, false);
            Snackbar snackbar = new Snackbar(viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.c.getChildAt(0)).a.setText(charSequence);
            snackbar.d = i;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }
}
