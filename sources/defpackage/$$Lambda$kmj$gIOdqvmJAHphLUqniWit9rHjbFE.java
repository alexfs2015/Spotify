package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.spotify.mobile.android.wrapped2019.stories.views.PerspectiveImageStack;

/* renamed from: -$$Lambda$kmj$gIOdqvmJAHphLUqniWit9rHjbFE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kmj$gIOdqvmJAHphLUqniWit9rHjbFE implements AnimatorUpdateListener {
    private final /* synthetic */ PerspectiveImageStack f$0;
    private final /* synthetic */ int f$1;

    public /* synthetic */ $$Lambda$kmj$gIOdqvmJAHphLUqniWit9rHjbFE(PerspectiveImageStack perspectiveImageStack, int i) {
        this.f$0 = perspectiveImageStack;
        this.f$1 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.b(this.f$1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
