package defpackage;

/* renamed from: fwu reason: default package */
public final class fwu implements fwv {
    private final fsy a;
    private float b = -1.0f;

    public fwu(fsy fsy) {
        this.a = fsy;
    }

    public final void a(float f) {
        float max = Math.max(0.0f, (f * 4.0f) - 1.0f) / 3.0f;
        if (Math.abs(this.b - max) >= 0.01f) {
            this.b = max;
            this.a.a(max);
        }
    }
}
