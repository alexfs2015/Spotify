package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: ezq reason: default package */
public final class ezq {
    public final ArrayList<a> a = new ArrayList<>();
    public a b = null;
    public ValueAnimator c = null;
    private final AnimatorListener d = new AnimatorListenerAdapter() {
        public final void onAnimationEnd(Animator animator) {
            if (ezq.this.c == animator) {
                ezq.this.c = null;
            }
        }
    };

    /* renamed from: ezq$a */
    public static class a {
        public final int[] a;
        public final ValueAnimator b;

        a(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        a aVar = new a(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(aVar);
    }
}
