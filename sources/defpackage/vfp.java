package defpackage;

import android.view.animation.Interpolator;

/* renamed from: vfp reason: default package */
public final class vfp {
    private final float a;
    private final float b;
    private final Interpolator c;
    private final float d;
    private final float e;

    public vfp(float f, float f2, float f3, float f4, Interpolator interpolator) {
        boolean z = true;
        fbp.a(f >= 0.0f && f < 1.0f);
        fbp.a(f2 > 0.0f);
        float f5 = f2 + f;
        if (f5 > 1.0f) {
            z = false;
        }
        fbp.a(z);
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
        fbp.a(z2, (Object) Boolean.valueOf(z));
        return vge.c(this.d, this.e, this.c.getInterpolation(vge.a(0.0f, 1.0f, vge.b(this.a, this.b, f))));
    }
}
