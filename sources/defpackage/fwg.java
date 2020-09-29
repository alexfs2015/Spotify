package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: fwg reason: default package */
public final class fwg extends LayerDrawable implements fwc {
    fwg(Drawable[] drawableArr) {
        super(drawableArr);
        fay.a(true);
    }

    public final void a(int i, float f) {
        if (getDrawable(0) instanceof fwc) {
            ((fwc) getDrawable(0)).a(i, f);
        }
        if (getDrawable(1) instanceof fwc) {
            ((fwc) getDrawable(1)).a(i, f);
        }
    }
}
