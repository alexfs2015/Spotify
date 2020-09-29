package com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import com.spotify.music.R;

public class VerticalSplitLayout extends FrameLayout implements tqg, vdc {
    public a a;
    public a b;
    /* access modifiers changed from: private */
    public View c;
    /* access modifiers changed from: private */
    public View d;
    /* access modifiers changed from: private */
    public View e;
    private jw f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public int h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public boolean j;
    private defpackage.jw.a k;

    public interface a {
        void onSlide(float f, boolean z);
    }

    public VerticalSplitLayout(Context context) {
        this(context, null);
    }

    public VerticalSplitLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalSplitLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = true;
        this.k = new defpackage.jw.a() {
            public final void a(int i) {
                if (i == 0) {
                    if (VerticalSplitLayout.this.e == VerticalSplitLayout.this.c) {
                        if (VerticalSplitLayout.this.c.getBottom() > VerticalSplitLayout.this.getHeight() / 2) {
                            VerticalSplitLayout verticalSplitLayout = VerticalSplitLayout.this;
                            verticalSplitLayout.e = verticalSplitLayout.d;
                        }
                    } else if (VerticalSplitLayout.this.d.getTop() < VerticalSplitLayout.this.getHeight() / 2) {
                        VerticalSplitLayout verticalSplitLayout2 = VerticalSplitLayout.this;
                        verticalSplitLayout2.e = verticalSplitLayout2.c;
                    }
                }
            }

            public final void a(View view, float f, float f2) {
                if (view == VerticalSplitLayout.this.c) {
                    VerticalSplitLayout.a(VerticalSplitLayout.this, view, f2);
                } else {
                    VerticalSplitLayout.b(VerticalSplitLayout.this, view, f2);
                }
            }

            public final void a(View view, int i, int i2, int i3) {
                if (view == VerticalSplitLayout.this.c) {
                    float height = ((float) ((-VerticalSplitLayout.this.g) - i2)) / (((float) VerticalSplitLayout.this.getHeight()) - (((float) VerticalSplitLayout.this.g) * 2.0f));
                    if (VerticalSplitLayout.this.a != null) {
                        VerticalSplitLayout.this.a.onSlide(1.0f - height, VerticalSplitLayout.this.j);
                    }
                    if (VerticalSplitLayout.this.b != null) {
                        VerticalSplitLayout.this.b.onSlide(height, VerticalSplitLayout.this.j);
                    }
                    if (height == 0.0f) {
                        VerticalSplitLayout.this.j = true;
                    }
                    ip.g(VerticalSplitLayout.this.d, i3);
                }
                if (view == VerticalSplitLayout.this.d) {
                    float g = ((float) (i2 - VerticalSplitLayout.this.g)) / (((float) VerticalSplitLayout.this.getHeight()) - (((float) VerticalSplitLayout.this.g) * 2.0f));
                    if (VerticalSplitLayout.this.a != null) {
                        VerticalSplitLayout.this.a.onSlide(g, VerticalSplitLayout.this.j);
                    }
                    if (VerticalSplitLayout.this.b != null) {
                        VerticalSplitLayout.this.b.onSlide(1.0f - g, VerticalSplitLayout.this.j);
                    }
                    if (g == 0.0f) {
                        VerticalSplitLayout.this.j = true;
                    }
                    ip.g(VerticalSplitLayout.this.c, i3);
                }
                VerticalSplitLayout verticalSplitLayout = VerticalSplitLayout.this;
                verticalSplitLayout.h = verticalSplitLayout.c.getTop();
                VerticalSplitLayout verticalSplitLayout2 = VerticalSplitLayout.this;
                verticalSplitLayout2.i = verticalSplitLayout2.d.getTop();
            }

            public final int b() {
                return VerticalSplitLayout.this.getHeight();
            }

            public final boolean b(View view, int i) {
                return view == VerticalSplitLayout.this.e;
            }

            public final int d(View view, int i) {
                return i;
            }
        };
    }

    private static int a(View view) {
        return view.getBottom() - view.getTop();
    }

    static /* synthetic */ void a(VerticalSplitLayout verticalSplitLayout, View view, float f2) {
        int i2;
        double d2 = (double) f2;
        boolean z = true;
        if (d2 <= 1000.0d && (d2 < -1000.0d || view.getBottom() <= verticalSplitLayout.getHeight() / 2)) {
            z = false;
        }
        if (z) {
            i2 = (verticalSplitLayout.getHeight() - verticalSplitLayout.g) - a(view);
        } else {
            i2 = verticalSplitLayout.g + (-a(view));
        }
        if (verticalSplitLayout.f.a(0, i2)) {
            ip.d(verticalSplitLayout);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(int i2) {
        if (a()) {
            this.c.setTop((-getHeight()) + this.g);
            this.c.setBottom(this.g);
            this.d.setTop(this.g);
            this.d.setBottom(getHeight());
            this.h = this.c.getTop();
            this.i = this.d.getTop();
            return;
        }
        d();
    }

    static /* synthetic */ void b(VerticalSplitLayout verticalSplitLayout, View view, float f2) {
        double d2 = (double) f2;
        boolean z = true;
        if (d2 > 1000.0d || (d2 >= -1000.0d && view.getTop() >= verticalSplitLayout.getHeight() / 2)) {
            z = false;
        }
        if (verticalSplitLayout.f.a(0, z ? verticalSplitLayout.g : verticalSplitLayout.getHeight() - verticalSplitLayout.g)) {
            ip.d(verticalSplitLayout);
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        this.c.setTop(-this.g);
        this.c.setBottom(getHeight() - this.g);
        this.d.setTop(getHeight() - this.g);
        this.d.setBottom((getHeight() << 1) - this.g);
        this.h = this.c.getTop();
        this.i = this.d.getTop();
    }

    public final void a(int i2) {
        setBackgroundColor(i2);
    }

    public final boolean a() {
        View view = this.e;
        return view != null && view == this.c;
    }

    public final void b() {
        this.j = false;
        this.f.a(this.c, 0, -this.g);
        ip.d(this);
    }

    public final void c() {
        this.j = false;
        this.f.a(this.d, 0, this.g);
        ip.d(this);
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f.a(true)) {
            ip.d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = getChildAt(0);
        this.d = getChildAt(1);
        this.e = this.d;
        postInvalidateOnAnimation();
        this.f = jw.a((ViewGroup) this, 1.0f, this.k);
        getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            /* access modifiers changed from: private */
            public /* synthetic */ boolean a() {
                VerticalSplitLayout.this.c.setTop(VerticalSplitLayout.this.h);
                VerticalSplitLayout.this.d.setTop(VerticalSplitLayout.this.i);
                VerticalSplitLayout.this.c.setBottom(VerticalSplitLayout.this.h + VerticalSplitLayout.this.getHeight());
                VerticalSplitLayout.this.d.setBottom(VerticalSplitLayout.this.i + VerticalSplitLayout.this.getHeight());
                return true;
            }

            public final boolean onPreDraw() {
                TypedValue typedValue = new TypedValue();
                VerticalSplitLayout.this.getResources().getValue(R.dimen.driving_pivot_entry_exit_height_percent, typedValue, true);
                float f = typedValue.getFloat();
                VerticalSplitLayout verticalSplitLayout = VerticalSplitLayout.this;
                verticalSplitLayout.g = (int) (((float) verticalSplitLayout.getHeight()) * f);
                VerticalSplitLayout.this.d();
                VerticalSplitLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                VerticalSplitLayout.this.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        return AnonymousClass1.this.a();
                    }
                });
                return true;
            }
        });
        setOnSystemUiVisibilityChangeListener(new OnSystemUiVisibilityChangeListener() {
            public final void onSystemUiVisibilityChange(int i) {
                VerticalSplitLayout.this.b(i);
            }
        });
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f.a(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f.b(motionEvent);
        return true;
    }
}
