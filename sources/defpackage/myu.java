package defpackage;

import android.graphics.Matrix;
import android.widget.ImageView;

/* renamed from: myu reason: default package */
public final class myu implements myn {
    private Matrix a;
    private final int b;

    public final void a(ImageView imageView) {
    }

    public myu(int i) {
        this.b = i;
    }

    public final void b(ImageView imageView) {
        this.a = new Matrix();
        float f = (float) this.b;
        float f2 = 1.15f * f;
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        float f3 = f2 / (intrinsicWidth < intrinsicHeight ? (float) intrinsicWidth : (float) intrinsicHeight);
        float f4 = (f - (((float) intrinsicWidth) * f3)) / 2.0f;
        float f5 = (f - (((float) intrinsicHeight) * f3)) / 2.0f;
        this.a.setScale(f3, f3);
        this.a.postTranslate(f4, f5);
        imageView.setImageMatrix(this.a);
    }
}
