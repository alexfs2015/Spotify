package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.wrapped2019.stories.views.PerspectiveImageStack;
import java.util.List;

/* renamed from: kmj reason: default package */
public final class kmj {
    private static Animator a(PerspectiveImageStack perspectiveImageStack, int i, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.1f, 1.0f});
        ofFloat.setDuration(600);
        ofFloat.setInterpolator(kfr.a);
        ofFloat.setStartDelay(j);
        ofFloat.addUpdateListener(new $$Lambda$kmj$JdaNagxa12BY1q84xckPgwsg67w(perspectiveImageStack, i));
        return ofFloat;
    }

    public static Animator a(PerspectiveImageStack perspectiveImageStack, boolean z) {
        return a(perspectiveImageStack, true, perspectiveImageStack.a());
    }

    public static Animator a(final PerspectiveImageStack perspectiveImageStack, boolean z, final int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(z ? a(perspectiveImageStack, i) : b(perspectiveImageStack, i));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                for (int i = 0; i < i; i++) {
                    perspectiveImageStack.a(i, 0.0f);
                }
            }
        });
        return animatorSet;
    }

    private static List<Animator> a(PerspectiveImageStack perspectiveImageStack, int i) {
        a g = ImmutableList.g();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            long j = ((long) (i - i2)) * 200;
            g.c(a(perspectiveImageStack, i2, j));
            g.c(b(perspectiveImageStack, i2, j));
        }
        return g.a();
    }

    public static Animator b(PerspectiveImageStack perspectiveImageStack, boolean z) {
        return b(perspectiveImageStack, true, perspectiveImageStack.a());
    }

    public static Animator b(final PerspectiveImageStack perspectiveImageStack, boolean z, final int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(z ? c(perspectiveImageStack, i) : d(perspectiveImageStack, i));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                for (int i = 0; i < i; i++) {
                    perspectiveImageStack.a(i, 1.0f);
                    perspectiveImageStack.b(i, 1.0f);
                }
            }
        });
        return animatorSet;
    }

    private static ValueAnimator b(PerspectiveImageStack perspectiveImageStack, int i, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(kfr.a);
        ofFloat.setStartDelay(j);
        ofFloat.addUpdateListener(new $$Lambda$kmj$FoBH0dlNU3xQdxbWIrFg26Tvv_A(perspectiveImageStack, i));
        return ofFloat;
    }

    private static List<Animator> b(PerspectiveImageStack perspectiveImageStack, int i) {
        a g = ImmutableList.g();
        for (int i2 = 0; i2 < i; i2++) {
            long j = ((long) i2) * 200;
            g.c(a(perspectiveImageStack, i2, j));
            g.c(b(perspectiveImageStack, i2, j));
        }
        return g.a();
    }

    private static Animator c(PerspectiveImageStack perspectiveImageStack, int i, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.1f});
        ofFloat.setDuration(600);
        ofFloat.setInterpolator(kfr.a);
        ofFloat.setStartDelay(j);
        ofFloat.addUpdateListener(new $$Lambda$kmj$gIOdqvmJAHphLUqniWit9rHjbFE(perspectiveImageStack, i));
        return ofFloat;
    }

    private static List<Animator> c(PerspectiveImageStack perspectiveImageStack, int i) {
        a g = ImmutableList.g();
        int i2 = i - 1;
        for (int i3 = i2; i3 >= 0; i3--) {
            long j = ((long) (i2 - i3)) * 150;
            g.c(c(perspectiveImageStack, i3, j));
            g.c(d(perspectiveImageStack, i3, j));
        }
        return g.a();
    }

    private static ValueAnimator d(PerspectiveImageStack perspectiveImageStack, int i, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(kfr.a);
        ofFloat.setStartDelay(j);
        ofFloat.addUpdateListener(new $$Lambda$kmj$eonGzvtGZYtEakhBp_SeqjdL8w(perspectiveImageStack, i));
        return ofFloat;
    }

    private static List<Animator> d(PerspectiveImageStack perspectiveImageStack, int i) {
        a g = ImmutableList.g();
        for (int i2 = 0; i2 < i; i2++) {
            long j = ((long) i2) * 150;
            g.c(c(perspectiveImageStack, i2, j));
            g.c(d(perspectiveImageStack, i2, j));
        }
        return g.a();
    }
}
