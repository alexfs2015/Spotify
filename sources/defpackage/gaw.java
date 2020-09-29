package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: gaw reason: default package */
public final class gaw {
    public static void a(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void a(View view, long j) {
        if (view.getVisibility() != 0) {
            view.clearAnimation();
            view.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(fuh.d);
            alphaAnimation.setDuration(j);
            view.startAnimation(alphaAnimation);
        }
    }

    public static void a(final View view, final View view2) {
        view.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                view.setAlpha(1.0f);
                view.setVisibility(4);
                view2.setVisibility(0);
                view2.setAlpha(0.0f);
                view2.animate().setListener(null).alpha(1.0f).start();
            }
        }).start();
    }

    public static <V extends View> void a(final V v, final gcp<V> gcp, final boolean z) {
        fbp.a(v);
        fbp.a(gcp);
        final ViewTreeObserver viewTreeObserver = v.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                gcp.accept(v);
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                } else {
                    v.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return z;
            }
        });
    }

    public static boolean a(View view) {
        return view.isEnabled() && view.isClickable() && view.performClick();
    }

    public static void b(final View view, final int i) {
        fbp.a(i == 4 || i == 8);
        if (view.getVisibility() != i) {
            view.clearAnimation();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(fuh.d);
            alphaAnimation.setDuration(400);
            alphaAnimation.setAnimationListener(new jzf() {
                public final void onAnimationEnd(Animation animation) {
                    view.setVisibility(i);
                }
            });
            view.startAnimation(alphaAnimation);
        }
    }

    public static boolean b(View view) {
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void c(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }

    public static void d(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
                return;
            }
            StringBuilder sb = new StringBuilder("Parent is not a ViewGroup: ");
            sb.append(parent);
            Assertion.a(sb.toString());
        }
    }
}
