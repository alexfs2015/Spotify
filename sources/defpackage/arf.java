package defpackage;

/* renamed from: arf reason: default package */
public final class arf {
    public final int a = 0;
    public final float b = 0.0f;

    public arf(int i, float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            arf arf = (arf) obj;
            return this.a == arf.a && Float.compare(arf.b, this.b) == 0;
        }
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Float.floatToIntBits(this.b);
    }
}
