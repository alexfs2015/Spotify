package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: tug reason: default package */
public final class tug {
    public static void a(View view) {
        if (view.getVisibility() != 0) {
            view.setTranslationY((float) view.getHeight());
            view.setAlpha(0.0f);
            view.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{(float) view.getMeasuredHeight(), 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
            ofFloat.setInterpolator(fuh.a);
            ofFloat2.setInterpolator(fuh.a);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.setDuration(300);
            animatorSet.start();
        }
    }
}
