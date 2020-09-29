package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: fxa reason: default package */
public final class fxa extends LayerDrawable implements fww {
    fxa(Drawable[] drawableArr) {
        super(drawableArr);
        fbp.a(true);
    }

    public final void a(int i, float f) {
        if (getDrawable(0) instanceof fww) {
            ((fww) getDrawable(0)).a(i, f);
        }
        if (getDrawable(1) instanceof fww) {
            ((fww) getDrawable(1)).a(i, f);
        }
    }
}
