package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.spotify.music.R;

/* renamed from: qw reason: default package */
public final class qw {

    /* renamed from: qw$a */
    static class a extends AnimatorListenerAdapter {
        private final View a;
        private final View b;
        private final int c;
        private final int d;
        private int[] e = ((int[]) this.a.getTag(R.id.transition_position));
        private float f;
        private float g;
        private final float h;
        private final float i;

        a(View view, View view2, int i2, int i3, float f2, float f3) {
            this.b = view;
            this.a = view2;
            this.c = i2 - Math.round(this.b.getTranslationX());
            this.d = i3 - Math.round(this.b.getTranslationY());
            this.h = f2;
            this.i = f3;
            if (this.e != null) {
                this.a.setTag(R.id.transition_position, null);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.e == null) {
                this.e = new int[2];
            }
            this.e[0] = Math.round(((float) this.c) + this.b.getTranslationX());
            this.e[1] = Math.round(((float) this.d) + this.b.getTranslationY());
            this.a.setTag(R.id.transition_position, this.e);
        }

        public final void onAnimationEnd(Animator animator) {
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
        }

        public final void onAnimationPause(Animator animator) {
            this.f = this.b.getTranslationX();
            this.g = this.b.getTranslationY();
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
        }

        public final void onAnimationResume(Animator animator) {
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }
    }

    public static Animator a(View view, qu quVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        View view2 = view;
        qu quVar2 = quVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) quVar2.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        a aVar = new a(view, quVar2.b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(aVar);
        qa.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
