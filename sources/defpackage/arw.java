package defpackage;

/* renamed from: arw reason: default package */
public final class arw {
    public final int a = 0;
    public final float b = 0.0f;

    public arw(int i, float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            arw arw = (arw) obj;
            return this.a == arw.a && Float.compare(arw.b, this.b) == 0;
        }
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Float.floatToIntBits(this.b);
    }
}
