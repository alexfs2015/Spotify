package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
    private int h = this.g;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final Paint n = new Paint();
    private final Rect o = new Rect();
    private int p = 255;
    private boolean q = false;
    private boolean r = false;
    private int s;
    private boolean t;
    private float u;
    private float v;
    private int w;

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n.setColor(this.h);
        float f = context.getResources().getDisplayMetrics().density;
        this.i = (int) ((3.0f * f) + 0.5f);
        this.j = (int) ((6.0f * f) + 0.5f);
        this.k = (int) (64.0f * f);
        this.m = (int) ((16.0f * f) + 0.5f);
        this.s = (int) ((1.0f * f) + 0.5f);
        this.l = (int) ((f * 32.0f) + 0.5f);
        this.w = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        a(this.f);
        setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                PagerTabStrip.this.a.b(PagerTabStrip.this.a.c - 1);
            }
        });
        this.d.setFocusable(true);
        this.d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                PagerTabStrip.this.a.b(PagerTabStrip.this.a.c + 1);
            }
        });
        if (getBackground() == null) {
            this.q = true;
        }
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        int i6 = this.j;
        if (i5 < i6) {
            i5 = i6;
        }
        super.setPadding(i2, i3, i4, i5);
    }

    public final void a(int i2) {
        int i3 = this.k;
        if (i2 < i3) {
            i2 = i3;
        }
        super.a(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        this.q = drawable == null;
    }

    public void setBackgroundColor(int i2) {
        super.setBackgroundColor(i2);
        this.q = (i2 & -16777216) == 0;
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        this.q = i2 == 0;
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        return Math.max(super.a(), this.l);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.t) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.u = x;
            this.v = y;
            this.t = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.u) > ((float) this.w) || Math.abs(y - this.v) > ((float) this.w))) {
                this.t = true;
            }
        } else if (x < ((float) (this.c.getLeft() - this.m))) {
            this.a.b(this.a.c - 1);
        } else if (x > ((float) (this.c.getRight() + this.m))) {
            this.a.b(this.a.c + 1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.c.getLeft() - this.m;
        int right = this.c.getRight() + this.m;
        int i2 = height - this.i;
        this.n.setColor((this.p << 24) | (this.h & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) i2, (float) right, f, this.n);
        if (this.q) {
            this.n.setColor(-16777216 | (this.h & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.s), (float) (getWidth() - getPaddingRight()), f, this.n);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, float f, boolean z) {
        Rect rect = this.o;
        int height = getHeight();
        int i3 = height - this.i;
        rect.set(this.c.getLeft() - this.m, i3, this.c.getRight() + this.m, height);
        super.a(i2, f, z);
        this.p = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.c.getLeft() - this.m, i3, this.c.getRight() + this.m, height);
        invalidate(rect);
    }
}
