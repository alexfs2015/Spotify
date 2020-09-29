package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import com.google.android.material.button.MaterialButton;

/* renamed from: eyv reason: default package */
public final class eyv {
    public static final boolean a = (VERSION.SDK_INT >= 21);
    public final MaterialButton b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public final Paint m = new Paint(1);
    public final Rect n = new Rect();
    public final RectF o = new RectF();
    public GradientDrawable p;
    public Drawable q;
    public GradientDrawable r;
    public Drawable s;
    public GradientDrawable t;
    public GradientDrawable u;
    public GradientDrawable v;
    public boolean w = false;

    public eyv(MaterialButton materialButton) {
        this.b = materialButton;
    }

    public InsetDrawable a(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
        return insetDrawable;
    }

    public void a() {
        GradientDrawable gradientDrawable = this.t;
        if (gradientDrawable != null) {
            gm.a((Drawable) gradientDrawable, this.j);
            Mode mode = this.i;
            if (mode != null) {
                gm.a((Drawable) this.t, mode);
            }
        }
    }
}
