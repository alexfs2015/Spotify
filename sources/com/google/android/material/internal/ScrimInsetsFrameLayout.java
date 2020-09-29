package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout {
    Drawable a;
    Rect b;
    private Rect c;

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        TypedArray a2 = faj.a(context, attributeSet, a.bV, i, 2132017908, new int[0]);
        this.a = a2.getDrawable(a.bW);
        a2.recycle();
        setWillNotDraw(true);
        ip.a((View) this, (il) new il() {
            public final iw onApplyWindowInsets(View view, iw iwVar) {
                if (ScrimInsetsFrameLayout.this.b == null) {
                    ScrimInsetsFrameLayout.this.b = new Rect();
                }
                ScrimInsetsFrameLayout.this.b.set(iwVar.a(), iwVar.b(), iwVar.c(), iwVar.d());
                ScrimInsetsFrameLayout.this.a(iwVar);
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                boolean z = false;
                if (!(VERSION.SDK_INT >= 20 ? ((WindowInsets) iwVar.a).hasSystemWindowInsets() : false) || ScrimInsetsFrameLayout.this.a == null) {
                    z = true;
                }
                scrimInsetsFrameLayout.setWillNotDraw(z);
                ip.d(ScrimInsetsFrameLayout.this);
                return iwVar.f();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void a(iw iwVar) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b != null && this.a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.c.set(0, 0, width, this.b.top);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            this.c.set(0, height - this.b.bottom, width, height);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            this.c.set(0, this.b.top, this.b.left, height - this.b.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            this.c.set(width - this.b.right, this.b.top, width, height - this.b.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
