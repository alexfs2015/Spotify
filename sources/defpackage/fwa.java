package defpackage;

/* renamed from: fwa reason: default package */
public final class fwa implements fwb {
    private final fse a;
    private float b = -1.0f;

    public fwa(fse fse) {
        this.a = fse;
    }

    public final void a(float f) {
        float max = Math.max(0.0f, (f * 4.0f) - 1.0f) / 3.0f;
        if (Math.abs(this.b - max) >= 0.01f) {
            this.b = max;
            this.a.a(max);
        }
    }
}
