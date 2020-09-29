package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.ColorDrawable;

/* renamed from: -$$Lambda$qlv$2rL4sQHRl-vOVQmJM7SkBFkfZlE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qlv$2rL4sQHRlvOVQmJM7SkBFkfZlE implements AnimatorUpdateListener {
    private final /* synthetic */ qlv f$0;
    private final /* synthetic */ vgo f$1;
    private final /* synthetic */ ColorDrawable f$2;
    private final /* synthetic */ int f$3;

    public /* synthetic */ $$Lambda$qlv$2rL4sQHRlvOVQmJM7SkBFkfZlE(qlv qlv, vgo vgo, ColorDrawable colorDrawable, int i) {
        this.f$0 = qlv;
        this.f$1 = vgo;
        this.f$2 = colorDrawable;
        this.f$3 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, valueAnimator);
    }
}
