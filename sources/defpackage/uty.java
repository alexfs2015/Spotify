package defpackage;

import android.view.animation.Interpolator;

/* renamed from: uty reason: default package */
public final class uty {
    private final float a;
    private final float b;
    private final Interpolator c;
    private final float d;
    private final float e;

    public uty(float f, float f2, float f3, float f4, Interpolator interpolator) {
        boolean z = true;
        fay.a(f >= 0.0f && f < 1.0f);
        fay.a(f2 > 0.0f);
        float f5 = f2 + f;
        if (f5 > 1.0f) {
            z = false;
        }
        fay.a(z);
        this.a = f;
        this.b = f5;
        this.d = f3;
        this.e = f4;
        this.c = interpolator;
    }

    public final float a(float f) {
        boolean z = true;
        boolean z2 = f >= 0.0f;
        if (f > 1.0f) {
            z = false;
        }
        fay.a(z2, (Object) Boolean.valueOf(z));
        return uun.c(this.d, this.e, this.c.getInterpolation(uun.a(0.0f, 1.0f, uun.b(this.a, this.b, f))));
    }
}
