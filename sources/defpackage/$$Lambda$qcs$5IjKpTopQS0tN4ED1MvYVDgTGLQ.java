package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.ColorDrawable;

/* renamed from: -$$Lambda$qcs$5IjKpTopQS0tN4ED1MvYVDgTGLQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qcs$5IjKpTopQS0tN4ED1MvYVDgTGLQ implements AnimatorUpdateListener {
    private final /* synthetic */ qcs f$0;
    private final /* synthetic */ uux f$1;
    private final /* synthetic */ ColorDrawable f$2;
    private final /* synthetic */ int f$3;

    public /* synthetic */ $$Lambda$qcs$5IjKpTopQS0tN4ED1MvYVDgTGLQ(qcs qcs, uux uux, ColorDrawable colorDrawable, int i) {
        this.f$0 = qcs;
        this.f$1 = uux;
        this.f$2 = colorDrawable;
        this.f$3 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, valueAnimator);
    }
}
