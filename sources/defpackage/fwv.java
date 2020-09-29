package defpackage;

import android.view.View.MeasureSpec;
import android.widget.ImageView;

/* renamed from: fwv reason: default package */
public final class fwv {
    public boolean a;
    private final ImageView b;
    private int c;
    private int d;
    private int e;

    public fwv(ImageView imageView) {
        this.b = imageView;
    }

    public final void a(int i, int i2, int i3) {
        a(i, i2);
        if (!this.a) {
            i3 = (int) (((float) i3) * 1.4f);
        }
        this.b.measure(MeasureSpec.makeMeasureSpec(this.c, 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void a() {
        int b2 = b(this.e);
        ImageView imageView = this.b;
        imageView.layout(0, b2, imageView.getMeasuredWidth(), this.b.getMeasuredHeight() + b2);
    }

    public final void a(int i) {
        this.e = i;
        c(i);
    }

    private int b(int i) {
        if (this.a) {
            return 0;
        }
        return -((int) ((1.0f - (((float) i) / ((float) this.d))) * ((float) (this.b.getMeasuredHeight() - this.d))));
    }

    private void a(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    private void c(int i) {
        this.b.offsetTopAndBottom(b(i) - this.b.getTop());
        ip.d(this.b);
    }
}
