package defpackage;

import android.view.View;

/* renamed from: vfz reason: default package */
public final class vfz {
    private static vgh<Float> a;
    private static vgh<Float> b = vgh.a(Float.valueOf(0.99f));
    private static vgh<Float> c = vgh.a(Float.valueOf(0.96f));
    private static vgh<Float> d;

    static {
        Float valueOf = Float.valueOf(0.97f);
        a = vgh.a(valueOf);
        d = vgh.a(valueOf);
    }

    public static vfx a(View view) {
        return new vfx(view, ((Float) a.a()).floatValue());
    }

    public static vfx b(View view) {
        return new vfx(view, ((Float) b.a()).floatValue());
    }

    public static vfx c(View view) {
        return new vfx(view, ((Float) c.a()).floatValue());
    }

    public static vfx d(View view) {
        return new vfx(view, ((Float) d.a()).floatValue());
    }
}
