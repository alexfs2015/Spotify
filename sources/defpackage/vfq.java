package defpackage;

import android.animation.Animator;

/* renamed from: vfq reason: default package */
public final class vfq {
    private static vgh<Float> a = vgh.a(Float.valueOf(1.0f));
    private static final float[] b = {0.0f, 1.0f};

    public static Animator a(vfr vfr) {
        vfs vfs = new vfs(vfr);
        vfs.setFloatValues(b);
        vfs.setDuration((long) (((float) vfr.b()) * ((Float) a.a()).floatValue()));
        return vfs;
    }
}
