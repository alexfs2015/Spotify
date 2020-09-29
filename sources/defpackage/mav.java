package defpackage;

import android.graphics.drawable.shapes.OvalShape;

/* renamed from: mav reason: default package */
public final class mav extends OvalShape {
    private final int a;

    public mav(int i) {
        this.a = i;
    }

    /* access modifiers changed from: protected */
    public final void onResize(float f, float f2) {
        float f3 = ((float) this.a) / 2.0f;
        float f4 = f / 2.0f;
        float f5 = f2 / 2.0f;
        rect().set(f4 - f3, f5 - f3, f4 + f3, f5 + f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mav)) {
            return false;
        }
        return this.a == ((mav) obj).a && super.equals(obj);
    }

    public final int hashCode() {
        return (super.hashCode() * 31) + this.a;
    }
}
