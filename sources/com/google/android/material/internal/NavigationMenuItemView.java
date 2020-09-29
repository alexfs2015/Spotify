package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import com.spotify.music.R;

public class NavigationMenuItemView extends ForegroundLinearLayout implements a {
    private static final int[] l = {16842912};
    public boolean a;
    boolean b;
    public final CheckedTextView c;
    public FrameLayout d;
    public az e;
    public ColorStateList j;
    public boolean k;
    private final int m;
    private Drawable n;
    private final ht o;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new ht() {
            public final void a(View view, ja jaVar) {
                super.a(view, jaVar);
                jaVar.a(NavigationMenuItemView.this.b);
            }
        };
        c(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        this.c = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.c.setDuplicateParentStateEnabled(true);
        ip.a((View) this.c, this.o);
    }

    public final az a() {
        return this.e;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            if (this.k) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = gm.f(drawable).mutate();
                gm.a(drawable, this.j);
            }
            int i = this.m;
            drawable.setBounds(0, 0, i, i);
        } else if (this.a) {
            if (this.n == null) {
                this.n = gb.a(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.n;
                if (drawable2 != null) {
                    int i2 = this.m;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.n;
        }
        jm.a(this.c, drawable, null, null, null);
    }

    public final void a(az azVar, int i) {
        StateListDrawable stateListDrawable;
        this.e = azVar;
        setVisibility(azVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(l, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            ip.a((View) this, (Drawable) stateListDrawable);
        }
        boolean isCheckable = azVar.isCheckable();
        refreshDrawableState();
        if (this.b != isCheckable) {
            this.b = isCheckable;
            this.o.a((View) this.c, 2048);
        }
        boolean isChecked = azVar.isChecked();
        refreshDrawableState();
        this.c.setChecked(isChecked);
        setEnabled(azVar.isEnabled());
        this.c.setText(azVar.getTitle());
        a(azVar.getIcon());
        View actionView = azVar.getActionView();
        if (actionView != null) {
            if (this.d == null) {
                this.d = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.d.removeAllViews();
            this.d.addView(actionView);
        }
        setContentDescription(azVar.getContentDescription());
        cr.a(this, azVar.getTooltipText());
        if (!(this.e.getTitle() == null && this.e.getIcon() == null && this.e.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.c.setVisibility(8);
            FrameLayout frameLayout = this.d;
            if (frameLayout != null) {
                LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.d.setLayoutParams(layoutParams);
            }
        } else {
            this.c.setVisibility(0);
            FrameLayout frameLayout2 = this.d;
            if (frameLayout2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) frameLayout2.getLayoutParams();
                layoutParams2.width = -2;
                this.d.setLayoutParams(layoutParams2);
            }
        }
    }

    public final boolean a_() {
        return false;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        az azVar = this.e;
        if (azVar != null && azVar.isCheckable() && this.e.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, l);
        }
        return onCreateDrawableState;
    }
}
