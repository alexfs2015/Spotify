package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* renamed from: ksn reason: default package */
public final class ksn {
    public static Animator a(View view, e eVar, View view2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float f = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), 0.0f});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(ftn.a);
        ofFloat.addListener(eVar);
        Property property = View.ALPHA;
        float[] fArr = new float[2];
        if (view != view2) {
            f = view2.getAlpha();
        }
        fArr[0] = f;
        fArr[1] = 1.0f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, fArr);
        ofFloat2.setDuration(200);
        ofFloat2.setInterpolator(ftn.b);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        return animatorSet;
    }

    public static Animator a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), 1.0f});
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(ftn.b);
        return ofFloat;
    }

    public static Animator b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), 0.0f});
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(ftn.a);
        return ofFloat;
    }
}
