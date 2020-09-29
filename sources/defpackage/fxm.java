package defpackage;

import android.animation.TimeInterpolator;
import java.util.Collections;
import java.util.List;

/* renamed from: fxm reason: default package */
public final class fxm implements fxj {
    TimeInterpolator a;
    List<fxl> b = Collections.emptyList();
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    /* renamed from: fxm$a */
    public static class a {
        final float a;
        final float b;
        final float c;
        final float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }
    }

    public fxm(TimeInterpolator timeInterpolator, float f2, float f3, float f4, float f5, fxl fxl) {
        this.a = timeInterpolator;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        if (fxl != null) {
            this.b = Collections.singletonList(fxl);
        }
    }

    public final float a(float f2) {
        float f3 = this.c;
        float f4 = this.d;
        float a2 = vge.a(this.c, this.d, this.e, this.f, f3 < f4 ? vge.a(f3, f4, f2) : vge.a(f4, f3, f2));
        if (this.a != null) {
            a2 = vge.a(0.0f, 1.0f, this.e, this.f, this.a.getInterpolation(vge.a(this.e, this.f, 0.0f, 1.0f, a2)));
        }
        if (!this.b.isEmpty()) {
            for (fxl a3 : this.b) {
                a3.a(a2);
            }
        }
        return a2;
    }
}
