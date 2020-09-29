package defpackage;

import android.animation.Animator.AnimatorListener;
import android.os.Build.VERSION;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: abt reason: default package */
public final class abt extends abr implements FrameCallback {
    public float b = 1.0f;
    public long c = 0;
    public float d = 0.0f;
    public float e = -2.14748365E9f;
    public float f = 2.14748365E9f;
    public xa g;
    private boolean h = false;
    private int i = 0;
    private boolean j = false;

    public final Object getAnimatedValue() {
        return Float.valueOf(b());
    }

    public final float b() {
        xa xaVar = this.g;
        if (xaVar == null) {
            return 0.0f;
        }
        return (this.d - xaVar.i) / (this.g.j - this.g.i);
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

    public final long getDuration() {
        xa xaVar = this.g;
        if (xaVar == null) {
            return 0;
        }
        return (long) xaVar.a();
    }

    public final boolean isRunning() {
        return this.j;
    }

    public final void doFrame(long j2) {
        float f2;
        k();
        if (this.g != null && isRunning()) {
            long nanoTime = System.nanoTime();
            long j3 = nanoTime - this.c;
            xa xaVar = this.g;
            if (xaVar == null) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = (1.0E9f / xaVar.k) / Math.abs(this.b);
            }
            float f3 = ((float) j3) / f2;
            float f4 = this.d;
            if (h()) {
                f3 = -f3;
            }
            this.d = f4 + f3;
            float f5 = this.d;
            boolean z = !(f5 >= i() && f5 <= j());
            this.d = abv.a(this.d, i(), j());
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
                float f6 = this.d;
                if (f6 < this.e || f6 > this.f) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.d)}));
                }
            }
        }
    }

    public final void c() {
        this.g = null;
        this.e = -2.14748365E9f;
        this.f = 2.14748365E9f;
    }

    public final void a(int i2) {
        float f2 = (float) i2;
        if (this.d != f2) {
            this.d = abv.a(f2, i(), j());
            this.c = System.nanoTime();
            a();
        }
    }

    public final void a(int i2, int i3) {
        xa xaVar = this.g;
        float f2 = xaVar == null ? -3.4028235E38f : xaVar.i;
        xa xaVar2 = this.g;
        float f3 = xaVar2 == null ? Float.MAX_VALUE : xaVar2.j;
        float f4 = (float) i2;
        this.e = abv.a(f4, f2, f3);
        float f5 = (float) i3;
        this.f = abv.a(f5, f2, f3);
        a((int) abv.a(this.d, f4, f5));
    }

    public final void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.h) {
            this.h = false;
            g();
        }
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

    private float i() {
        xa xaVar = this.g;
        if (xaVar == null) {
            return 0.0f;
        }
        float f2 = this.e;
        return f2 == -2.14748365E9f ? xaVar.i : f2;
    }

    private float j() {
        xa xaVar = this.g;
        if (xaVar == null) {
            return 0.0f;
        }
        float f2 = this.f;
        return f2 == 2.14748365E9f ? xaVar.j : f2;
    }

    private void k() {
        if (isRunning()) {
            b(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    private void b(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.j = false;
        }
    }

    private void g() {
        this.b = -this.b;
    }

    public final void e() {
        b(true);
        a(h());
    }

    public final void f() {
        b(true);
    }

    public final void cancel() {
        for (AnimatorListener onAnimationCancel : this.a) {
            onAnimationCancel.onAnimationCancel(this);
        }
        b(true);
    }

    private boolean h() {
        return this.b < 0.0f;
    }
}
