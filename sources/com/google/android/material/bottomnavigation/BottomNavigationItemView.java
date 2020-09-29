package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;

public class BottomNavigationItemView extends FrameLayout implements a {
    private static final int[] c = {16842912};
    int a;
    az b;
    private final int d;
    private float e;
    private float f;
    private float g;
    private int h;
    private boolean i;
    private ImageView j;
    private final TextView k;
    private final TextView l;
    private ColorStateList m;

    public final boolean a_() {
        return false;
    }

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(R.layout.design_bottom_navigation_item, this, true);
        setBackgroundResource(R.drawable.design_bottom_navigation_item_background);
        this.d = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_margin);
        this.j = (ImageView) findViewById(R.id.icon);
        this.k = (TextView) findViewById(R.id.smallLabel);
        this.l = (TextView) findViewById(R.id.largeLabel);
        ip.b((View) this.k, 2);
        ip.b((View) this.l, 2);
        setFocusable(true);
        a(this.k.getTextSize(), this.l.getTextSize());
    }

    public final void a(az azVar, int i2) {
        this.b = azVar;
        azVar.isCheckable();
        refreshDrawableState();
        b(azVar.isChecked());
        setEnabled(azVar.isEnabled());
        a(azVar.getIcon());
        CharSequence title = azVar.getTitle();
        this.k.setText(title);
        this.l.setText(title);
        az azVar2 = this.b;
        if (azVar2 == null || TextUtils.isEmpty(azVar2.getContentDescription())) {
            setContentDescription(title);
        }
        setId(azVar.getItemId());
        if (!TextUtils.isEmpty(azVar.getContentDescription())) {
            setContentDescription(azVar.getContentDescription());
        }
        cr.a(this, azVar.getTooltipText());
        setVisibility(azVar.isVisible() ? 0 : 8);
    }

    public final void a(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (this.b != null) {
                b(this.b.isChecked());
            }
        }
    }

    public final void a(int i2) {
        if (this.h != i2) {
            this.h = i2;
            if (this.b != null) {
                b(this.b.isChecked());
            }
        }
    }

    public final az a() {
        return this.b;
    }

    private void b(boolean z) {
        TextView textView = this.l;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.l;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.k;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.k;
        textView4.setPivotY((float) textView4.getBaseline());
        int i2 = this.h;
        if (i2 != -1) {
            if (i2 == 0) {
                if (z) {
                    a(this.j, this.d, 49);
                    a(this.l, 1.0f, 1.0f, 0);
                } else {
                    a(this.j, this.d, 17);
                    a(this.l, 0.5f, 0.5f, 4);
                }
                this.k.setVisibility(4);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    a(this.j, this.d, 17);
                    this.l.setVisibility(8);
                    this.k.setVisibility(8);
                }
            } else if (z) {
                a(this.j, (int) (((float) this.d) + this.e), 49);
                a(this.l, 1.0f, 1.0f, 0);
                TextView textView5 = this.k;
                float f2 = this.f;
                a(textView5, f2, f2, 4);
            } else {
                a(this.j, this.d, 49);
                TextView textView6 = this.l;
                float f3 = this.g;
                a(textView6, f3, f3, 4);
                a(this.k, 1.0f, 1.0f, 0);
            }
        } else if (this.i) {
            if (z) {
                a(this.j, this.d, 49);
                a(this.l, 1.0f, 1.0f, 0);
            } else {
                a(this.j, this.d, 17);
                a(this.l, 0.5f, 0.5f, 4);
            }
            this.k.setVisibility(4);
        } else if (z) {
            a(this.j, (int) (((float) this.d) + this.e), 49);
            a(this.l, 1.0f, 1.0f, 0);
            TextView textView7 = this.k;
            float f4 = this.f;
            a(textView7, f4, f4, 4);
        } else {
            a(this.j, this.d, 49);
            TextView textView8 = this.l;
            float f5 = this.g;
            a(textView8, f5, f5, 4);
            a(this.k, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    private static void a(View view, int i2, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private static void a(View view, float f2, float f3, int i2) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.k.setEnabled(z);
        this.l.setEnabled(z);
        this.j.setEnabled(z);
        if (z) {
            ip.a((View) this, in.a(getContext(), 1002));
        } else {
            ip.a((View) this, (in) null);
        }
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        az azVar = this.b;
        if (azVar != null && azVar.isCheckable() && this.b.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    private void a(Drawable drawable) {
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = gm.f(drawable).mutate();
            gm.a(drawable, this.m);
        }
        this.j.setImageDrawable(drawable);
    }

    public final void a(ColorStateList colorStateList) {
        this.m = colorStateList;
        az azVar = this.b;
        if (azVar != null) {
            a(azVar.getIcon());
        }
    }

    public final void b(int i2) {
        LayoutParams layoutParams = (LayoutParams) this.j.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.j.setLayoutParams(layoutParams);
    }

    public final void c(int i2) {
        jm.a(this.k, i2);
        a(this.k.getTextSize(), this.l.getTextSize());
    }

    public final void d(int i2) {
        jm.a(this.l, i2);
        a(this.k.getTextSize(), this.l.getTextSize());
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.k.setTextColor(colorStateList);
            this.l.setTextColor(colorStateList);
        }
    }

    private void a(float f2, float f3) {
        this.e = f2 - f3;
        this.f = (f3 * 1.0f) / f2;
        this.g = (f2 * 1.0f) / f3;
    }

    public final void e(int i2) {
        Drawable drawable;
        if (i2 == 0) {
            drawable = null;
        } else {
            drawable = fr.a(getContext(), i2);
        }
        ip.a((View) this, drawable);
    }
}
