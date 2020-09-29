package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: bo reason: default package */
public final class bo {
    private final View a;
    private final bq b;
    private int c = -1;
    private cn d;
    private cn e;
    private cn f;

    public bo(View view) {
        this.a = view;
        this.b = bq.b();
    }

    public final void a(AttributeSet attributeSet, int i) {
        cp a2 = cp.a(this.a.getContext(), attributeSet, a.dK, i, 0);
        try {
            if (a2.f(a.dL)) {
                this.c = a2.g(a.dL, -1);
                ColorStateList b2 = this.b.b(this.a.getContext(), this.c);
                if (b2 != null) {
                    b(b2);
                }
            }
            if (a2.f(a.dM)) {
                ip.a(this.a, a2.e(a.dM));
            }
            if (a2.f(a.dN)) {
                ip.a(this.a, ca.a(a2.a(a.dN, -1), null));
            }
        } finally {
            a2.a.recycle();
        }
    }

    public final void a(int i) {
        this.c = i;
        bq bqVar = this.b;
        b(bqVar != null ? bqVar.b(this.a.getContext(), i) : null);
        d();
    }

    public final void a() {
        this.c = -1;
        b(null);
        d();
    }

    public final void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new cn();
        }
        cn cnVar = this.e;
        cnVar.a = colorStateList;
        cnVar.d = true;
        d();
    }

    public final ColorStateList b() {
        cn cnVar = this.e;
        if (cnVar != null) {
            return cnVar.a;
        }
        return null;
    }

    public final void a(Mode mode) {
        if (this.e == null) {
            this.e = new cn();
        }
        cn cnVar = this.e;
        cnVar.b = mode;
        cnVar.c = true;
        d();
    }

    public final Mode c() {
        cn cnVar = this.e;
        if (cnVar != null) {
            return cnVar.b;
        }
        return null;
    }

    public final void d() {
        Drawable background = this.a.getBackground();
        if (background != null && (!e() || !a(background))) {
            cn cnVar = this.e;
            if (cnVar != null) {
                bq.a(background, cnVar, this.a.getDrawableState());
                return;
            }
            cn cnVar2 = this.d;
            if (cnVar2 != null) {
                bq.a(background, cnVar2, this.a.getDrawableState());
            }
        }
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new cn();
            }
            cn cnVar = this.d;
            cnVar.a = colorStateList;
            cnVar.d = true;
        } else {
            this.d = null;
        }
        d();
    }

    private boolean e() {
        int i = VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new cn();
        }
        cn cnVar = this.f;
        cnVar.a();
        ColorStateList w = ip.w(this.a);
        if (w != null) {
            cnVar.d = true;
            cnVar.a = w;
        }
        Mode x = ip.x(this.a);
        if (x != null) {
            cnVar.c = true;
            cnVar.b = x;
        }
        if (!cnVar.d && !cnVar.c) {
            return false;
        }
        bq.a(drawable, cnVar, this.a.getDrawableState());
        return true;
    }
}
