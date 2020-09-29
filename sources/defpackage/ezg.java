package defpackage;

/* renamed from: ezg reason: default package */
public final class ezg extends fas {
    public float a;
    public float b;
    public float c;
    private float d;
    private float e;

    public ezg(float f, float f2, float f3) {
        this.e = f;
        this.d = f2;
        this.b = f3;
        if (f3 >= 0.0f) {
            this.c = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public final void a(float f, float f2, fau fau) {
        float f3 = f;
        fau fau2 = fau;
        float f4 = this.a;
        if (f4 == 0.0f) {
            fau2.b(f3, 0.0f);
            return;
        }
        float f5 = ((this.e * 2.0f) + f4) / 2.0f;
        float f6 = f2 * this.d;
        float f7 = (f3 / 2.0f) + this.c;
        float f8 = (this.b * f2) + ((1.0f - f2) * f5);
        if (f8 / f5 >= 1.0f) {
            fau2.b(f3, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        float f14 = f11 - f6;
        fau2.b(f14, 0.0f);
        float f15 = f6 * 2.0f;
        float f16 = degrees;
        fau.a(f14, 0.0f, f11 + f6, f15, 270.0f, degrees);
        fau.a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        fau.a(f12 - f6, 0.0f, f12 + f6, f15, 270.0f - f16, f16);
        fau2.b(f3, 0.0f);
    }
}
