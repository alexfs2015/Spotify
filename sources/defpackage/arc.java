package defpackage;

/* renamed from: arc reason: default package */
public final class arc {
    public static final arc a = new arc(1.0f);
    public final float b;
    public final float c;
    public final boolean d;
    public final int e;

    private arc(float f) {
        this(1.0f, 1.0f, false);
    }

    public arc(float f, float f2) {
        this(1.0f, 1.0f, false);
    }

    public arc(float f, float f2, boolean z) {
        boolean z2 = true;
        bdl.a(f > 0.0f);
        if (f2 <= 0.0f) {
            z2 = false;
        }
        bdl.a(z2);
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            arc arc = (arc) obj;
            return this.b == arc.b && this.c == arc.c && this.d == arc.d;
        }
    }

    public final int hashCode() {
        return ((((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c)) * 31) + (this.d ? 1 : 0);
    }
}
