package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: jyt reason: default package */
public final class jyt {
    private static final ArgbEvaluator a = new ArgbEvaluator();
    private int b;
    private final long c;
    /* access modifiers changed from: private */
    public final a d;

    /* renamed from: jyt$a */
    public interface a {
        void a(int i);
    }

    public jyt(int i, long j, a aVar) {
        fbp.a(j > 0);
        this.b = i;
        this.c = j;
        this.d = (a) fbp.a(aVar);
    }

    public jyt(a aVar) {
        this(-1, 500, aVar);
    }

    public final void a(int i) {
        this.d.a(i);
        this.b = i;
    }

    public final void b(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{this.b, i});
        valueAnimator.setEvaluator(a);
        valueAnimator.setDuration(this.c);
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                jyt.this.d.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimator.start();
        this.b = i;
    }
}
