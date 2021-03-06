package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.common.base.Optional;
import java.util.List;

/* renamed from: hyi reason: default package */
public final class hyi {
    private AnimatorSet a;

    private void a() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(List<Animator> list, Interpolator interpolator, long j, Optional<AnimatorListener> optional) {
        a();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(interpolator);
        if (optional.b()) {
            animatorSet.addListener((AnimatorListener) optional.c());
        }
        animatorSet.start();
        this.a = animatorSet;
    }

    static Animator a(View view, float... fArr) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, fArr);
    }

    static Animator b(View view, float... fArr) {
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, fArr);
    }
}
