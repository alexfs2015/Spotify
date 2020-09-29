package defpackage;

/* renamed from: gw reason: default package */
public final class gw {
    public static float a(float f, float f2, float f3) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static int a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }
}
