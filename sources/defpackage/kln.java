package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import com.spotify.mobile.android.wrapped2019.stories.templates.topgenres.GenreBarView;

/* renamed from: kln reason: default package */
final class kln {
    static Animator a(View view, int i, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{view.getResources().getDimension(i), 0.0f});
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new $$Lambda$kln$P3U7lkpCEA6gy9YDydw8bL7wgg(view));
        ofFloat.setTarget(view);
        return ofFloat;
    }

    static Animator a(View view, long j) {
        return ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}).setDuration(j);
    }

    static Animator a(GenreBarView genreBarView, int i, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, genreBarView.getResources().getDimension(i)});
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new $$Lambda$kln$KKjrbD4bvotkodbSBvQQR1PZ5Lw(genreBarView));
        ofFloat.setTarget(genreBarView);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        Animator b = b(genreBarView.b(), 300);
        Animator b2 = b((View) genreBarView.c(), 300);
        b2.setInterpolator(kfr.b);
        b.setStartDelay(2000);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, b, b2});
        return animatorSet;
    }

    /* access modifiers changed from: private */
    public static void a(View view, ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = f.intValue();
        view.setLayoutParams(layoutParams);
    }

    private static Animator b(View view, long j) {
        return ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
    }
}
