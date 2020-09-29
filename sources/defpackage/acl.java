package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: acl reason: default package */
public class acl<T> {
    private final xo a;
    public final T b;
    public final T c;
    public final Interpolator d;
    public final float e;
    public Float f;
    public PointF g;
    public PointF h;
    private float i;
    private float j;

    public acl(T t) {
        this.i = Float.MIN_VALUE;
        this.j = Float.MIN_VALUE;
        this.g = null;
        this.h = null;
        this.a = null;
        this.b = t;
        this.c = t;
        this.d = null;
        this.e = Float.MIN_VALUE;
        this.f = Float.valueOf(Float.MAX_VALUE);
    }

    public acl(xo xoVar, T t, T t2, Interpolator interpolator, float f2, Float f3) {
        this.i = Float.MIN_VALUE;
        this.j = Float.MIN_VALUE;
        this.g = null;
        this.h = null;
        this.a = xoVar;
        this.b = t;
        this.c = t2;
        this.d = interpolator;
        this.e = f2;
        this.f = f3;
    }

    public final float a() {
        xo xoVar = this.a;
        if (xoVar == null) {
            return 0.0f;
        }
        if (this.i == Float.MIN_VALUE) {
            this.i = (this.e - xoVar.i) / this.a.b();
        }
        return this.i;
    }

    public final boolean a(float f2) {
        return f2 >= a() && f2 < b();
    }

    public final float b() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.j == Float.MIN_VALUE) {
            if (this.f == null) {
                this.j = 1.0f;
            } else {
                this.j = a() + ((this.f.floatValue() - this.e) / this.a.b());
            }
        }
        return this.j;
    }

    public final boolean c() {
        return this.d == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(this.b);
        sb.append(", endValue=");
        sb.append(this.c);
        sb.append(", startFrame=");
        sb.append(this.e);
        sb.append(", endFrame=");
        sb.append(this.f);
        sb.append(", interpolator=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
