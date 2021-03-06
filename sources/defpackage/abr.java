package defpackage;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: abr reason: default package */
public abstract class abr extends ValueAnimator {
    final Set<AnimatorListener> a = new CopyOnWriteArraySet();
    private final Set<AnimatorUpdateListener> b = new CopyOnWriteArraySet();

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.b.add(animatorUpdateListener);
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.b.remove(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        this.b.clear();
    }

    public void addListener(AnimatorListener animatorListener) {
        this.a.add(animatorListener);
    }

    public void removeListener(AnimatorListener animatorListener) {
        this.a.remove(animatorListener);
    }

    public void removeAllListeners() {
        this.a.clear();
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        for (AnimatorListener animatorListener : this.a) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        for (AnimatorUpdateListener onAnimationUpdate : this.b) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }
}
