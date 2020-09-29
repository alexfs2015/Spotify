package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.spotify.music.R;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final Handler a = new Handler(Looper.getMainLooper(), new Callback() {
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).f();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).b(message.arg1);
                return true;
            }
        }
    });
    /* access modifiers changed from: private */
    public static final boolean f = (VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19);
    private static final int[] g = {R.attr.snackbarStyle};
    public final Context b;
    protected final d c;
    int d;
    final defpackage.fag.a e = new defpackage.fag.a() {
        public final void a() {
            Handler handler = BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public final void a(int i) {
            Handler handler = BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };
    private final ViewGroup h;
    /* access modifiers changed from: private */
    public final faf i;
    private final AccessibilityManager j;

    public static class Behavior extends SwipeDismissBehavior<View> {
        private final a g = new a(this);

        public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            a aVar = this.g;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    fag.a().d(aVar.a);
                }
            } else if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                fag.a().c(aVar.a);
            }
            return super.a(coordinatorLayout, view, motionEvent);
        }

        public final boolean a(View view) {
            return view instanceof d;
        }
    }

    public static class a {
        /* access modifiers changed from: 0000 */
        public defpackage.fag.a a;

        public a(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.e = SwipeDismissBehavior.a(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.f = SwipeDismissBehavior.a(0.0f, 0.6f, 1.0f);
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public static class d extends FrameLayout {
        c a;
        b b;
        private final AccessibilityManager c;
        private final defpackage.iz.a d;

        protected d(Context context) {
            this(context, null);
        }

        protected d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyc.a.bZ);
            if (obtainStyledAttributes.hasValue(defpackage.eyc.a.cb)) {
                ip.e((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(defpackage.eyc.a.cb, 0));
            }
            obtainStyledAttributes.recycle();
            this.c = (AccessibilityManager) context.getSystemService("accessibility");
            this.d = new defpackage.iz.a() {
                public final void a(boolean z) {
                    d.this.a(z);
                }
            };
            AccessibilityManager accessibilityManager = this.c;
            defpackage.iz.a aVar = this.d;
            if (VERSION.SDK_INT >= 19 && aVar != null) {
                accessibilityManager.addTouchExplorationStateChangeListener(new defpackage.iz.b(aVar));
            }
            a(this.c.isTouchExplorationEnabled());
        }

        /* access modifiers changed from: private */
        public void a(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            c cVar = this.a;
            if (cVar != null) {
                cVar.a();
            }
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            ip.s(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            b bVar = this.b;
            if (bVar != null) {
                bVar.a();
            }
            AccessibilityManager accessibilityManager = this.c;
            defpackage.iz.a aVar = this.d;
            if (VERSION.SDK_INT >= 19 && aVar != null) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new defpackage.iz.b(aVar));
            }
        }
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, faf faf) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (faf != null) {
            this.h = viewGroup;
            this.i = faf;
            this.b = viewGroup.getContext();
            ezs.a(this.b);
            LayoutInflater from = LayoutInflater.from(this.b);
            TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(g);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            this.c = (d) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, this.h, false);
            this.c.addView(view);
            ip.d((View) this.c, 1);
            ip.b((View) this.c, 1);
            ip.b((View) this.c, true);
            ip.a((View) this.c, (il) new il() {
                public final iw onApplyWindowInsets(View view, iw iwVar) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iwVar.d());
                    return iwVar;
                }
            });
            ip.a((View) this.c, (ht) new ht() {
                public final void a(View view, ja jaVar) {
                    super.a(view, jaVar);
                    jaVar.a(1048576);
                    jaVar.k(true);
                }

                public final boolean a(View view, int i, Bundle bundle) {
                    if (i != 1048576) {
                        return super.a(view, i, bundle);
                    }
                    BaseTransientBottomBar.this.d();
                    return true;
                }
            });
            this.j = (AccessibilityManager) this.b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public int a() {
        return this.d;
    }

    public final View b() {
        return this.c;
    }

    public void c() {
        fag a2 = fag.a();
        int a3 = a();
        defpackage.fag.a aVar = this.e;
        synchronized (a2.a) {
            if (a2.g(aVar)) {
                a2.c.b = a3;
                a2.b.removeCallbacksAndMessages(a2.c);
                a2.a(a2.c);
                return;
            }
            if (a2.h(aVar)) {
                a2.d.b = a3;
            } else {
                a2.d = new defpackage.fag.b(a3, aVar);
            }
            if (a2.c == null || !a2.a(a2.c, 4)) {
                a2.c = null;
                a2.b();
            }
        }
    }

    public void d() {
        a(3);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        fag.a().a(this.e, i2);
    }

    public boolean e() {
        return fag.a().e(this.e);
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        if (this.c.getParent() == null) {
            LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.d) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.d dVar = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) layoutParams;
                Behavior behavior = new Behavior();
                behavior.g.a = this.e;
                behavior.b = new com.google.android.material.behavior.SwipeDismissBehavior.a() {
                    public final void a(View view) {
                        view.setVisibility(8);
                        BaseTransientBottomBar.this.a(0);
                    }

                    public final void a(int i) {
                        if (i == 0) {
                            fag.a().d(BaseTransientBottomBar.this.e);
                        } else if (i == 1 || i == 2) {
                            fag.a().c(BaseTransientBottomBar.this.e);
                        }
                    }
                };
                dVar.a((androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) behavior);
                dVar.g = 80;
            }
            this.h.addView(this.c);
        }
        this.c.b = new b() {
            public final void a() {
                if (fag.a().f(BaseTransientBottomBar.this.e)) {
                    BaseTransientBottomBar.a.post(new Runnable() {
                        public final void run() {
                            BaseTransientBottomBar.this.c(3);
                        }
                    });
                }
            }
        };
        if (!ip.B(this.c)) {
            this.c.a = new c() {
                public final void a() {
                    BaseTransientBottomBar.this.c.a = null;
                    if (BaseTransientBottomBar.this.i()) {
                        BaseTransientBottomBar.this.g();
                    } else {
                        BaseTransientBottomBar.this.h();
                    }
                }
            };
        } else if (i()) {
            g();
        } else {
            h();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        final int k = k();
        if (f) {
            ip.f((View) this.c, k);
        } else {
            this.c.setTranslationY((float) k);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{k, 0});
        valueAnimator.setInterpolator(eyd.b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.i.a(70, 180);
            }

            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.h();
            }
        });
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            private int a = k;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f) {
                    ip.f((View) BaseTransientBottomBar.this.c, intValue - this.a);
                } else {
                    BaseTransientBottomBar.this.c.setTranslationY((float) intValue);
                }
                this.a = intValue;
            }
        });
        valueAnimator.start();
    }

    private int k() {
        int height = this.c.getHeight();
        LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams instanceof MarginLayoutParams ? height + ((MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: 0000 */
    public final void b(final int i2) {
        if (!i() || this.c.getVisibility() != 0) {
            c(i2);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, k()});
        valueAnimator.setInterpolator(eyd.b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.i.b(0, 180);
            }

            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.c(i2);
            }
        });
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            private int a = 0;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f) {
                    ip.f((View) BaseTransientBottomBar.this.c, intValue - this.a);
                } else {
                    BaseTransientBottomBar.this.c.setTranslationY((float) intValue);
                }
                this.a = intValue;
            }
        });
        valueAnimator.start();
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        fag.a().b(this.e);
    }

    /* access modifiers changed from: 0000 */
    public final void c(int i2) {
        fag.a().a(this.e);
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean i() {
        List enabledAccessibilityServiceList = this.j.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }
}
