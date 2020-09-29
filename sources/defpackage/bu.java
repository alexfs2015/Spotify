package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: bu reason: default package */
public final class bu extends bt {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d = null;
    private Mode e = null;
    private boolean f = false;
    private boolean g = false;

    public bu(SeekBar seekBar) {
        super(seekBar);
        this.b = seekBar;
    }

    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        cp a = cp.a(this.b.getContext(), attributeSet, a.T, i, 0);
        Drawable b2 = a.b(a.U);
        if (b2 != null) {
            this.b.setThumb(b2);
        }
        Drawable a2 = a.a(a.V);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = a2;
        if (a2 != null) {
            a2.setCallback(this.b);
            gm.b(a2, ip.f(this.b));
            if (a2.isStateful()) {
                a2.setState(this.b.getDrawableState());
            }
            a();
        }
        this.b.invalidate();
        if (a.f(a.X)) {
            this.e = ca.a(a.a(a.X, -1), this.e);
            this.g = true;
        }
        if (a.f(a.W)) {
            this.d = a.e(a.W);
            this.f = true;
        }
        a.a.recycle();
        a();
    }

    private void a() {
        if (this.c == null) {
            return;
        }
        if (this.f || this.g) {
            this.c = gm.f(this.c.mutate());
            if (this.f) {
                gm.a(this.c, this.d);
            }
            if (this.g) {
                gm.a(this.c, this.e);
            }
            if (this.c.isStateful()) {
                this.c.setState(this.b.getDrawableState());
            }
        }
    }
}
