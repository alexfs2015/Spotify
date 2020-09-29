package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: bs reason: default package */
public final class bs {
    private final ImageView a;
    private cn b;
    private cn c;

    public bs(ImageView imageView) {
        this.a = imageView;
    }

    public final void a(AttributeSet attributeSet, int i) {
        cp a2 = cp.a(this.a.getContext(), attributeSet, a.P, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null) {
                int g = a2.g(a.Q, -1);
                if (g != -1) {
                    drawable = ab.b(this.a.getContext(), g);
                    if (drawable != null) {
                        this.a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                ca.b(drawable);
            }
            if (a2.f(a.R)) {
                jj.a(this.a, a2.e(a.R));
            }
            if (a2.f(a.S)) {
                jj.a(this.a, ca.a(a2.a(a.S, -1), null));
            }
        } finally {
            a2.a.recycle();
        }
    }

    public final void a(int i) {
        if (i != 0) {
            Drawable b2 = ab.b(this.a.getContext(), i);
            if (b2 != null) {
                ca.b(b2);
            }
            this.a.setImageDrawable(b2);
        } else {
            this.a.setImageDrawable(null);
        }
        d();
    }

    public final boolean a() {
        return VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public final void a(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new cn();
        }
        cn cnVar = this.b;
        cnVar.a = colorStateList;
        cnVar.d = true;
        d();
    }

    public final ColorStateList b() {
        cn cnVar = this.b;
        if (cnVar != null) {
            return cnVar.a;
        }
        return null;
    }

    public final void a(Mode mode) {
        if (this.b == null) {
            this.b = new cn();
        }
        cn cnVar = this.b;
        cnVar.b = mode;
        cnVar.c = true;
        d();
    }

    public final Mode c() {
        cn cnVar = this.b;
        if (cnVar != null) {
            return cnVar.b;
        }
        return null;
    }

    public final void d() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            ca.b(drawable);
        }
        if (drawable != null && (!e() || !a(drawable))) {
            cn cnVar = this.b;
            if (cnVar != null) {
                bq.a(drawable, cnVar, this.a.getDrawableState());
            }
        }
    }

    private boolean e() {
        int i = VERSION.SDK_INT;
        return i <= 21 && i == 21;
    }

    private boolean a(Drawable drawable) {
        if (this.c == null) {
            this.c = new cn();
        }
        cn cnVar = this.c;
        cnVar.a();
        ColorStateList a2 = jj.a(this.a);
        if (a2 != null) {
            cnVar.d = true;
            cnVar.a = a2;
        }
        Mode b2 = jj.b(this.a);
        if (b2 != null) {
            cnVar.c = true;
            cnVar.b = b2;
        }
        if (!cnVar.d && !cnVar.c) {
            return false;
        }
        bq.a(drawable, cnVar, this.a.getDrawableState());
        return true;
    }
}
