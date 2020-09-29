package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.Map;

/* renamed from: ezr reason: default package */
public final class ezr extends Transition {
    public final void a(qu quVar) {
        d(quVar);
    }

    public final void b(qu quVar) {
        d(quVar);
    }

    private static void d(qu quVar) {
        if (quVar.b instanceof TextView) {
            String str = "android:textscale:scale";
            quVar.a.put(str, Float.valueOf(((TextView) quVar.b).getScaleX()));
        }
    }

    public final Animator a(ViewGroup viewGroup, qu quVar, qu quVar2) {
        ValueAnimator valueAnimator = null;
        if (quVar != null && quVar2 != null && (quVar.b instanceof TextView) && (quVar2.b instanceof TextView)) {
            final TextView textView = (TextView) quVar2.b;
            Map<String, Object> map = quVar.a;
            Map<String, Object> map2 = quVar2.a;
            String str = "android:textscale:scale";
            float f = 1.0f;
            float floatValue = map.get(str) != null ? ((Float) map.get(str)).floatValue() : 1.0f;
            if (map2.get(str) != null) {
                f = ((Float) map2.get(str)).floatValue();
            }
            if (floatValue == f) {
                return null;
            }
            valueAnimator = ValueAnimator.ofFloat(new float[]{floatValue, f});
            valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    textView.setScaleX(floatValue);
                    textView.setScaleY(floatValue);
                }
            });
        }
        return valueAnimator;
    }
}
