package defpackage;

import android.graphics.drawable.shapes.OvalShape;

/* renamed from: mey reason: default package */
public final class mey extends OvalShape {
    private final int a;

    public mey(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mey)) {
            return false;
        }
        return this.a == ((mey) obj).a && super.equals(obj);
    }

    public final int hashCode() {
        return (super.hashCode() * 31) + this.a;
    }

    /* access modifiers changed from: protected */
    public final void onResize(float f, float f2) {
        float f3 = ((float) this.a) / 2.0f;
        float f4 = f / 2.0f;
        float f5 = f2 / 2.0f;
        rect().set(f4 - f3, f5 - f3, f4 + f3, f5 + f3);
    }
}
