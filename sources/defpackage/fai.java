package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.Map;

/* renamed from: fai reason: default package */
public final class fai extends Transition {
    private static void d(qz qzVar) {
        if (qzVar.b instanceof TextView) {
            String str = "android:textscale:scale";
            qzVar.a.put(str, Float.valueOf(((TextView) qzVar.b).getScaleX()));
        }
    }

    public final Animator a(ViewGroup viewGroup, qz qzVar, qz qzVar2) {
        ValueAnimator valueAnimator = null;
        if (qzVar != null && qzVar2 != null && (qzVar.b instanceof TextView) && (qzVar2.b instanceof TextView)) {
            final TextView textView = (TextView) qzVar2.b;
            Map<String, Object> map = qzVar.a;
            Map<String, Object> map2 = qzVar2.a;
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

    public final void a(qz qzVar) {
        d(qzVar);
    }

    public final void b(qz qzVar) {
        d(qzVar);
    }
}
