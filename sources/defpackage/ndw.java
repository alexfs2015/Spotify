package defpackage;

import android.graphics.Matrix;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

/* renamed from: ndw reason: default package */
public final class ndw implements ndo {
    private final int a;
    private final int b;
    private Matrix c;

    public ndw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(ImageView imageView) {
        LayoutParams layoutParams = imageView.getLayoutParams();
        int i = this.a;
        layoutParams.width = i;
        layoutParams.height = Math.min((int) (((float) this.b) * 0.6f), i);
        imageView.setLayoutParams(layoutParams);
    }

    public final void b(ImageView imageView) {
        this.c = new Matrix();
        int i = this.a;
        int min = Math.min((int) (((float) this.b) * 0.6f), i);
        float f = (float) i;
        float f2 = 1.15f * f;
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        float f3 = f2 / (intrinsicWidth < intrinsicHeight ? (float) intrinsicWidth : (float) intrinsicHeight);
        float f4 = (f - (((float) intrinsicWidth) * f3)) * 0.5f;
        float f5 = (((float) min) - (((float) intrinsicHeight) * f3)) * 0.33f;
        this.c.setScale(f3, f3);
        this.c.postTranslate(f4, f5);
        imageView.setImageMatrix(this.c);
    }
}
