package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition.c;
import org.xmlpull.v1.XmlPullParser;

public class Fade extends Visibility {

    static class a extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        a(View view) {
            this.a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            rj.a(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (ip.u(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public Fade() {
    }

    public Fade(int i) {
        b(i);
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qu.d);
        b(gc.a(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "fadingMode", 0, this.a));
        obtainStyledAttributes.recycle();
    }

    private static float a(qz qzVar, float f) {
        if (qzVar == null) {
            return f;
        }
        Float f2 = (Float) qzVar.a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }

    private Animator a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        rj.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, rj.a, new float[]{f2});
        ofFloat.addListener(new a(view));
        a((c) new qv() {
            public final void a(Transition transition) {
                rj.a(view, 1.0f);
                rj.d(view);
                transition.b((c) this);
            }
        });
        return ofFloat;
    }

    public final Animator a(ViewGroup viewGroup, View view, qz qzVar) {
        rj.c(view);
        return a(view, a(qzVar, 1.0f), 0.0f);
    }

    public final Animator a(ViewGroup viewGroup, View view, qz qzVar, qz qzVar2) {
        float f = 0.0f;
        float a2 = a(qzVar, 0.0f);
        if (a2 != 1.0f) {
            f = a2;
        }
        return a(view, f, 1.0f);
    }

    public final void a(qz qzVar) {
        super.a(qzVar);
        qzVar.a.put("android:fade:transitionAlpha", Float.valueOf(rj.b(qzVar.b)));
    }
}
