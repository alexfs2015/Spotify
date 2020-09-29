package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

@Deprecated
/* renamed from: no reason: default package */
public final class no {
    private final ViewGroup a;

    @Deprecated
    /* renamed from: no$a */
    public static class a {
        public float a = -1.0f;
        public float b = -1.0f;
        public float c = -1.0f;
        public float d = -1.0f;
        public float e = -1.0f;
        public float f = -1.0f;
        public float g = -1.0f;
        public float h = -1.0f;
        public float i;
        final c j = new c(0, 0);

        public final void a(LayoutParams layoutParams, int i2, int i3) {
            this.j.width = layoutParams.width;
            this.j.height = layoutParams.height;
            boolean z = false;
            boolean z2 = (this.j.b || this.j.width == 0) && this.a < 0.0f;
            if ((this.j.a || this.j.height == 0) && this.b < 0.0f) {
                z = true;
            }
            float f2 = this.a;
            if (f2 >= 0.0f) {
                layoutParams.width = Math.round(((float) i2) * f2);
            }
            float f3 = this.b;
            if (f3 >= 0.0f) {
                layoutParams.height = Math.round(((float) i3) * f3);
            }
            if (this.i >= 0.0f) {
                if (z2) {
                    layoutParams.width = Math.round(((float) layoutParams.height) * this.i);
                    this.j.b = true;
                }
                if (z) {
                    layoutParams.height = Math.round(((float) layoutParams.width) / this.i);
                    this.j.a = true;
                }
            }
        }

        public final void a(View view, MarginLayoutParams marginLayoutParams, int i2, int i3) {
            a(marginLayoutParams, i2, i3);
            this.j.leftMargin = marginLayoutParams.leftMargin;
            this.j.topMargin = marginLayoutParams.topMargin;
            this.j.rightMargin = marginLayoutParams.rightMargin;
            this.j.bottomMargin = marginLayoutParams.bottomMargin;
            ia.a(this.j, ia.a(marginLayoutParams));
            ia.b(this.j, ia.b(marginLayoutParams));
            float f2 = this.c;
            if (f2 >= 0.0f) {
                marginLayoutParams.leftMargin = Math.round(((float) i2) * f2);
            }
            float f3 = this.d;
            if (f3 >= 0.0f) {
                marginLayoutParams.topMargin = Math.round(((float) i3) * f3);
            }
            float f4 = this.e;
            if (f4 >= 0.0f) {
                marginLayoutParams.rightMargin = Math.round(((float) i2) * f4);
            }
            float f5 = this.f;
            if (f5 >= 0.0f) {
                marginLayoutParams.bottomMargin = Math.round(((float) i3) * f5);
            }
            boolean z = false;
            float f6 = this.g;
            if (f6 >= 0.0f) {
                ia.a(marginLayoutParams, Math.round(((float) i2) * f6));
                z = true;
            }
            float f7 = this.h;
            if (f7 >= 0.0f) {
                ia.b(marginLayoutParams, Math.round(((float) i2) * f7));
                z = true;
            }
            if (z && view != null) {
                ia.c(marginLayoutParams, ip.f(view));
            }
        }

        public final String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h)});
        }

        public final void a(MarginLayoutParams marginLayoutParams) {
            a((LayoutParams) marginLayoutParams);
            marginLayoutParams.leftMargin = this.j.leftMargin;
            marginLayoutParams.topMargin = this.j.topMargin;
            marginLayoutParams.rightMargin = this.j.rightMargin;
            marginLayoutParams.bottomMargin = this.j.bottomMargin;
            ia.a(marginLayoutParams, ia.a(this.j));
            ia.b(marginLayoutParams, ia.b(this.j));
        }

        public final void a(LayoutParams layoutParams) {
            if (!this.j.b) {
                layoutParams.width = this.j.width;
            }
            if (!this.j.a) {
                layoutParams.height = this.j.height;
            }
            c cVar = this.j;
            cVar.b = false;
            cVar.a = false;
        }
    }

    @Deprecated
    /* renamed from: no$b */
    public interface b {
        a a();
    }

    /* renamed from: no$c */
    static class c extends MarginLayoutParams {
        boolean a;
        boolean b;

        public c(int i, int i2) {
            super(0, 0);
        }
    }

    public no(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static void a(LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    public final void a(int i, int i2) {
        int size = (MeasureSpec.getSize(i) - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        int size2 = (MeasureSpec.getSize(i2) - this.a.getPaddingTop()) - this.a.getPaddingBottom();
        int childCount = this.a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.a.getChildAt(i3);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof b) {
                a a2 = ((b) layoutParams).a();
                if (a2 != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        a2.a(childAt, (MarginLayoutParams) layoutParams, size, size2);
                    } else {
                        a2.a(layoutParams, size, size2);
                    }
                }
            }
        }
    }

    public static a a(Context context, AttributeSet attributeSet) {
        a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.nn.a.a);
        float fraction = obtainStyledAttributes.getFraction(defpackage.nn.a.k, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            aVar = new a();
            aVar.a = fraction;
        } else {
            aVar = null;
        }
        float fraction2 = obtainStyledAttributes.getFraction(defpackage.nn.a.c, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.b = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(defpackage.nn.a.g, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.c = fraction3;
            aVar.d = fraction3;
            aVar.e = fraction3;
            aVar.f = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(defpackage.nn.a.f, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.c = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(defpackage.nn.a.j, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.d = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(defpackage.nn.a.h, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.e = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(defpackage.nn.a.d, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(defpackage.nn.a.i, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.g = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(defpackage.nn.a.e, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.h = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(defpackage.nn.a.b, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.i = fraction10;
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final void a() {
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = this.a.getChildAt(i).getLayoutParams();
            if (layoutParams instanceof b) {
                a a2 = ((b) layoutParams).a();
                if (a2 != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        a2.a((MarginLayoutParams) layoutParams);
                    } else {
                        a2.a(layoutParams);
                    }
                }
            }
        }
    }

    public final boolean b() {
        int childCount = this.a.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.a.getChildAt(i);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof b) {
                a a2 = ((b) layoutParams).a();
                if (a2 != null) {
                    if (a(childAt, a2)) {
                        layoutParams.width = -2;
                        z = true;
                    }
                    if (b(childAt, a2)) {
                        layoutParams.height = -2;
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    private static boolean a(View view, a aVar) {
        return (view.getMeasuredWidthAndState() & -16777216) == 16777216 && aVar.a >= 0.0f && aVar.j.width == -2;
    }

    private static boolean b(View view, a aVar) {
        return (view.getMeasuredHeightAndState() & -16777216) == 16777216 && aVar.b >= 0.0f && aVar.j.height == -2;
    }
}
