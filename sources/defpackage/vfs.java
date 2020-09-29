package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: vfs reason: default package */
final class vfs extends ValueAnimator {
    /* access modifiers changed from: private */
    public final vfr a;
    private final AnimatorUpdateListener b = new AnimatorUpdateListener() {
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            vfs.this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    };

    vfs(vfr vfr) {
        this.a = vfr;
        addUpdateListener(this.b);
    }

    public final void start() {
        this.a.a();
        super.start();
    }
}
