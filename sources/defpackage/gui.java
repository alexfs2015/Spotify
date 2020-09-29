package defpackage;

import android.widget.ImageView;

/* renamed from: gui reason: default package */
public final class gui implements guj {
    private final ImageView a;
    private final gul b;

    public gui(ImageView imageView, gul gul) {
        this.a = imageView;
        this.b = gul;
    }

    public final void a() {
        this.a.setImageDrawable(this.b.a());
        this.a.setVisibility(0);
    }

    public final void a(int i, int i2) {
        this.a.getLayoutParams().width = i;
        this.a.getLayoutParams().height = i2;
        this.a.requestLayout();
    }

    public final void b() {
        this.a.setVisibility(8);
    }

    public final void c() {
        this.a.setImageDrawable(this.b.a());
        this.a.setVisibility(0);
    }
}
