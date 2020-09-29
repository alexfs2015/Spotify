package com.spotify.music.nowplaying.drivingmode.view;

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

public class VerticalSplitLayout extends FrameLayout implements urx {
    public View a;
    public jw b;
    public int c;
    public a d;
    public a e;
    public boolean f;
    /* access modifiers changed from: private */
    public View g;
    /* access modifiers changed from: private */
    public View h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public int j;
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
        this.f = true;
        this.k = new defpackage.jw.a() {
            public final int d(View view, int i) {
                return i;
            }

            public final boolean b(View view, int i) {
                return view == VerticalSplitLayout.this.h;
            }

            public final int b() {
                return VerticalSplitLayout.this.getHeight();
            }

            public final void a(View view, float f, float f2) {
                if (view == VerticalSplitLayout.this.g) {
                    VerticalSplitLayout.a(VerticalSplitLayout.this, view, f2);
                } else {
                    VerticalSplitLayout.b(VerticalSplitLayout.this, view, f2);
                }
            }

            public final void a(View view, int i, int i2, int i3) {
                if (view == VerticalSplitLayout.this.g) {
                    float height = ((float) ((-VerticalSplitLayout.this.c) - i2)) / (((float) VerticalSplitLayout.this.getHeight()) - (((float) VerticalSplitLayout.this.c) * 2.0f));
                    if (VerticalSplitLayout.this.d != null) {
                        VerticalSplitLayout.this.d.onSlide(1.0f - height, VerticalSplitLayout.this.f);
                    }
                    if (VerticalSplitLayout.this.e != null) {
                        VerticalSplitLayout.this.e.onSlide(height, VerticalSplitLayout.this.f);
                    }
                    if (height == 0.0f) {
                        VerticalSplitLayout.this.f = true;
                    }
                    ip.f(VerticalSplitLayout.this.a, i3);
                }
                if (view == VerticalSplitLayout.this.a) {
                    float g = ((float) (i2 - VerticalSplitLayout.this.c)) / (((float) VerticalSplitLayout.this.getHeight()) - (((float) VerticalSplitLayout.this.c) * 2.0f));
                    if (VerticalSplitLayout.this.d != null) {
                        VerticalSplitLayout.this.d.onSlide(g, VerticalSplitLayout.this.f);
                    }
                    if (VerticalSplitLayout.this.e != null) {
                        VerticalSplitLayout.this.e.onSlide(1.0f - g, VerticalSplitLayout.this.f);
                    }
                    if (g == 0.0f) {
                        VerticalSplitLayout.this.f = true;
                    }
                    ip.f(VerticalSplitLayout.this.g, i3);
                }
                VerticalSplitLayout verticalSplitLayout = VerticalSplitLayout.this;
                verticalSplitLayout.i = verticalSplitLayout.g.getTop();
                VerticalSplitLayout verticalSplitLayout2 = VerticalSplitLayout.this;
                verticalSplitLayout2.j = verticalSplitLayout2.a.getTop();
            }

            public final void a(int i) {
                if (i != 0) {
                    if (i == 1) {
                    }
                } else if (VerticalSplitLayout.this.h == VerticalSplitLayout.this.g) {
                    if (VerticalSplitLayout.this.g.getBottom() > VerticalSplitLayout.this.getHeight() / 2) {
                        VerticalSplitLayout verticalSplitLayout = VerticalSplitLayout.this;
                        verticalSplitLayout.h = verticalSplitLayout.a;
                    }
                } else if (VerticalSplitLayout.this.a.getTop() < VerticalSplitLayout.this.getHeight() / 2) {
                    VerticalSplitLayout verticalSplitLayout2 = VerticalSplitLayout.this;
                    verticalSplitLayout2.h = verticalSplitLayout2.g;
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g = getChildAt(0);
        this.a = getChildAt(1);
        this.h = this.a;
        postInvalidateOnAnimation();
        this.b = jw.a((ViewGroup) this, 1.0f, this.k);
        getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                TypedValue typedValue = new TypedValue();
                VerticalSplitLayout.this.getResources().getValue(R.dimen.driving_pivot_entry_exit_height_percent, typedValue, true);
                float f = typedValue.getFloat();
                VerticalSplitLayout verticalSplitLayout = VerticalSplitLayout.this;
                verticalSplitLayout.c = (int) (((float) verticalSplitLayout.getHeight()) * f);
                VerticalSplitLayout.this.c();
                VerticalSplitLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                VerticalSplitLayout.this.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        return AnonymousClass1.this.a();
                    }
                });
                return true;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ boolean a() {
                VerticalSplitLayout.this.g.setTop(VerticalSplitLayout.this.i);
                VerticalSplitLayout.this.a.setTop(VerticalSplitLayout.this.j);
                VerticalSplitLayout.this.g.setBottom(VerticalSplitLayout.this.i + VerticalSplitLayout.this.getHeight());
                VerticalSplitLayout.this.a.setBottom(VerticalSplitLayout.this.j + VerticalSplitLayout.this.getHeight());
                return true;
            }
        });
        setOnSystemUiVisibilityChangeListener(new OnSystemUiVisibilityChangeListener() {
            public final void onSystemUiVisibilityChange(int i) {
                VerticalSplitLayout.this.b(i);
            }
        });
    }

    public final boolean a() {
        View view = this.h;
        if (view != null && view == this.g) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(int i2) {
        if (a()) {
            this.g.setTop((-getHeight()) + this.c);
            this.g.setBottom(this.c);
            this.a.setTop(this.c);
            this.a.setBottom(getHeight());
            this.i = this.g.getTop();
            this.j = this.a.getTop();
            return;
        }
        c();
    }

    /* access modifiers changed from: private */
    public void c() {
        this.g.setTop(-this.c);
        this.g.setBottom(getHeight() - this.c);
        this.a.setTop(getHeight() - this.c);
        this.a.setBottom((getHeight() << 1) - this.c);
        this.i = this.g.getTop();
        this.j = this.a.getTop();
    }

    private static int a(View view) {
        return view.getBottom() - view.getTop();
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.b.a(true)) {
            ip.d(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.b.a(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.b.b(motionEvent);
        return true;
    }

    public final void b() {
        this.f = false;
        this.b.a(this.g, 0, -this.c);
        ip.d(this);
    }

    public final void a(int i2) {
        setBackgroundColor(i2);
    }

    static /* synthetic */ void a(VerticalSplitLayout verticalSplitLayout, View view, float f2) {
        int i2;
        double d2 = (double) f2;
        boolean z = true;
        if (d2 <= 1000.0d && (d2 < -1000.0d || view.getBottom() <= verticalSplitLayout.getHeight() / 2)) {
            z = false;
        }
        if (z) {
            i2 = (verticalSplitLayout.getHeight() - verticalSplitLayout.c) - a(view);
        } else {
            i2 = verticalSplitLayout.c + (-a(view));
        }
        if (verticalSplitLayout.b.a(0, i2)) {
            ip.d(verticalSplitLayout);
        }
    }

    static /* synthetic */ void b(VerticalSplitLayout verticalSplitLayout, View view, float f2) {
        double d2 = (double) f2;
        boolean z = true;
        if (d2 > 1000.0d || (d2 >= -1000.0d && view.getTop() >= verticalSplitLayout.getHeight() / 2)) {
            z = false;
        }
        if (verticalSplitLayout.b.a(0, z ? verticalSplitLayout.c : verticalSplitLayout.getHeight() - verticalSplitLayout.c)) {
            ip.d(verticalSplitLayout);
        }
    }
}
