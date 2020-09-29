package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

/* renamed from: qf reason: default package */
public final class qf {

    /* renamed from: qf$a */
    public interface a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    public static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }
}
