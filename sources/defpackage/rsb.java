package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* renamed from: rsb reason: default package */
public final class rsb {
    public ValueAnimator a;
    private final Drawable b;

    public rsb(Drawable drawable) {
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
        this.a.setInterpolator(fuh.b);
        this.a.addUpdateListener(new $$Lambda$rsb$dcBT8tQyxlSHIMwKwULeCNFbs(this));
        if (z) {
            this.a.start();
        } else {
            this.a.end();
        }
        this.b.invalidateSelf();
    }
}
