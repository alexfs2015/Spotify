package defpackage;

/* renamed from: sid reason: default package */
public final class sid {
    public static float a(int i) {
        float f = ((float) i) / 100.0f;
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
