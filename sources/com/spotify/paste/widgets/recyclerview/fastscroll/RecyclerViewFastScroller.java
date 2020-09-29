package com.spotify.paste.widgets.recyclerview.fastscroll;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.music.R;

public class RecyclerViewFastScroller extends View {
    public boolean a;
    public int b;
    /* access modifiers changed from: private */
    public RecyclerView c;
    private final Drawable d;
    /* access modifiers changed from: private */
    public final int e;
    private final int f;
    private final int g;
    private LinearLayoutManager h;
    private final a i;
    private final Paint j;
    /* access modifiers changed from: private */
    public boolean k;
    private final Handler l;
    private final Runnable m;
    private final m n;
    private final Rect o;
    /* access modifiers changed from: private */
    public ObjectAnimator p;

    class a {
        final Rect a;
        final Rect b;
        float c;

        private a() {
            this.a = new Rect();
            this.b = new Rect();
        }

        /* synthetic */ a(RecyclerViewFastScroller recyclerViewFastScroller, byte b2) {
            this();
        }

        public final void a(float f) {
            this.c = f;
            if (this.c < 0.0f) {
                this.c = 0.0f;
            }
            if (this.c > 1.0f) {
                this.c = 1.0f;
            }
            a();
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.b.offsetTo(0, Math.round(((float) (this.a.height() - RecyclerViewFastScroller.this.e)) * this.c));
        }
    }

