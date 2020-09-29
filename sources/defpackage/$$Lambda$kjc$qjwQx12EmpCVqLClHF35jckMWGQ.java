package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: -$$Lambda$kjc$qjwQx12EmpCVqLClHF35jckMWGQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kjc$qjwQx12EmpCVqLClHF35jckMWGQ implements AnimatorUpdateListener {
    private final /* synthetic */ View f$0;
    private final /* synthetic */ float f$1;
    private final /* synthetic */ int f$2;
    private final /* synthetic */ int f$3;

    public /* synthetic */ $$Lambda$kjc$qjwQx12EmpCVqLClHF35jckMWGQ(View view, float f, int i, int i2) {
        this.f$0 = view;
        this.f$1 = f;
        this.f$2 = i;
        this.f$3 = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        kjc.a(this.f$0, this.f$1, this.f$2, this.f$3, valueAnimator);
    }
}
