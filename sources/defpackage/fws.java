package defpackage;

import android.animation.TimeInterpolator;
import java.util.Collections;
import java.util.List;

/* renamed from: fws reason: default package */
public final class fws implements fwp {
    TimeInterpolator a;
    List<fwr> b = Collections.emptyList();
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    /* renamed from: fws$a */
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

    public fws(TimeInterpolator timeInterpolator, float f2, float f3, float f4, float f5, fwr fwr) {
        this.a = timeInterpolator;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        if (fwr != null) {
            this.b = Collections.singletonList(fwr);
        }
    }

    public final float a(float f2) {
        float f3;
        float f4 = this.c;
        float f5 = this.d;
        if (f4 < f5) {
            f3 = uun.a(f4, f5, f2);
        } else {
            f3 = uun.a(f5, f4, f2);
        }
        float a2 = uun.a(this.c, this.d, this.e, this.f, f3);
        if (this.a != null) {
            a2 = uun.a(0.0f, 1.0f, this.e, this.f, this.a.getInterpolation(uun.a(this.e, this.f, 0.0f, 1.0f, a2)));
        }
        if (!this.b.isEmpty()) {
            for (fwr a3 : this.b) {
                a3.a(a2);
            }
        }
        return a2;
    }
}
