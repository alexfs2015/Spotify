package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;

/* renamed from: dj reason: default package */
public final class dj implements dm {
    private float e(dl dlVar) {
        return f(dlVar).b;
    }

    private static dn f(dl dlVar) {
        return (dn) dlVar.c();
    }

    public final float a(dl dlVar) {
        return f(dlVar).a * 2.0f;
    }

    public final void a() {
    }

    public final void a(dl dlVar, float f) {
        dn f2 = f(dlVar);
        if (f != f2.a) {
            f2.a = f;
            f2.a((Rect) null);
            f2.invalidateSelf();
        }
    }

    public final void a(dl dlVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dlVar.a(new dn(colorStateList, f));
        View d = dlVar.d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        dn f4 = f(dlVar);
        boolean a = dlVar.a();
        boolean b = dlVar.b();
        if (!(f3 == f4.b && f4.c == a && f4.d == b)) {
            f4.b = f3;
            f4.c = a;
            f4.d = b;
            f4.a((Rect) null);
            f4.invalidateSelf();
        }
        d(dlVar);
    }

    public final void a(dl dlVar, ColorStateList colorStateList) {
        dn f = f(dlVar);
        f.a(colorStateList);
        f.invalidateSelf();
    }

    public final float b(dl dlVar) {
        return f(dlVar).a * 2.0f;
    }

    public final float c(dl dlVar) {
        return f(dlVar).a;
    }

    public final void d(dl dlVar) {
        if (!dlVar.a()) {
            dlVar.a(0, 0, 0, 0);
            return;
        }
        float e = e(dlVar);
        float c = c(dlVar);
        int ceil = (int) Math.ceil((double) C0094do.b(e, c, dlVar.b()));
        int ceil2 = (int) Math.ceil((double) C0094do.a(e, c, dlVar.b()));
        dlVar.a(ceil, ceil2, ceil, ceil2);
    }
}
