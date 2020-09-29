package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;

/* renamed from: suv reason: default package */
public final class suv {
    private static Animator a(View view, int i, int i2) {
        return ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) i, (float) i2});
    }

    private static Animator a(View view, int i, int i2, float f, float f2) {
        Animator a = a(view, i, i2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{f, f2});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, ofFloat});
        return animatorSet;
    }

    private static Animator a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        Animator a = a(view, i, i2);
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("width", new int[]{i5, i6}), PropertyValuesHolder.ofInt("height", new int[]{i3, i4})});
        ofPropertyValuesHolder.addUpdateListener(new $$Lambda$suv$55Edm1nAm4t1Ih1je1HqDOrYPPU(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, a});
        return animatorSet;
    }

    public static void a(AnimatorSet animatorSet, Bundle bundle, View view, View view2, View view3) {
        int i = bundle.getInt("start_y");
        int i2 = bundle.getInt("start_height");
        int i3 = bundle.getInt("start_width");
        int height = view3.getHeight();
        Animator a = a(view, 0, i, view.getHeight(), i2, view.getWidth(), i3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        Animator a2 = a(view2, 0, i - ((int) view2.getY()), 1.0f, 0.0f);
        Animator a3 = a(view3, 0, -height);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        animatorSet.playTogether(new Animator[]{a, ofFloat, a2, a3});
        animatorSet.setDuration(350);
    }

    public static void a(AnimatorSet animatorSet, Bundle bundle, View view, View view2, View view3, View view4, View view5, int i) {
        int i2 = bundle.getInt("start_y");
        int i3 = bundle.getInt("start_height");
        int i4 = bundle.getInt("end_height");
        int i5 = bundle.getInt("start_width");
        int i6 = bundle.getInt("end_width");
        int height = view3.getHeight();
        Animator a = a(view, i2, 0, i3, i4 + (height << 1), i5, i6);
        int i7 = (i2 - height) + i;
        animatorSet.playTogether(new Animator[]{a, a(view2, i7, 0, 0.0f, 1.0f), a(view3, -height, 0), a(view4, i7, 0, 0.0f, 1.0f), a(view5, i7, 0, 0.0f, 1.0f)});
        animatorSet.setDuration(350);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(View view, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("width")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("height")).intValue();
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = intValue;
        layoutParams.height = intValue2;
        view.setLayoutParams(layoutParams);
    }
}
