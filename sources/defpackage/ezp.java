package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewAnimationUtils;

/* renamed from: ezp reason: default package */
public final class ezp {
    public static Animator a(ezr ezr, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(ezr, b.a, a.a, new d[]{new d(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        d c = ezr.c();
        if (c != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) ezr, (int) f, (int) f2, c.c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
