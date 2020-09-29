package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.view.View;
import com.spotify.music.R;

/* renamed from: qhz reason: default package */
public final class qhz {
    final Context a;
    View b;
    public ValueAnimator c;
    private final qhx d;
    private ValueAnimator e;
    private int f = -1;

    public qhz(Context context, qhx qhx) {
        this.a = context;
        this.d = qhx;
    }

    public final void a(View view) {
        this.b = (View) fay.a(view);
        a(qhx.a(this.f));
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.f = aVar.a;
        this.c = a(aVar.a, aVar.b);
        this.e = a(aVar.b, aVar.c);
        this.c.setDuration(2500);
        this.e.setDuration(2500);
        this.c.addUpdateListener(new $$Lambda$qhz$EGNLN87jlZHe1f6DPDvuiUYcCk(this));
        a((ValueAnimator) fay.a(this.c));
        this.c.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ValueAnimator valueAnimator) {
        this.e.setCurrentPlayTime(valueAnimator.getCurrentPlayTime());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) ((View) fay.a(this.b)).getWidth(), (float) ((View) fay.a(this.b)).getHeight(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), ((Integer) this.e.getAnimatedValue()).intValue(), TileMode.REPEAT);
        paint.setShader(linearGradient);
        ip.a((View) fay.a(this.b), (Drawable) shapeDrawable);
    }

    private ValueAnimator a(int i, int i2) {
        return ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(fr.c(this.a, i)), Integer.valueOf(fr.c(this.a, i2))});
    }

    private void a(ValueAnimator valueAnimator) {
        valueAnimator.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (!(VERSION.SDK_INT >= 21 && ((PowerManager) qhz.this.a.getSystemService("power")).isPowerSaveMode())) {
                    qhz.this.a(qhx.a(qhz.this.f));
                    return;
                }
                qhz qhz = qhz.this;
                ip.a((View) fay.a(qhz.b), fr.a(qhz.a, (int) R.drawable.bg_free_tier_taste_onboarding_default));
            }
        });
    }
}
