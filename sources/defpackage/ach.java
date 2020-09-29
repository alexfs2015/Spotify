package defpackage;

import android.animation.Animator.AnimatorListener;
import android.os.Build.VERSION;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: ach reason: default package */
public final class ach extends acf implements FrameCallback {
    public float b = 1.0f;
    public long c = 0;
    public float d = 0.0f;
    public float e = -2.14748365E9f;
    public float f = 2.14748365E9f;
    public xo g;
    private boolean h = false;
    private int i = 0;
    private boolean j = false;

    private void b(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.j = false;
        }
    }

    private void g() {
        this.b = -this.b;
    }

    private boolean h() {
        return this.b < 0.0f;
    }

    private float i() {
        xo xoVar = this.g;
        if (xoVar == null) {
            return 0.0f;
        }
        float f2 = this.e;
        return f2 == -2.14748365E9f ? xoVar.i : f2;
    }

    private float j() {
        xo xoVar = this.g;
        if (xoVar == null) {
            return 0.0f;
        }
        float f2 = this.f;
        return f2 == 2.14748365E9f ? xoVar.j : f2;
    }

    private void k() {
        if (isRunning()) {
            b(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void a(int i2) {
        float f2 = (float) i2;
        if (this.d != f2) {
            this.d = acj.a(f2, i(), j());
            this.c = System.nanoTime();
            a();
        }
    }

    public final void a(int i2, int i3) {
        xo xoVar = this.g;
        float f2 = xoVar == null ? -3.4028235E38f : xoVar.i;
        xo xoVar2 = this.g;
        float f3 = xoVar2 == null ? Float.MAX_VALUE : xoVar2.j;
        float f4 = (float) i2;
        this.e = acj.a(f4, f2, f3);
        float f5 = (float) i3;
        this.f = acj.a(f5, f2, f3);
        a((int) acj.a(this.d, f4, f5));
    }

    public final float b() {
        xo xoVar = this.g;
        if (xoVar == null) {
            return 0.0f;
        }
        return (this.d - xoVar.i) / (this.g.j - this.g.i);
    }

    public final void c() {
        this.g = null;
        this.e = -2.14748365E9f;
        this.f = 2.14748365E9f;
    }

    public final void cancel() {
        for (AnimatorListener onAnimationCancel : this.a) {
            onAnimationCancel.onAnimationCancel(this);
        }
        b(true);
    }

    public final void d() {
        this.j = true;
        boolean h2 = h();
        for (AnimatorListener animatorListener : this.a) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, h2);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
        a((int) (h() ? j() : i()));
        this.c = System.nanoTime();
        this.i = 0;
        k();
    }

    public final void doFrame(long j2) {
        k();
        if (this.g != null && isRunning()) {
            long nanoTime = System.nanoTime();
            long j3 = nanoTime - this.c;
            xo xoVar = this.g;
            float abs = ((float) j3) / (xoVar == null ? Float.MAX_VALUE : (1.0E9f / xoVar.k) / Math.abs(this.b));
            float f2 = this.d;
            if (h()) {
                abs = -abs;
            }
            this.d = f2 + abs;
            float f3 = this.d;
            boolean z = !(f3 >= i() && f3 <= j());
            this.d = acj.a(this.d, i(), j());
            this.c = nanoTime;
            a();
            if (z) {
                if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
                    for (AnimatorListener onAnimationRepeat : this.a) {
                        onAnimationRepeat.onAnimationRepeat(this);
                    }
                    this.i++;
                    if (getRepeatMode() == 2) {
                        this.h = !this.h;
                        g();
                    } else {
                        this.d = h() ? j() : i();
                    }
                    this.c = nanoTime;
                } else {
                    this.d = j();
                    b(true);
                    a(h());
                }
            }
            if (this.g != null) {
                float f4 = this.d;
                if (f4 < this.e || f4 > this.f) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.d)}));
                }
            }
        }
    }

    public final void e() {
        b(true);
        a(h());
    }

    public final void f() {
        b(true);
    }

    public final float getAnimatedFraction() {
        float i2;
        float j2;
        float i3;
        if (this.g == null) {
            return 0.0f;
        }
        if (h()) {
            i2 = j() - this.d;
            j2 = j();
            i3 = i();
        } else {
            i2 = this.d - i();
            j2 = j();
            i3 = i();
        }
        return i2 / (j2 - i3);
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(b());
    }

    public final long getDuration() {
        xo xoVar = this.g;
        if (xoVar == null) {
            return 0;
        }
        return (long) xoVar.a();
    }

    public final boolean isRunning() {
        return this.j;
    }

    public final void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.h) {
            this.h = false;
            g();
        }
    }
}
