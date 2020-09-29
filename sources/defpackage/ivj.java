package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;

/* renamed from: ivj reason: default package */
public final class ivj {
    public static void a(CharSequence charSequence, TextView textView) {
        jsg.a(textView, new $$Lambda$ivj$h7ENBYRGDZncdtFr06CCn_I0pXU(charSequence));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(final CharSequence charSequence, final TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(150);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                textView.setText(charSequence);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(150);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }
}
