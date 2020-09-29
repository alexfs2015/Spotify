package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.wrapped2019.stories.views.IsometricImageStack;
import java.util.List;

/* renamed from: kmi reason: default package */
public final class kmi {
    public static Animator a(IsometricImageStack isometricImageStack, int i, final Runnable runnable, gcp<Float> gcp) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(150);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                runnable.run();
            }
        });
        ofFloat.addUpdateListener(new $$Lambda$kmi$R_pTpKoKcgR70AyPa4P0QskTJlk(isometricImageStack, i, gcp));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(150);
        ofFloat2.setStartDelay(4000);
        ofFloat2.addUpdateListener(new $$Lambda$kmi$SzjKZZBdv49Pfw9nru7P2Ra_Oyw(isometricImageStack, i, gcp));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        return animatorSet;
    }

    public static List<Animator> a(IsometricImageStack isometricImageStack, int i) {
        a g = ImmutableList.g();
        for (int i2 = 0; i2 < i; i2++) {
            long j = ((long) ((i - 1) - i2)) * 150;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration(600);
            ofFloat.setInterpolator(kfr.a);
            ofFloat.setStartDelay(j);
            ofFloat.addUpdateListener(new $$Lambda$kmi$_ostFVWfEnTuZfMzZWTpsKopRqA(isometricImageStack, i2));
            g.c(ofFloat);
        }
        return g.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(IsometricImageStack isometricImageStack, int i, gcp gcp, ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        isometricImageStack.b(i, f.floatValue());
        gcp.accept(f);
    }

    public static List<Animator> b(IsometricImageStack isometricImageStack, int i) {
        a g = ImmutableList.g();
        for (int i2 = 0; i2 < i; i2++) {
            long j = ((long) ((i - 1) - i2)) * 50;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, -1.0f});
            ofFloat.setDuration(600);
            ofFloat.setInterpolator(kfr.a);
            ofFloat.setStartDelay(j);
            ofFloat.addUpdateListener(new $$Lambda$kmi$7zfiYsz6TcpKwmiBTHk8i7i97Q(isometricImageStack, i2));
            g.c(ofFloat);
        }
        return g.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(IsometricImageStack isometricImageStack, int i, gcp gcp, ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        isometricImageStack.b(i, f.floatValue());
        gcp.accept(f);
    }
}
