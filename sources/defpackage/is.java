package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: is reason: default package */
public final class is {
    public WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;
    int d = -1;

    /* renamed from: is$a */
    static class a implements it {
        private is a;
        private boolean b;

        a(is isVar) {
            this.a = isVar;
        }

        public final void a(View view) {
            this.b = false;
            it itVar = null;
            if (this.a.d >= 0) {
                view.setLayerType(2, null);
            }
            if (this.a.b != null) {
                Runnable runnable = this.a.b;
                this.a.b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof it) {
                itVar = (it) tag;
            }
            if (itVar != null) {
                itVar.a(view);
            }
        }

        public final void b(View view) {
            it itVar = null;
            if (this.a.d >= 0) {
                view.setLayerType(this.a.d, null);
                this.a.d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.b) {
                if (this.a.c != null) {
                    Runnable runnable = this.a.c;
                    this.a.c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof it) {
                    itVar = (it) tag;
                }
                if (itVar != null) {
                    itVar.b(view);
                }
                this.b = true;
            }
        }

        public final void c(View view) {
            Object tag = view.getTag(2113929216);
            it itVar = tag instanceof it ? (it) tag : null;
            if (itVar != null) {
                itVar.c(view);
            }
        }
    }

    is(View view) {
        this.a = new WeakReference<>(view);
    }

    public final is a(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final is a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final is b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final is a(Runnable runnable) {
        View view = (View) this.a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                view.animate().withEndAction(runnable);
            } else {
                a(view, new a(this));
                this.c = runnable;
            }
        }
        return this;
    }

    public final long a() {
        View view = (View) this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public final is a(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final is b(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public final is c(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public final is d(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final is e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public final void c() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final is b(Runnable runnable) {
        View view = (View) this.a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                view.animate().withStartAction(runnable);
            } else {
                a(view, new a(this));
                this.b = runnable;
            }
        }
        return this;
    }

    public final is a(it itVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                a(view, itVar);
            } else {
                view.setTag(2113929216, itVar);
                a(view, new a(this));
            }
        }
        return this;
    }

    private void a(final View view, final it itVar) {
        if (itVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    itVar.c(view);
                }

                public final void onAnimationEnd(Animator animator) {
                    itVar.b(view);
                }

                public final void onAnimationStart(Animator animator) {
                    itVar.a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public final is a(final iv ivVar) {
        final View view = (View) this.a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            AnonymousClass2 r1 = null;
            if (ivVar != null) {
                r1 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ivVar.a();
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }
}
