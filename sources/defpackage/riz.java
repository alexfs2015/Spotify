package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* renamed from: riz reason: default package */
public final class riz {
    public ValueAnimator a;
    private final Drawable b;

    public riz(Drawable drawable) {
        this.b = drawable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.b.invalidateSelf();
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a = null;
        }
        this.a = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.a.setDuration(400);
        this.a.setInterpolator(ftn.b);
        this.a.addUpdateListener(new $$Lambda$riz$ALFogEmJxeD_aGbcFMpGL1TwLBc(this));
        if (z) {
            this.a.start();
        } else {
            this.a.end();
        }
        this.b.invalidateSelf();
    }
}
