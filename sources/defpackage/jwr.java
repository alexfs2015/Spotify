package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: jwr reason: default package */
public final class jwr {
    private static final ArgbEvaluator a = new ArgbEvaluator();
    private int b;
    private final long c;
    /* access modifiers changed from: private */
    public final a d;

    /* renamed from: jwr$a */
    public interface a {
        void a(int i);
    }

    public jwr(a aVar) {
        this(-1, 500, aVar);
    }

    public jwr(int i, long j, a aVar) {
        fay.a(j > 0);
        this.b = i;
        this.c = j;
        this.d = (a) fay.a(aVar);
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
                jwr.this.d.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimator.start();
        this.b = i;
    }
}
