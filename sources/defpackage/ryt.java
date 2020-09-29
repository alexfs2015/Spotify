package defpackage;

/* renamed from: ryt reason: default package */
public final class ryt {
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
