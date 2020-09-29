package defpackage;

import android.view.View;

/* renamed from: uui reason: default package */
public final class uui {
    private static uuq<Float> a;
    private static uuq<Float> b = uuq.a(Float.valueOf(0.99f));
    private static uuq<Float> c = uuq.a(Float.valueOf(0.96f));
    private static uuq<Float> d;

    static {
        Float valueOf = Float.valueOf(0.97f);
        a = uuq.a(valueOf);
        d = uuq.a(valueOf);
    }

    public static uug a(View view) {
        return new uug(view, ((Float) a.a()).floatValue());
    }

    public static uug b(View view) {
        return new uug(view, ((Float) b.a()).floatValue());
    }

    public static uug c(View view) {
        return new uug(view, ((Float) c.a()).floatValue());
    }

    public static uug d(View view) {
        return new uug(view, ((Float) d.a()).floatValue());
    }
}
