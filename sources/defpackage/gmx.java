package defpackage;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* renamed from: gmx reason: default package */
public final class gmx extends StateListDrawable {
    private final int a;

    public gmx(Drawable drawable, int i) {
        this.a = i;
        addState(new int[]{16842919}, drawable);
        addState(new int[0], drawable);
    }

    public final boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842919) {
                z = true;
            }
        }
        if (z) {
            setColorFilter(this.a, Mode.SRC_ATOP);
        } else {
            clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
