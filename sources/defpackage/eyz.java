package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: eyz reason: default package */
public final class eyz extends Property<ImageView, Matrix> {
    private final Matrix a = new Matrix();

    public eyz() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final /* synthetic */ Object get(Object obj) {
        this.a.set(((ImageView) obj).getImageMatrix());
        return this.a;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
