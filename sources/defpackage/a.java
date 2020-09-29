package defpackage;

import android.common.view.SlidingTabLayout.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: a reason: default package */
public final class a extends LinearLayout {
    private final int a;
    private final Paint b;
    private final int c;
    private final Paint d;
    private final boolean e;
    private final int f;
    private final Paint g;
    private final float h;
    private int i;
    private float j;
    private final C0013a k = new C0013a(0);

    /* renamed from: a$a reason: collision with other inner class name */
    static class C0013a implements c {
        int[] a;
        int[] b;

        private C0013a() {
        }

        /* synthetic */ C0013a(byte b2) {
            this();
        }

        public final int a(int i) {
            int[] iArr = this.a;
            return iArr[i % iArr.length];
        }

        public final int b(int i) {
            int[] iArr = this.b;
            return iArr[i % iArr.length];
        }
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setId(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.vfi.a.f, i2, 0);
        int color = obtainStyledAttributes.getColor(defpackage.vfi.a.g, -16777216);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(defpackage.vfi.a.h, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(defpackage.vfi.a.i, 0);
        int color2 = obtainStyledAttributes.getColor(defpackage.vfi.a.j, -1);
        int color3 = obtainStyledAttributes.getColor(defpackage.vfi.a.k, -16711936);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(defpackage.vfi.a.l, 2);
        obtainStyledAttributes.recycle();
        this.f = a(color2, 38);
        C0013a aVar = this.k;
        aVar.a = new int[]{color3};
        aVar.b = new int[]{a(color2, 32)};
        this.a = dimensionPixelSize;
        this.b = new Paint();
        this.b.setColor(this.f);
        this.c = dimensionPixelSize3;
        this.d = new Paint();
        this.e = true;
        this.h = 0.5f;
        this.g = new Paint();
        this.g.setStrokeWidth((float) dimensionPixelSize2);
        setBackgroundColor(color);
    }

    private static int a(int i2, byte b2) {
        return Color.argb(b2, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public final void a(int i2, float f2) {
        getChildAt(this.i).setSelected(false);
        this.i = i2;
        this.j = f2;
        getChildAt(this.i).setSelected(true);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int height = getHeight();
        int childCount = getChildCount();
        float f2 = (float) height;
        int min = (int) (Math.min(Math.max(0.0f, 0.5f), 1.0f) * f2);
        C0013a aVar = this.k;
        if (childCount > 0) {
            View childAt = getChildAt(this.i);
            int left = childAt.getLeft() + childAt.getPaddingLeft();
            int right = childAt.getRight() - childAt.getPaddingRight();
            int a2 = aVar.a(this.i);
            if (this.j > 0.0f && this.i < getChildCount() - 1) {
                int a3 = aVar.a(this.i + 1);
                if (a2 != a3) {
                    float f3 = this.j;
                    float f4 = 1.0f - f3;
                    a2 = Color.rgb((int) ((((float) Color.red(a3)) * f3) + (((float) Color.red(a2)) * f4)), (int) ((((float) Color.green(a3)) * f3) + (((float) Color.green(a2)) * f4)), (int) ((((float) Color.blue(a3)) * f3) + (((float) Color.blue(a2)) * f4)));
                }
                View childAt2 = getChildAt(this.i + 1);
                float left2 = this.j * ((float) (childAt2.getLeft() + childAt2.getPaddingLeft()));
                float f5 = this.j;
                left = (int) (left2 + ((1.0f - f5) * ((float) left)));
                right = (int) ((f5 * ((float) (childAt2.getRight() - childAt2.getPaddingRight()))) + ((1.0f - this.j) * ((float) right)));
            }
            this.d.setColor(a2);
            Canvas canvas2 = canvas;
            canvas2.drawRect((float) left, (float) (height - this.c), (float) right, f2, this.d);
        }
        int i2 = this.a;
        if (i2 > 0) {
            canvas.drawRect(0.0f, (float) (height - i2), (float) getWidth(), f2, this.b);
        }
        if (this.g.getStrokeWidth() > 0.0f) {
            int i3 = (height - min) / 2;
            for (int i4 = 0; i4 < childCount - 1; i4++) {
                View childAt3 = getChildAt(i4);
                this.g.setColor(aVar.b(i4));
                canvas.drawLine((float) childAt3.getRight(), (float) i3, (float) childAt3.getRight(), (float) (i3 + min), this.g);
            }
        }
    }
}
