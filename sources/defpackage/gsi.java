package defpackage;

import android.widget.ImageView;

/* renamed from: gsi reason: default package */
public final class gsi implements gsj {
    private final ImageView a;
    private final gsl b;

    public gsi(ImageView imageView, gsl gsl) {
        this.a = imageView;
        this.b = gsl;
    }

    public final void c() {
        this.a.setImageDrawable(this.b.a());
        this.a.setVisibility(0);
    }

    public final void a() {
        this.a.setImageDrawable(this.b.a());
        this.a.setVisibility(0);
    }

    public final void b() {
        this.a.setVisibility(8);
    }

    public final void a(int i, int i2) {
        this.a.getLayoutParams().width = i;
        this.a.getLayoutParams().height = i2;
        this.a.requestLayout();
    }
}
