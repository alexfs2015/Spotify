package defpackage;

/* renamed from: aql reason: default package */
public final class aql {
    public static final aql a = new aql(1.0f);
    public final float b;
    public final float c;
    public final boolean d;
    public final int e;

    private aql(float f) {
        this(1.0f, 1.0f, false);
    }

    public aql(float f, float f2) {
        this(1.0f, 1.0f, false);
    }

    public aql(float f, float f2, boolean z) {
        boolean z2 = true;
        bcu.a(f > 0.0f);
        if (f2 <= 0.0f) {
            z2 = false;
        }
        bcu.a(z2);
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
            aql aql = (aql) obj;
            return this.b == aql.b && this.c == aql.c && this.d == aql.d;
        }
    }

    public final int hashCode() {
        return ((((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c)) * 31) + (this.d ? 1 : 0);
    }
}