    public RecyclerViewFastScroller(Context context) {
        this(context, null);
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteRecyclerFastScrollerStyle);
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new a(this, 0);
        this.j = new Paint();
        this.l = new Handler();
        this.m = new Runnable() {
            public final void run() {
                RecyclerViewFastScroller.this.k = false;
                RecyclerViewFastScroller.this.d();
            }
        };
        this.n = new m() {
            public final void a(RecyclerView recyclerView, int i) {
            }

            public final void a(RecyclerView recyclerView, int i, int i2) {
                if (RecyclerViewFastScroller.this.isEnabled()) {
                    if (Math.abs(i2) > 15) {
                        RecyclerViewFastScroller.b(RecyclerViewFastScroller.this);
                    }
                    if (RecyclerViewFastScroller.this.k) {
                        RecyclerViewFastScroller.this.b();
                        RecyclerViewFastScroller.e(RecyclerViewFastScroller.this);
                    }
                }
            }
        };
        this.o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.uvy.a.S, i2, 0);
        this.d = obtainStyledAttributes.getDrawable(defpackage.uvy.a.V);
        this.e = obtainStyledAttributes.getDimensionPixelSize(defpackage.uvy.a.W, uts.b(72.0f, getResources()));
        this.f = obtainStyledAttributes.getDimensionPixelSize(defpackage.uvy.a.X, uts.b(32.0f, getResources()));
        this.g = obtainStyledAttributes.getInt(defpackage.uvy.a.T, 1000);
        int color = obtainStyledAttributes.getColor(defpackage.uvy.a.U, 0);
        obtainStyledAttributes.recycle();
        fay.a(this.d);
        this.j.setColor(color);
        setVisibility(4);
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 != null) {
            recyclerView2.b(this.n);
            this.h = null;
        }
        this.c = recyclerView;
        if (this.c != null) {
            recyclerView.a(this.n);
        }
    }

    public final void a() {
        boolean z = this.k;
        this.k = false;
        this.l.removeCallbacks(this.m);
        if (z) {
            d();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.l.removeCallbacks(this.m);
        super.onDetachedFromWindow();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.k && motionEvent.getAction() == 0 && this.i.b.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.a = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.d.setState(new int[]{16842919});
            b();
            return true;
        } else if (motionEvent.getAction() == 2 && this.a) {
            b();
            a aVar = this.i;
            aVar.a((motionEvent.getY() - (((float) aVar.b.height()) / 2.0f)) / ((float) aVar.a.height()));
            c();
            int t = (int) (((float) this.h.t()) * this.i.c);
            if (t != 0) {
                this.h.e(t);
            } else {
                this.h.a(t, -this.b);
            }
            ip.d(this);
            return true;
        } else if (!this.a || (motionEvent.getAction() != 1 && motionEvent.getAction() != 3)) {
            return super.onTouchEvent(motionEvent);
        } else {
            b();
            this.d.setState(new int[0]);
            getParent().requestDisallowInterceptTouchEvent(false);
            this.a = false;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(this.f, 1073741824), i3);
        a aVar = this.i;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i4 = this.e;
        aVar.a.set(0, 0, measuredWidth, measuredHeight);
        aVar.b.set(0, 0, measuredWidth, i4);
        aVar.a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        canvas.drawRect(this.i.a, this.j);
        this.d.getPadding(this.o);
        Rect rect = this.i.b;
        int centerY = rect.centerY();
        int intrinsicHeight = centerY - (this.d.getIntrinsicHeight() / 2);
        int intrinsicHeight2 = centerY + (this.d.getIntrinsicHeight() / 2);
        if (uur.a((View) this)) {
            i3 = rect.left + this.o.right;
            i2 = this.d.getIntrinsicWidth() + i3;
        } else {
            int intrinsicWidth = (rect.right - this.d.getIntrinsicWidth()) - this.o.right;
            i2 = rect.right - this.o.right;
            i3 = intrinsicWidth;
        }
        this.d.setBounds(i3, intrinsicHeight, i2, intrinsicHeight2);
        this.d.draw(canvas);
    }

    /* access modifiers changed from: private */
    public void b() {
        this.l.removeCallbacks(this.m);
        this.l.postDelayed(this.m, (long) this.g);
    }

    private void c() {
        if (this.c.d() instanceof LinearLayoutManager) {
            this.h = (LinearLayoutManager) this.c.d();
            return;
        }
        throw new IllegalStateException("Must be instance of LinearLayoutManager!");
    }

    /* access modifiers changed from: private */
    public void d() {
        int i2;
        if (uur.a((View) this)) {
            i2 = -getMeasuredWidth();
        } else {
            i2 = getMeasuredWidth();
        }
        this.p = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{(float) i2})});
        this.p.setDuration(200);
        this.p.setInterpolator(uuc.a(this.c.getContext()));
        this.p.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                RecyclerViewFastScroller.this.setVisibility(4);
                RecyclerViewFastScroller.this.setTranslationX(0.0f);
                RecyclerViewFastScroller.this.setAlpha(1.0f);
                RecyclerViewFastScroller.this.p = null;
            }
        });
        this.p.start();
    }

    static /* synthetic */ void b(RecyclerViewFastScroller recyclerViewFastScroller) {
        if (!recyclerViewFastScroller.k) {
            ObjectAnimator objectAnimator = recyclerViewFastScroller.p;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                recyclerViewFastScroller.p.cancel();
                recyclerViewFastScroller.p = null;
            }
            recyclerViewFastScroller.setVisibility(0);
            recyclerViewFastScroller.setTranslationX((float) (uur.a((View) recyclerViewFastScroller) ? -recyclerViewFastScroller.getMeasuredWidth() : recyclerViewFastScroller.getMeasuredWidth()));
            recyclerViewFastScroller.setAlpha(0.0f);
            recyclerViewFastScroller.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    RecyclerViewFastScroller.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(RecyclerViewFastScroller.this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f}), PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f})});
                    ofPropertyValuesHolder.setDuration(200);
                    ofPropertyValuesHolder.setInterpolator(uuc.a(RecyclerViewFastScroller.this.c.getContext()));
                    ofPropertyValuesHolder.start();
                    return true;
                }
            });
        }
        recyclerViewFastScroller.k = true;
    }

    static /* synthetic */ void e(RecyclerViewFastScroller recyclerViewFastScroller) {
        if (!recyclerViewFastScroller.a) {
            recyclerViewFastScroller.c();
            if (recyclerViewFastScroller.c.getChildCount() == 0) {
                recyclerViewFastScroller.i.a(0.0f);
                return;
            }
            int k2 = recyclerViewFastScroller.h.k();
            int i2 = 0;
            if (k2 != -1) {
                int l2 = recyclerViewFastScroller.h.l();
                if (l2 != -1) {
                    i2 = (l2 - k2) + 1;
                }
            }
            int m2 = (recyclerViewFastScroller.h.m() - i2) + 1;
            recyclerViewFastScroller.i.a(((float) m2) / ((float) (((androidx.recyclerview.widget.RecyclerView.a) fay.a(recyclerViewFastScroller.c.c())).b() - i2)));
            ip.d(recyclerViewFastScroller);
        }
    }
}
