package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

/* renamed from: gr reason: default package */
final class gr extends ConstantState {
    int a;
    ConstantState b;
    ColorStateList c = null;
    Mode d = gp.a;

    gr(gr grVar) {
        if (grVar != null) {
            this.a = grVar.a;
            this.b = grVar.b;
            this.c = grVar.c;
            this.d = grVar.d;
        }
    }

    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    public final Drawable newDrawable(Resources resources) {
        if (VERSION.SDK_INT >= 21) {
            return new gq(this, resources);
        }
        return new gp(this, resources);
    }

    public final int getChangingConfigurations() {
        int i = this.a;
        ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }
}
