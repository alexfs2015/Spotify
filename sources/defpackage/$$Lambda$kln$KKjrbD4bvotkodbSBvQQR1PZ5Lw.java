package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: -$$Lambda$kln$KKjrbD4bvotkodbSBvQQR1PZ5Lw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kln$KKjrbD4bvotkodbSBvQQR1PZ5Lw implements AnimatorUpdateListener {
    private final /* synthetic */ View f$0;

    public /* synthetic */ $$Lambda$kln$KKjrbD4bvotkodbSBvQQR1PZ5Lw(View view) {
        this.f$0 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        kln.a(this.f$0, valueAnimator);
    }
}
