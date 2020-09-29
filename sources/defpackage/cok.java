package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;

@cey
/* renamed from: cok reason: default package */
public final class cok {
    Activity a;
    private final View b;
    private boolean c;
    private boolean d;
    private boolean e;
    private OnGlobalLayoutListener f;
    private OnScrollChangedListener g;

    public cok(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.a = activity;
        this.b = view;
        this.f = onGlobalLayoutListener;
        this.g = onScrollChangedListener;
    }

    private static ViewTreeObserver a(Activity activity) {
        if (activity == null) {
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void e() {
        if (!this.c) {
            OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.a;
                if (activity != null) {
                    ViewTreeObserver a2 = a(activity);
                    if (a2 != null) {
                        a2.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
                bjl.A();
                cqk.a(this.b, this.f);
            }
            OnScrollChangedListener onScrollChangedListener = this.g;
            if (onScrollChangedListener != null) {
                Activity activity2 = this.a;
                if (activity2 != null) {
                    ViewTreeObserver a3 = a(activity2);
                    if (a3 != null) {
                        a3.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
                bjl.A();
                cqk.a(this.b, this.g);
            }
            this.c = true;
        }
    }

    private final void f() {
        Activity activity = this.a;
        if (activity != null && this.c) {
            OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            if (onGlobalLayoutListener != null) {
                ViewTreeObserver a2 = a(activity);
                if (a2 != null) {
                    bjl.g().a(a2, onGlobalLayoutListener);
                }
            }
            OnScrollChangedListener onScrollChangedListener = this.g;
            if (onScrollChangedListener != null) {
                ViewTreeObserver a3 = a(this.a);
                if (a3 != null) {
                    a3.removeOnScrollChangedListener(onScrollChangedListener);
                }
            }
            this.c = false;
        }
    }

    public final void a() {
        this.e = true;
        if (this.d) {
            e();
        }
    }

    public final void b() {
        this.e = false;
        f();
    }

    public final void c() {
        this.d = true;
        if (this.e) {
            e();
        }
    }

    public final void d() {
        this.d = false;
        f();
    }
}
