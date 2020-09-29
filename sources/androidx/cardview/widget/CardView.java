package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.spotify.music.R;

public class CardView extends FrameLayout {
    protected static final dm a;
    private static final int[] i = {16842801};
    boolean b;
    boolean c;
    int d;
    int e;
    public final Rect f;
    final Rect g;
    protected final dl h;

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            a = new dj();
        } else if (VERSION.SDK_INT >= 17) {
            a = new di();
        } else {
            a = new dk();
        }
        a.a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        int i3;
        ColorStateList valueOf;
        super(context, attributeSet, i2);
        this.f = new Rect();
        this.g = new Rect();
        this.h = new dl() {
            private Drawable a;

            public final void a(Drawable drawable) {
                this.a = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            public final boolean a() {
                return CardView.this.b;
            }

            public final boolean b() {
                return CardView.this.c;
            }

            public final void a(int i, int i2, int i3, int i4) {
                CardView.this.g.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i + cardView.f.left, i2 + CardView.this.f.top, i3 + CardView.this.f.right, i4 + CardView.this.f.bottom);
            }

            public final void a(int i, int i2) {
                if (i > CardView.this.d) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.e) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            public final Drawable c() {
                return this.a;
            }

            public final View d() {
                return CardView.this;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, i2, R.style.CardView);
        if (obtainStyledAttributes.hasValue(a.d)) {
            valueOf = obtainStyledAttributes.getColorStateList(a.d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i3 = getResources().getColor(R.color.cardview_light_background);
            } else {
                i3 = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i3);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(a.e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(a.f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(a.g, 0.0f);
        this.b = obtainStyledAttributes.getBoolean(a.i, false);
        this.c = obtainStyledAttributes.getBoolean(a.h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.j, 0);
        this.f.left = obtainStyledAttributes.getDimensionPixelSize(a.l, dimensionPixelSize);
        this.f.top = obtainStyledAttributes.getDimensionPixelSize(a.n, dimensionPixelSize);
        this.f.right = obtainStyledAttributes.getDimensionPixelSize(a.m, dimensionPixelSize);
        this.f.bottom = obtainStyledAttributes.getDimensionPixelSize(a.k, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.d = obtainStyledAttributes.getDimensionPixelSize(a.b, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(a.c, 0);
        obtainStyledAttributes.recycle();
        a.a(this.h, context, colorStateList, dimension, dimension2, f2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!(a instanceof dj)) {
            int mode = MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) a.a(this.h)), MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) a.b(this.h)), MeasureSpec.getSize(i3)), mode2);
            }
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setMinimumWidth(int i2) {
        this.d = i2;
        super.setMinimumWidth(i2);
    }

    public void setMinimumHeight(int i2) {
        this.e = i2;
        super.setMinimumHeight(i2);
    }

    public final void a(int i2) {
        a.a(this.h, ColorStateList.valueOf(i2));
    }

    public void a(float f2) {
        a.a(this.h, f2);
    }

    public final float O_() {
        return a.c(this.h);
    }
}
