package defpackage;

import android.animation.Animator;

/* renamed from: utz reason: default package */
public final class utz {
    private static uuq<Float> a = uuq.a(Float.valueOf(1.0f));
    private static final float[] b = {0.0f, 1.0f};

    public static Animator a(uua uua) {
        uub uub = new uub(uua);
        uub.setFloatValues(b);
        uub.setDuration((long) (((float) uua.b()) * ((Float) a.a()).floatValue()));
        return uub;
    }
}
